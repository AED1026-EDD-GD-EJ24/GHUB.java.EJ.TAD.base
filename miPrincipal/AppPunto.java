package miPrincipal;
public class AppPunto{
    public static void menu() {
        System.out.println("==================================");
		System.out.println("    Operaciones con Puntos        ");
        System.out.println("==================================");
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.leer();
        p1.despliega();
        p2.leer();
        p2.despliega();
        p1.distancia(p2);
    }
}