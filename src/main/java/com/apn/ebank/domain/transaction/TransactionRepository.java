/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.transaction;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Phil Silla
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
