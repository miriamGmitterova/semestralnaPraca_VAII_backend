package com.eshop.eshop.repository.product;

import com.eshop.eshop.entity.product.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProduktRepository extends JpaRepository<Produkt, UUID> {
}


