package miPrincipal;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	//retorna la fecha expresada en días
	//11/02/1968
	private int fechaToDias() {
		return anio*360+mes*30+dia;
		
	}
	//asignar la fecha expresada en dias a los atributos
	private void diasToFecha(int i)
	{
		//dividimos por 360 y obtenemos el año
		anio = (int)i/360;
		//del resto o residuo de la división anterior
		//podemos obtener el mes y el dia
		int resto = i%360;
	   // el mes del resto lo divido entre 30
		mes =(int)resto/30;
		//el resto de la division anterior son los dias
		dia = resto%30;
		//ajustar por si el día es cero
		if (dia == 0)
		{
			dia = 30;
			mes --;
		}
		//ajustar por si el mes quedo en cero
		if (mes == 0)
		{
			mes = 12;
			anio-- ;
		}
	}
	public void addDias(int d) {
		//convertir la fecha a dias y le sumamos d
		int suma =fechaToDias()+d;
		//la fecha resultante se separa en dia, mes y año
		diasToFecha(suma);
	}
	
	//constructos
	
	public Fecha() {
		
	}
	
	public Fecha(String s) {
		//buscamos la primera ocurrencia de '/'
		int pos1 = s.indexOf('/');
		//buscamos la última ocurrencia de '/'
		int pos2 = s.lastIndexOf('/');
		//procesa el día
		String sDia = s.substring(0,pos1);
		dia = Integer.parseInt(sDia);
		//procesamos el mes
		String sMes = s.substring(pos1+1,pos2);
		mes = Integer.parseInt(sMes);
		//procesamos el año
		String sAnio = s.substring(pos2+1);
		anio = Integer.parseInt(sAnio);
		
	}
	public Fecha(int d,int m,int a) {
		dia = d;
		mes = m;
		anio = a;
	}
	/*
	 * 15/06/1973
	 * 
	 */
	//sobre escribimos el método to toString (lo heradamos de Object)
	public String toString() {
		return dia+"/"+mes+"/"+anio;	
	}
	//sobre escribrir el método equals que herados de Object
	public boolean equals(Object o) {
		Fecha otra = (Fecha)o;
		return (dia ==otra.dia) && (mes==otra.mes) && (anio == otra.anio);
		
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	

} 
