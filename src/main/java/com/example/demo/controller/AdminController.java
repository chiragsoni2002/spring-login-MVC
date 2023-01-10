package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Registration;
import com.example.demo.model.UserPrincipal;
import com.example.demo.repositry.AdminRepositry;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AdminRepositry adminRepositry;
	
	@GetMapping("/index")
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index");
		return modelAndView;
	}

	
	@GetMapping("/login")
	public ModelAndView login() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/login");
		return modelAndView;
	}
	
	@PostMapping("/process-login")
	public ModelAndView login(@ModelAttribute("userData") Registration registration) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		Registration registration2 = adminRepositry.findByUsername(registration.getUsername());
		
		if(registration2!=null) {
			
			boolean pass = passwordEncoder.matches(registration.getPassword(), registration2.getPassword());
			final UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
		              new UserPrincipal(registration2), registration.getPassword());
			final Authentication authentication = token;
	       	SecurityContextHolder.getContext().setAuthentication(authentication);
	      
	       	modelAndView.setViewName("/index");
			return modelAndView;
		}
		modelAndView.setViewName("redirect:/admin/login");
		return modelAndView;
		
		
	}
	
	
	@GetMapping("/signup")
	public ModelAndView signup() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/registration");
		return modelAndView;
	}
	
	@PostMapping("/signup")
	public ModelAndView signupDetails(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("inputEmail") String inputEmail,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password
			) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		Registration registration = new Registration();
		registration.setFirstName(firstName);
		registration.setLastName(lastName);
		registration.setEmailId(inputEmail);
		registration.setUsername(userName);
		registration.setPassword(passwordEncoder.encode(password));
		registration.setAuthority("ROLE_ADMIN");
		
		adminService.addSignupDetails(registration);
		
		modelAndView.setViewName("redirect:/admin/signup");
		return modelAndView;
		
		
	}
	


}
