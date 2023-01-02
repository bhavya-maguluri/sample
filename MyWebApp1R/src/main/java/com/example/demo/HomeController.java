package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController
{
	@RequestMapping("home")
	
	//public String home(HttpServletRequest req,HttpServletResponse res) 
			//{
			 //HttpSession session=req.getSession();
			 //String name=req.getParameter("name");
			 //System.out.println("Hi  " +name);
			 //session.setAttribute("name",name);
			 //return "home";}
	
	//BY USING MODELANDVIEW
			//public String home(String name,HttpSession session) 
			//{ 
			 //System.out.println("Hi  " +name);
			 //session.setAttribute("name",name);
			 //return "home";
	
	// And also by removing httpsessions
	//request param is used for a name variablewhich maybe different in url
	//public ModelAndView home(@RequestParam("name") String myname) {
		//ModelAndView mv=new ModelAndView();
		//mv.addObject("name",myname);
		//mv.setViewName("home");
		//return mv;
	
	//By using MODEL OBJECT
		public ModelAndView home(Alien alien) {
			ModelAndView mv=new ModelAndView();
			mv.addObject("obj",alien);
			mv.setViewName("home");
			return mv;
	}
}
