package com.api.hotel.service;

import com.api.hotel.model.Guest;
import com.api.hotel.model.Reservation;
import com.api.hotel.repository.IGuestRepository;
import com.api.hotel.repository.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReservationService {
    @Autowired
    private IReservationRepository iReservationRepository;

    //mostrar reservaciones
    public List<Reservation> getAllReservations(){
        return iReservationRepository.findAll();
    }

    //crear reservacion
    public Reservation createReservation(Reservation reservation){
        return iReservationRepository.save(reservation);
    }

    //edit reservacion
    public Reservation updateReservation(Reservation reservation){
        return iReservationRepository.save(reservation);
    }

    //
    public void deleteReservationtById(Long id){

    }
}
