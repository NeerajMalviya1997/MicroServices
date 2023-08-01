package com.microServices.user.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microServices.user.externalAPIfign.HotelService;
import com.microServices.user.externalAPIfign.RatingServices;
import com.microServices.user.model.Hotel;
import com.microServices.user.model.Rating;
import com.microServices.user.model.User;
import com.microServices.user.repository.UserRepository;




@Service
public class UserserviceImplimention implements UserServices {
	
	
	@Autowired
	private UserRepository repository;

	
	@Autowired
     private RestTemplate restTemplate;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private RatingServices ratingServices;
	
   private Logger logger=LoggerFactory.getLogger(UserserviceImplimention.class);
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
	public Optional<User> getUserbyId(Integer userid) {
		// TODO Auto-generated method stub
//		Rating[] ratingOfUsers	=restTemplate.getForObject("http://RATING-SERVICES/rating/user/"+userid, Rating[].class);
//	    
//		List<Rating> list=Arrays.stream(ratingOfUsers).toList();
		ResponseEntity<List<Rating>> lists = ratingServices.getRatingUserById(userid);
		List<Rating>   list=lists.getBody();
		for(int i=0;i<list.size()-1;i++) {
	    	
	    	
	    	
//			ResponseEntity<Hotel> hotel	=restTemplate.getForEntity("http://HOTEL-SERVICES/hotel/"+list.get(i).getHotelId(), Hotel.class);
//			list.get(i).setHotel(hotel.getBody());
//	    	logger.info("{}",ratingOfUsers);
			Hotel hotel=hotelService.getHotelById(list.get(i).getHotelId());
			list.get(i).setHotel(hotel);
	    }
		
		Optional<User> user=repository.findById(userid);
		user.get().setRating(list);
		return user;
	}

}
