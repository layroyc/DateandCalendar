package com.hp.Date;

import java.util.Date;

/*
* 使用Date输出当前系统时间，以及3天后这一刻的时间
* */
public class Test01 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);//当前系统时间

        long time = date.getTime();//获得真实的时间，long值（毫秒数）
        time += 1000*60*60*24*3L;//3天后的这一时间
        date.setTime(time);
        System.out.println("date = " + date);

    }
}
