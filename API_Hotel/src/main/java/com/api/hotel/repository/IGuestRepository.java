package com.api.hotel.repository;


import com.api.hotel.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGuestRepository extends JpaRepository<Guest,Long>{

}
