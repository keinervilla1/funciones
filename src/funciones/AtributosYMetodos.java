/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author SENA
 */
public class AtributosYMetodos {
    
    String nombre = "Roland Deschain";
    short edad = 16;
    int poblacion = 1_200_000;
    long enteroLargo = 200_045_320_202l;
    char vocal = 'a';
    float altura = 1_500.253f;
    double distancia = 194_000_200_230.0000494;
    boolean esNoche = false;
    
    public void mostrarVariables(){
        System.out.println("Nombre:      "+nombre);
        System.out.println("Edad:        "+edad);
        System.out.println("Población:   "+poblacion);
        System.out.println("Entero Largo:"+enteroLargo);
        System.out.println("Vocal:       "+vocal);
        System.out.println("Altura:      "+altura);
        System.out.println("Distancia:   "+distancia);
        System.out.println("Es de noche?:"+esNoche);
    
   }
    public void dividirDosnumeros(){
        float numero=220f;
        float valor=12f;
        float resultado = numero / valor;
        System.out.println("resultado="+resultado);
    }
    public void multiplicarDosNumeros(int cantidad, int precio){
        int total = precio * cantidad;
        System.out.println("total="+total);        
    }
    public int restarDosNumeros(int cotizacion, int presupuesto){
        int respuesta = cotizacion - presupuesto;
        return respuesta;
    
    }
    public double sumarDosNumeros(double poblacion, double dato){
        double salida = poblacion + dato;
        return salida;                 
    }
    public void mostrarSumayResta(){
        int resta =restarDosNumeros(48,14);
        double suma = sumarDosNumeros(65, 12);
        System.out.println("la resta es ="+resta); 
        System.out.println("la suma es ="+suma); 
        
    
    }  
    
    
}
    
    
