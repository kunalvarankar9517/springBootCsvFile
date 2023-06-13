package com.cdac.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Customer;

import jakarta.persistence.Id;

@Repository
public interface CustomerDto extends CrudRepository <Customer, Integer>  {

}
