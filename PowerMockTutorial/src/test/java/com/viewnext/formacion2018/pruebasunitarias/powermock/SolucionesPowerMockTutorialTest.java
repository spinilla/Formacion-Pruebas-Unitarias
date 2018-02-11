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

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ItemHelper.class, SaludosHelper.class, ItemController.class })
@SuppressStaticInitializationFor("com.viewnext.formacion2018.pruebasunitarias.powermock.SaludosHelper")
public class SolucionesPowerMockTutorialTest {

	@Spy
	private ItemController itemController = new ItemController();

	@Before
	public void configurarTests() {
		mockStatic(ItemHelper.class, SaludosHelper.class);
	}

	/**
   * Metodo para probar la generacion de un stub de un Metodo estatico que
   * devuelve un valor, haciendo que el mismo devuelva un array distinto al
   * que por codificacion deberia devolver.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado. - Array de cadenas con los valores "one", "two",
   * "three".
   */
	@Test
	public void testObtenerItemsDevolviendoUnArrayDistintoAlCodificado() {
		// ARRANGE
		String[] itemsEsperados = { "one", "two", "three" };
		when(ItemHelper.obtenerItems()).thenReturn(itemsEsperados);
		// ACT
		String[] itemsObtenidos = ItemController.obtenerItems();
		// ASSERT
		verifyStatic();
		ItemHelper.obtenerItems();
		assertThat(itemsObtenidos, is(arrayContaining(itemsEsperados)));
	}

	/**
   * Metodo para probar la generacion de un stub de un Metodo estatico que no
   * retorna valor, haciendo que el mismo no se ejecute.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado. - No se lanza excepci�n alguna.
   */
	@Test
	public void testImprimirItemsEvitandoLanzamientoExcepcion() {
		// ARRANGE
		doNothing().when(ItemHelper.class);
		ItemHelper.imprimirItems();
		// ACT
		ItemController.imprimirItems();
		// ASSERT
		verifyStatic();
		ItemHelper.imprimirItems();
	}

	/**
   * Metodo para probar el mockeo de una clase con un bloque estatico.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado. - No se lanza excepci�n alguna.
   */
	@Test
	public void testSaludarEvitandoLanzamientoExcepcion() {
		// ARRANGE
		doCallRealMethod().when(SaludosHelper.class);
		SaludosHelper.saludar();
		// ACT
		ItemController.saludar();
		// ASSERT
		verifyStatic();
		SaludosHelper.saludar();
	}

	/**
   * Metodo para probar la generacion de un stub de un Metodo privado que
   * retorna valor, haciendo que el mismo devuelva un valor distinto al que
   * por codificaciondeberiadevolver.
   * 
   * Resultado esperado:
   * 
   * - Stub invocado. - No se lanza excepci�n alguna.
   */
	@Test
	public void testRealizarValidacionSinLanzamientoExcepcion() {
		// ARRANGE
		try {
			when(itemController, "obtenerEstadoValidacion").thenReturn(Boolean.TRUE);
		} catch (Exception e) {
			fail("Se ha lanzado una excepcion no esperada generando el stub de un Metodo privado.");
		}
		// ACT
		itemController.realizarValidacion();
		// ASSERT
		try {
			verifyPrivate(itemController).invoke("obtenerEstadoValidacion");
		} catch (Exception e) {
			fail("Se ha lanzado una excepcion no esperada verificando un stub de un Metodo privado.");
		}
	}

	/**
   * Metodo para probar la modificacion del valor de un atributo de instancia
   * de forma que podamos guiar el flujo de ejecucion.
   * 
   * Resultado esperado:
   * 
   * - No se lanza excepci�n alguna.
   */
	@Test
	public void testRealizarValidacionSinLanzamientoExcepcionModificandoInstancia() {
		// ARRANGE
		Whitebox.setInternalState(itemController, "estadoValidacion", Boolean.TRUE);
		// ACT
		itemController.realizarValidacion();
		// ASSERT
	}

	/**
   * Metodo para probar la modificacion de una instanciacion de forma que se
   * tenga control sobre que debe generar la misma.
   * 
   * Resultado esperado:
   * 
   * - Instanciaci�n ejecutada. - Valor instanciado es el esperado. - No se
   * lanza excepci�n alguna.
   */
	@Test
	public void testMockeandoInstanciacion() {
		// ARRANGE
		SimpleDateFormat formateadorFecha = new SimpleDateFormat(ItemController.PATRON_FECHA);
		String fechaEsperada = "01/01/1970 00:00:00";
		String fechaObtenida = null;
		try {
			whenNew(Date.class).withAnyArguments().thenReturn(formateadorFecha.parse(fechaEsperada));
		} catch (ParseException e1) {
			fail("Se ha lanzado una excepcion no esperada parseando una fecha.");
		} catch (Exception e1) {
			fail("Se ha lanzado una excepcion no esperada verificando un stub de una instanciaci�n.");
		}
		// ACT
		fechaObtenida = itemController.obtenerFechaComoCadena();
		// ASSERT
		try {
			verifyNew(Date.class).withNoArguments();
		} catch (Exception e) {
			fail("Se ha lanzado una excepcion no esperada verificando un stub de una instanciaci�n.");
		}
		assertThat(fechaObtenida, is(fechaEsperada));
	}

}
