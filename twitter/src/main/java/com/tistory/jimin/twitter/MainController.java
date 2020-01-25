package com.tistory.jimin.twitter;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/{name}.html")
	public String page(@PathVariable String name, Model model) {
		model.addAttribute("pageName", name);
		return "page";
	}
}
