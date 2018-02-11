package com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial.impl.ItemControllerImpl;

@RunWith(MockitoJUnitRunner.class)
public class SolucionesMockitoTutorialTest {

	@Mock
	private ItemDao itemDaoMock;

	@InjectMocks
	private ItemController itemController = new ItemControllerImpl();

	/**
   * Metodo para probar que la obtencion de todos los items se realiza de
   * forma exitosa.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha recuperado un array con Peonza y
   * Munieca como elementos contenidos.
   */
	@Test
	public void comprobarObtencionExitosaDeTodosLosItems() {
		// ARRANGE
		List<String> retornoObtenido = null;
    Mockito.when(itemDaoMock.obtenerTodosLosItems()).thenReturn(new String[] { "Peonza", "Munieca" });
		// ACT
		try {
			retornoObtenido = itemController.obtenerTodosLosItems();
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		Mockito.verify(itemDaoMock).obtenerTodosLosItems();
    assertThat(retornoObtenido, allOf(is(notNullValue()), contains("Peonza", "Munieca")));
	}

	/**
   * Metodo para probar que la obtencion de todos los items se realiza de
   * forma exitosa, pero haciendo uso de un objeto Answer.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha recuperado un array con Peonza y
   * Munieca como elementos contenidos.
   */
	@Test
	public void comprobarObtencionExitosaDeTodosLosItemsHaciendoUsoDeAnswer() {
		// ARRANGE
		List<String> retornoObtenido = null;
		Answer<String[]> respuesta = new Answer<String[]>() {
			@Override
			public String[] answer(InvocationOnMock invocation) throws Throwable {
        return new String[] { "Peonza", "Munieca" };
			}
		};
		Mockito.when(itemDaoMock.obtenerTodosLosItems()).then(respuesta);
		// ACT
		try {
			retornoObtenido = itemController.obtenerTodosLosItems();
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		Mockito.verify(itemDaoMock).obtenerTodosLosItems();
    assertThat(retornoObtenido, allOf(is(notNullValue()), contains("Peonza", "Munieca")));
	}

	/**
   * Metodo para probar el caso en el que la obtencion de items no devuelve
   * contenido, solo la coleccion instanciada.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha recuperado una coleccionvacia.
   */
	@Test
	public void comprobarObtencionVaciaDeTodosLosItems() {
		// ARRANGE
		List<String> retornoObtenido = null;
		Mockito.when(itemDaoMock.obtenerTodosLosItems()).thenReturn(new String[] {});
		// ACT
		try {
			retornoObtenido = itemController.obtenerTodosLosItems();
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		Mockito.verify(itemDaoMock).obtenerTodosLosItems();
		assertThat(retornoObtenido, allOf(is(notNullValue()), is(empty())));
	}

	/**
   * Metodo para probar el caso en el que la obtencion de items genera una
   * excepcion de tipo NullPointerException. El tipo de la excepcion es
   * indicado como parametro de la anotacion @Test
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha lanzado la excepcion de tipo
   * NullPointerException.
   */
	@Test(expected = NullPointerException.class)
	// FIXME
	public void comprobarPorAnotacionLanzamientoExcepcionPorFaltaInyeccionDaoControlandoPorNotacion() throws Exception {
		// ARRANGE
		Mockito.when(itemDaoMock.obtenerTodosLosItems()).thenThrow(NullPointerException.class);
		// ACT
		try {
			itemController.obtenerTodosLosItems();
		} catch (Exception ex) {
			// ASSERT
			Mockito.verify(itemDaoMock).obtenerTodosLosItems();
			throw ex;
		}
    fail("Se esperaba el lanzamiento de una excepcion no esperada.\n");
	}

	/**
   * Metodo para probar el caso en el que la obtencion de items genera una
   * excepcion de tipo NullPointerException. La prueba no parametriza la
   * anotacion @Test
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha lanzado la excepcion de tipo
   * NullPointerException.
   */
	@Test
	public void comprobarObtencionItemsErroneaPorLanzamientoExcepcionPorFaltaInyeccionDaoControlandoPorCodigo() {
		// ARRANGE
		Mockito.when(itemDaoMock.obtenerTodosLosItems()).thenThrow(NullPointerException.class);
		// ACT
		try {
			itemController.obtenerTodosLosItems();
		} catch (NullPointerException ex) {
			// ASSERT
			Mockito.verify(itemDaoMock).obtenerTodosLosItems();
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
	}

	/**
   * Metodo para probar el caso en el que la actualizacionde un item se lleva
   * a cabo de forma exitosa.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - No se ha lanzado excepcion alguna.
   */
	@Test
	public void comprobarActualizacionExitosaDeItem() {
		// ARRANGE
		String item = "Arco";
		Integer posicion = 1;
		Mockito.doNothing().when(itemDaoMock).actualizarItem(item, posicion);
		// ACT
		try {
			this.itemController.actualizarItem(item, posicion);
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		Mockito.verify(itemDaoMock).actualizarItem(item, posicion);
	}

	/**
   * Metodo para probar el caso en el que la actualizacionde un item provoca
   * una excepcion de tipo ArrayIndexOutOfBoundsException, la cual tiene
   * asociada el mensaje "excepcion esperada". No se hace uso de la
   * parametrizacion de la anotacion @Test
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha lanzado una excepcion de tipo
   * ArrayIndexOutOfBoundsException. - El mensaje de la excepcion es
   * "excepcion esperada".
   */
	@Test
	public void comprobarActualizacionFallidaPorExcederTamanioDelArray() {
		// ARRANGE
		String item = "Arco";
		Integer posicion = 10;
		ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(
        "excepcion esperada");
		Mockito.doThrow(arrayIndexOutOfBoundsException).when(itemDaoMock).actualizarItem(item, posicion);
		// ACT
		try {
			this.itemController.actualizarItem(item, posicion);
		} catch (ArrayIndexOutOfBoundsException ex) {
			// ASSERT
			Mockito.verify(itemDaoMock).actualizarItem(item, posicion);
      assertThat(ex.getMessage(), is("excepcion esperada"));
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
	}

	/**
   * Metodo para probar el caso en el que se realiza una actualizacionexitosa
   * de un item, mostrando ademas por consola la cadena proporcionada, a la
   * que se le han eliminado todos los espacios en blanco.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - Se ha mostrado por consola la cadena
   * "UnoDosTresCuatroCinco".
   */
	@Test
	public void comprobarActualizacionExitosaDeItemMostrandoEnConsolaSuValorEliminandoEspaciosEnBlancoUsandoAnswer() {
		// ARRANGE
		String item = " Uno Dos Tres Cuatro Cinco ";
		Integer posicion = 1;
		Answer<String> respuesta = new Answer<String>() {
			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				String item = invocation.getArgumentAt(0, String.class);
				System.out.println(item.replaceAll("\\s", ""));
				return item;
			}
		};
		Mockito.doAnswer(respuesta).when(itemDaoMock).actualizarItem(item, posicion);
		// ACT
		try {
			this.itemController.actualizarItem(item, posicion);
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		Mockito.verify(itemDaoMock).actualizarItem(item, posicion);
	}

	/**
   * Metodo para probar el caso en el que el reseteo de items se lleva a cabo
   * de forma satisfactoria.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - No se ha lanzado excepcion alguna. -
   * Comprobar que el numero de actualizaciones llevas a cabo son 2.
   */
	@Test
	public void comprobarReseteoExitosoDeItemsVerificandoNumeroEstrictoDeReseteos() {
		// ARRANGE
		String EMPTY_STRING = "";
		Integer[] posiciones = { 2, 3 };
		// ACT
		try {
			itemController.resetearItemsEspecificos(posiciones);
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		Mockito.verify(itemDaoMock, Mockito.times(2)).actualizarItem(Mockito.eq(EMPTY_STRING), Matchers.anyInt());
	}

	/**
   * Metodo para probar el caso en el que el listado de items se lleva a cabo
   * de forma exitosa.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado. - No se ha lanzado excepcion alguna.
   */
	@Test
	public void comprobarListadoItemsParaReseteoConControlEstrictoIvocaciones() {
		// ARRANGE
		String[] items = { "uno", "dos", "tres" };
		Mockito.when(itemDaoMock.obtenerTodosLosItems()).thenReturn(items);
		// ACT
		try {
			itemController.listaItemsParaReseteo();
		} catch (Exception ex) {
      fail("Se ha lanzado una excepcion no esperada.\n");
		}
		// ASSERT
		InOrder inOrder = Mockito.inOrder(itemDaoMock);
		inOrder.verify(itemDaoMock).obtenerTodosLosItems();
		inOrder.verify(itemDaoMock, Mockito.times(3)).actualizarItem(Matchers.any(String.class), Matchers.anyInt());
	}

}
