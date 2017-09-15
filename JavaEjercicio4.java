/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaEjercicio4 {

    /**
     * Al ingresar la edad y el nombre mostrar el siguiente mensaje: “ Usted se llama “ XXXXXX y
       tiene XX años de edad”.
     */
    public static void main(String[] args) {
    
        Scanner mis= new Scanner(System.in);
        String nom;
        int edad;
        System.out.println("Nombre:");
        nom= mis.nextLine();
        System.out.println("Edad:");
        edad= mis.nextInt();
        System.out.println("Usted se llama: "+ nom);
        System.out.println("Su edad es: " + edad);
         
        
        
        
        
        
        
   
   
        
  // TODO code application logic here
    }
    
}
