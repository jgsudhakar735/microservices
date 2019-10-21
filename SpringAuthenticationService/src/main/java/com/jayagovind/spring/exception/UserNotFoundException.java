/**
 * 
 */
package com.jayagovind.spring.exception;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.exception.UserNotFoundException.java
 * $Version : 1.0
 * Mar 13, 2019
 */
public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}
	
	

}
