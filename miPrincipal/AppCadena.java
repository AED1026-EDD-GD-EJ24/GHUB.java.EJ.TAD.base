package miPrincipal;
public class AppCadena{
    public static void menu() throws PosicionIlegalException {
        System.out.println("==================================");
		System.out.println("    Operaciones con Cadena        ");
        System.out.println("==================================");
        Cadena c = new Cadena();
        c.agregarFinal('M');
        c.agregarFinal('a');
        c.agregarFinal('r');
        c.agregarFinal('1');
        c.agregarFinal('a');
        System.out.println("valor de c:"+c);
        System.out.println("Invertida:"+c.invertir());
        c.borrarInicio();
        System.out.println("valor de c:"+c);
        System.out.println("Invertida:"+c.invertir());
        
    }
}