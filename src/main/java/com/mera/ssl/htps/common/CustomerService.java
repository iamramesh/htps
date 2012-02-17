package com.mera.ssl.htps.common;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.security.annotation.Secured;

@Path("/cat")
@Produces("application/json")
public interface CustomerService {
	
	@Secured({"ROLE_CUSTOMER", "ROLE_ADMIN" })
	@GET
	@Path("/customers/{id}/")
	Customer getCustomer(@PathParam("id") String id);
	
	@Secured({"ROLE_ADMIN"})
	@PUT
	@Path("/customers/")
	Response updateCustomer(Customer customer);
	
	@Secured({"ROLE_ADMIN"})
	@POST
	@Path("/customers/")
	Response addCustomer(Customer customer);
	
	@Secured({"ROLE_ADMIN"})
	@DELETE
	@Path("/customers/{id}/")
	Response deleteCustomer(@PathParam("id") String id);

}
