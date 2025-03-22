package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping("/name")
	public String myName() {
		return "Hello SpringBoot";
	}
	
	
	@GetMapping("/profile")
	public String myProfile() {
		return "I'm Bingusala. My registration number is 2020/ICT/37";
	}
}
