package com.viewnext.formacion2018.pruebasunitarias.powermock;

public class ItemHelper {
	private static String[] items = { "uno", "dos", "tres" };

	public static String[] obtenerItems() {
		return items;
	}

	public static void imprimirItems() {
		for (String item : items) {
			System.out.println(Integer.parseInt(item));
		}
	}

	public static void imprimirSaludo() {
		SaludosHelper.saludar();
	}
}
