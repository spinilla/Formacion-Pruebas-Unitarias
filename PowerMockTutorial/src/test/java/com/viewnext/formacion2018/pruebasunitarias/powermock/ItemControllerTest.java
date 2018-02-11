package com.viewnext.formacion2018.pruebasunitarias.powermock;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;

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
