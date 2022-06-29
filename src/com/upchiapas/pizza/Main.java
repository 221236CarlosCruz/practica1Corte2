package com.upchiapas.pizza;

import com.upchiapas.pizza.models.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main (String[]args) {

		Scanner teclado = new Scanner(System.in);
		
		CatalogoPizza catalogo = new CatalogoPizza();
		String[] nombre = {"4 quesos", "Mexicana", "Hawaina", "Peperoni"};
		OrdenCompra nombrePedido[] = new OrdenCompra[2];
		ItemCompra cantidadOrden[] = new ItemCompra[2];
		
		String nombrePedido1="";
		int id2=0;
		int tipoPizza=0;
		int cantidadPedidos=0;
		int totalOrdenes=0;
		
		byte cantidad=0;
		byte opcion=0;

		System.out.println("");
		System.out.println("Flamingos Pizza´s");
		
		do {

		System.out.println("");
		System.out.println("1. Mostrar Catalogo de Especialidades.");
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
				System.out.println("Introduce tu id: ");
				id2 = teclado.nextInt();
				System.out.println("Introduce tu tipo de pizza: ");	
				tipoPizza = teclado.nextInt();
				byte candidad = (byte) i;
				cantidadOrden[i] = new ItemCompra(cantidad=(byte)i);
				nombrePedido[i] = new OrdenCompra(nombrePedido1, id2, tipoPizza);
			}
			
			for(int i=0; i<nombrePedido.length; i++) {		
				System.out.println(nombrePedido[i].getNombrePedido()+" "+nombrePedido[i].getId()+" "+nombrePedido[i].getTipoPizza());
			}	
			break;
		case 3:
			for(int i=0; i<cantidadOrden.length; i++) {		
				totalOrdenes = cantidadOrden[i].getCantidad();	
			}
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