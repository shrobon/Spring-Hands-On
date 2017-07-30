package com.shrobon.spring.springmvcorm.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shrobon.spring.springmvcorm.user.dao.UserDao;
import com.shrobon.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
		
	}

	@Override
	public List<User> getUsers() {
		return dao.findUsers();
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}
}
