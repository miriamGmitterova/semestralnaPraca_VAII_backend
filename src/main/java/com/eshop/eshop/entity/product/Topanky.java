package com.eshop.eshop.entity.product;

import com.eshop.eshop.enums.product.TopankyType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "topanky")
@Getter
@Setter
@RequiredArgsConstructor
public class Topanky {
    @Id
    private UUID id;

    @OneToOne
    @MapsId
    private Produkt produkt;

    @Column(name = "velkosti_a_pocet_kusov")
    private String velkostiAPocetKusov;

    @Enumerated(EnumType.STRING)
    private List<TopankyType> kategorie;
}

