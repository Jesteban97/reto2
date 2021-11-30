package tecnicasprogramacion.reto2;

/*
Construir un procedimiento que simule el funcionamiento de un cajero automático a la hora de
determinar cuántos billetes de qué denominación debe proporcionar al momento de un retiro.
Para esto se supondrá que proporciona la mayor cantidad de billetes posibles para cada
denominación. Por ejemplo, en un retiro de 298.600 proporcionaría: 2 billetes de 100.000, 1 de
50.000, 2 de 20.000, 1 de 5.000, 1 de 2.000, 1 de 1.000, 1 moneda de 500 y una moneda de 100.

@author JoseW
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int dinero = 399670;
        int numeroDeBilletes = 0;
        
        if (dinero >= 100000) {
            numeroDeBilletes = dinero/100000;
            System.out.println(numeroDeBilletes + " billete(s) de $100.000");
            dinero = dinero - (100000 * numeroDeBilletes);
        }
        
        if (dinero >= 50000) {
            numeroDeBilletes = dinero/50000;
            System.out.println(numeroDeBilletes + " billete(s) de $50.000");
            dinero = dinero - (50000 * numeroDeBilletes);
        }
        
        if (dinero >= 20000) {
            numeroDeBilletes = dinero/20000;
            System.out.println(numeroDeBilletes + " billete(s) de $20.000");
            dinero = dinero - (20000 * numeroDeBilletes);
        }
        
        if (dinero >= 10000) {
            numeroDeBilletes = dinero/10000;
            System.out.println(numeroDeBilletes + " billete(s) de $10.000");
            dinero = dinero - (10000 * numeroDeBilletes);
        }
        
        if (dinero >= 5000) {
            numeroDeBilletes = dinero/5000;
            System.out.println(numeroDeBilletes + " billete(s) de $5.000");
            dinero = dinero - (5000 * numeroDeBilletes);
        }
        
        if (dinero >= 2000) {
            numeroDeBilletes = dinero/2000;
            System.out.println(numeroDeBilletes + " billete(s) de $2.000");
            dinero = dinero - (2000 * numeroDeBilletes);
        }
        
        if (dinero >= 1000) {
            numeroDeBilletes = dinero/1000;
            System.out.println(numeroDeBilletes + " billete(s) de $1.000");
            dinero = dinero - (1000 * numeroDeBilletes);
        }
        
        if (dinero >= 500) {
            numeroDeBilletes = dinero/500;
            System.out.println(numeroDeBilletes + " moneda(s) de $500");
            dinero = dinero - (500 * numeroDeBilletes);
        }
        
        if (dinero >= 100) {
            numeroDeBilletes = dinero/100;
            System.out.println(numeroDeBilletes + " moneda(s) de $100");
            dinero = dinero - (100 * numeroDeBilletes);
        }
        
        if (dinero >= 50) {
            numeroDeBilletes = dinero/50;
            System.out.println(numeroDeBilletes + " moneda(s) de $50");
            dinero = dinero - (50 * numeroDeBilletes);
        }
        
    }

}
