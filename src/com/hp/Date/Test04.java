package com.hp.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
* 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
* 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
* */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        String pattern = "yyyy-MM-dd";//设置当前时间的输出格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个生产日期格式:yyyy-MM-dd");
        String ctime = scanner.nextLine();
        System.out.println("再输入一个数字为(保质期的天数)");
        int dayNum = scanner.nextInt();
        //String 转成 Date
        Date date = sdf.parse(ctime);
        // 新建日历
        Calendar calendar = Calendar.getInstance();
        //设置时间
        calendar.setTime(date);
        //计算过期日
        calendar.add(Calendar.DAY_OF_YEAR,dayNum);
        //计算前两周
        calendar.add(Calendar.DAY_OF_YEAR,-14);
        //计算前两周的周三
        calendar.set(Calendar.DAY_OF_WEEK,4);
        //得到周三时间
        date=calendar.getTime();
        //date 转回String  将得到的时间格式化输出格式转化为yyyy-MM-dd
        ctime = sdf.format(date);
        System.out.println("促销日为 : " + ctime);

    }
}
