/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author SENA
 */
public class SumarMultiplos {
    public void sumarMultiplos() {
        int suma3 = 0;
        int suma4=0;
        int suma5=0;
        int sumatotal=0;
        

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0){
                suma3 += i;
            }
        }
        for (int i = 1; i <= 1000; i++) {
            if (i % 4 == 0) {
                suma4 += i;
            }
        }
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                suma5 += i;
            }
        }
        sumatotal= suma3 + suma4  +suma5;
        
        System.out.println("La suma de los múltiplos de 3  entre 1 y 1000 es: " + suma3);
        System.out.println("la suma de los multiplos de 4 entre 1 y 100 es "+suma4);
        System.out.println("la suma de los multiplos de 5 entre 1 y 100 es "+suma5);
        System.out.println("la suma total de los multiplos es "+sumatotal);
    }
}

