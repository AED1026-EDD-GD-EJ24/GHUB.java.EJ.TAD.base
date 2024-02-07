package miPrincipal;

public class Triangulo {
    private Punto v1,v2,v3;
	//private double longLados[]= {0,0,0};
	private double longLados[] = new double[3];
	
	public Triangulo(Punto v1, Punto v2, Punto v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public double[] longuitudes()
	{
		longLados[0]= v1.distancia(v2);
		longLados[1]= v2.distancia(v3);
		longLados[2]= v3.distancia(v1);
		return longLados;
	}
    
}
