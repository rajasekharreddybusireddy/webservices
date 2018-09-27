package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CToFService {
@GET
@Produces("application/json")
	public String ctofservice() {
	
	Double celsius=47.8;
	Double fahrenhiet;
	fahrenhiet=((celsius*9)/5)+32;
		return ""+fahrenhiet;
		
	}
@GET
@Path("{c}")
@Produces("application/json")
	public String ctofservice1(@PathParam("c")Double c) {
	
	Double celsius=c;
	Double fahrenhiet;
	fahrenhiet=((celsius*9)/5)+32;
		return ""+fahrenhiet;
		
	}
}
