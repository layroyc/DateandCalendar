package com.hp.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        //输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日，格式为:yyyy-MM-dd");
        String btime = scanner.nextLine();

        //字符串---->转日期
        Date bDate = sdf.parse(btime);
        Date now = new Date();
        long time = now.getTime() - bDate.getTime();
        long day = time / 1000 / 60 / 60 / 24;
        long weeks = day / 7;
        System.out.println("到现在为止经过了 " + weeks + "周了");

    }
}
