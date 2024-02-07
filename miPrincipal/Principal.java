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
            System.out.println("2) MATRIZ  ");
            System.out.println("3) CONJUNTO");
            System.out.println("4) PERSONA ");
            System.out.println("5) FECHA   ");
            System.out.println("6) CADENA  ");
            System.out.println("7) NUMEROTE");
            System.out.println("8) CUENTA_CHEQUES");
            System.out.println("9) PUNTO");
            System.out.println("10)TRIANGULO");
            System.out.println("            ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppRational.menu();
               break;
            case 2:
              
            case 3:
               
            case 4:
               
            case 5:
               
            case 6:
             
            case 7:
               
            case 8:
               
            case 9:
               
            case 10:
               
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}