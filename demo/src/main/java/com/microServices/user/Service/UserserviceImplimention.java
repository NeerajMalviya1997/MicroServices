package com.microServices.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.microServices.user.model.User;
import com.microServices.user.repository.UserRepository;


@Service
public class UserserviceImplimention implements UserServices {
	
	
	@Autowired
	UserRepository repository;

	@Override
	public User sveUser(User user) {
		// TODO Auto-generated method stub
		repository.save(user);
		return user;
	}

	@Override
	public List<User> getallUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User getUserbyId(Integer userid) {
		// TODO Auto-generated method stub
		return repository.getById(userid);
	}

}
