package com.example.datajpa.repository;

import com.example.datajpa.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Optional<Customer> findByPhoneNumber(String phoneNumber);

    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phoneNumber);
}
