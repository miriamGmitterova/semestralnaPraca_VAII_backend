package com.eshop.eshop.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Getter
@Setter
@Validated
public class SaveNohaviceRequest {


    @NotNull
    private String nazov;

    private Integer velkost;

    @NotEmpty
    private String popis;


}
