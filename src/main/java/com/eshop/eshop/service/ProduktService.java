package com.eshop.eshop.service;

import com.eshop.eshop.repository.product.*;
import com.eshop.eshop.request.SaveProduktRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Validated
public class ProduktService {
    private final ProduktRepository produktRepository;
    private final TopRepository topRepository;
    private final NohaviceRepository nohaviceRepository;
    private final TopankyRepository topankyRepository;
    private final DoplnokRepository doplnokRepository;


    public void saveProduct(@Valid SaveProduktRequest saveProduktRequest) {

    }
}
