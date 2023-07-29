package com.cameron.controller;

import com.cameron.interfaces.IActorService;
import com.cameron.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorController {

	private IActorService actors;
	
	@Autowired
	public ActorController(IActorService actors) {
		this.actors = actors;
	}

	@GetMapping("/rates")
	public String getActors() {
		String response = actors.getRates();
		System.out.println("getting actors");
		return response;
	}

}
