package com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.PrintWriter;
import java.io.StringWriter;
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

// [...]
public class ItemControllerTest {

	// [...]

	/**
   * Metodo para probar que la obtencion de todos los items se realiza de
   * forma exitosa.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha recuperado un array con Peonza y Munieca como elementos contenidos.
   */
	@Test
	public void comprobarObtencionExitosaDeTodosLosItems() {
		// [...]
	}

	/**
   * Metodo para probar que la obtencion de todos los items se realiza de
   * forma exitosa, pero haciendo uso de un objeto Answer.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha recuperado un array con Peonza y Munieca como elementos contenidos.
   */
	@Test
	public void comprobarObtencionExitosaDeTodosLosItemsHaciendoUsoDeAnswer() {
		// [...]
	}

	/**
   * Metodo para probar el caso en el que la obtencion de items no devuelve
   * contenido, solo la coleccion instanciada.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha recuperado una coleccionvacia.
   */
	@Test
	public void comprobarObtencionVaciaDeTodosLosItems() {
		// [...]
	}

	/**
   * Metodo para probar el caso en el que la obtencion de items genera una
   * excepcion de tipo NullPointerException. El tipo de la excepcion es
   * indicado como parametro de la anotacion @Test
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha lanzado la excepcion de tipo NullPointerException.
   */
	@Test
	public void comprobarPorAnotacionLanzamientoExcepcionPorFaltaInyeccionDaoControlandoPorNotacion() throws Exception {
		// [...]
	}

	/**
   * Metodo para probar el caso en el que la obtencion de items genera una
   * excepcion de tipo NullPointerException. La prueba no parametriza la
   * anotacion @Test
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha lanzado la excepcion de tipo NullPointerException.
   */
	@Test
	public void comprobarObtencionItemsErroneaPorLanzamientoExcepcionPorFaltaInyeccionDaoControlandoPorCodigo() {
		// [...]
	}

	/**
   * Metodo para probar el caso en el que la actualizacionde un item se lleva
   * a cabo de forma exitosa.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - No se ha lanzado excepcion alguna.
   */
	@Test
	public void comprobarActualizacionExitosaDeItem() {
		// [...]
	}

	/**
   * Metodo para probar el caso en el que la actualizacionde un item provoca
   * una excepcion de tipo ArrayIndexOutOfBoundsException, la cual tiene
   * asociada el mensaje "excepcion esperada". No se hace uso de la
   * parametrizacion de la anotacion @Test
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha lanzado una excepcion de tipo ArrayIndexOutOfBoundsException.
   * - El mensaje de la excepcion es "excepcion esperada".
   */
	@Test
	public void comprobarActualizacionFallidaPorExcederTamanioDelArray() {
		// [...]
	}

	/**
   * Metodo para probar el caso en el que se realiza una actualizacionexitosa
   * de un item, mostrando ademas por consola la cadena proporcionada, a la
   * que se le han eliminado todos los espacios en blanco.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - Se ha mostrado por consola la cadena "UnoDosTresCuatroCinco".
   */
	@Test
	public void comprobarActualizacionExitosaDeItemMostrandoEnConsolaSuValorEliminandoEspaciosEnBlancoUsandoAnswer() {
		// ARRANGE
		String item = " Uno Dos Tres Cuatro Cinco ";
		// [...]
	}

	/**
   * Metodo para probar el caso en el que el reseteo de items se lleva a cabo
   * de forma satisfactoria.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - No se ha lanzado excepcion alguna.
   * - Comprobar que el numero de actualizaciones llevas a cabo son 2.
   */
	@Test
	public void comprobarReseteoExitosoDeItemsVerificandoNumeroEstrictoDeReseteos() {
		// ARRANGE
		String EMPTY_STRING = "";
		Integer[] posiciones = { 2, 3 };
		// [...]
	}

	/**
   * Metodo para probar el caso en el que el listado de items se lleva a cabo
   * de forma exitosa, comprobando que se han invocado los Metodos en el orden
   * y numero esperado.
   * 
   * Resultado esperado:
   * 
   * - Se invoca el stub generado.
   * - No se ha lanzado excepcion alguna.
   * - Se ha invocado el Metodo obtenerTodosLosItems una sola vez.
   * - Se ha invocado el Metodo actualizarItem tres veces.
   */
	@Test
	public void comprobarListadoItemsParaReseteoConControlEstrictoIvocaciones() {
		// ARRANGE
		String[] items = { "uno", "dos", "tres" };
		// [...]
	}

}
