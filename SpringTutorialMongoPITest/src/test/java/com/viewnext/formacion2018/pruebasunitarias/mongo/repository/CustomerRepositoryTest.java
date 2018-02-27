package com.viewnext.formacion2018.pruebasunitarias.mongo.repository;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.viewnext.formacion2018.pruebasunitarias.mongo.MongodbExampleApplication;
import com.viewnext.formacion2018.pruebasunitarias.mongo.model.Customer;

import lombok.extern.slf4j.Slf4j;

/**
 * SpringTutorialMongoTest
 * com.viewnext.formacion2018.pruebasunitarias.mongo.repository
 * 
 * CustomerRepositoryTest
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 26 feb. 2018
 *
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { MongodbExampleApplication.class })
public class CustomerRepositoryTest {
  @Autowired
  private CustomerRepository repository;

  @After
  public void after() {
    repository.deleteAll();
  }

  @Test
  public void saveDocument() {
    log.info("--##TEST##--##{}##--##{}##--", this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    Customer customer = new Customer("Alice", "Smith");
    repository.save(customer);
    List<Customer> customers = repository.findByLastName("Smith");
    for (Customer cust : customers) {
      log.debug("--##TEST##--Customer recovered -->{}<--", cust);
    }
    assertThat(customers.get(0).getFirstName(), is(equalTo(customer.getFirstName())));
  }

  @Test
  public void updateDocument() {
    log.info("--##TEST##--##{}##--##{}##--", this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    // save Document
    Customer customer = new Customer("Binod", "Smith");
    repository.save(customer);
    log.info("--##TEST##--Customer saved -->{}<--", customer);
    // update document
    Customer toBeUpdatedCustomer = repository.findByFirstName(customer.getFirstName());
    customer.setLastName("Pandey");
    repository.save(toBeUpdatedCustomer);
    log.info("--##TEST##--Customer updated -->{}<--", toBeUpdatedCustomer);

    // now verify verify
    Customer updatedCustomer = repository.findByFirstName(customer.getFirstName());
    log.info("--##TEST##--Customer founded -->{}<--", toBeUpdatedCustomer);

    assertThat(updatedCustomer.getLastName(), is(equalTo(toBeUpdatedCustomer.getLastName())));

  }

  @Test
  public void deleteDocument() {
    log.info("--##TEST##--##{}##--##{}##--", this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    // save Document
    Customer customer = new Customer("Binod", "Smith");
    repository.save(customer);
    log.info("--##TEST##--Customer saved -->{}<--", customer);
    
    // delete document
    Customer toBeDeletedCustomer = repository.findByFirstName(customer.getFirstName());
    repository.delete(toBeDeletedCustomer);
    log.info("--##TEST##--Customer deleted -->{}<--", toBeDeletedCustomer);

    // now verify the result
    Customer deletedCustomer = repository.findByFirstName(customer.getFirstName());
    log.info("--##TEST##--Customer not founded -->{}<--", deletedCustomer);
    Assert.assertNull(deletedCustomer);

  }
}
