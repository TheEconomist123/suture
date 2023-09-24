package com.itheima.demo24;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/21
 * @time 11:34
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        String  str ="\n" +
                "\n" +
                "新一代票据业务系统10.0.81.54环境系统记录\n" +
                "新一代票据业务系统10.0.81.54环境系统记录\n" +
                "新一代票据业务系统10.0.81.54环境系统记录\n" +
                "\n" +
                "1.票据系统前段访问系统：10.0.81.54:18080         root/888888\n" +
                "2.网银前段系统访问地址：10.0.81.54:8092/ebank-web   \n" +
                "网银后端项目端口是8091。\n" +
                "3.ecds模拟器网址  ：10.0.89.16:8886/EcdsMonitor\n" +
                "4.turbo(cpes)模拟器地址:10.0.81.53:8029/turbo/login.html      arcu/arcu\n" +
                "\n" +
                "5.切日是在公共管理，\n" +
                "\n" +
                "6.10.0.89.209  root/redhat12#$\n" +
                "\n" +
                "7.see平台地址：10.0.81.54:8081/acm      \n" +
                "     \n" +
                "用户名/密码  admin/Aa123456_\n" +
                "\n" +
                "\n" +
                "8.票据系统。\n" +
                "\n" +
                "340101\tarcu    法人管理员    合肥科技农村银行股份有限公司\n" +
                "\n" +
                "341465arcu    法人管理员    宣城皖南农村商业银行股份有限公司\n" +
                "\n" +
                "\n" +
                "\n" +
                "34010102   合科管理员       机构号 3401010079             合肥科技农村银行股份有限公司  \n" +
                "合肥科技管理员针对柜员的新增删除都要经过 总行管理员复核才行。\n" +
                "\n" +
                "     \n" +
                "34010101   总行管理员       机构号 3401010079             合肥科技农村银行股份有限公司\n" +
                "\n" +
                "柜员 229021    姓名：徐**   \n" +
                "\n" +
                "\n" +
                "业务系统名称\t子系统名称\tvCPU\t内存 (GB)\t磁盘空间 (GB)\t带内IP\t操作系统\t账户\t密码\t    账户\t密码\n" +
                "票据系统数据移植服务器\t应用服务器-01\t4\t8\t300g\t10.0.81.53\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t应用服务器-02\t4\t8\t300g\t10.0.81.54\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t应用服务器-03\t4\t8\t300g\t10.0.81.55\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t应用服务器-04\t4\t8\t300g\t10.0.81.56\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t应用服务器-05\t4\t8\t300g\t10.0.81.57\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t应用服务器-06\t4\t8\t300g\t10.0.81.58\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t数据库服务器-01\t8\t16\t600g\t10.0.81.59\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "票据系统数据移植服务器\t数据库服务器-02\t8\t16\t600g\t10.0.81.60\tredhat8.4\tyyglb\tyyglb@2021！\troot\tAhrcu@1!\n" +
                "\n" +
                "\n" +
                "云桌面： t20wangshaowen\n" +
                "           Aa123456\n" +
                "\n";

        jsonObject.put("electrSign",str);
        jsonObject.put("age","10");
        jsonObject.put("name","22222");
        System.out.println(jsonObject.toString());


    }



}
