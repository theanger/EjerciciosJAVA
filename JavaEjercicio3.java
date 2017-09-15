/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaEjercicio3 {

    /**
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje “su nombre
       es XXXXX y XXXXXX es su apellido”
     */
    public static void main(String[] args) {
     
        String nom;
        String ape;
        Scanner mis= new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nom= mis.nextLine();
        System.out.println("Ingrese su apellido");
        ape= mis.nextLine();
        System.out.println("Su nombre es:" + nom + "\nSu apellido es:" + ape);
     // TODO code application logic here
    }
    
}
