package com.eshop.eshop.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "adresy")
@Getter
@Setter
@RequiredArgsConstructor
public class Adresa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String krajina;

    @Column(nullable = false)
    private String obec;

    @Column(name = "ulica_a_cislo_domu", nullable = false)
    private String ulicaACisloDomu;

    @Column(nullable = false)
    private Integer psc;
}
