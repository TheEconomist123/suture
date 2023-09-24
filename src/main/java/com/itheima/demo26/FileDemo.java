package com.itheima.demo26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/24
 * @time 15:17
 * @desc 来模拟一个文件保存过程
 */
public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(date);
        String taskNo = "TK020201";
        String filePath = "D:\\" + taskNo + "_" + formattedDate + ".log";
        System.out.println(filePath);
        File f = new File(filePath);

          if(f.exists()){
              String str = new String();
              FileInputStream fis = new FileInputStream(f);
          }






    }
}
