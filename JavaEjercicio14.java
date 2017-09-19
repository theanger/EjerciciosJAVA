/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio14;

import java.util.Scanner;

/**
 *
 *Se pide ingresar una clave, si es "utn750" se mostrará el mensaje "Bienvenido", 
 * de lo contrario el mensaje "Clave Erronea".
 */
public class JavaEjercicio14 {

    /**
     * 15, se ingresa un importe, si supera los $100 se le suma un 23%, si es menor a 100
     * se le descuenta el 50%
     * 16, Se ingresa el importe de un pasaje de avión y el mes de viaje, si es enero; se les descuenta un 10%
     * por temporada baja.
     */
    public static void main(String[] args) {
     
        Scanner msc= new Scanner(System.in);
        String Clave;
        
        System.out.println("Ingrese contraseña");
        Clave = msc.next();
      
        
        if (Clave.equals("utn750"))
        {
        System.out.println("Bienvenido");
        
        }else
        System.out.println("Contraseña incorrecta");
        
        
       
      
        
       
     // TODO code application logic here
    }
    
}
