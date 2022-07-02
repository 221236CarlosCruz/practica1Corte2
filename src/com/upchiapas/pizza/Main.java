package com.upchiapas.pizza;

import com.upchiapas.pizza.models.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[]args) {

		Scanner teclado = new Scanner(System.in);

		CatalogoPizza catalogo = new CatalogoPizza();
		String[] nombre = {"4 quesos.", "Mexicana.", "Hawaina.", "Peperoni."};
		SalidasText imprimir = new SalidasText();

		byte opcion=0;

		imprimir.nombrePizza();

		do {
			imprimir.menu();
			opcion = teclado.nextByte();

			switch(opcion) {
				case 1:
					System.out.println("");
					catalogo.nombresPizza(nombre, nombre.length);
					break;
				case 2:
					imprimir.case2();
					break;
				case 3:
					imprimir.case3();
					break;
			}

		}while(opcion!=4);
		imprimir.terminoPrograma();
	}
}