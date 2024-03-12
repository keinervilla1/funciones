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
public class TareaHoroscopo {
    
    String signoZoodiacal = "";
    
    public void pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su signo zoodiacal");
        signoZoodiacal = teclado.nextLine();

    }
            
    public void procesarDatos(){
        signoZoodiacal = signoZoodiacal.trim();
        signoZoodiacal = signoZoodiacal.toLowerCase();
        
    }
    public void mostrarMensaje(){
        System.out.println("Tu horoscopo es:");
        switch(signoZoodiacal){
            case "aries":
                System.out.println("Te saldra oportunidad");
                break;
            case "piscis":
                System.out.println("Te llamaran al cel");
                break;
            case "tauro":
                System.out.println("Encontraras dinero");
                break;    
            default:
                System.out.println("Signo no existente");
        }
        
    }
    
    
    
    
}
