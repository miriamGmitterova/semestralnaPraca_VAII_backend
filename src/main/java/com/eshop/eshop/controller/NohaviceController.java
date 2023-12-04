package com.eshop.eshop.controller;

import com.eshop.eshop.entity.Nohavice;
import com.eshop.eshop.request.SaveNohaviceRequest;
import com.eshop.eshop.service.NohaviceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/nohavice")
@RequiredArgsConstructor
public class NohaviceController {

    private final NohaviceService nohaviceService;


    @PostMapping("/find-all")
    public List<Nohavice> findAll() {
        return nohaviceService.findAll();

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public UUID saveNohavice(@RequestBody SaveNohaviceRequest request) {
        return nohaviceService.save(request);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Nohavice getById(@PathVariable UUID id) {

        return nohaviceService.getById(id);

    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable UUID id) {
        nohaviceService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateId () {


    }



}
