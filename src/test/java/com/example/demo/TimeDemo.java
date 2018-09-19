package com.example.demo;

import org.joda.time.DateTime;
import org.joda.time.Days;

import javax.sound.midi.Soundbank;

/**
 * Created by wuxueyou on 2018/9/18.
 * joda Time demo
 */
public class TimeDemo {
    public static void main(String[] args) {
        System.out.println(123);
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("YYYY-MM-dd HH:mm:ss.SSS"));
        System.out.println(dateTime.getMillis());
        DateTime dateTime2 = dateTime.plusDays(2);
        System.out.println(dateTime2.toString("YYYY-MM-dd HH:mm:ss.SSS"));
        System.out.println(Days.daysBetween(dateTime2, dateTime).getDays());
    }
}
