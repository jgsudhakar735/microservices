/**
 * 
 */
package com.jayagovind.spring.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jayagovind.spring.dto.AuditDto;
import com.jayagovind.spring.feignclient.AuditService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
/**
 * @author sudhakar.tangellapalli
 *
 */
public class ZuulLogFIlter extends ZuulFilter {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AuditService auditService;

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request ->{} Request URI {} -> "+request.getRequestURI());
		AuditDto auditDto = new AuditDto();
		auditDto.setIpAddress(request.getRemoteAddr());
		auditDto.setAuditDate(new Date());
		auditDto.setServiceId(request.getRequestURI().split("/")[1].toUpperCase());
		auditService.saveAudit(auditDto);
		return null;
	}

	@Override
	public String filterType() {
		return PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
