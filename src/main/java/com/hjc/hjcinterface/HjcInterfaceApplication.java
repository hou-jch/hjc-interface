package com.hjc.hjcinterface;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主类（项目启动入口）
 *

 */
// todo 如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication
public class HjcInterfaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HjcInterfaceApplication.class, args);
    }

}
