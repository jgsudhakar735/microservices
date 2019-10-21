/**
 * 
 */
package com.jayagovind.spring.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayagovind.spring.dao.AuditDao;
import com.jayagovind.spring.entities.Audit;
import com.jayagovind.spring.repositories.AuditRepository;

/**
 * @author Sudhakar Tangellapalli
 * @File : com.jayagovind.spring.dao.impl.AuditDaoImpl.java
 * Apr 4, 2019
 */
@Service
public class AuditDaoImpl implements AuditDao{
	
	@Autowired
	AuditRepository auditRepository;

	/* (non-Javadoc)
	 * @see com.jayagovind.spring.dao.AuditDao#findByServiceId(java.lang.String)
	 */
	@Override
	public List<Audit> findByServiceId(String serviceId) {
		return Optional.ofNullable(auditRepository.findByServiceId(serviceId)).
				orElse(Collections.emptyList());
	}

	/* (non-Javadoc)
	 * @see com.jayagovind.spring.dao.AuditDao#find()
	 */
	@Override
	public List<Audit> find() {
		return Optional.ofNullable(auditRepository.findAll()).
				orElse(Collections.emptyList());
	}
	
	/* (non-Javadoc)
	 * @see com.jayagovind.spring.dao.AuditDao#save(com.jayagovind.spring.entities.Audit)
	 */
	@Override
	public void save(Audit audit) {
		auditRepository.save(audit);
	}

}
