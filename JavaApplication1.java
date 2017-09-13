/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numuno;
        System.out.println("Bienvenido");
        Scanner miscan= new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numuno= miscan.nextInt();
        System.out.println("El numero es: "+ numuno);
        // TODO code application logic here
    }
    
}
