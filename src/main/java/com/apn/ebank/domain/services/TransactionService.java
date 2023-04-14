/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.services;

import com.apn.ebank.domain.sendmoney.SendMoneyRequest;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Phil Silla
 */
public interface TransactionService {
    
    public ResponseEntity<?> sendMoney(SendMoneyRequest data);
    
}
