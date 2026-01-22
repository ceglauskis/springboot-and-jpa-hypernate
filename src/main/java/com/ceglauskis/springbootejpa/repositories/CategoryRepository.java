package com.ceglauskis.springbootejpa.repositories;

import com.ceglauskis.springbootejpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
