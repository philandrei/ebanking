/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.sendmoney;

import lombok.Data;

/**
 *
 * @author Phil Silla
 */
@Data
public class SendMoneyRequest {

    private String recipient;

    private String amount;

}
