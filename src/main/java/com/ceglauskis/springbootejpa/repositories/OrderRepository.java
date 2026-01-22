package com.ceglauskis.springbootejpa.repositories;

import com.ceglauskis.springbootejpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
