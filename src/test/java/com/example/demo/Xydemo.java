package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Xydemo {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println((double)a/b);
//        System.out.println(caculateTime());
        Random r = new Random();
        for (int i = 0; i < 1; i++) {
            int c = r.nextInt(30);
            int positiveOrNagative = r.nextInt(2);
            if (positiveOrNagative == 0) {
                c = c * -1;
            }
            int time = c * 100 / 100;
            System.out.println(time);

        }
        double xTotal = 0;
        for (int i = 0; i < 1000; i++) {
            double x = Math.random();
            xTotal += x;
            System.out.println(x);
        }
        System.out.println("=--------------------");
        System.out.println(xTotal / 1000);
//        r.nextDouble();
//        System.out.println(r.nextInt(10));
//        System.out.println(r.nextInt(10));
    }

    /**
     * 计算当前时间点到次日凌晨的时间间隔（秒数）
     *
     * @return
     */
    private static long caculateTime() {
        long res = 0;
        Calendar ca = Calendar.getInstance();
        long s = ca.getTime().getTime();
        ca.add(Calendar.DATE, 1);
        ca.set(Calendar.HOUR_OF_DAY, 0);
        ca.set(Calendar.MINUTE, 0);
        ca.set(Calendar.SECOND, 0);
        ca.set(Calendar.MILLISECOND, 0);
        long nextZero = ca.getTime().getTime();
        res = (nextZero - s) / 1000;
        return res;
    }
}
