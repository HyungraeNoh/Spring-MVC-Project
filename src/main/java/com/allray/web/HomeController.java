package com.allray.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping( "/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping( "/select")
	public String selcet() {
		logger.info("Welcome home! The client locale is {}.",1);
		return "home";
	}
	
	@RequestMapping( "/insert")
	public String insert() {
		logger.info("Welcome home! The client locale is {}.",1);
		return "home";
	}
	
	@RequestMapping( "/update")
	public String update() {
		logger.info("Welcome home! The client locale is {}.",1);
		return "home";
	}
	
	@RequestMapping( "/delete")
	public String delete() {
		logger.info("Welcome home! The client locale is {}.",1);
		return "home";
	}
	
}
