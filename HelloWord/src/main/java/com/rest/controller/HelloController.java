package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	String home(ModelMap model) {
		model.addAttribute("title","Dear Viewer");
		model.addAttribute("message", "Hello World and Welcome to SpringBoot");
		return "hello";
	}		
}
