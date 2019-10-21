/**
 * 
 */
package com.jayagovind.spring.dto;

import java.io.Serializable;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.dto.UserDTO.java
 * $Version : 1.0
 * Mar 13, 2019
 */
public class UserDTO implements Serializable{

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 1L;

	private Long userKey;
	
	private String userId;

	private String pwd;
	
	private String userName;
	
	/**
	 * 
	 */
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the userKey
	 */
	public Long getUserKey() {
		return userKey;
	}

	/**
	 * @param userKey the userKey to set
	 */
	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
