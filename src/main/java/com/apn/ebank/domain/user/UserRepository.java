/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Phil Silla
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findById(long id);
    
    User findByUsername(String username);
    
}
