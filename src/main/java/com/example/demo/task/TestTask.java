package com.example.demo.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {
    @Scheduled(cron = "0/5 * * * * ?")
    public void test() {
        System.out.println("===============begin" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        Thread thread = new Thread(new Exetask());
        thread.start();
    }

    class Exetask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        }
    }

}
