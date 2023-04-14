/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.services;

import com.apn.ebank.domain.sendmoney.SendMoneyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Phil Silla
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public ResponseEntity<?> sendMoney(SendMoneyRequest data) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
