/**
 * 
 */
package com.jayagovind.spring.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jayagovind.spring.dto.UserDTO;
import com.jayagovind.spring.entities.User;
import com.jayagovind.spring.exception.UserNotFoundException;
import com.jayagovind.spring.jpa.dao.UserDAO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author sudhakar.tangellapalli
 *
 */
@RestController
public class AuthenticationService {

	@Autowired
	private Environment env;
	
	@Autowired
	private UserDAO userDAO;
	
//	@Autowired
//	private AuditService auditService;
	
	@GetMapping(value = "/login/home", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String home(HttpServletRequest request) {
		/*
		 * AuditDto auditDto = new AuditDto();
		 * auditDto.setIpAddress(request.getRemoteAddr()); auditDto.setAuditDate(new
		 * Date()); auditDto.setServiceId("AUTHSERVICES");
		 * auditService.saveAudit(auditDto);
		 */
		return "This is Authentication Service running at port: " + env.getProperty("local.server.port");
	}

	/**
	 * This method will be used to validate the user with the given User Information
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	@HystrixCommand(fallbackMethod="fallBack")
	@PostMapping(path="/validateUser",consumes= {MediaType.APPLICATION_JSON_VALUE},produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserDTO retriveUsers(@RequestBody UserDTO user) throws Exception{
		User dbuser = userDAO.findByUserIdAndPwd(user.getUserId(), user.getPwd());
		if(null != dbuser) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(dbuser, dto);
			return dto;
		}
		throw new UserNotFoundException("User Not Found!");
	}
	
	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod="fallBackEmptyList")
	@GetMapping(value = "/retriveUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User>  retriveUserList() throws Exception{
		List<User> users = null;
		users = Optional.ofNullable(userDAO.find()).orElse(Collections.EMPTY_LIST);
		return users;
	}
	
	public String fallBack() {
		return "This system is under maintanance.";
	}
	
	public List<User> fallBackEmptyList(){
		return new ArrayList<>();
	}
}
