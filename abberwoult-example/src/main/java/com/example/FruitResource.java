package com.example;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

	@GET
	public Collection<Fruit> fruitList() {
		return Collections.emptyList();
	}
}
