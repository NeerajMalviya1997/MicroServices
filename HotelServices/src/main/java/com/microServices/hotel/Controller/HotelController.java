package com.microServices.hotel.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microServices.hotel.model.Hotel;
import com.microServices.hotel.services.HotelServies;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelServies hotelServies;
	
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelServies.createHotel(hotel));
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Hotel>> getallhotel(){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelServies.getallhotel());
		
	}
	
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Optional<Hotel>> getHotelById(@PathVariable Integer hotelId){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelServies.getHotelById(hotelId));
		
	}
	
	
	
	
}
