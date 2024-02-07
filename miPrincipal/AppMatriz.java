package miPrincipal;
public class AppMatriz{
    public static void menu() throws PosicionIlegalException {
        System.out.println("==================================");
		System.out.println("    Operaciones con Matrices      ");
        System.out.println("==================================");
        Matriz m = new Matriz(2,3);
        
        m.asignarMatriz(0,0,5);
        System.out.println("Valor del elemento 0,0="+m.infoMat(0, 0));
        System.out.println("Valor del elemento 0,0="+m.infoMat(1, 0));

        m.infoMat(0,0);
        System.out.println("Filas = "+m.filasMat());
        System.out.println("Columnas ="+m.columnasMat());
        
    }
}