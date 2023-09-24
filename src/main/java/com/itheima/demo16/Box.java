package com.itheima.demo16;

public class Box {
    private int milk;
    //奶箱默认状态是没有
    private boolean state=false;
    public synchronized  void put(int milk) {
        //如果有奶有等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶就生产
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱里");
        //生产完以后将奶箱状态改变
        state = true;
        //唤醒其它等待线程
        notifyAll();
    }

    public  synchronized  void get() {
        //如果没有牛奶,等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        //消费完毕后修改奶箱状态
        state=false;
        //唤醒其它等待其它线程
        notifyAll();
    }


}
