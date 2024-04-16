package com.api.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGuest;

    private String name;
    private String lastName;
    private String birthDate;
    private String nationality;
    private String phone;

    //generamos nuestra relacion
    @OneToMany(cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

}
