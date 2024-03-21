package com.example.demo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
