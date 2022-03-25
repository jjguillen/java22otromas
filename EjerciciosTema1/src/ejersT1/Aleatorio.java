package ejersT1;

public class Aleatorio {

	
	public static void main(String [] args)
	{
		int aleatorio;
		
		aleatorio = (int) (Math.random() * 100) + 1 ; //1 al 100
		System.out.println(aleatorio);
		
		aleatorio = (int) (Math.random() * 6) + 1 ;  //1 al 6
		System.out.println(aleatorio);
		
		aleatorio = (int) (Math.random() * 7) ; //0 al 6
		System.out.println(aleatorio);
		
		aleatorio = (int) (Math.random() * 49) + 1 ; //1 al 49
		System.out.println(aleatorio);
		
		aleatorio = (int) (Math.random() * 100) * 2 ; //0 al 200
		System.out.println(aleatorio);
		
		//Entre -150 y -50  0 al 99
		aleatorio = (int) (Math.random() * 101) - 150 ;
		System.out.println(aleatorio);
		
		//Entre -100 y 100   0 al 199
		aleatorio = (int) (Math.random() * 201) - 100 ;
		System.out.println(aleatorio);
		
		//(int) (Math.random() * (mayor - menor + 1)) + menor
		
		//Números entre -70 y 50
		aleatorio = (int) (Math.random() * 121) - 70 ;
		System.out.println(aleatorio);
		
		//Números 5,7,33,125,77
		//aleatorios entre 0 y 125
		System.out.println("Raro ");
		
		aleatorio = (int) (Math.random() * 126);
		while ( (aleatorio != 5) && (aleatorio != 7) && 
				(aleatorio != 33) && (aleatorio != 125) && (aleatorio != 77) ) {
			
			aleatorio = (int) (Math.random() * 126);
		}		 
		System.out.println(aleatorio);
	
		
		
		
		
		
	}
}
