package com.eshop.eshop.entity.user;

import com.eshop.eshop.entity.order.Objednavka;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Base64;
import java.util.List;
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

    @Column(nullable = false)
    private String heslo;

    @Column(nullable = false)
    private String email;

    private String krstneMeno;

    private String priezvisko;

    @Column(nullable = false)
    private Integer admin;

    @OneToOne
    private Kosik kosik;

    @OneToMany
    private List<Adresa> adresy;

    @OneToMany
    private List<Objednavka> objednavky;
}

