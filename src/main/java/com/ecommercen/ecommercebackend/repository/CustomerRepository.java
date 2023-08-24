package com.ecommercen.ecommercebackend.repository;

import com.ecommercen.ecommercebackend.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
