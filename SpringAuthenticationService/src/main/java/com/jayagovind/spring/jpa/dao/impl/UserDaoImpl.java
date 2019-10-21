/**
 * 
 */
package com.jayagovind.spring.jpa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayagovind.spring.entities.User;
import com.jayagovind.spring.jpa.dao.UserDAO;
import com.jayagovind.spring.jpa.repositories.UserRepository;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.jpa.dao.impl.UserDaoImpl.java
 * $Version : 1.0
 * Mar 13, 2019
 */
@Service
public class UserDaoImpl implements UserDAO {

	@Autowired
	private UserRepository userRepository;

	/* (non-Javadoc)
	 * @see com.jayagovind.spring.jpa.dao.UserDAO#findByUserId(java.lang.String)
	 */
	@Override
	public User findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}

	/* (non-Javadoc)
	 * @see com.jayagovind.spring.jpa.dao.UserDAO#findByUserIdAndPwd(java.lang.String, java.lang.String)
	 */
	@Override
	public User findByUserIdAndPwd(String userId, String pwd) {
		return userRepository.findByUserIdAndPwd(userId, pwd);
	}

	/* (non-Javadoc)
	 * @see com.jayagovind.spring.jpa.dao.UserDAO#find()
	 */
	@Override
	public List<User> find() {
		return userRepository.findAll();
	}
}
