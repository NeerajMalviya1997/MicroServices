package com.microServices.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microServices.rating.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
	List<Rating> findByUserId(Integer userId);
	List<Rating> findByHotelId(Integer hotelId);
	

}
