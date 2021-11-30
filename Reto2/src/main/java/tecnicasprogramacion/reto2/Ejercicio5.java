package tecnicasprogramacion.reto2;

import java.util.Scanner;

/**
 *
 * @author JoseW
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        while (true) {
            imprimirMenu();
            System.out.println("Digite una de las opciones: ");
            int eleccionUsuarioMenú = lector.nextInt();

            if (eleccionUsuarioMenú == 1) {
                ejercicio1();
            } else if (eleccionUsuarioMenú == 2) {
                ejercicio2();
            } else if (eleccionUsuarioMenú == 4) {
                ejercicio4();
            } else if (eleccionUsuarioMenú == 5) {
                break;
            } else {
                System.out.println("Elección Incorrecta!!!");
            }
        }

    }

    public static void imprimirMenu() {
        System.out.println("******************************************************************");
        System.out.println("MENU:");
        System.out.println("1. Tablas de multiplicar dado dos números. \n"
                + "2. Calcular el cuadrado de un número con la suma de los impares. \n"
                + "3. Calcular el cubo de un número usando los cubos de Nicómaco. \n"
                + "4. Mostrar las denominaciones de una cierta cantidad de dinero. \n"
                + "5. Finalizar programa");
        System.out.println("******************************************************************");
    }

    public static void ejercicio1() {
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

    public static void ejercicio2() {
        Scanner lectorUser = new Scanner(System.in);
        System.out.println("Digite el número que desea elevar al cuadrado: ");

        int input = lectorUser.nextInt();

        int numeroImpar = 0;
        int resultado = 0;
        for (int i = 1; i <= input; i++) {
            numeroImpar = (i * 2) - 1;
            // System.out.println(numeroImpar);
            resultado += numeroImpar;
        }

        System.out.println("El cuadrado del número es: " + resultado);
    }

    public static void ejercicio4() {

        Scanner lectorUser = new Scanner(System.in);
        System.out.println("Escriba la cantidad de dinero (Sin puntos o comas, como un número entero mayor a 0): ");
        int input = lectorUser.nextInt();

        int dinero = input;
        int numeroDeBilletes = 0;

        System.out.println("--------------------------------");
        if (dinero >= 100000) {
            numeroDeBilletes = dinero / 100000;
            System.out.println(numeroDeBilletes + " billete(s) de $100.000");
            dinero = dinero - (100000 * numeroDeBilletes);
        }

        if (dinero >= 50000) {
            numeroDeBilletes = dinero / 50000;
            System.out.println(numeroDeBilletes + " billete(s) de $50.000");
            dinero = dinero - (50000 * numeroDeBilletes);
        }

        if (dinero >= 20000) {
            numeroDeBilletes = dinero / 20000;
            System.out.println(numeroDeBilletes + " billete(s) de $20.000");
            dinero = dinero - (20000 * numeroDeBilletes);
        }

        if (dinero >= 10000) {
            numeroDeBilletes = dinero / 10000;
            System.out.println(numeroDeBilletes + " billete(s) de $10.000");
            dinero = dinero - (10000 * numeroDeBilletes);
        }

        if (dinero >= 5000) {
            numeroDeBilletes = dinero / 5000;
            System.out.println(numeroDeBilletes + " billete(s) de $5.000");
            dinero = dinero - (5000 * numeroDeBilletes);
        }

        if (dinero >= 2000) {
            numeroDeBilletes = dinero / 2000;
            System.out.println(numeroDeBilletes + " billete(s) de $2.000");
            dinero = dinero - (2000 * numeroDeBilletes);
        }

        if (dinero >= 1000) {
            numeroDeBilletes = dinero / 1000;
            System.out.println(numeroDeBilletes + " billete(s) de $1.000");
            dinero = dinero - (1000 * numeroDeBilletes);
        }

        if (dinero >= 500) {
            numeroDeBilletes = dinero / 500;
            System.out.println(numeroDeBilletes + " moneda(s) de $500");
            dinero = dinero - (500 * numeroDeBilletes);
        }

        if (dinero >= 100) {
            numeroDeBilletes = dinero / 100;
            System.out.println(numeroDeBilletes + " moneda(s) de $100");
            dinero = dinero - (100 * numeroDeBilletes);
        }

        if (dinero >= 50) {
            numeroDeBilletes = dinero / 50;
            System.out.println(numeroDeBilletes + " moneda(s) de $50");
            dinero = dinero - (50 * numeroDeBilletes);
        }
        System.out.println("--------------------------------");

    }

}
