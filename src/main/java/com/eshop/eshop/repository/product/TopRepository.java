package com.eshop.eshop.repository.product;


import com.eshop.eshop.entity.product.Top;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TopRepository extends JpaRepository<Top, UUID> {

}

