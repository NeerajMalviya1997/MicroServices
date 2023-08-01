package com.microServices.rating.service;

import java.util.List;

import com.microServices.rating.model.Rating;

public interface RatingService {

	
	
	public Rating creatRating(Rating rating);
	
	public List<Rating> getRatingByUserId(Integer userId);
	
	public List<Rating> getRatingByHotelId(Integer hotelId);
}
