package com.eshop.eshop.service;

import com.eshop.eshop.entity.Nohavice;
import com.eshop.eshop.repository.NohaviceRepository;
import com.eshop.eshop.request.SaveNohaviceRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Validated
public class NohaviceService {

    private final NohaviceRepository nohaviceRepository;

    public UUID save( @Valid SaveNohaviceRequest request) {

        Nohavice nohavice = new Nohavice();
        nohavice.setNazov(request.getNazov());
        nohavice.setVelkost(request.getVelkost());
        nohavice.setPopis(request.getPopis());

        return nohaviceRepository.save(nohavice).getId();

    }

    public Nohavice getById(UUID id) {

        return nohaviceRepository.findById(id).get();
    }

    public void deleteById(UUID id) {

        if (!nohaviceRepository.existsById(id)) {

            throw new RuntimeException("Ucitel neexistuje!");

        } else {
            nohaviceRepository.deleteById(id);
        }
    }

    public List<Nohavice> findAll() {
        return nohaviceRepository.findAll();
    }
}
