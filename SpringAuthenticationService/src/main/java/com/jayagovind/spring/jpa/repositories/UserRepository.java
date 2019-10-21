/**
 * 
 */
package com.jayagovind.spring.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayagovind.spring.entities.User;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.jpa.repositories.UserRepository.java
 * $Version : 1.0
 * Mar 13, 2019
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserId(String userId);

	public User findByUserIdAndPwd(String userId,String pwd);
	
	public List<User> findAll();
}
