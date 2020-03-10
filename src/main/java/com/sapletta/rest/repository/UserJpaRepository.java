package com.sapletta.rest.repository;

import com.sapletta.rest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {
    Users findByFirstName(String firstName);
    Users findByLastName(String lastName);
}
