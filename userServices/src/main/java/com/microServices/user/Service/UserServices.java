package com.microServices.user.Service;

import java.util.List;
import java.util.Optional;

import com.microServices.user.model.User;


public interface UserServices {

	
	public User sveUser(User user);
	public List<User> getallUser();
	public Optional<User> getUserbyId(Integer userid);
}
