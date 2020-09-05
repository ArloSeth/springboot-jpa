package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 开启定时任务
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
        System.out.println("dddd");
        System.out.println("新增内容加上提交远程仓库");
    }
}
