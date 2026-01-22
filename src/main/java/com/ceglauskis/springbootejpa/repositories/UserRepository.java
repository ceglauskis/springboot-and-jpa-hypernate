package com.ceglauskis.springbootejpa.repositories;

import com.ceglauskis.springbootejpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
