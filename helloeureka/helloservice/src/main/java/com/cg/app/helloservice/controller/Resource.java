package com.cg.app.helloservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@RequestMapping("/helloworld")
public class Resource {
	@GetMapping
	public String helloWorld() {
		return "Hello World";

	}

}
