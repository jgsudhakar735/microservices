package com.jayagovind.spring.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sudhakar.tangellapalli
 * com.jayagovind.spring.entities.Audit.java
 * $Version : 1.0
 * Apr 04, 2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDto implements Serializable{

	/**
	 * Default Serial Id
	 */
	private static final long serialVersionUID = 1L;

	private Long auditKey;
	
	private Date auditDate;

	private String serviceId;
	
	private String ipAddress;
}
