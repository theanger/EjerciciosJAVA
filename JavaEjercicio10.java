/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaEjercicio10 {

    /**
     * Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
informar cuánto dinero le corresponde a cada uno
     */
    public static void main(String[] args) {
        
        String datoAux;
        Scanner miEscaner = new Scanner(System.in);
        Integer cantidad;
        Double Precio;
        Double total;
        System.out.println("Ingrese cantidad de ganadores: ");
        datoAux= miEscaner.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Ingrese Total ganado: ");
        datoAux= miEscaner.next();
        Precio= Double.parseDouble(datoAux);
        
        total= cantidad*Precio;
        System.out.println("El total a pagar es: "+ total );
        
// TODO code application logic here
    }
    
}
