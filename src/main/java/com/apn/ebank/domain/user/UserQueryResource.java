/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Phil Silla
 */
@RestController
@RequestMapping("/users")
public class UserQueryResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List> getUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id) {
        try {
            return ResponseEntity.ok(userRepository.findById(id));
        } catch (Exception ex) {
            return ResponseEntity.status(503).body(ex.getMessage());
        }
    }

}
