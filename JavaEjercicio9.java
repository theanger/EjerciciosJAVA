/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio9;

import java.util.Scanner;

/**
 *
 * 
 */
public class JavaEjercicio9 {

    /**
     *Se ingresa la cantidad y precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        
        
        
        
        String datoAux;
        Scanner miEscaner = new Scanner(System.in);
        Integer cantidad;
        Double Precio;
        Double total;
        System.out.println("Ingrese cantidad: ");
        datoAux= miEscaner.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Ingrese precio: ");
        datoAux= miEscaner.next();
        Precio= Double.parseDouble(datoAux);
        
        total= cantidad*Precio;
        System.out.println("El total a pagar es: "+ total );
        
        
        
        
        
        // TODO code application logic here
    }
    
}
