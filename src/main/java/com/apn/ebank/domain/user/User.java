/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apn.ebank.domain.user;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Phil Silla
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    private Status status;

    public enum Status {
        ACTIVE, INACTIVE, RESERVED
    }

    public User setActive() {
        this.status = Status.ACTIVE;
        return this;
    }

    public User setInactive() {
        this.status = Status.INACTIVE;
        return this;
    }

    public User updateUser(User user) {
        this.firstName = user.getFirstName();
        this.middleName = user.getMiddleName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.password = user.getPassword();
        return this;
    }

}
