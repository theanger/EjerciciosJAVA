/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio12;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaEjercicio12 {

    /**
     * Se ingresa el importe de un producto importado y se le debe agregar el 35 % de impuestos
       internos.
     */
    public static void main(String[] args) {
     int num;
     int porcentaje;
     double resultado;
     
     Scanner msc= new Scanner(System.in);
     System.out.println("Ingrese el importe: ");
     num= msc.nextInt();
     System.out.println("Ingrese el porcenaje de impuesto: ");
     porcentaje= msc.nextInt();
     resultado= num * porcentaje /100 ;
     System.out.println("El agregado de impuestos es: " + resultado);
     
     
     
        
     // TODO code application logic here
    }
    
}
