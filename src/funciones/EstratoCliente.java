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
public class EstratoCliente {
    
    short estrato;
    
    public void pedirEstrato(){
        System.out.println("Ingrese el estrato");
        Scanner teclado = new Scanner(System.in);
        estrato = teclado.nextShort();
        
       
    }
    
    public void clasificarEstrato(){
        if (estrato<3){
            System.out.println("Estrato bajo");
        
        }else{
            System.out.println("Estrato alto");
        }
        
       
    }

    public void ejecutar(){
        pedirEstrato();
        clasificarEstrato();
        
      
    }
}
