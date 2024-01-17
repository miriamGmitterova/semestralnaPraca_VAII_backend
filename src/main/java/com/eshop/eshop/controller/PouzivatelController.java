package com.eshop.eshop.controller;

import com.eshop.eshop.entity.user.Pouzivatel;
import com.eshop.eshop.request.SavePouzivatelRequest;
import com.eshop.eshop.service.PouzivatelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class PouzivatelController {
    private final PouzivatelService pouzivatelService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public UUID saveUser(@RequestBody SavePouzivatelRequest request) {
        return pouzivatelService.save(request);
    }

    @GetMapping("/{username}")
    @ResponseStatus(HttpStatus.OK)
    public Pouzivatel getByUsername(@PathVariable String username) {
        return pouzivatelService.findByPouzivatelskeMeno(username);
    }

    @GetMapping("/{username}/getHeslo")
    @ResponseStatus(HttpStatus.OK)
    public String getPasswordByUsername(@PathVariable String username) {
        return pouzivatelService.getHesloByPouzivatelskeMeno(username);
    }

    @PutMapping("/{username}")
    public void updateUserByUsername(@RequestBody SavePouzivatelRequest request, @PathVariable String username) {

    }

    @PutMapping("/{username}/setAdmin/{bool}")
    @ResponseStatus(HttpStatus.OK)
    public void setUserAsAdmin(@PathVariable String username, @PathVariable boolean bool) {
        pouzivatelService.setPouzivatelAsAdmin(username, bool);
    }

    @DeleteMapping("/{username}")
    @ResponseStatus(HttpStatus.OK)
    public int deleteUserByUsername(@PathVariable String username) {
        return pouzivatelService.deletePouzivatelByPouzivatelskeMeno(username);
    }
}
