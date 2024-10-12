package com.project.healthsync.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableZuulProxy
@SpringBootApplication
		//(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "com.project")
@EnableJpaRepositories("com.project")
@EntityScan(basePackages = "com.project")
public class HealthSyncApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(HealthSyncApiApplication.class, args);
	}

}
