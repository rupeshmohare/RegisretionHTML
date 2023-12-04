package com.example.html.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.html.entity.User;
import com.example.html.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

}
