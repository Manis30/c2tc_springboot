package com.tnsif.restapi_project7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")
	public String welcome() {
		return "Welcome to the RestfulAPI in Spring....";
	}

}
