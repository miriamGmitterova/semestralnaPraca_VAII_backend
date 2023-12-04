package com.eshop.eshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "pouzivatelia")
@Getter
@Setter
@RequiredArgsConstructor
public class Pouzivatel {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String pouzivatelskeMeno;

    private String heslo;

    private String email;

    private String krstneMeno;

    private String priezvisko;

    private Integer admin;
}
