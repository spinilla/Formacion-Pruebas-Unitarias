package com.viewnext.formacion2018.pruebasunitarias.powermock;

import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.powermock.api.mockito.PowerMockito.doCallRealMethod;
import static org.powermock.api.mockito.PowerMockito.doNothing;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyNew;
import static org.powermock.api.mockito.PowerMockito.verifyPrivate;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

// [...]
public class ItemControllerTest {

  // [...]

  @Before
  public void configurarTests() {
    // [...]
    fail("Not implemented yet !!");
  }

  /**
   * Metodo para probar la generacion de un stub de un Metodo estatico que
   * devuelve un valor, haciendo que el mismo devuelva un array distinto al
   * que por codificacion deberia devolver.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado.
   * - Array de cadenas con los valores "one", "two", "three".
   */
  @Test
  public void testObtenerItemsDevolviendoUnArrayDistintoAlCodificado() {
    // [...]
    fail("Not implemented yet !!");
  }

  /**
   * Metodo para probar la generacion de un stub de un Metodo estatico que no
   * retorna valor, haciendo que el mismo no se ejecute.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado.
   * - No se lanza excepcion alguna.
   */
  @Test
  public void testImprimirItemsEvitandoLanzamientoExcepcion() {
    // [...]
    fail("Not implemented yet !!");
  }

  /**
   * Metodo para probar el mockeo de una clase con un bloque estatico.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado.
   * - No se lanza excepcion alguna.
   */
  @Test
  public void testSaludarEvitandoLanzamientoExcepcion() {
    // [...]
    fail("Not implemented yet !!");
  }

  /**
   * Metodo para probar la generacion de un stub de un Metodo privado que
   * retorna valor, haciendo que el mismo devuelva un valor distinto al que
   * por codificaciondeberiadevolver.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado.
   * - No se lanza excepcion alguna.
   */
  @Test
  public void testRealizarValidacionSinLanzamientoExcepcion() {
    // [...]
    fail("Not implemented yet !!");
  }

  /**
   * Metodo para probar la modificacion del valor de un atributo de instancia
   * de forma que podamos guiar el flujo de ejecucion.
   * 
   * Resultado esperado:
   * 
   * - No se lanza excepcion alguna.
   */
  @Test
  public void testRealizarValidacionSinLanzamientoExcepcionModificandoInstancia() {
    // [...]
    fail("Not implemented yet !!");
  }

  /**
   * Metodo para probar la modificacion de una instanciacion de forma que se
   * tenga control sobre que debe generar la misma.
   * 
   * Resultado esperado:
   * 
   * - Instanciacion ejecutada.
   * - Valor instanciado es el esperado.
   * - No se lanza excepcion alguna.
   */
  @Test
  public void testMockeandoInstanciacion() {
    // [...]
    fail("Not implemented yet !!");
  }

}
