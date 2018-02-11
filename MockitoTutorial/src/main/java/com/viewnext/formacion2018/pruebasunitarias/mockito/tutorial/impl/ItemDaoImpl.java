package com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial.impl;

import com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial.ItemDao;

public class ItemDaoImpl implements ItemDao {
	private String[] items ;
	
	public ItemDaoImpl(){
		items = new String[]{ "Bal�n", "Maceta", "Lupa" };
	}

	@Override
	public String[] obtenerTodosLosItems() {
		return items;
	}

	@Override
	public void actualizarItem(String nuevoItem, Integer posicion) {
		items[posicion] = nuevoItem;
	}

}
