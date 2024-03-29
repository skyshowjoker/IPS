package com.example.ads.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;
    String name;
    String email;

}
