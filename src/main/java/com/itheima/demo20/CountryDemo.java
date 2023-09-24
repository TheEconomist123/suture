package com.itheima.demo20;

public class CountryDemo {
    private String  nation;

    public CountryDemo() {
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "CountryDemo{" +
                "nation='" + nation + '\'' +
                '}';
    }
}
