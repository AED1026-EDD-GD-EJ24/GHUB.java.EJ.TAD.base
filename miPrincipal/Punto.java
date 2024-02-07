package miPrincipal;
import java.util.Scanner;
public class Punto{

	private int x,y,z;
	String dimension;
	public Punto(int coorx,int coory)
	{
	   this.x=coorx;
	   this.y=coory;
	}
	public Punto(int coorx,int coory,int coorz)
	{
	   this.x = coorx;
	   this.y = coory;
	   this.z = coorz;
	}
	   public Punto() {
	      this.x = 0;
	      this.y = 0;
	   }
	   public int getX() {
		   return x;
		}
		public int getY() {
		   return y;
		}
		public int getZ() {
		   return z;
		}
		
		public void setX(int valor)
		{
		   this.x = valor;
		}
		public void setY(int valor)
		{
		   this.y = valor;
		}
		public void setZ(int valor)
		{
		   this.z = valor;
		}
		public void leer() {
			try (Scanner entrada = new Scanner(System.in)) {
				System.out.print("Proporciona valor de x:");
				this.x = entrada.nextInt();
				System.out.print("Proporciona valor de y:");
				this.y = entrada.nextInt();
			}	
            
		}
		public void despliega() {
			System.out.println("valor de x:"+this.x);
			System.out.println("valor de y:"+this.y);
		}
		public double distancia(Punto p) {
			double d;
			d = Math.sqrt(Math.pow(p.x-this.x,2) + Math.pow(p.y-this.y,2));
			return d;
		}
		

}