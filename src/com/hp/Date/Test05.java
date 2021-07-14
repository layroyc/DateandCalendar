package com.hp.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
       // 411527 2002 03 23 1046    6-10  10-12 12-14

        Scanner scanner = new Scanner(System.in);
        String cardId = scanner.nextLine();
        if(cardId.length()==18) {
            String year = cardId.substring(6, 10);//年
            String month = cardId.substring(10, 12);//月
            String day = cardId.substring(12, 14);//日
            String ww = year+"-"+month+"-"+day;
            System.out.println(ww);
            Integer a = new Integer(year);
            int year2 = a+20;//二十岁
            String ww2 = year2+"-"+month+"-"+day;
            System.out.println(ww2);

            String pattern = "yyyy-MM-dd";//设置当前时间的输出格式
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            Date date = sdf.parse(ww2);//String 转 date
            Calendar calendar = Calendar.getInstance();//创建构造方法 日历
            //calendar.add(Calendar.DAY_OF_YEAR,year2);
            calendar.setTime(date);//设置时间
            calendar.set(Calendar.DAY_OF_WEEK,4);//周三
            date=calendar.getTime();//得到周三时间
            ww2 = sdf.format(date);//将得到的时间格式化输出格式转化为yyyy-MM-dd
            System.out.println("周三的时间为："+ww2);

        }else{
            System.out.println("格式有误，请重新输入");
        }

    }
}
