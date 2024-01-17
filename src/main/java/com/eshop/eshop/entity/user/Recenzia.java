package com.eshop.eshop.entity.user;

import com.eshop.eshop.entity.product.Produkt;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "recenzie")
@Getter
@Setter
@RequiredArgsConstructor
public class Recenzia {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToOne
    private Pouzivatel pouzivatel;
    @OneToOne
    private Produkt produkt;
    private Integer hodnotenie;
    private String popis;
}

