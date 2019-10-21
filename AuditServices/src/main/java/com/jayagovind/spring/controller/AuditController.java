/**
 * 
 */
package com.jayagovind.spring.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jayagovind.spring.dao.AuditDao;
import com.jayagovind.spring.entities.Audit;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Sudhakar Tangellapalli
 * @File : com.jayagovind.spring.controller.AuditController.java
 * Apr 4, 2019
 */
@RestController
public class AuditController {

	@Autowired
	private Environment env;
	
	@Autowired
	AuditDao auditDao;
	
	@GetMapping(value = "/audit/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String home() {
		return "This is Audit Service running at port: " + env.getProperty("local.server.port");
	}
	
	@HystrixCommand(fallbackMethod="fallBackEmptyList")
	@GetMapping(value = "/retriveAudit", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Audit>  retriveAudit() throws Exception{
		return Optional.ofNullable(auditDao.find()).orElse(Collections.emptyList());
	}
	
	@HystrixCommand(fallbackMethod="fallBackEmptyList")
	@GetMapping(value = "/retriveAuditByService", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Audit>  retriveAuditByService(@RequestBody Audit audit) throws Exception{
		return Optional.ofNullable(auditDao.findByServiceId(audit.getServiceId())).orElse(Collections.emptyList());
	}
	
	@HystrixCommand(fallbackMethod="fallBack")
	@PostMapping(value = "/saveAudit", produces = MediaType.APPLICATION_JSON_VALUE)
	public void  saveAudit(@RequestBody Audit audit) throws Exception{
		auditDao.save(audit);
	}
	
	public void fallBack() {
		System.out.println("This system is under maintanance.");
	}
	
	public List<Audit> fallBackEmptyList(){
		return new ArrayList<>();
	}
}
