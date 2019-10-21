/**
 * 
 */
package com.jayagovind.spring.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Sudhakar Tangellapalli
 * @File : com.jayagovind.spring.swagger.SwaggerConfiguration.java
 * Apr 9, 2019
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	private static final Contact DEFAULT_CONTACT = new Contact("Sudhakar Tangellapalli", "www.xyz.com", "xyz@gmail.com");;
	private static final ApiInfo DEFAULT_API_INFO =  new ApiInfo("Auth Service", "Authentication Service Swagger Documentation", "1.0", "https://github.com/jgsudhakar",
	          DEFAULT_CONTACT, "NA", "NA");
	private static final Set<String> DEFAULT_PRODUCE = new HashSet<String>(Arrays.asList("application/json","application/xml"));
	private static final Set<String> DEFAULT_CONSUME = new HashSet<String>(Arrays.asList("application/json"));;

	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2).
				apiInfo(DEFAULT_API_INFO).
				produces(DEFAULT_PRODUCE).
				consumes(DEFAULT_CONSUME);
	}
}
