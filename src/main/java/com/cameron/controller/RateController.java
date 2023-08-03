package com.cameron.controller;

import com.cameron.interfaces.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RateController {

	private IRateService rateService;
	
	@Autowired
	public RateController(IRateService rateService) {
		this.rateService = rateService;
	}

	@GetMapping("/rates")
	public String getActors() {
		//Call zillow api and get mortgage rates
		String response = rateService.getRates();
		System.out.println("getting rates");
		return response;
	}

}
