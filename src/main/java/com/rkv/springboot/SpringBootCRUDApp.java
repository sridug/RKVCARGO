package com.rkv.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.rkv.springboot.configuration.JpaConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.rkv.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableSwagger2
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
