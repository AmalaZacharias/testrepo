package com.springmvc.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	
	@RequestMapping("/message")
	public String sendMessage(Model m){
		m.addAttribute("myMessage", "Batch 2 for Spring");
		return "kitchen";
	}
	
	
	@RequestMapping("/supermessage")
	public ModelAndView sendSuperMessage(ModelAndView mv) {
		mv.addObject("food", "Hai from super message");
		mv.setViewName("canteen"); 
		return mv;
	}
}
