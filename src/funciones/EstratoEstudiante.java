/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EstratoEstudiante {
    
    
    String[] nombreEstudiante = new String[2];
    int[] estratoEstudiante = new int[2];
    
    public void pedirNombreYEstrato(){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombreEstudiante.length; i++) {
            System.out.println("Escriba nombre");
            String unNombreEmpleado = teclado.next();
            System.out.println("Escriba estrato");
            int unEstratoEmpleado = teclado.nextInt();
            nombreEstudiante[i] = unNombreEmpleado;
            estratoEstudiante[i] = unEstratoEmpleado;        

        }
    }
    public void mostrarEstudianteTres() {
        pedirNombreYEstrato();
        for (int i = 0; i < estratoEstudiante.length; i++){
            int elEstrato = estratoEstudiante[i];
            if(elEstrato==3){
                System.out.println("Estudiante "+nombreEstudiante[i]+" es 3");
            }
        }
        
    
    
    
    
}       
            
            
    
   
    
}
