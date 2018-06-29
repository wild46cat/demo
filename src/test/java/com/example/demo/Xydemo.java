package com.example.demo;

import java.util.Calendar;
import java.util.Date;

public class Xydemo {
    public static void main(String[] args) {
        System.out.println(caculateTime());
    }

    /**
     * 计算当前时间点到次日凌晨的时间间隔（秒数）
     * @return
     */
    private static long caculateTime(){
        long res = 0;
        Calendar ca = Calendar.getInstance();
        long s = ca.getTime().getTime();
        ca.add(Calendar.DATE,1);
        ca.set(Calendar.HOUR_OF_DAY,0);
        ca.set(Calendar.MINUTE,0);
        ca.set(Calendar.SECOND,0);
        ca.set(Calendar.MILLISECOND,0);
        long nextZero = ca.getTime().getTime();
        res = (nextZero - s)/1000;
        return res;
    }
}
