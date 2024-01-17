package com.eshop.eshop.entity.product;

import com.eshop.eshop.enums.product.NohaviceType;
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
    private UUID id;

    @OneToOne
    @MapsId
    private Produkt produkt;

    @Enumerated(EnumType.STRING)
    @Column(name="typ_nohavic")
    private NohaviceType typ;

    @Column(name = "velkosti_a_pocet_kusov")
    private String velkostiAPocetKusov;
}
