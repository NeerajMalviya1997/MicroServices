package com.microServices.hotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microServices.hotel.model.Hotel;
import com.microServices.hotel.repository.HotelRepository;

@Service
public class HotelServicesImplimentation implements HotelServies {
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getallhotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Optional<Hotel> getHotelById(Integer hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId);
	}

}
