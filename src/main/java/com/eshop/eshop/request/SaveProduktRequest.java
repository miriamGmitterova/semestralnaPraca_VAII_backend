package com.eshop.eshop.request;

import com.eshop.eshop.enums.product.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class SaveProduktRequest {
    @NotEmpty
    private String nazov;

    @NotEmpty
    private String znacka;

    private Integer zlava;

    @NotEmpty
    private Double cena;

    @Enumerated(EnumType.STRING)
    @NotEmpty
    private ProduktType produkt_typ;

    @Enumerated(EnumType.STRING)
    private ProduktKategorie produkt_kategoria;

    @Enumerated(EnumType.STRING)
    private TopsType top_typ;

    @Enumerated(EnumType.STRING)
    private NohaviceType nohavice_typ;

    @Enumerated(EnumType.STRING)
    private TopankyType topanky_typ;

    @Enumerated(EnumType.STRING)
    private DoplnokType doplnok_typ;
}

