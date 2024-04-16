package com.api.hotel.controller;


import com.api.hotel.model.Guest;
import com.api.hotel.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/v1/huespedes")//ruta de la api
public class GuestController {

    @Autowired
    private GuestService guestService;

    //GET
    @GetMapping
    public List<Guest> listAll(){
        return guestService.getAllGuests();
    }

    //POST
    @PostMapping
    public Guest create(@RequestBody Guest guest){
        return guestService.createGuest(guest);
    }

    //PUT
    @PostMapping("edit/{id}")
    public Guest update(@RequestBody Guest guest, @PathVariable Long id){
        guest.setIdGuest(id);
        return guestService.updateGuest(guest);
    }

    //DELETE
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        guestService.deleteGuestById(id);
    }

}
