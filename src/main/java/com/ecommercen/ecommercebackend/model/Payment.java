package com.ecommercen.ecommercebackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Payment {
    @Id
    private Long id;
    private String creditCardNumber;

    private String cvv;

    private String expirationDate;

    private String confirmationCode;


}
