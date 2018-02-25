package com.viewnext.formacion2018.pruebasunitarias.ejercicio001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

/**
 * Ejercicio001
 * com.viewnext.formacion2018.pruebasunitarias.ejercicio001
 * 
 * CalculadoraTest
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
public class CalculadoraTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

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
   * Test verify ArithmeticException
   *
   */
  @Test
  public void testSumarDoubleDouble_expectedArithmeticException() {
    Calculadora calc = new Calculadora();
    Assertions.assertThrows(ArithmeticException.class, () -> {
      calc.dividir(5, 0);
    });

  }

  /**
   * Method CalculadoraTest.testSumarDoubleDouble_expectedNullPointer
   * Test method for {@link com.viewnext.formacion2018.pruebasunitarias.ejercicio001.Calculadora#sumar(java.lang.Double, java.lang.Double)}.
   * Test verify NullPointerException
   *
   */
  @Test
  public void testSumarDoubleDouble_expectedNullPointerException() {
    Calculadora calc = new Calculadora();
    Assertions.assertThrows(NullPointerException.class, () -> {
      calc.sumar(null, null);
    });

  }

}
