package com.eshop.eshop.entity.product;

import com.eshop.eshop.enums.product.DoplnokType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "doplnky")
@Getter
@Setter
@RequiredArgsConstructor
public class Doplnok {
    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "typ_doplnku")
    private DoplnokType typ;

    @OneToOne
    @MapsId
    private Produkt produkt;
}

