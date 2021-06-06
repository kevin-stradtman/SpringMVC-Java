package com.stradtman.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FunController {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "fun-form";
	}
}
