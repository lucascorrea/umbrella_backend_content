package org.secfirst.umbrella.backend.controllers;

import org.secfirst.umbrella.backend.entities.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/healthcheck")
	public Response getHealcheck() {
		return new Response();
	}

	@GetMapping("greeter")
	public String getGreeter(@RequestParam("name") String name) {
		return "Helllo " + name;
	}

}