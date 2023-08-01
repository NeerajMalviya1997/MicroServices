package com.microServices.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microServices.hotel.model.Hotel;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
