package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CseController {
	@GetMapping("/home")
	public String rocks() {
		return "welcome to springboot with jenkins world +dp";
	}
	@GetMapping("/rocks")
	public String rocks1() {
		return "welcome to springboot through jenkins environment +dp";
	}

}
