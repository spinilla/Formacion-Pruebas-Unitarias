package com.viewnext.formacion2018.pruebasunitarias.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.viewnext.formacion2018.pruebasunitarias.mongo.MongodbExampleApplication;
import com.viewnext.formacion2018.pruebasunitarias.mongo.model.Customer;
import com.viewnext.formacion2018.pruebasunitarias.mongo.repository.CustomerRepository;
import com.viewnext.formacion2018.pruebasunitarias.mongo.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

/**
 * SpringTutorialMongoPITest
 * com.viewnext.formacion2018.pruebasunitarias.mongo.service
 * 
 * CustomerServiceTest
 * TODO
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 26 feb. 2018
 *
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { MongodbExampleApplication.class })
public class CustomerServiceTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  @Autowired
  private CustomerService service;
  
  @Autowired
  private CustomerRepository repository;

  private final String FIRST_NAME = "Alice";
  private final String LAST_NAME = "Liddell";
  
  /**
   * Method CustomerServiceTest.setUp
   * Preparacion de cada uno de los test guardando un registro
   */
  @Before
  public void setUp() {
    Customer customer = new Customer(FIRST_NAME, LAST_NAME);
    repository.save(customer);
  }

  /**
   * Method CustomerServiceTest.after
   * Reseteo de la tabla tras cada uno de los test
   */
  @After
  public void after() {
    repository.deleteAll();
  }

  /**
   * Test method for {@link com.viewnext.formacion2018.pruebasunitarias.mongo.service.CustomerService#getCustomerByFirstName(java.lang.String)}.
   * Objetivo:
   * - Testear la recuperacion del registro insertado
   * Resultado:
   * - Se debe recibir el cliente con el lastName Lidell
   * 
   * @throws Exception 
   */
  @Test
  public void testGetCustomerByFirstName() throws Exception {
    String firstName = "Alice";
    Customer customer = service.getCustomerByFirstName(firstName);
    
    assertThat(LAST_NAME, equalTo(customer.getLastName()));
  }

  /**
   * Method CustomerServiceTest.testGetCustomerByFirstName_firstNameIsNull
   * Objetivo:
   * - Testear el comportamiento de la aplicacion al recibir el parametro null
   * Resultado:
   * - Se debe recibir la excepcion IllegalArgumentException
   *
   * @throws Exception
   */
  @Test(expected = IllegalArgumentException.class)
  public void testGetCustomerByFirstName_firstNameIsNull() throws Exception {
    Customer customer = service.getCustomerByFirstName(null);
  }

  /**
   * Method CustomerServiceTest.testGetCustomerByFirstName_firstNameIsNull
   * Objetivo:
   * - Testear el comportamiento de la aplicacion al no recuperar ningun parametro de la BDD
   * Resultado:
   * - Se debe recibir la excepcion Exception
   *
   * @throws Exception
   */
  @Test(expected = Exception.class)
  public void testGetCustomerByFirstName_WithOutRegister() throws Exception {
    Customer customer = service.getCustomerByFirstName("NotFound");
  }
}

