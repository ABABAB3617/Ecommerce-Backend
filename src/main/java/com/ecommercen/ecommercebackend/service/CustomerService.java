package com.ecommercen.ecommercebackend.service;

import com.ecommercen.ecommercebackend.model.Customer;
public interface CustomerService {
    Customer registerCustomer(Customer customer);

    boolean passwordChange(Long id, String passWord);

    Customer updateCustomer(Customer customer);

}
