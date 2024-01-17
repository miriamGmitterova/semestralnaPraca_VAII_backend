package com.eshop.eshop.repository.product;

import com.eshop.eshop.entity.product.Nohavice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NohaviceRepository extends JpaRepository<Nohavice, UUID> {

}

