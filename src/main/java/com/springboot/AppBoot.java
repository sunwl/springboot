package com.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 依赖的maven库为 <localRepository>D:\java\maven\repository</localRepository>
 * 项目启动类
 * 访问http://localhost:8002/myboot/
 *
 */
@SpringBootApplication
public class AppBoot extends SpringBootServletInitializer {
    private static final Logger logger = LogManager.getLogger(AppBoot.class);
    public static void main(String[] args) {
        SpringApplication.run(AppBoot.class, args);
        logger.info("main(String[] args)");
    }

}
