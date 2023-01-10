package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Registration;
import com.example.demo.model.UserPrincipal;
import com.example.demo.repositry.AdminRepositry;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private AdminRepositry adminRepositry;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Registration user = adminRepositry.findByUsername(username);
		if(user == null) {
        	throw new UsernameNotFoundException("could not found user");
        }
        
        UserPrincipal userPrincipal = new UserPrincipal(user);
        
        return null ;
	}

}
