package com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial;

import java.util.List;

public interface ItemController {
	List<String> obtenerTodosLosItems();

	void actualizarItem(String item, Integer posicion);

	void resetearItemsEspecificos(Integer... posiciones);
	
	public void listaItemsParaReseteo();
}
