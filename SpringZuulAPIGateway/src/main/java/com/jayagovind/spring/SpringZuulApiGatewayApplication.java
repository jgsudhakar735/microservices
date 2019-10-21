package com.jayagovind.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.jayagovind.spring.filter.ErrorFilter;
import com.jayagovind.spring.filter.PostFilter;
import com.jayagovind.spring.filter.RouteFilter;
import com.jayagovind.spring.filter.ZuulLogFIlter;

/**
 * @author sudhakar.tangellapalli
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.jayagovind.spring")
public class SpringZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApiGatewayApplication.class, args);
	}
	
	@Bean
	public ZuulLogFIlter preFilter() {
		return new ZuulLogFIlter();
	}
	@Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
