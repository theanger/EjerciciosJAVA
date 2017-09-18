/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaEjercicio6 {

    /**Se piden tres números e informar el promedio.
     *
     */
    public static void main(String[] args) {
        int nota1 ,nota2 ,nota3 ;
        int resultado; 
        Scanner msc= new Scanner(System.in);
        System.out.println("Ingrese primera nota: ");
        nota1= msc.nextInt();
        System.out.println("Ingrese segunda nota: ");
        nota2= msc.nextInt();
        System.out.println("Ingrese tercer nota: ");
        nota3= msc.nextInt();
        resultado = (nota1+nota2+nota3) /3;
        System.out.println("El promedio total es: " + resultado);
        
        
        // TODO code application logic here
    }
    
}
