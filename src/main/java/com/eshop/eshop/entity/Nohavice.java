package com.eshop.eshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Entity
@Table(name = "nohavice")
@Getter
@Setter
@RequiredArgsConstructor
public class Nohavice {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;

    private String nazov;

    private Integer velkost;

    private String popis;


}
