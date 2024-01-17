package com.eshop.eshop.entity.product;

import com.eshop.eshop.enums.product.TopsType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Entity
@Table(name = "topy")
@Getter
@Setter
@RequiredArgsConstructor
public class Top {
    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "typ_topu")
    private TopsType typ;

    @Column(name = "velkosti_a_pocet_kusov")
    private String velkostiAPocetKusov;

    @OneToOne
    @MapsId
    private Produkt produkt;

}
