package com.ceglauskis.springbootejpa.repositories;

import com.ceglauskis.springbootejpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
