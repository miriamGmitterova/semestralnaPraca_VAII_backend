package com.eshop.eshop.repository.product;

import com.eshop.eshop.entity.product.Doplnok;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DoplnokRepository extends JpaRepository<Doplnok, UUID> {

}

