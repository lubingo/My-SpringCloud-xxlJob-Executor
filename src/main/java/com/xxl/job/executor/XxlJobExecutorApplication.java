package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XxlJobExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobExecutorApplication.class, args);
    }

}
