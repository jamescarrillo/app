package com.redsoluciones.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/restdemo")
public class restdemoAPI {
	
	@GET
	public String rest() {
		return "Hola amigos este es un servicio rest :v!";
	}
	
}
