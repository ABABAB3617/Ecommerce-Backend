package com.ecommercen.ecommercebackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "orders")
@Setter
@Getter
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address shippingAddress;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderItem> items = new HashSet<>();

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private Double subTotal;

    private Double shippingCharge;

    private Double tax;

    private Double totalPrice;

}
