package com.oriel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oriel.model.User;
import com.oriel.service.UserService;


@Controller
public class HomeController {
	/*
	 * @Autowired private UserService userService;
	 */

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("about");
		return modelAndView;
	}
	
	@RequestMapping(value = "/contact_us", method = RequestMethod.GET)
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("contact");
		return modelAndView;
	}
	
	@RequestMapping(value = "/Services", method = RequestMethod.GET)
	public ModelAndView services() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("services");
		return modelAndView;
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blog() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("blog");
		return modelAndView;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public ModelAndView joinUs() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("join");
		return modelAndView;
	}
	
	@RequestMapping(value = "/whyoriel", method = RequestMethod.GET)
	public ModelAndView whyOriel() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("whyoriel");
		return modelAndView;
	}
	
	@RequestMapping(value = "/management", method = RequestMethod.GET)
	public ModelAndView Management() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("team");
		return modelAndView;
	}
	

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("registration");
		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/registration", method = RequestMethod.POST) public
	 * ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
	 * ModelAndView modelAndView = new ModelAndView(); User userExists =
	 * userService.findUserByEmail(user.getEmail()); if (userExists != null) {
	 * bindingResult.rejectValue("email", "error.user",
	 * "There is already a user registered with the email provided"); } if
	 * (bindingResult.hasErrors()) { modelAndView.setViewName("registration"); }
	 * else { userService.saveUser(user); modelAndView.addObject("successMessage",
	 * "User has been registered successfully"); modelAndView.addObject("user", new
	 * User()); modelAndView.setViewName("registration");
	 * 
	 * } return modelAndView; }
	 * 
	 * @RequestMapping(value = "/admin/home", method = RequestMethod.GET) public
	 * ModelAndView home() { ModelAndView modelAndView = new ModelAndView();
	 * Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 * User user = userService.findUserByEmail(auth.getName());
	 * modelAndView.addObject("userName", "Welcome " + user.getName() + " " +
	 * user.getLastName() + " (" + user.getEmail() + ")");
	 * modelAndView.addObject("adminMessage",
	 * "Content Available Only for Users with Admin Role");
	 * modelAndView.setViewName("admin/home"); return modelAndView; }
	 */
}
