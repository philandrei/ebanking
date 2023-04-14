/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Phil Silla
 */
@RestController
@RequestMapping("/users")
public class UserCommandResource {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok("Success");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUserById(@PathVariable long id,
            @RequestBody User request) {
        try {
            User user = userRepository.getReferenceById(id);
            userRepository.save(user.updateUser(request));
        } catch (Exception ex) {
            return ResponseEntity.status(503).body(ex.getMessage());
        }
        return ResponseEntity.ok("Id: " + id + " Updated successfully");
    }

    @PatchMapping("/{id}/activate")
    public ResponseEntity<?> activateUser(@PathVariable long id) {
        try {
            User user = userRepository.getReferenceById(id);
            userRepository.save(user.setActive());
            return ResponseEntity.ok("Id: " + id + " Activated");
        } catch (Exception ex) {
            return ResponseEntity.status(503).body(ex.getMessage());
        }

    }

    @PatchMapping("/{id}/deactivate")
    public ResponseEntity<?> deactivateUser(@PathVariable long id) {
        try {
            User user = userRepository.getReferenceById(id);
            userRepository.save(user.setInactive());
            return ResponseEntity.ok("Id: " + id + " Deactivated");
        } catch (Exception ex) {
            return ResponseEntity.status(503).body(ex.getMessage());
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception ex) {
            return ResponseEntity.status(503).body(ex.getMessage());
        }
        return ResponseEntity.ok("Id: " + id + " Deleted successfully");
    }

}
