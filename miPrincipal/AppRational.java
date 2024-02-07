package miPrincipal;
import java.util.Scanner;
public class AppRational{

    public static void menu() throws Exception {
        Scanner consola = new Scanner(System.in);
        Rational r1 = new Rational();
        int a,b;
        System.out.println("==================================");
        System.out.println("Operaciones con Números Racionales");
        System.out.println("==================================");

        System.out.print("Introduce el numerador del Racional 1:");
        a = consola.nextInt();
        System.out.print("Introduce el denominado del Racional 1:");
        b = consola.nextInt();

        r1=new Rational(a,b);

        System.out.println(r1);

        
        System.out.print("Introduce el numerador del Racional 2:");
        a = consola.nextInt();
        System.out.print("Introduce el denominado del Racional 2:");
        b = consola.nextInt();

        Rational r2 = new Rational(a,b);

        System.out.println(r2);
       
        System.out.println("Suma = "+r1.toString()+"+"+r2.toString()+"="+r1.add(r1,r2));
        System.out.println("Multiplica = "+r1.toString()+"*"+r2.toString()+"="+r1.mult(r1,r2));
        System.out.println("¿Son Iguales? ="+r1+"== "+r2+r1.equal(r1,r2)); 
      

    }

}