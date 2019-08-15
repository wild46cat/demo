package com.example.demo;


import java.util.regex.Pattern;

public class Xydemo {
    public static void main(String[] args) {
        System.out.println(123);
        String cc = "oDsTG5cXP_S66Ung-RutSGTd0BPY";
//        String cc = "oDsTG5cXP-S66UngRutSGTd0BPY";

        Pattern JCNUSERID_PATTERN = Pattern.compile("^[\\w|\\-|=]+$");
        boolean matches = JCNUSERID_PATTERN.matcher(cc).matches();
        System.out.println(matches);

    }
}
