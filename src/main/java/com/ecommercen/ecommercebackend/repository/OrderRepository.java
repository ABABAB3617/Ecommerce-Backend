package com.ecommercen.ecommercebackend.repository;

import com.ecommercen.ecommercebackend.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
