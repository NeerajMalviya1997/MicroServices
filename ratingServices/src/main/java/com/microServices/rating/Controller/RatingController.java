package com.microServices.rating.Controller;

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


import com.microServices.rating.model.Rating;
import com.microServices.rating.service.RatingService;

@RestController
@RequestMapping("rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	
	@PostMapping("create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ratingService.creatRating(rating));
		
	}
	
	
	@GetMapping("hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingHotelById(@PathVariable("hotelId") Integer hotelId){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ratingService.getRatingByHotelId(hotelId));
		
	}
	
	
	@GetMapping("user/{userId}")
	public ResponseEntity<List<Rating>> getRatingUserById(@PathVariable("userId") Integer userId){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ratingService.getRatingByUserId(userId));
		
	}
	
	
	
}
