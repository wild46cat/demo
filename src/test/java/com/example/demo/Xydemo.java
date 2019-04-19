package com.example.demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Xydemo {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("805386072982533000");
        double d = Double.parseDouble("805386072982533000");
        DecimalFormat df = new DecimalFormat("#.################");
//        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(d));
        System.out.println(bd.toPlainString());
    }
}
