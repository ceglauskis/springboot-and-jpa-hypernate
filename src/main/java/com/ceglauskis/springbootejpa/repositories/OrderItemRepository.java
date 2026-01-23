package com.ceglauskis.springbootejpa.repositories;

import com.ceglauskis.springbootejpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
