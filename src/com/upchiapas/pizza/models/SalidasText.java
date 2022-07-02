package com.upchiapas.pizza.models;

import java.util.Scanner;

public class SalidasText {

    Scanner teclado = new Scanner(System.in);
    OrdenCompra nombrePedido[] = new OrdenCompra[2];
    ItemCompra cantidadOrden[] = new ItemCompra[2];
    String[] arregloAux = new String[2];
    String[] A = new String[2];

    String aux;
    int Position = 5, totalOrdenes;
    byte cantidad;

    public void nombrePizza() {
        System.out.println("\n"+"Flamingos Pizza´s");
    }

    public void menu() {
        System.out.println("\n"+"1. Mostrar Catalogo de Especialidades.");
        System.out.println("2. Levantar ordenes de compra");
        System.out.println("3. Reporte de las ventas realizadas");
        System.out.println("4. Salir");
        System.out.print("Seleccione su opcion: ");
    }

    public void terminoPrograma() {
        System.out.println("");
        System.out.println("*****Terminamos el programa*****");
    }

    public void case2() {
        System.out.println("Cuantos pedidos decide realizar: ");
        int cantidadPedidos = teclado.nextInt();

        for(int i=0; i<nombrePedido.length; i++) {
            teclado.nextLine();
            System.out.println("Introduce tu nombre: ");
            String nombrePedido1 = teclado.nextLine();
            System.out.println("Introduce tu tipo de pizza: ");
            String tipoPizza = teclado.nextLine();
            System.out.println("Introduce tu id: ");
            int id2 = teclado.nextInt();

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
    }

    public void case3() {
        for(int i=0; i<cantidadOrden.length; i++)
            totalOrdenes = cantidadOrden[i].getCantidad();

        totalOrdenes= totalOrdenes+1;
        System.out.println("");
        System.out.println("La cantidad de pedidos realizados son: "+ totalOrdenes+ " Pedidos");

    }
}
