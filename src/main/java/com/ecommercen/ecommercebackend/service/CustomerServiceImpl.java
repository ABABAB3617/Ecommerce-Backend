package com.ecommercen.ecommercebackend.service;
import  com.ecommercen.ecommercebackend.model.Customer;
import com.ecommercen.ecommercebackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer registerCustomer(Customer customer) {
        Customer saved = customerRepository.save(customer);
        return saved;
    }

    @Override
    public boolean passwordChange(Long id, String passWord) {
        return false;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }
}
