package com.viewnext.formacion2018.pruebasunitarias.ejercicio001;

import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.viewnext.formacion2018.pruebasunitarias.ejercicio002.Calculadora;

/**
 * Ejercicio002_JUnit5
 * com.viewnext.formacion2018.pruebasunitarias.ejercicio001
 * 
 * CompleteTest
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
public class CompleteTest {

  @Test
  void testAssertArrayEquals() {
    // Test will pass
    Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }, "Array Equal Test");

    // Test will fail because element order is different
    Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 3, 2 }, "Array Equal - Test will fail because element order is different");

    // Test will fail because number of elements are different
    Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3, 4 }, "Array Equal - Test will fail because number of elements are different");
  }

  @Test
  void testAssertEquals() {
    Calculadora calc = new Calculadora();
    // Test will pass
    Assertions.assertEquals(4, calc.sumar(2, 2));

    // Test will fail
    Assertions.assertEquals(3, calc.sumar(2, 2), "Calculadora.sumar(2, 2) test failed");

    // Test will fail
    Supplier<String> messageSupplier = () -> "Calculadora.sumar(2, 2) test failed";
    Assertions.assertEquals(3, calc.sumar(2, 2), messageSupplier);
  }

  @Test
  void testAssertNotEquals() {
    Calculadora calc = new Calculadora();
    // Test will pass
    Assertions.assertNotEquals(3, calc.sumar(2, 2));

    // Test will fail
    Assertions.assertNotEquals(4, calc.sumar(2, 2), "Calculadora.sumar(2, 2) test failed");

    // Test will fail
    Supplier<String> messageSupplier = () -> "Calculadora.sumar(2, 2) test failed";
    Assertions.assertNotEquals(4, calc.sumar(2, 2), messageSupplier);
  }

  @Test
  void testAssertFalse() {
    boolean falseBool = false;

    Assertions.assertFalse(2 == 1);
    Assertions.assertFalse(falseBool);
    Assertions.assertFalse(falseBool, "test execution message");
    Assertions.assertFalse(falseBool, CompleteTest::message);
    Assertions.assertFalse(!CompleteTest.getResult(), CompleteTest::message);
  }

  @Test
  void testAssertTrue() {
    boolean trueBool = true;

    Assertions.assertTrue(2 == 2);
    Assertions.assertTrue(trueBool);
    Assertions.assertTrue(trueBool, "test execution message");
    Assertions.assertTrue(trueBool, CompleteTest::message);
    Assertions.assertTrue(CompleteTest::getResult, CompleteTest::message);
    Assertions.assertTrue(CompleteTest.getResult(), CompleteTest::message);
  }

  @Test
  void testAssertNotNull() {
    String nullString = null;
    String notNullString = "viewnext.com";

    // Test will pass
    Assertions.assertNull(nullString);

    // Test will fail
    Assertions.assertNull(notNullString);
  }

  @Test
  void testAssertNull() {
    String nullString = null;
    String notNullString = "viewnext.com";

    // Test will pass
    Assertions.assertNull(nullString);

    // Test will fail
    Assertions.assertNull(notNullString);
  }

  @Test
  void testAssertNotSame() {
    String originalObject = "ibm.com";
    String cloneObject = originalObject;
    String otherObject = "viewnext.com";

    // Test will pass
    Assertions.assertSame(originalObject, cloneObject);

    // Test will fail
    Assertions.assertSame(originalObject, otherObject);
  }

  @Test
  void testAssertSame() {
    String originalObject = "ibm.com";
    String cloneObject = originalObject;
    String otherObject = "viewnext.com";

    // Test will pass
    Assertions.assertSame(originalObject, cloneObject);

    // Test will fail
    Assertions.assertSame(originalObject, otherObject);
  }

  /*
   * #####################################
   * ## STATIC UTILS TO TEST #############
   * #####################################
   */
  /**
   * 
   * Method CompleteTest.message
   *
   * @return Test execution result
   */
  private static String message() {
    return "Test execution result";
  }

  /**
   * 
   * Method CompleteTest.getResult
   *
   * @return true
   */
  private static boolean getResult() {
    return true;
  }

}
