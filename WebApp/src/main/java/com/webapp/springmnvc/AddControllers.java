package com.webapp.springmnvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddControllers implements ACInterface{
	@RequestMapping("/add")
	public String add()
	{
		
		System.out.println("Hi, See on the Web Screen :)");
		return "Info.jsp";
	}

}
