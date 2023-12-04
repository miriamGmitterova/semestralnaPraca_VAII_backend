package com.eshop.eshop.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class SavePouzivatelRequest {

    @NotEmpty
    private String pouzivatelskeMeno;

    @NotEmpty
    private String heslo;

    @NotEmpty
    @Email
    private String email;

    private String krstneMeno;

    private String priezvisko;
}
