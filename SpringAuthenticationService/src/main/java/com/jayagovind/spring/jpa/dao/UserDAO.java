/**
 * 
 */
package com.jayagovind.spring.jpa.dao;

import java.util.List;

import com.jayagovind.spring.entities.User;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.jpa.dao.UserDAO.java
 * $Version : 1.0
 * Mar 13, 2019
 */
public interface UserDAO {

	public User findByUserId(String userId);

	public User findByUserIdAndPwd(String userId,String pwd);
	
	public List<User> find();
}
