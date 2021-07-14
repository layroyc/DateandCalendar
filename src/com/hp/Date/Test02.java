package com.hp.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Date date = new Date();
        //将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
        String currentTime = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(currentTime);
        String tt = sdf.format(date);
        System.out.println("tt = " + tt);
    }
}
