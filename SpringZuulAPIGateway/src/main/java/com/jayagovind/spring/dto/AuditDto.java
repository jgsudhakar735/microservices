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

	/**
	 * @return the auditKey
	 */
	public Long getAuditKey() {
		return auditKey;
	}

	/**
	 * @param auditKey the auditKey to set
	 */
	public void setAuditKey(Long auditKey) {
		this.auditKey = auditKey;
	}

	/**
	 * @return the auditDate
	 */
	public Date getAuditDate() {
		return auditDate;
	}

	/**
	 * @param auditDate the auditDate to set
	 */
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	
}
