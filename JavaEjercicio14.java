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
     * @param args the command line arguments
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
