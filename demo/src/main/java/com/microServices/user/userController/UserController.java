package com.microServices.user.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microServices.user.Service.UserServices;
import com.microServices.user.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserServices services;
	
	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user){
	
		User user2=services.sveUser(user);
	
		return new  ResponseEntity<User>(user2,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/{userid}")
	public ResponseEntity<User> getUser(@PathVariable Integer userid){
	
		User user2=services.getUserbyId(userid);
		return new  ResponseEntity<User>(user2,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/all")
	public ResponseEntity<List<User>> getAllUser(){
	
		List<User> user2=services.getallUser();
		return new   ResponseEntity<List<User>>(user2,HttpStatus.ACCEPTED);
		
	}

}
