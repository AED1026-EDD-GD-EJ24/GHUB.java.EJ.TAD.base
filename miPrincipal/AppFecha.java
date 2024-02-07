package miPrincipal;
public class AppFecha{
    public static void menu() {
        System.out.println("====================================");
		System.out.println("    Operaciones con Fechas        ");
        System.out.println("====================================");
        Fecha f = new Fecha(2,20,1970);
		Fecha f1 = new Fecha(2,20,1970);
		/*
		 * No es accesible porque son privadas
		f.dia = 2;
		f.mes = 20;
		f.anio = 1970;
		*/
		/*
		f.setDia(2);
		f.setMes(20);
		f.setAnio(1970);
		f1.setDia(2);
		f1.setMes(20);
		f1.setAnio(1970);
		*/
		//imprimir el día
		System.out.println("Dia = "+f.getDia());
		//imprimimos el mes
		System.out.println("Mes = "+f.getMes());
		//imprimimos el año
		System.out.println("Año = "+f.getAnio());
		System.out.println(f);
		if (f.equals(f1))
			System.out.println("Son iguales");
		else
			System.out.println("Son Diferentes");


        
    }
}