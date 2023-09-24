package com.itheima.demo10;

import java.io.File;

public class DiGuiDemo01 {
    public static void main(String[] args) {

        System.out.println(File.separator);
        File file = new File("E:\\创建文件夹");
        //getAllFilePath(file);
        remEmptyDir(file);
    }

    private static void remEmptyDir(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                remEmptyDir(file1);
                file1.delete();
            }
        }


    }

    private static void getAllFilePath(File file) {
        File[] filesArr = file.listFiles();
        if (filesArr != null) {
            for (File file1 : filesArr) {
                if (file1.isDirectory()) {
                    getAllFilePath(file1);
                } else {
                    System.out.println(file1.getAbsoluteFile() + "  删除：" + (file1.delete() ? "成功" : "失败"));
                }
            }
        }
    }
}
