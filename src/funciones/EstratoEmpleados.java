/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author keinervilla
 */
public class EstratoEmpleados {
    
    int estrato;
    
    public void pedirEstrato(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el estrato");
        estrato = teclado.nextInt(); 
        
    }
    
    String ciudad, nombreCompleto;
    float estatura;
    double distancia;
    
    public void pedirCiudad(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la ciudad");
        ciudad = teclado.next();
        System.out.println("Escriba la estatura");
        estatura = teclado.nextFloat();
        System.out.println("Escriba la distancia");
        distancia = teclado.nextDouble();
        System.out.println("Escriba nombres y apellidos");
        nombreCompleto = teclado.next();
    }
    
    
}
