package com.eshop.eshop.entity.order;

import com.eshop.eshop.entity.product.Produkt;
import com.eshop.eshop.enums.order.DopravaType;
import com.eshop.eshop.enums.order.ObjednavkaState;
import com.eshop.eshop.enums.order.PlatbaState;
import com.eshop.eshop.enums.order.PlatbaType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "objednavky")
@Getter
@Setter
@RequiredArgsConstructor
public class Objednavka {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String krstneMeno;
    private String priezvisko;
    private String email;
    private Integer telefon;
    private String krajina;
    private String obec;

    @Column(name = "ulica_a_cislo_domu")
    private String ulicaACisloDomu;
    private Integer psc;

    @Enumerated(EnumType.STRING)
    private DopravaType typDopravy;

    @Enumerated(EnumType.STRING)
    private PlatbaType typPlatby;

    @Enumerated(EnumType.STRING)
    private PlatbaState stavPlatby;

    @Enumerated(EnumType.STRING)
    private ObjednavkaState stavObjednavky;

    private String casObjednania;
    private String casPlatby;
    private String casDorucenia;

    @ManyToMany
    private List<Produkt> produkty;
    private double cenaSpolu;

}

