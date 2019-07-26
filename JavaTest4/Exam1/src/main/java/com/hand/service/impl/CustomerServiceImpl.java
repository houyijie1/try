package com.hand.service.impl;

import com.hand.mapper.CustomerMapper;
import com.hand.model.Customer;
import com.hand.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
      private CustomerMapper customerMapper;
    @Override
    public Customer select(Customer customer) {
              Customer customer1=new Customer();
              customer1=customerMapper.select(customer);
           return customer1;
    }
}
