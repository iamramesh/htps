package com.mera.ssl.htps.server;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.cxf.interceptor.security.AccessDeniedException;

public class SecurityExceptionMapper implements
		ExceptionMapper<AccessDeniedException> {
	
	public Response toResponse(AccessDeniedException exception) {
        return Response.status(Response.Status.FORBIDDEN).build();
    }

}
