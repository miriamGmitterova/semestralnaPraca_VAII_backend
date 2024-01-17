package com.eshop.eshop.entity.user;

import com.eshop.eshop.entity.product.Produkt;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "kosiky")
@Getter
@Setter
@RequiredArgsConstructor
public class Kosik {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private Integer pocetPoloziek;

    @ManyToMany
    private List<Produkt> produkty;
}
