package com.insags.hamcresttutorial;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.either;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class HamcrestTutorialTest {

	/**
	 * Test que realiza la comprobaci�n del valor obtenido con respecto al
	 * esperado de cuatro formas distintas.
	 */
	@Test
	public void comprobarDeCuatroFormasCadenasIguales() {
		String expected = "Expected";
		String actual = "Expected";
	}

	/**
	 * Test para comprobar que el n�mero proporcionado es menor que con el que
	 * se compara.
	 */
	@Test
	public void comprobarNumeroProporcionadoMenorQueValorDado() {
		Integer numeroProporcionado = 7;
		Integer valorDado = 10;
	}

	/**
	 * Test para comprobar que el n�mero proporcionado es menor que con el que
	 * se compara.
	 */
	@Test
	public void comprobarNumeroProporcionadoMayorQueValorDado() {
		Integer numeroProporcionado = 7;
		Integer valorDado = 5;
	}

	/**
	 * Test para comprobar que una cadena lo es sin hacer uso de 'instanceof'.
	 */
	@Test
	public void comprobarQueEsUnaCadenaSinImportarValorContenido() {
		String cualquierCadena = "Cualquiera";
	}

	/**
	 * Test para la comprobaci�n estricta del orden de los elementos de un
	 * array.
	 */
	@Test
	public void comprobarContenidoArrayConEstrictezEnOrden() {
		String[] cadenas = { "uno", "dos", "tres" };
	}

	/**
	 * Test para la comprobaci�n laxa del orden de los elementos de un array.
	 */
	@Test
	public void comprobarContenidoArrayConLaxitudEnOrden() {
		String[] cadenas = { "uno", "dos", "tres" };
	}

	/**
	 * Test para la comprobaci�n estricta de orden de los elementos de un array
	 * donde: <br/>
	 * - El primer elemento comience por "un". <br/>
	 * - El segundo elemento sea igual a "dos". <br/>
	 * - El tercer elemento termine por "es".
	 */
	@Test
	public void comprobarRestriccionesContenidoArrayConEstrictez() {
		String[] cadenas = { "uno", "dos", "tres" };
	}

	/**
	 * Test para la comprobaci�n laxa del orden de los elementos de un array
	 * donde: <br/>
	 * - Un elemento comience por "un". <br/>
	 * - Un elemento sea igual a "dos". <br/>
	 * - Un elemento termine por "es".
	 */
	@Test
	public void comprobarRestriccionesContenidoArrayConLaxitud() {
		String[] cadenas = { "dos", "tres", "uno" };
	}

	/**
	 * Test para comprobar el tamanio de un array.
	 */
	@Test
	public void comprobarTamanioArray() {
		String[] cadenas = { "uno", "dos", "tres" };
		Integer tamanyo = 3;
	}

	/**
	 * Test para comprobar que el tamanio de un array es menor que un tamanio
	 * dado.
	 */
	@Test
	public void comprobarTamanioArrayMenorQueTamanyoDado() {
		String[] cadenas = { "uno", "dos", "tres" };
		Integer tamanyoDado = 4;
	}

	/**
	 * Test para comprobar que el tamanio de un array es mayor que un tamanio
	 * dado.
	 */
	@Test
	public void comprobarTamanioArrayMayorQueTamanyoDado() {
		String[] cadenas = { "uno", "dos", "tres" };
		Integer tamanyoDado = 2;
	}

	/**
	 * Test para comprobar que un n�mero esta pr�ximo a otro dentro de una
	 * cierta cantidad.
	 */
	@Test
	public void comprobarProximidadEntreNumeros() {
		Double valorReferencia = 6.8;
		Double valorComprobacion = 7.0;
		Double proximidad = 0.5;
	}

	/**
	 * Test para la comprobaci�n de forma estricta el orden de los elementos de
	 * una lista.
	 */
	@Test
	public void comprobarOrdenContenidoListaConEstrictez() throws Exception {
		List<String> strings = Arrays.asList("uno", "dos", "tres");
	}

	/**
	 * Test para la comprobaci�n estricta de orden de los elementos de una lista
	 * donde: <br/>
	 * - El primer elemento comience por "un". <br/>
	 * - El segundo elemento termine por "es". <br/>
	 * - El tercer elemento sea igual a "dos".
	 */
	@Test
	public void comprobarRestriccionesContenidoListaConEstrictez() throws Exception {
		List<String> cadenas = Arrays.asList("uno", "tres", "dos");
	}

	/**
	 * Test para la comprobaci�n de forma estricta el orden de los elementos de
	 * una lista.
	 */
	@Test
	public void comprobarContenidoListaConLaxitud() throws Exception {
		List<String> cadenas = Arrays.asList("uno", "dos", "tres");
	}

	/**
	 * Test para la comprobaci�n laxa de orden de los elementos de una lista
	 * donde: <br/>
	 * - Un elemento termine por "es". <br/>
	 * - Un elemento comience por "un". <br/>
	 * - Un elemento sea igual a "dos".
	 */
	@Test
	public void comprobarRestriccionesContenidoListaConLaxitud() throws Exception {
		List<String> cadenas = Arrays.asList("uno", "tres", "dos");
	}

	/**
	 * Test para comprobar que una cadena contiene otra dada.
	 */
	@Test
	public void test_containsString() {
		String cadena = "Cadena";
		String subcadena = "ade";
	}

	/**
	 * Test para comprobar si un array no es null.
	 */
	@Test
	public void comprobarSiArrayNoEsNull() {
		String[] array = new String[0];
	}

	/**
	 * Test para comrpobar si una colecci�n no es null.
	 */
	@Test
	public void comprobarSiColeccionNoEsNull() {
		Set<String> coleccion = new HashSet<String>();
	}

	/**
	 * Test para comprobar si un array est� vac�o.
	 */
	@Test
	public void comprobarArrayVacio() {
		String[] array = new String[0];
	}

	/**
	 * Test para comrpobar si una colecci�n est� vac�a.
	 */
	@Test
	public void comprobarColeccionVacia() {
		Set<String> coleccion = new HashSet<String>();
	}

	/**
	 * Test para comprobar que dos cadenas son iguales ignorando las
	 * may�sculas/min�sculas.
	 */
	@Test
	public void comprobarCadenasIgnorandoMayusculasMinusculas() {
		String cadenaEsperada = "valor";
		String cadenaObtenida = "VaLoR";
	}

	/**
	 * Test para comprobar si un array contiene un valor concreto.
	 */
	@Test
	public void test_hasItemInArray() {
		Integer[] array = { 1, 2, 7, 5, 4, 8 };
		Integer valor = 4;
	}

	/**
	 * Test para comprobar si una lista contiene un valor mayor que uno dado.
	 */
	@Test
	public void comprobarListaContieneResticcionMayorQueValor() {
		List<Integer> lista = Arrays.asList(1, 2, 7, 5, 4, 8);
		Integer valor = 6;
	}

	/**
	 * Test para comprobar si un mapa tiene una clave dada.
	 */
	@Test
	public void comprobarMapaContieneEntradaConcreta() {
		Integer clave = 1;
		String valor = "uno";
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(clave, valor);
	}

	/**
	 * Test para comprobar, en una sola l�nea, que una cadena cumple con todas
	 * las siguientes restricciones: <br/>
	 * - Comienza por "En un lugar". <br/>
	 * - Contiene la cadena "cuyo nombre". <br/>
	 * - Termina en puntos suspensivos ("...").
	 */
	@Test
	public void comprobarMultiplesRestriccionesEnCadena() {
		String cadena = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme...";
	}

	/**
	 * Test para comprobar, en una sola l�nea, que una cadena cumple con alguna
	 * de las siguientes restricciones: <br/>
	 * - Contiene la cadena "remember". <br/>
	 * - Contiene la cadena "vendetta".
	 */
	@Test
	public void comprobarAlgunaRestriccionEnCadena() {
		String cadena = "Remember, remember the fifth of November, the gunpowder treason and plot.";
	}

	/**
	 * Test para comprobar, en una sola l�nea, que una cadena cumple con todas
	 * las siguientes restricciones: <br/>
	 * - Comienza por "�Hola". <br/>
	 * - Termina por "mundo!".
	 */
	@Test
	public void comprobarAmbasRestriccionesEnCadena() {
		String cadena = "�Hola, mundo!";
	}

	/**
	 * Test para comprobar, en una sola l�nea, que una cadena cumple con alguna
	 * las siguientes restricciones: <br/>
	 * - Comienza por "�Hola". <br/>
	 * - Termina por "mundo!".
	 */
	@Test
	public void comprobarSoloUnaRestriccionEnCadena() {
		String cadena = "�Hola, mundo.";
	}
}
