package com.sapletta.rest.controller;


import com.sapletta.rest.model.Users;
import com.sapletta.rest.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping(value = "/")
    public @ResponseBody String hello() {
        return "Hello";
    }

    @GetMapping(value="/users/all")
    public List<Users> findAll() {
        return userJpaRepository.findAll();
    }

    @GetMapping(value = "/users/{lastName}")
    public Users findByName(@PathVariable final String lastName) {
        return userJpaRepository.findByLastName(lastName);
    }

    @PostMapping(value = "/users/load")
    public Users load(@RequestBody final Users users) {
        userJpaRepository.save(users);
        return userJpaRepository.findByLastName(users.getLastName());
    }
}
