package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.model.Customer;

public interface CustomerDataAccess {
    Customer findByUserName(String username);
    Customer findByUsernameOrEmail(String username, String email);
    Customer save(Customer customer);
}
