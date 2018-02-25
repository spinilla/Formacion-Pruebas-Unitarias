package com.viewnext.formacion2018.pruebasunitarias.ejercicio001;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.viewnext.formacion2018.pruebasunitarias.ejercicio002.Calculadora;

/**
 * Ejercicio002
 * com.viewnext.formacion2018.pruebasunitarias.ejercicio002
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

  @Test
  public void testAssertArrrayEquals() {
    Integer[] array = new Integer[3];
    array[0] = new Integer(1);
    array[1] = new Integer(2);
    array[2] = new Integer(3);
    Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, array);
  }

  @Test
  public void testAssertEquals() {
    Calculadora ej1 = new Calculadora();
    int resultado = ej1.sumar(1, 2);
    Assertions.assertEquals(3, resultado);
  }

  @Test
  public void testAssertNotEquals() {
    char[] aa = "Hola Mundo".toCharArray();
    char[] bb = "Hola Mundo".toCharArray();
    Assertions.assertNotEquals(aa, bb);
  }

  @Test
  public void testAssertFalse() {
    Calculadora ej1 = new Calculadora();
    int resultado = ej1.sumar(1, 2);
    Assertions.assertFalse(4 == resultado);
  }

  @Test
  public void testAssertTrue() {
    Calculadora ej1 = new Calculadora();
    int resultado = ej1.sumar(1, 2);
    Assertions.assertTrue(3 == resultado);
  }

  @Test
  public void testAssertSame() {
    Calculadora calc = new Calculadora();
    Assertions.assertSame(calc, calc);

    String txt1 = "Hola Mundo";
    String txt2 = "Hola Mundo";

    Assertions.assertSame(txt1, txt2);
  }

  @Test
  public void testAssertNotSame() {
    String txt1 = "Hola Mundo";
    String txt2 = "Hola mundo";

    Assertions.assertNotSame(txt1, txt2);
  }

  @Test
  public void testExpectionExpected() {
    try {
      throw new NullPointerException("Exception");
    } catch (Exception ex) {
      Assertions.assertTrue(ex instanceof NullPointerException);
    }
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testExpectionExpectedJUnit5() {
    Calculadora calc = new Calculadora();
    Assertions.assertThrows(ArithmeticException.class, () -> {
      calc.dividir(5, 0);
    });
  }

}
