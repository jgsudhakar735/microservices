/**
 * 
 */
package com.jayagovind.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.entities.User.java
 * $Version : 1.0
 * Mar 12, 2019
 */
@Entity
public class User implements Serializable{

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_KEY")
	private Long userKey;
	
	@Column(name="USER_ID")
	private String userId;

	@Column(name="USER_PSWD")
	private String pwd;
	
	@Column(name="USER_NAME")
	private String userName;
	
	/**
	 * 
	 */
	public User() {
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
