/**
 * 
 */
package com.jayagovind.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayagovind.spring.entities.Audit;

/**
 * @author Sudhakar Tangellapalli
 * @File : com.jayagovind.spring.repositories.AuditRepository.java
 * Apr 4, 2019
 */
@Repository
public interface AuditRepository extends JpaRepository<Audit, Long>{
	
	public List<Audit> findByServiceId(String serviceId);

	public List<Audit> findAll();
	
}
