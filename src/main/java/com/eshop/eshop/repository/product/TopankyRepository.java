package com.eshop.eshop.repository.product;

import com.eshop.eshop.entity.product.Topanky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TopankyRepository extends JpaRepository<Topanky, UUID> {
}

