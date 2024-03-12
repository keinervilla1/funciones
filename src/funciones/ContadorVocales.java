/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author SENA
 */
public class ContadorVocales {

    public void iniciar(){
        String texto = "murcielago";
        System.out.println(texto);
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (esVocal(caracter)) {
                contador++;
            }
        }

        System.out.println("El texto contiene " + contador + " vocales.");
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


