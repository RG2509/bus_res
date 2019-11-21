package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Bus;

import com.model.Users;
import com.service.UserServIntf;

@Controller("mycontroller")
public class UserController {
	
		@Autowired
		UserServIntf userservice;
		
		
		@RequestMapping(value="/register" ,method=RequestMethod.GET)
		public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
			//public ModelAndView showRegister() {
		    ModelAndView mav = new ModelAndView("registration");
		    mav.addObject("user", new Users());
		    return mav;
		  }
		
		@RequestMapping(value="/register" ,method=RequestMethod.POST)
		 public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("user") Users user)	
		{
			/*String fullname=request.getParameter("fullname");
			String mobile=request.getParameter("mobile");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			user.setEmail(email);
			user.setFullname(fullname);

			user.setMobile(mobile);
			user.setPassword(password);
			*/
			
			
			
			
			boolean flag=userservice.registerPassenger(user);
			ModelAndView mav= new ModelAndView();
			
			 if (flag)
			 {
				 mav.addObject("status", "Thanks for msg..........................");
			 }
			 else
			 {
				 mav.addObject("status", " NO Thanks for msg..........................");
			 }
			
			 mav.setViewName("success");
			 
			 return mav;
		}
		
		
		
		@RequestMapping(value = "/viewbuses", method = RequestMethod.GET)
		public ModelAndView viewbuses(HttpServletRequest request, HttpServletResponse response) {
			List<Bus>  buslist = userservice.getBuses();
			 ModelAndView mav = new ModelAndView("viewbuses");
			 mav.addObject("buslist", buslist);
			 HttpSession session =request.getSession(false);
			 session.setAttribute("blist", buslist);
			 return mav;
		 }
		
		
		 @RequestMapping(value = "/login", method = RequestMethod.GET)
		  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		    ModelAndView mav = new ModelAndView("login");
		    mav.addObject("user", new Users());
		    return mav;
		  }

		  @RequestMapping(value = "/login", method = RequestMethod.POST)
		  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,   @ModelAttribute Users iuser) {
		    ModelAndView mav = null;
		    Users user = userservice.validateUser(iuser);
		    if (user != null) {
		      mav = new ModelAndView("userhome");
		      //session manage
		      HttpSession session= request.getSession();
		      session.setAttribute("Email", iuser.getEmail());
		    
		    } else {
		      mav = new ModelAndView("login");
		      mav.addObject("message", "Username or Password is wrong!!");
		    }
		    return mav;
		  }


}
