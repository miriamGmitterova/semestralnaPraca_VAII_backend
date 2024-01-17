package com.eshop.eshop.service;

import com.eshop.eshop.entity.user.Pouzivatel;
import com.eshop.eshop.repository.user.PouzivatelRepository;
import com.eshop.eshop.request.SavePouzivatelRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Validated
public class PouzivatelService {
    private final PouzivatelRepository pouzivatelRepository;
    public UUID save(@Valid SavePouzivatelRequest request) {
        if (pouzivatelRepository.existsPouzivatelByPouzivatelskeMeno(request.getPouzivatelskeMeno()))  {
            throw new RuntimeException("Pouzivatelske meno uz existuje!");
        } else {
            Pouzivatel pouzivatel = new Pouzivatel();
            pouzivatel.setPouzivatelskeMeno(request.getPouzivatelskeMeno());
            pouzivatel.setHeslo(request.getHeslo());
            pouzivatel.setAdmin(0);
            pouzivatel.setEmail(request.getEmail());
            pouzivatel.setKrstneMeno(request.getKrstneMeno());
            pouzivatel.setPriezvisko(request.getPriezvisko());
            return pouzivatelRepository.save(pouzivatel).getId();
        }
    }

    public Pouzivatel findByPouzivatelskeMeno(String pouzivatelskeMeno) {
        return pouzivatelRepository.findPouzivatelByPouzivatelskeMeno(pouzivatelskeMeno);
    }

    public String getHesloByPouzivatelskeMeno(String pouzivatelskeMeno) {
        return pouzivatelRepository.findPouzivatelByPouzivatelskeMeno(pouzivatelskeMeno).getHeslo();
    }

    @Transactional
    public void setPouzivatelAsAdmin(String pouzivatelskeMeno, boolean bool) {
        int adminNumber = 1;
        if (bool) {
            adminNumber = 0;
        }
        if (pouzivatelRepository.existsPouzivatelByPouzivatelskeMeno(pouzivatelskeMeno)) {
            if (pouzivatelRepository.findPouzivatelByPouzivatelskeMeno(pouzivatelskeMeno).getAdmin() == adminNumber) {
                if (bool) {
                    pouzivatelRepository.updateToAdminByPouzivatelskeMeno(pouzivatelskeMeno);
                } else {
                    pouzivatelRepository.updateToUserByPouzivatelskeMeno(pouzivatelskeMeno);
                }
            } else {
                throw new RuntimeException("Pouzivatel uz je tato rola!");
            }
        } else {
            throw new RuntimeException("Pouzivatel neexistuje!");
        }
    }

    @Transactional
    public int deletePouzivatelByPouzivatelskeMeno(String pouzivatelskeMeno) {
        if (pouzivatelRepository.existsPouzivatelByPouzivatelskeMeno(pouzivatelskeMeno)) {
            return pouzivatelRepository.deletePouzivatelByPouzivatelskeMeno(pouzivatelskeMeno);
        } else {
            throw new RuntimeException("Pouzivatel neexistuje!");
        }
    }
}
