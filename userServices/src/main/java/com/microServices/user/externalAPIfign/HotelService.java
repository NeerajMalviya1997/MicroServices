package com.microServices.user.externalAPIfign;



import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microServices.user.model.Hotel;

@Service
@FeignClient("HOTEL-SERVICES")
public interface HotelService {
	
	@GetMapping("hotel/{hotelId}")
	public Hotel getHotelById(@PathVariable("hotelId") Integer hotelId);
	

}
