/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/*
 *
 * @author alumno
 */
public class JavaApplication6 {

    /**Se necesita pedir dos numeros y sumarlos, mostrar el resultado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerouno;
        int numerodos;
        int resultado;
        Scanner mis= new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        numerouno= mis.nextInt();
        System.out.println("Ingrese el segundo número");
        numerodos= mis.nextInt();
        resultado= numerouno+numerodos;
        System.out.println("El resultado es "+ resultado);
        
          
        
                
    }
    
}
