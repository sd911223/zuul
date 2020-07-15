package com.accurascience;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
/**
 * 项目启动入口
 * @author zhuchaojie
 * @version 1.0.0
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@NacosPropertySource(dataId = "zuul", autoRefreshed = true)
public class Application {
     
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
