package com.example.demo;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * Created by wuxueyou on 2018/9/18.
 * joda Time demo
 */
public class TimeDemo {
    public static void main(String[] args) {
        System.out.println(123);
//      日期to字符串
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("YYYY-MM-dd HH:mm:ss.SSS"));
        System.out.println(dateTime.getMillis());
//        日期加减
        DateTime dateTime2 = dateTime.plusDays(2);
        System.out.println(dateTime.toString("YYYY-MM-dd HH:mm:ss.SSS"));
        System.out.println(dateTime.getMillis());
        System.out.println(dateTime2.toString("YYYY-MM-dd HH:mm:ss.SSS"));
        System.out.println(Days.daysBetween(dateTime2, dateTime).getDays());
//        字符串to日期
        String dateStr = "2018-12-12 11:12:13.333";
        DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss.SSS");
        DateTime dateTime3 = DateTime.parse(dateStr, fmt);
        System.out.println(dateTime3);

        DateTime dateTime1 = new DateTime(57620000);
        System.out.println(dateTime1.toString("mm:ss"));
    }
}
