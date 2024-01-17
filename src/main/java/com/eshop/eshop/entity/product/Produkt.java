package com.eshop.eshop.entity.product;

import com.eshop.eshop.enums.product.ProduktKategorie;
import com.eshop.eshop.enums.product.ProduktType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Entity
@Table(name = "produkty")
@Getter
@Setter
@RequiredArgsConstructor
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nazov;

    @Column(nullable = false)
    private String znacka;

    private Integer zlava;

    @Column(nullable = false)
    private Double cena;

    private Integer hodnotenie;

    private Integer pocetHodnotiacich;

    @Enumerated(EnumType.STRING)
    @Column(name="typ_produktu", nullable = false)
    private ProduktType typ;

    @Enumerated(EnumType.STRING)
    private ProduktKategorie kategoria;

    private String popis;
}
