package com.ecommercen.ecommercebackend.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {
@Id
@Setter
@Getter
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double unitPrice;

    private Long availableQuantity;


}
