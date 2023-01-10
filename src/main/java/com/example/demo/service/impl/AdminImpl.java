package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Registration;
import com.example.demo.repositry.AdminRepositry;
import com.example.demo.service.AdminService;

@Service
public class AdminImpl implements AdminService {
	
	@Autowired
	private AdminRepositry adminRepositry;

	@Override
	public void addSignupDetails(Registration registration) {
		// TODO Auto-generated method stub
		adminRepositry.save(registration);
		
	}

}
