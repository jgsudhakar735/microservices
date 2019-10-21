/**
 * 
 */
package com.jayagovind.spring.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jayagovind.spring.dto.AuditDto;

/**
 * @author sudhakar.t
 *
 */
@FeignClient("AUDITSERVICE")
public interface AuditService {

	@PostMapping("/saveAudit")
	public void saveAudit(@RequestBody AuditDto auditDto) ;
}
