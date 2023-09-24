package com.itheima.demo30;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/28
 * @time 16:33
 * @desc
 */
public class TestDecimal {
    public static void main(String[] args) throws ParseException {
        BigDecimal bigDecimal = new BigDecimal("1242342342.5326523623");
        System.out.println(bigDecimal.setScale(4, RoundingMode.HALF_UP));
        System.out.println(bigDecimal.setScale(0, RoundingMode.HALF_UP));
        System.out.println(bigDecimal.setScale(0, RoundingMode.FLOOR));
        BigDecimal bigDecimal1 = new BigDecimal(".9231242141421");
        System.out.println(bigDecimal1.setScale(5, RoundingMode.HALF_UP));
        System.out.println("------------------针对日期进行测试-------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String d1 = "20220421";
        String d2 = "20230721";
        Date parse = sdf.parse(d1);
        Date parse1 = sdf.parse(d2);
        System.out.println(parse.before(parse1));
        System.out.println("----------------------");
        
          List<String> ccc=new ArrayList();
        ccc.add("111");
        ccc.add("2222");
        ccc.add("2222");
        ccc.add("2333");
        System.out.println(ccc);
        System.out.println("-----------------------");

        BigDecimal c=new BigDecimal("0");
        BigDecimal c1=new BigDecimal("1");
        System.out.println(c.divide(c1,4,RoundingMode.HALF_UP));








    }
}
