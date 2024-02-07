package miPrincipal;
public class AppTriangulo{
    public static void menu() {
        System.out.println("==================================");
		System.out.println("    Operaciones con Triangulo     ");
        System.out.println("==================================");
        Punto v1 = new Punto(1,2);
		Punto v2 = new Punto(1,6);
		Punto v3 = new Punto(4,4);
		double lados[]= {0,0,0};
		Triangulo t1 = new Triangulo(v1,v2,v3);
		lados=t1.longuitudes();
		System.out.println("Lado 1:"+lados[0]);
		System.out.println("Lado 2:"+lados[1]);
		System.out.println("Lado 3:"+lados[2]);
        
    }
}