package com.cameron.controller;

import com.cameron.models.*;
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
	public RateResponse getRates() {
		RateResponse response = rateService.getRates();
		return response;
	}

}
