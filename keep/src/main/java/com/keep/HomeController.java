package com.keep;

import java.util.Map;

import org.hibernate.Version;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(path = "/")
	String Home () {
		System.out.println("Hibernate Core version: " + Version.getVersionString());
		return "login";
	}
	@GetMapping(path = "/home")
	String Home1 () {
		return "home";
	}
}

