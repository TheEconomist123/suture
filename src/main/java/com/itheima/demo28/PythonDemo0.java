package com.itheima.demo28;

import java.io.IOException;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/17
 * @time 8:43
 * @desc
 */
public class PythonDemo0 {
    public static void main(String[] args) throws IOException {

/*
        URL url = new URL("https://unsplash.com/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String regex="https\\w*";
        Pattern compile = Pattern.compile(regex);
        String line;
        while ((line = br.readLine()) != null) {
          */
/*  Matcher matcher = compile.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }*//*

            System.out.println(line);
        }

        br.close();
*/


        Integer i =20230506;
        Integer i1 =20230506;
        System.out.println(i.intValue());

    }
}
