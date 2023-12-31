package com.ecommercen.ecommercebackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private  Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Long orderedQuantity;


}
