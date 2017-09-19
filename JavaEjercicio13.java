/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaEjercicio13 {

    /**
     * Se ingresa una edad y se informa si es mayor de edad.
     */
    public static void main(String[] args) {
        String datoaux;
        Integer edad;
        Scanner msc= new Scanner(System.in);
        
        System.out.println("Ingrese edad");
        datoaux= msc.next();
        edad= Integer.parseInt(datoaux);
        
        if (edad>17)
        System.out.println("Es mayor");    
       // TODO code application logic here
    }
    
}
