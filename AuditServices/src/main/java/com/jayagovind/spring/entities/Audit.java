package com.jayagovind.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Entity
public class Audit implements Serializable{

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AUDIT_KEY")
	private Long auditKey;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="AUDIT_DATE")
	private Date auditDate;

	@Column(name="SERVICE_ID")
	private String serviceId;
	
	@Column(name="IP_ADDRESS")
	private String ipAddress;
	
	/**
	 * 
	 */
	public Audit() {
		// TODO Auto-generated constructor stub
	}

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
