package com.expose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String create() {
		return "";
		
	}
}
