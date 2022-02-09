package com.relevel.backend.amazonpay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonPayController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

