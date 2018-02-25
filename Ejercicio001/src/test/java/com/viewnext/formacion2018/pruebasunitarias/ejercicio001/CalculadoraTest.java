package com.viewnext.formacion2018.pruebasunitarias.ejercicio001;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Ejercicio001
 * com.viewnext.formacion2018.pruebasunitarias.ejercicio001
 * 
 * CalculadoraTest
 * TODO
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
public class CalculadoraTest {

  /**
   * Test method for {@link com.viewnext.formacion2018.pruebasunitarias.ejercicio001.Calculadora#sumar(int, int)}.
   * Test correcto funcionamiento
   */
  @Test
  public void testSumar() {
    Calculadora calc = new Calculadora();
    int resultado = calc.sumar(1, 2);
    assertEquals(3, resultado);
  }

  /**
   * Test method for {@link com.viewnext.formacion2018.pruebasunitarias.ejercicio001.Calculadora#sumar(java.lang.Double, java.lang.Double)}.
   * Test correcto funcionamiento
   */
  @Test
  public void testSumarDoubleDouble() {
    Calculadora calc = new Calculadora();
    Double resultado = calc.sumar(Double.parseDouble("1"), Double.parseDouble("2"));
    assertTrue(resultado.compareTo(Double.parseDouble("3")) == 0);
  }

  /**
   * Method CalculadoraTest.testSumarDoubleDouble_expectedNullPointer
   * Test method for {@link com.viewnext.formacion2018.pruebasunitarias.ejercicio001.Calculadora#sumar(java.lang.Double, java.lang.Double)}.
   * Test to verify expected NullPointerException
   *
   */
  @Test(expected = NullPointerException.class)
  public void testSumarDoubleDouble_expectedNullPointer() {
    Calculadora calc = new Calculadora();
    Double resultado = calc.sumar(null, null);
  }

  /**
   * Method CalculadoraTest.testSumarDoubleDouble_expectedNullPointer
   * Test method for {@link com.viewnext.formacion2018.pruebasunitarias.ejercicio001.Calculadora#sumar(java.lang.Double, java.lang.Double)}.
   * Test to fail when expected NullPointerException
   * Fail !!
   *
   */
  @Test(expected = NullPointerException.class)
  public void testSumarDoubleDouble_NotExpectedNullPointer() {
    Calculadora calc = new Calculadora();
    Double resultado = calc.sumar(null, null);
  }

}
