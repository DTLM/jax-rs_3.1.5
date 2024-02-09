package main.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import main.model.Usuario;

@Path("usuario/")
public class UsuarioController {

	@POST
	@Path("cadastrar/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Usuario usu) {
		System.out.println("Criado usuario: " + usu.getNome());
		return Response.status(Status.CREATED).entity(usu).build();
	}
}
