package tecnicasprogramacion.reto2;

import java.util.Scanner;

/*
@author JoseW

Construir un procedimiento que calcule el cuadrado de los N primeros enteros, 
haciéndolo mediante sumas de números impares, como se observa a continuación:

*/
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el número que desea elevar al cuadrado: ");
        
        int input = lector.nextInt();
        
        int numeroImpar = 0;
        int resultado = 0;
        for (int i = 1; i <= input; i++) {
            numeroImpar = (i * 2) - 1;
            // System.out.println(numeroImpar);
            resultado += numeroImpar;
        }

        System.out.println("El cuadrado del número es: " + resultado);
    
    }
}
