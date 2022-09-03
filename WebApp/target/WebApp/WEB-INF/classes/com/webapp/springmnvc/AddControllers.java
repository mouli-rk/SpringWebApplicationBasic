package com.webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddControllers {
	@RequestMapping("/add")
	public void add()
	{
		System.out.println("Hi You are reached");
	}

}
