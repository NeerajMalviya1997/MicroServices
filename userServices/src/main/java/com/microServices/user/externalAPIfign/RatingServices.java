package com.microServices.user.externalAPIfign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.microServices.user.model.Rating;

@FeignClient("RATING-SERVICES")
@Service
public interface RatingServices {
	
	
	@GetMapping("rating/user/{userId}")
	public ResponseEntity<List<Rating>> getRatingUserById(@PathVariable("userId") Integer userId);
}
