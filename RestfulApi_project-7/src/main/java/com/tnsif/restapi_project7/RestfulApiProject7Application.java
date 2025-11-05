package com.tnsif.restapi_project7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApiProject7Application {

    private final Controller controller;

    RestfulApiProject7Application(Controller controller) {
        this.controller = controller;
    }

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiProject7Application.class, args);
		System.out.print("hello");
	}

}
