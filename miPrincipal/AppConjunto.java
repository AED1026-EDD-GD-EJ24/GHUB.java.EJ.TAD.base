package miPrincipal;

public class AppConjunto{
    public static void  menu() throws Exception {
		System.out.println("==================================");
		System.out.println("    Operaciones con Conjuntos     ");
        System.out.println("==================================");
        Conjunto A = new Conjunto();
		if(A.esVacio())
			System.out.println("El conjunto A esta vacio");
		else
			System.out.println("El conjunto A NO esta vacio");
		System.out.println("El conjunto A tiene  "+
			A.cardinal() +" elementos ");
		//Añadir elementos al conjunto
		Integer ele = 4;
		A.añadir(ele);
		ele = 7;
		A.añadir(ele);
		ele = 2;
		A.añadir(ele);
		ele = 5;
		A.añadir(ele);
		System.out.println("El conjunto A tiene  "+
				A.cardinal() +" elementos ");
		//Crear otro conjunto
		Conjunto B = new Conjunto();
		//Añadir elementos al conjunto B
		ele = 6;
		B.añadir(ele);
		ele = 3;
		B.añadir(ele);
		System.out.println("El conjunto B tiene  "+
				B.cardinal() +" elementos ");
		A.union(B);
		ele = 6;
		B.retirar(ele);
		System.out.println("El conjunto B tiene  "+
				B.cardinal() +" elementos ");
		B.retirar(ele);
		//Preguntar si el el 3 pertenece al conjunto A
		ele = 3;
		if(A.pertenece(ele))
			System.out.println("El elemento "+ele+" pertenece a A");
		else
			System.out.println("El elemento "+ele+" NO pertenece a A");
		if(B.pertenece(ele))
			System.out.println("El elemento "+ele+" pertenece a B");
		else
			System.out.println("El elemento "+ele+" NO pertenece a B");
		
		System.out.println(A.elemento(2));
		System.out.println(A.elemento(4));
         
    }

}