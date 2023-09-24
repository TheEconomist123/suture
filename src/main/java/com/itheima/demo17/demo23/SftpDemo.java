package com.itheima.demo17.demo23;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SftpDemo {

    public static void main(String[] args) throws IOException {
        //读取配置文件内容
        InputStream is = SftpDemo.class.getResourceAsStream("/sftp.properties");
        Properties pro = new Properties();
        pro.load(is);
        String host = pro.getProperty("host");
        int port = Integer.parseInt(pro.getProperty("port"));
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        String sftpPath = pro.getProperty("sftpPath");
        String localPath = pro.getProperty("localPath");

        String oriName = "cc.sql";
        String remoteName = "cc_back.sql";

        System.out.println(host + "_" + port + "_" + username + "_" + password);
        SFTPUtil sftpUtil = new SFTPUtil(host, port, username, password);

        //uploadSingleFile(sftpUtil, sftpPath, remoteName, localPath, oriName);

        downloadSingleFile(sftpUtil, sftpPath, remoteName, localPath, oriName);


    }


    static void uploadSingleFile(SFTPUtil sftpUtil, String sftpPath, String remoteName, String localPath, String oriName) {

        //1.通过sftp 服务器
        sftpUtil.connect();
        //2.上传文件
        boolean b = sftpUtil.uploadFile(sftpPath, remoteName, localPath, oriName);
        if (b) {
            System.out.println("上传原文件" + localPath + oriName + "到" + sftpPath + "路径下成功！文件名为：" + remoteName);
        } else {
            System.out.println("上传原文件" + localPath + oriName + "到" + sftpPath + "路径下失败！文件名为：" + remoteName);
        }

        //3.关闭服务 释放资源
        sftpUtil.disconnect();

    }

    static void downloadSingleFile(SFTPUtil sftpUtil, String sftpPath, String remoteName, String localPath, String oriName) {
         //1.开启sftp 服务器
        sftpUtil.connect();
        //2.下载文件
        boolean b = sftpUtil.downloadFile(sftpPath, remoteName, localPath, remoteName);
        if (b) {
            System.out.println("下载文件" + sftpPath + remoteName + "到" + localPath + "路径下成功！文件名为：" + remoteName);
        } else {
            System.out.println("下载文件" + sftpPath + remoteName + "到" + localPath + "路径下成功！文件名为：" + remoteName);

        }
        //3.关闭服务 释放资源
        sftpUtil.disconnect();

    }


}
