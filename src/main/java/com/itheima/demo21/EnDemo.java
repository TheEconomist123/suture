package com.itheima.demo21;


/**
 * 案例测试
 *
 */
public enum EnDemo {

    Red("红色", 1),
    Blue("蓝色", 2),
    Yellow("黄色", 3),
    Green("红色", 4);

    private EnDemo(String name, int index) {
        this.name = name;
        this.index = index;
    }


    private String name;
    private int index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
