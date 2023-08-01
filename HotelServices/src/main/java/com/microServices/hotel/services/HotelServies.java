package com.microServices.hotel.services;

import java.util.List;
import java.util.Optional;

import com.microServices.hotel.model.Hotel;

public interface HotelServies {
	
	public Hotel createHotel(Hotel hotel);
	
	public List<Hotel> getallhotel();
	
	public Optional<Hotel> getHotelById(Integer hotelId);
	

}
