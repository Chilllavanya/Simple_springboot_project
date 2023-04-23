package com.microservicesDemo.microservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProjectController {
	@GetMapping("/demo")
	public DemoProject retrieve() {
		return new DemoProject(100, 1);
	}
}
