package com.viewnext.formacion2018.pruebasunitarias.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.viewnext.formacion2018.pruebasunitarias.mongo.model.Customer;

/**
 * SpringTutorialMongoTest
 * com.viewnext.formacion2018.pruebasunitarias.mongo.repository
 * 
 * CustomerRepository
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 26 feb. 2018
 */
public interface CustomerRepository extends MongoRepository<Customer,String>{
  public Customer findByFirstName(String firstName);
  public List<Customer> findByLastName(String lastName);
}