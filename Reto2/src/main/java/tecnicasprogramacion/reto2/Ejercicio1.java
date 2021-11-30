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
public class Ejercicio1 {

    public static void main(String[] args) {
        int N = 0;
        int M = 0;
        while (N < 1) {
            System.out.println("ingrese el numero entero N mayor o igual a 1");
            Scanner sc1 = new Scanner(System.in);
            N = sc1.nextInt();
        };
        while (M < 1) {
            System.out.println("ingrese el numero entero M mayor o igual a 1");
            Scanner sc2 = new Scanner(System.in);
            M = sc2.nextInt();
        };
        for (int i = 1; i <= N; i++) {
            System.out.println("La tabla del " + i + " es: ");
            for (int j = 1; j <= M; j++) {
                System.out.println(i + "*" + j + "=" + i * j + " ");
            };
        };

    }
}
