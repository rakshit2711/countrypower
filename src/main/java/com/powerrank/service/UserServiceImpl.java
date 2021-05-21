package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.powerrank.model.User;
import com.powerrank.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired 
	UserRepository userRepo;
	
	@Override
	public void register(User user) {
		PasswordEncoder pbkdEncoder=new BCryptPasswordEncoder();
		user.setPassword(pbkdEncoder.encode(user.getPassword()));
		userRepo.save(user);
	}

	@Override
	public void makeActive(User user) {
		user.setActive(true);
		userRepo.save(user);
	}

	@Override
	public void makeInActive(User user) {
		user.setActive(false);
		userRepo.save(user);

	}

}
