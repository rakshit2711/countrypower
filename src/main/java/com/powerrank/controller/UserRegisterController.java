package com.powerrank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.powerrank.domain.AuthenticationRequest;
import com.powerrank.domain.AuthenticationResponse;
import com.powerrank.model.User;
import com.powerrank.service.UserService;
@Controller
public class UserRegisterController {
	@Autowired 
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception{
		String str ="Not Registered";
		try {
			userService.register(user);
			 str="Registered";
		} catch (BadCredentialsException e) {
			throw new Exception("User Cannot be inserted", e);
		}
		ResponseEntity<String> res=null;
		if(str.equals("Not Registered"))
			res = new ResponseEntity<String>(str,HttpStatus.BAD_REQUEST);
		else {
			res = new ResponseEntity<String>(str,HttpStatus.OK);
		}
		return res;
	}
}
