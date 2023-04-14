/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.rest;

import com.apn.ebank.domain.sendmoney.SendMoneyRequest;
import com.apn.ebank.domain.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Phil Silla
 */
@RestController
@RequestMapping("/customer")
public class TransactionRestConroller {

    @Autowired
    private TransactionService service;

    @PostMapping("/sendmoney")
    public ResponseEntity<?> sendMoney(@RequestBody SendMoneyRequest request) {
        return service.sendMoney(request);
    }

}
