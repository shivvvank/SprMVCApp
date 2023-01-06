package com.swimsn.SprMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage()
	{
		return "menu";
	}
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
}
