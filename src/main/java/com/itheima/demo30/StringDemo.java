package com.itheima.demo30;

import java.text.NumberFormat;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/8/10
 * @time 22:03
 * @desc
 */
public class StringDemo {
    public static void main(String[] args) {
        System.out.println(String.format("%03d",2));
        System.out.println(String.format("%03d",12));
        System.out.println(String.format("%03d",0));


        // 将数字千分位
        NumberFormat nf = NumberFormat.getNumberInstance();
          nf.setGroupingUsed(true);//默认就是true 这样自动千分之数字
        System.out.println(nf.format(69754231L));
        System.out.println(NumUtils.toChineseLower(69754231L));
        System.out.println(NumUtils.toChineseUpper(69754231L));
    }
}
