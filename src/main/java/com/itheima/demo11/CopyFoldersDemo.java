package com.itheima.demo11;

import java.io.*;

public class CopyFoldersDemo {

    public static void main(String[] args) throws IOException {

        //将e盘符下的电子书籍复制到d盘符下
        //将已知原文件夹内容复制到另一个盘符下
        File srcFolder = new File("E:\\A");
        File destFolder = new File("d:\\");
        copyFolder(srcFolder, destFolder);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFolderName = srcFile.getName();
            File newFolder = new File(destFile, srcFolderName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            File[] files = srcFile.listFiles();
            for (File file1 : files) {
                copyFolder(file1, newFolder);
            }
        } else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
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
