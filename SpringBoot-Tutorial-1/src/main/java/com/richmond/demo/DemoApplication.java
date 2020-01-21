package com.richmond.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Controller
	public class SimpleController {
		@Value("${spring.application.name}")
		String appName;

		@GetMapping("/")
		public String homePage(Model model) {
			model.addAttribute("appName", appName);
			return "home";
		}
	}


}
