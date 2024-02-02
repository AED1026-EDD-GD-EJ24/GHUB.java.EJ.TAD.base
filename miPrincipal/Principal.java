package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("TIPOS ABSTRACTOS DE DATOS");
            System.out.println("*************************");
            System.out.println("1) RATIONAL");
            System.out.println("2) CONJUNTO");
            System.out.println("            ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppRational.menu();
               break;
            case 2:
               AppConjunto.menu();
               break;

            case 0:
               System.out.println("ADIOS!");
               consola.close();

            default:

        }
       
    }while (opc != 0);
		
    }
}