package com.itheima.demo11;

import java.io.*;

public class CopyFolders {
    //将一个文件夹
    public static void main(String[] args) throws IOException {
        String srcFolder = "e:\\A";
        String destFolder = "C:";
        File src = new File(srcFolder);
        File dest = new File(destFolder);
        //复制文件夹
        copyFolders(src, dest);
    }

    private static void copyFolders(File src, File dest) throws IOException {
        //如果是文件夹就遍历
        if (src.isDirectory()) {
            //获取文件夹名称进行复制
            String newName = src.getName();
            //这是新目录
            File newFolder = new File(dest, newName);
            //复制的文件夹要是没有就创建
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            File[] files = src.listFiles();
            for (File file1 : files) {
                copyFolders(file1, newFolder);
            }
        } else {
            File newFile = new File(dest, src.getName());
            copyFile(src, newFile);
        }


    }

    private static void copyFile(File src, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        int len;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }
}
