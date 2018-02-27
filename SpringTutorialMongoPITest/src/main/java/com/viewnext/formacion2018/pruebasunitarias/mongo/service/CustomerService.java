package com.viewnext.formacion2018.pruebasunitarias.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.formacion2018.pruebasunitarias.mongo.model.Customer;
import com.viewnext.formacion2018.pruebasunitarias.mongo.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * SpringTutorialMongoPITest
 * com.viewnext.formacion2018.pruebasunitarias.mongo.service
 * 
 * CustomerService
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 26 feb. 2018
 *
 */
@Slf4j
@Service
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;
  
  public Customer getCustomerByFirstName(String firstName) throws Exception {
    Customer valueToReturn = null;
    
    if ( firstName != null ) {
      valueToReturn = customerRepository.findByFirstName(firstName);
    } else {
      throw new IllegalArgumentException ("First Name is Null");
    }
    
    if (valueToReturn != null ) {
      return valueToReturn;
    } else {
      throw new Exception ("Customer NOT found");
    }
  }
}

