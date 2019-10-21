/**
 * 
 */
package com.jayagovind.spring.dao;

import java.util.List;

import com.jayagovind.spring.entities.Audit;

/**
 * @author Sudhakar Tangellapalli
 * @File : com.jayagovind.spring.dao.AuditDao.java
 * Apr 4, 2019
 */
public interface AuditDao {

	public List<Audit> findByServiceId(String serviceId);

	public List<Audit> find();
	
	public void save(Audit audit);
}
