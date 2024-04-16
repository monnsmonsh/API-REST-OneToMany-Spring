package com.api.hotel.repository;

import com.api.hotel.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationRepository extends JpaRepository<Reservation,Long> {
}
