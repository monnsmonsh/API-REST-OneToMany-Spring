package com.api.hotel.service;

import com.api.hotel.model.Guest;
import com.api.hotel.repository.IGuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private IGuestRepository iGuestRepository;

    //mostrar huespests
    public List<Guest> getAllGuests(){
        return iGuestRepository.findAll();
    }

    //crear huesped
    public Guest createGuest(Guest guest){
        return iGuestRepository.save(guest);
    }

    //edit huesped
    public Guest updateGuest(Guest guest){
        return iGuestRepository.save(guest);
    }

    //
    public void deleteGuestById(Long id){

    }
}
