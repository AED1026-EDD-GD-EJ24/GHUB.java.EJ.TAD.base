package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int x,y;

        Scanner consola = new Scanner(System.in);

        System.out.println("Calculadora aritmetica");
        System.out.println("======================");

        System.out.print("Introduce el primer operando:");
        x = consola.nextInt();
        
        System.out.print("Introduce el segundo operando:");
        y = consola.nextInt();

        System.out.println(x+"+"+y+"="+c.suma(x, y));
        System.out.println(x+"-"+y+"="+c.resta(x, y));
        System.out.println(x+"*"+y+"="+c.multiplica(x, y));
        System.out.println(x+"/"+y+"="+c.divide(x, y));

        consola.close();
    }
}