package org.jenkins;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
//@SpringBootApplication
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World yeahhh Finally buahahah!";
	}

	public static void main(String[] args) throws Exception {
		System.getProperties().put( "server.port", 8090 ); 
		SpringApplication.run(Example.class, args);
	}

}