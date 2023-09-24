package com.itheima.demo12;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        //将桌面上文件夹复制到本地   C:\Users\zhouz\Desktop\SSR-SALE
        File srcFolder = new File("C:\\Users\\zhouz\\Desktop\\SSR-SALE\\软件图文教程");
        System.out.println(srcFolder.getName());
        //创建文件目的地文件
        File destFolder = new File(srcFolder.getName());
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        File[] files = srcFolder.listFiles();
        for (File file : files) {
            //遍历文件然后复制
            String name = file.getName();
            File destFile = new File(destFolder, name);
            copyFolder(destFile, file);
        }
    }

    private static void copyFolder(File destFile, File file) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();

    }
}
