/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasprogramacion.reto2;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {
    public static void main(String [] args){
        int N =0;
        System.out.println("ingrese el numero N");
        Scanner num = new Scanner(System.in);
        N=num.nextInt();
        int impar = -1;
        for(int i=1; i<=N;i++){
          impar+=2;
          int contador = impar;
            System.out.print("los numeros impares sumados son "+impar+" ");
          for(int j=2;j<=i;j++){
              impar+=2;
              contador+= impar; 
              System.out.print(" "+impar+" ");
          }
            
            System.out.println("\nel cubo del numero "+i+" es: "+contador);
        }
       
    }
}

