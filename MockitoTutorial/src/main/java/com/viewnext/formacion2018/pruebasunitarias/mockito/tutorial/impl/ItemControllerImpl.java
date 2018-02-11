package com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial.impl;

import java.util.Arrays;
import java.util.List;

import com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial.ItemController;
import com.viewnext.formacion2018.pruebasunitarias.mockito.tutorial.ItemDao;

public class ItemControllerImpl implements ItemController {
	//[SonarQube] Prueba de comentario interno.
	String EMPTY_STRING = "";
	private ItemDao itemDao;

	public ItemControllerImpl() {
	}

	public ItemControllerImpl(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public List<String> obtenerTodosLosItems() {
		return Arrays.asList(itemDao.obtenerTodosLosItems());
	}

	@Override
	public void actualizarItem(String item, Integer posicion) {
		itemDao.actualizarItem(item, posicion);
	}

	@Override
	public void resetearItemsEspecificos(Integer... posiciones) {
		String EMPTY_STRING = "";
		for (Integer posicion : posiciones) {
			itemDao.actualizarItem(EMPTY_STRING, posicion);
		}
	}

	@Override
	public void listaItemsParaReseteo() {
		Integer posicion = 0;
		for (String item : itemDao.obtenerTodosLosItems()) {
			System.out.println(item);
			itemDao.actualizarItem(EMPTY_STRING, posicion++);
		}
	}
}
