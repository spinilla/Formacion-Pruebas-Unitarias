package com.viewnext.formacion2018.pruebasunitarias.mongo.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * SpringTutorialMongoTest
 * com.viewnext.formacion2018.pruebasunitarias.mongo.model
 * 
 * Customer
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 26 feb. 2018
 *
 */
@Slf4j
@ToString
@NoArgsConstructor
@RequiredArgsConstructor 
public class Customer {

  @Id
  @Getter @Setter private String id;
  @Getter @Setter @NonNull private String firstName;
  @Getter @Setter @NonNull private String lastName;

}

