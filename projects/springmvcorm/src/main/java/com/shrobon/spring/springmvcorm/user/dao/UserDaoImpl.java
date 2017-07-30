package com.shrobon.spring.springmvcorm.user.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.shrobon.spring.springmvcorm.user.entity.User;

@Repository //see the perfect use for this 
public class UserDaoImpl implements UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	private List<User> result;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		// TODO Auto-generated method stub
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		result = hibernateTemplate.loadAll(User.class);
		return result;
	}

	@Override
	public User findUser(Integer id) {
		return hibernateTemplate.get(User.class, id);
	}


}
