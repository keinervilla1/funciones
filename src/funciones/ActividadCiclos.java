/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author SENA
 */
public class ActividadCiclos {
    String[] listaNombres = new String[10];
    
    public void cicloMientras(){
        listaNombres = new String[11];
        listaNombres[0] = "Edward Snowden";
        listaNombres[1] = "Bill Gates";
        listaNombres[2] = "Steve Jobs";
        listaNombres[3] = "Mark Zukerberg";
        listaNombres[4] = "German Cruz";
        listaNombres[5] = "Linus Tolvards";
        listaNombres[6] = "Grigori Perelman";
        listaNombres[7] = "Terrence Tao";
        listaNombres[8] = "James Gosling";
        listaNombres[9] = "Steve Wozniak";
        listaNombres[10] = "Stephen Hawking";
        
        int i=0;
        while (i<listaNombres.length) {
            if (listaNombres[i].endsWith("s")){
                System.out.println("El aprendiz "+i+" es "+listaNombres[i]);
            }
            i++;
        }
    }
    public void comienzanPorSt(){
        int i=0;
        do {            
            if (listaNombres[i].startsWith("St")) {
                System.out.println("El aprendiz "+i+" es "+listaNombres[i]);
                
            }
            i++;
 
        } while (i<listaNombres.length);
        
    }
}
