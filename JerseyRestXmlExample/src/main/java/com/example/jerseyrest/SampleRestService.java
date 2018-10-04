package com.example.jerseyrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/{name}")
public class SampleRestService {

	@GET()
	@Produces("application/json")
	public String welcome(@PathParam("name") String name) {
		return "welcome to jersey rest " +name;

	}
}
