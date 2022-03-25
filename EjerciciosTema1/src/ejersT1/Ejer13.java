package ejersT1;

public class Ejer13 {

	
	public static void main(String [] args)
	{
		int segundosTotales=1000000;
		
		int horas;
		int minutos;
		int segundos;
		
		horas = segundosTotales / 3600; //Obvia la parte decimal al asignarlo a un entero
		minutos = (segundosTotales % 3600) / 60;
		segundos = (minutos % 60); 
		System.out.println(horas+":"+minutos+":"+segundos);
		
		double horasF, minutosF, segundosF;
		horasF = Math.floor(segundosTotales / 3600); //Necesito truncar el valor
		minutosF = Math.floor( (segundosTotales % 3600) / 60 );
		segundosF = (minutosF % 60); 
		System.out.println((int)horasF+":"+(int)minutosF+":"+(int)segundosF);
		
	}
}
