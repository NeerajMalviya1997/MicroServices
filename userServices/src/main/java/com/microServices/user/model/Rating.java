package com.microServices.user.model;

import java.util.List;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rating {

	private Integer ratingId;
	private Integer UserId;
	private Integer hotelId;
	private Integer rating;
	private String feedBack;
	
	private Hotel hotel;
}
