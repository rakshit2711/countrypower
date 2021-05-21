package com.powerrank.service;

import com.powerrank.model.User;

public interface UserService {
	public void register(User user);
	public void makeActive(User user);
	public void makeInActive(User user);
}
