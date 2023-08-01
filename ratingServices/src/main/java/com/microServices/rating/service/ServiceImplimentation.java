package com.microServices.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microServices.rating.model.Rating;
import com.microServices.rating.repository.RatingRepository;

@Service
public class ServiceImplimentation implements RatingService {

	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating creatRating(Rating rating) {
		return  ratingRepository.save(rating);
	
	}

	@Override
	public List<Rating> getRatingByUserId(Integer userId) {
		
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(Integer hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
