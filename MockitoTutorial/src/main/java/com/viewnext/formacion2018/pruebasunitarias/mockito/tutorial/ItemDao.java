package com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial;

public interface ItemDao {

	String[] obtenerTodosLosItems();

	void actualizarItem(String nuevoItem, Integer posicion);

}
