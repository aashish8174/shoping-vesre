package com.example.shoppingverse.Repository;

import com.example.shoppingverse.Model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository {
    public Customer findByMobNo(String mobileNo);

    public Customer findByEmailId(String email);

    Customer save(Customer customer);
}
