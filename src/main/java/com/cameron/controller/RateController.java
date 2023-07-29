package com.cameron.controller;

import com.cameron.interfaces.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RateController {

	private IRateService actors;
	
	@Autowired
	public RateController(IRateService actors) {
		this.actors = actors;
	}

	@GetMapping("/rates")
	public String getActors() {
		String response = actors.getRates();
		System.out.println("getting actors");
		return response;
	}

}
