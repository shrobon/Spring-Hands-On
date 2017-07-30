package com.shrobon.spring.springmvcorm.user.services;

import java.util.List;

import com.shrobon.spring.springmvcorm.user.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();
	
	User getUser(Integer id);
}
