package com.itheima.demo27;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/22
 * @time 16:45
 * @desc
 */
public class TestUsb {
    public static void main(String[] args) {
     /*        Vedio vedio = new Vedio();
        vedio.song();*/



 /*       class  Fan implements  USB{
            @Override
            public void service() {
                System.out.println("带风扇接入，可以扇风了");

            }
        }
        Fan fan = new Fan();
        fan.service();
*/
        USB usb= new  USB(){
            @Override
            public void service() {
                System.out.println("风扇已经接入，可以使用了。。。");
            }
        };
        usb.service();


    }
}
