package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  // 启动声明式事务
@MapperScan("com.woniu.dao") // 告诉spring 在哪里找mybatis的子配置文件
public class App {
		
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}