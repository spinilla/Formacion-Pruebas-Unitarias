package com.viewnext.formacion2018.pruebasunitarias.ejercicio001;

/**
 * Ejercicio001
 * com.viewnext.formacion2018.pruebasunitarias.ejercicio001
 * 
 * Calculadora
 * 
 * @author Sergio Pinilla Garcia (Viewnext/IBM)
 * @version 0.1
 * @since 25 feb. 2018
 *
 */
public class Calculadora {

  /**
   * Public Contructor Calculadora
   *
   */
  public Calculadora() {
    super();
  }

  /**
   * Method Calculadora.main
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("START PROCESS->main Calculadora<--");
    Calculadora calc = new Calculadora();
    System.out.println("-->1 + 2 = " + calc.sumar(1, 2) + "<--");
  }

  /**
   * 
   * Method Calculadora.sumar
   *
   * @param x
   *          first number
   * @param y
   *          second number
   * @return result
   */
  public int sumar(int x, int y) {
    return x + y;
  }

  /**
   * 
   * Method Calculadora.restar
   *
   * @param x
   *          first number
   * @param y
   *          second number
   * @return result
   */
  public int restar(int x, int y) {
    return x - y;
  }

  /**
   * 
   * Method Calculadora.dividir
   *
   * @param x
   *          first number
   * @param y
   *          second number
   * @return result
   */
  public int dividir(int x, int y) {
    return x / y;
  }

  /**
   * 
   * Method Calculadora.multiplicar
   *
   * @param x
   *          first number
   * @param y
   *          second number
   * @return result
   */
  public int multiplicar(int x, int y) {
    return x * y;
  }

  /**
   * 
   * Method Calculadora.sumar
   *
   * @param number1
   * @param number2
   * @return
   */
  public Double sumar(Double number1, Double number2) {
    if (number1 == null || number2 == null) {
      throw new NullPointerException();
    } else {
      return Double.sum(number1, number2);
    }
  }
}
