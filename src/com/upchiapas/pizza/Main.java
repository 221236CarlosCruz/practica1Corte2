package com.upchiapas.pizza;

import com.upchiapas.pizza.models.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[]args) {

		Scanner teclado = new Scanner(System.in);
		String[] A = new String[2];
		CatalogoPizza catalogo = new CatalogoPizza();
		String[] nombre = {"4 quesos.", "Mexicana.", "Hawaina.", "Peperoni."};
		String[] arregloAux = new String[2];
		OrdenCompra nombrePedido[] = new OrdenCompra[2];
		ItemCompra cantidadOrden[] = new ItemCompra[2];

		String nombrePedido1="", aux, tipoPizza="",aux1;
		int id2=0,cantidadPedidos=0,totalOrdenes=0,Position = 5;
		byte cantidad=0, opcion=0;

		System.out.println("\n"+"Flamingos Pizza´s");

		do {
			System.out.println("\n"+"1. Mostrar Catalogo de Especialidades.");
			System.out.println("2. Levantar ordenes de compra");
			System.out.println("3. Reporte de las ventas realizadas");
			System.out.println("4. Salir");

			System.out.print("Seleccione su opcion: ");
			opcion = teclado.nextByte();

			switch(opcion) {
				case 1:
					System.out.println("");
					catalogo.nombresPizza(nombre, nombre.length);
					break;
				case 2:
					System.out.println("Cuantos pedidos decide realizar: ");
					cantidadPedidos = teclado.nextInt();

					for(int i=0; i<nombrePedido.length; i++) {
						teclado.nextLine();
						System.out.println("Introduce tu nombre: ");
						nombrePedido1 = teclado.nextLine();
						System.out.println("Introduce tu tipo de pizza: ");
						tipoPizza = teclado.nextLine();
						System.out.println("Introduce tu id: ");
						id2 = teclado.nextInt();

						cantidadOrden[i] = new ItemCompra(cantidad=(byte)i);
						nombrePedido[i] = new OrdenCompra(nombrePedido1, id2, tipoPizza);
					}

					for(int i=0; i<nombrePedido.length; i++)
						arregloAux[i] += nombrePedido[i].getNombrePedido()+", con identificador: "+nombrePedido[i].getId()+", pidio una pizza: "+nombrePedido[i].getTipoPizza();

					for(int i=0; i<nombrePedido.length; i++)
						arregloAux[i] = arregloAux[i].substring(4,Position) + arregloAux[i].substring(Position+0);

					for(int i=0; i<nombrePedido.length; i++)
						A[i]=arregloAux[i];

					for(int i=1; i<=A.length; i++)
						for(int j=0; j<A.length-i; j++)
							if( A[j].compareTo( A[j+1] ) > 0 ) {
								aux   = A[j];
								A[j]  = A[j+1];
								A[j+1]= aux;
							}

					for(int i=0; i<A.length; i++)
						System.out.println("Pedido a nombre de: "+A[i] +" " );
					break;
				case 3:
					for(int i=0; i<cantidadOrden.length; i++)
						totalOrdenes = cantidadOrden[i].getCantidad();

					totalOrdenes= totalOrdenes+1;
					System.out.println("");
					System.out.println("La cantidad de pedidos realizados son: "+ totalOrdenes+ " Pedidos");
					break;
			}

		}while(opcion!=4);
		System.out.println("");
		System.out.println("Terminamos el programa");
	}
}