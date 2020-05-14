package com.naveen.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
public String sayHi(@RequestParam(value = "name") String name) {
	
	
		return String.format("Hello %s!", name);
}
}
