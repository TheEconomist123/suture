package com.itheima.demo17.demo23;

import com.jcraft.jsch.*;


import java.io.*;

import java.util.*;
import java.util.function.Predicate;

/**
 * sftp工具类
 *
 * @author gxsoft
 * @version 1.0
 * @date 2019-7-10
 * @time 下午1:39:44
 */

public class SFTPUtil {

    private String host;//服务器连接ip
    private String username;//用户名
    private String password;//密码
    private int port = 22;//端口号
    private ChannelSftp sftp = null;
    private Session sshSession = null;
    private boolean isOverwrite = false;

    public SFTPUtil() {
    }

    public SFTPUtil(String host, int port, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public SFTPUtil(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    /**
     * 通过SFTP连接服务器
     */
    public void connect() {
        try {
            JSch jsch = new JSch();
            jsch.getSession(username, host, port);
            sshSession = jsch.getSession(username, host, port);


            System.out.println("Session created....");
            sshSession.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();


            System.out.println("Session connected.");
            Channel channel = sshSession.openChannel("sftp");
            channel.connect();


            System.out.println("Opening Channel.....");
            sftp = (ChannelSftp) channel;

            System.out.println("Connected to " + host + ".");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    /**
     * 关闭连接
     */
    public void disconnect() {
        if (this.sftp != null) {
            if (this.sftp.isConnected()) {
                this.sftp.disconnect();
               /* if (log.isInfoEnabled()) {
                    log.info("sftp is closed already");
                }*/

                System.out.println("sftp is closed already");
            }
        }
        if (this.sshSession != null) {
            if (this.sshSession.isConnected()) {
                this.sshSession.disconnect();
               /* if (log.isInfoEnabled()) {
                    log.info("sshSession is closed already");
                }*/

                System.out.println("sshSession is closed already");
            }
        }
    }




    /**
     * 下载单个文件
     *
     * @param remotePath：远程下载目录(以路径符号结束)
     * @param remoteFileName：下载文件名
     * @param localPath：本地保存目录(以路径符号结束)
     * @param localFileName：保存文件名
     * @return
     */
    public boolean downloadFile(String remotePath, String remoteFileName, String localPath,String localFileName) {
        FileOutputStream fieloutput = null;
        try {
            // sftp.cd(remotePath);  // 把文件带日期的形式下载 如 /2021/04/06/00/12/文件名称
            // 下载到ftp 可以扫到文件的目录
            File file = new File(localPath + localFileName);
            // 文件如果已经存在 是否覆盖
            if (file.exists()) {
                System.out.println("File is exists : " + localFileName);
                return false;
            }
            // 创建本地文件夹
            mkdirs(localPath + localFileName);
            fieloutput = new FileOutputStream(file);
            // 把线上服务的文件内容写到 本地数如流里面
            sftp.get(remotePath + remoteFileName, fieloutput);


            System.out.println("===DownloadFile:" + remoteFileName + " success from sftp.");
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        } finally {
            if (null != fieloutput) {
                try {
                    fieloutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 上传单个文件
     *
     * @param remotePath：远程保存目录
     * @param remoteFileName：保存文件名
     * @param localPath：本地上传目录(以路径符号结束)
     * @param localFileName：上传的文件名
     * @return
     */
    public boolean uploadFile(String remotePath, String remoteFileName, String localPath, String localFileName) {
        FileInputStream in = null;
        try {
            createDir(remotePath);
            File file = new File(localPath + localFileName);
            in = new FileInputStream(file);
            sftp.put(in, remoteFileName);
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 删除本地文件
     *
     * @param filePath
     * @return
     */
    public boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return false;
        }

        if (!file.isFile()) {
            return false;
        }
        boolean rs = file.delete();
        if (rs) {
            System.out.println("delete file success from local.");
        }
        return rs;
    }

    /**
     * 创建目录
     *
     * @param createpath
     * @return
     */
    public boolean createDir(String createpath) {
        try {
            if (isDirExist(createpath)) {
                this.sftp.cd(createpath);
                return true;
            }
            String pathArry[] = createpath.split("/");
            StringBuffer filePath = new StringBuffer("/");
            for (String path : pathArry) {
                if (path.equals("")) {
                    continue;
                }
                filePath.append(path + "/");
                if (isDirExist(filePath.toString())) {
                    sftp.cd(filePath.toString());
                } else {
                    // 建立目录
                    sftp.mkdir(filePath.toString());
                    // 进入并设置为当前目录
                    sftp.cd(filePath.toString());
                }

            }
            this.sftp.cd(createpath);
            return true;
        } catch (SftpException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 判断目录是否存在
     *
     * @param directory
     * @return
     */
    public boolean isDirExist(String directory) {
        boolean isDirExistFlag = false;
        try {
            SftpATTRS sftpATTRS = sftp.lstat(directory);
            isDirExistFlag = true;
            return sftpATTRS.isDir();
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().equals("no such file")) {
                isDirExistFlag = false;
            }
        }
        return isDirExistFlag;
    }

    /**
     * 判断文件是否存在
     *
     * @param fullFileName
     */
    public boolean judeFileExists(String fullFileName) {

        File file = new File(fullFileName);
        return file.exists();
    }

    /**
     * 删除stfp文件
     *
     * @param directory：要删除文件所在目录
     * @param deleteFile：要删除的文件
     */
    public void deleteSFTP(String directory, String deleteFile) {
        try {
            // sftp.cd(directory);
            sftp.rm(directory + deleteFile);
           /* if (log.isInfoEnabled()) {
                log.info("delete file success from sftp.");
            }*/

            System.out.println("delete file success from sftp.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 如果目录不存在就创建目录
     *
     * @param path
     */
    public void mkdirs(String path) {
        File f = new File(path);

        String fs = f.getParent();

        f = new File(fs);

        if (!f.exists()) {
            f.mkdirs();
        }
    }

    /**
     * 文件重命名
     *
     * @param oldPath
     * @param newPath
     */
    public void rename(String oldPath, String newPath) {
        try {
            sftp.rename(oldPath, newPath);
        } catch (SftpException e) {
            System.out.println("File rename failed [" + oldPath + "]->[" + newPath + "]");
        }
    }

    /**
     * 列出目录下的文件
     *
     * @param directory：要列出的目录
     * @return
     * @throws SftpException
     */
    public Vector listFiles(String directory, Date now) throws SftpException {
        Vector vector = new Vector();
        /**
         * 过滤linux目录下 '.' 和 '..' 文件
         * */
        boolean isExist = isExistDir(directory);
        if (!isExist) {
//
//            String BAYONET_PATH = this.getClass().getClassLoader().getResource("record_log.txt").getPath();
//            FileWriter fw = null;
//            try {
//                //创建字符输出流对象，负责向文件内写入
//                fw = new FileWriter("D:\\working\\scadaSecs\\06.newScadaSecs\\scadaSecsReCollect\\src\\main\\resources\\record_log.txt",true);
//                String date3 = DateUtils.fomatDate3(now);
//                fw.write("服务器在该时间:"+date3+"===不存在目录和数据===="+directory+"\r\n");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally{
//                if(fw!=null){
//                    try {
//                        fw.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
            System.out.println("服务器上不存在文件:{}" + directory);
        } else {
            vector = sftp.ls(directory);
            vector.removeIf(new Predicate<ChannelSftp.LsEntry>() {
                @Override
                public boolean test(ChannelSftp.LsEntry lsEntry) {
                    return "..".equals(lsEntry.getFilename()) || "src/main".equals(lsEntry.getFilename()) || ".".equals(lsEntry.getFilename());
                }
            });
        }


        return vector;
    }


    public boolean isExistDir(String path) {
        boolean isExist = false;
        try {
            SftpATTRS sftpATTRS = sftp.lstat(path);
            isExist = true;
            return sftpATTRS.isDir();
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().equals("no such file")) {
                isExist = false;
            }
        }
        return isExist;

    }

    /**
     * 获取本地文件
     */
    public static List<String> getAllFile(String directoryPath) {
        List<String> list = new ArrayList<String>();
        File baseFile = new File(directoryPath);
        if (baseFile.isFile() || !baseFile.exists()) {
            return list;
        }
        File[] files = baseFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                list.add(file.toString());
//                    list.add(file.getAbsolutePath());
//                list.addAll(getAllFile(file.getAbsolutePath()));
            } else {
                list.add(file.toString());
//                list.add(file.getAbsolutePath());
            }
        }
        return list;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ChannelSftp getSftp() {
        return sftp;
    }

    public void setSftp(ChannelSftp sftp) {
        this.sftp = sftp;
    }


}