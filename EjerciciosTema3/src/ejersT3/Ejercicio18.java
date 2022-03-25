package ejersT3;

public class Ejercicio18 {

	public static void pintarMatriz(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
			
	}
	
	public static void main(String[] args) {
		//Encuesta matriz 10x3
		
		int encuesta[][] = new int[100000][3];
		
		//Rellenarla con datos aleatorios
		for(int i=0; i<encuesta.length; i++) {
			//Sexo
			encuesta[i][0] = (int) (Math.random() * 2) + 1;
			
			//Trabaja
			encuesta[i][1] = (int) (Math.random() * 2) + 1;
			
			//Sueldo
			if (encuesta[i][1] == 2) {
				//No trabaja, entonces sueldo es 0
				encuesta[i][2] = 0;
			} else {
				//Si trabaja. 600-2000
				encuesta[i][2] = (int) (Math.random() * 1401) + 600;
			}
		}
		
		//Pintamos la encuesta
		pintarMatriz(encuesta);
		
		//Calcular porcentajes encuesta
		int numeroHombres=0;
		int numeroMujeres=0;
		int numeroHombresTrabajan=0;
		int numeroMujeresTrabajan=0;
		int sueldoHombres=0;
		int sueldoMujeres=0;
		
		for(int i=0; i<encuesta.length; i++) {
			//Hombre
			if(encuesta[i][0] == 1) {
				numeroHombres++;
				//Trabaja
				if(encuesta[i][1] == 1) {
					numeroHombresTrabajan++;
					sueldoHombres += encuesta[i][2];
				}
			}
			
			//Mujer
			if(encuesta[i][0] == 2) {
				numeroMujeres++;
				//Trabaja
				if(encuesta[i][1] == 1) {
					numeroMujeresTrabajan++;
					sueldoMujeres += encuesta[i][2];
				}
			}
		}
		
		
		//Pintar resultados
		System.out.println("El porcentaje de hombres es "+numeroHombres*100/encuesta.length);
		System.out.println("El porcentaje de mujeres es "+numeroMujeres*100/encuesta.length);
		System.out.println("El porcentaje de hombres que trabajan es "+numeroHombresTrabajan*100/numeroHombres);
		System.out.println("El porcentaje de mujeres que trabajan es "+numeroMujeresTrabajan*100/numeroMujeres);
		System.out.println("El sueldo medio de hombres que trabajan es "+sueldoHombres/numeroHombresTrabajan);
		System.out.println("El sueldo medio de mujeres que trabajan es "+sueldoMujeres/numeroMujeresTrabajan);
		

	}

}
