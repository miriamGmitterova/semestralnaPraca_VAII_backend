package com.eshop.eshop.controller;


import com.eshop.eshop.request.SaveProduktRequest;
import com.eshop.eshop.service.ProduktService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProduktController {
    private final ProduktService produktService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody SaveProduktRequest saveProduktRequest)
    {
        this.produktService.saveProduct(saveProduktRequest);
    }
}

