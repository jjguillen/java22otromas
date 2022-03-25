package EjerciciosClase;

public class Matriz {
	
	public static void pintarMediaAsignatura(int[][] matriz) {
		String[] asignaturas = {"FOL", "SSII", "LM", "BBDD", "Entornos", "Programación"};
		
		for(int i=0; i<matriz.length; i++) {
			//Sumo las notas de esa fila/asignatura
			int total=0;
			for(int j=0; j<matriz[0].length; j++) {
				total = total + matriz[i][j];
			}
			System.out.println("La nota media de "+ asignaturas[i] +" es "+total/matriz[0].length);
		}
	}
	
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			//Pinta la fila entera
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			//Cuando termino la fila, pinto un salto de línea
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		//Asignaturas: FOL, SSII, LM, BBDD, Entornos, Programación
		//Notas por asignatura: 4 notas diferentes
		
		//Matriz 6x4
		int[][] notas = new int[6][4];
		
		//LLenamos la matriz con notas aleatorias
		for(int i=0; i<notas.length; i++) { //FILAS
			for(int j=0; j<notas[i].length; j++) { //COLUMNAS
				notas[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		
		//Pintar la matriz
		pintarMatriz(notas);
		
		//Pintar las medias
		pintarMediaAsignatura(notas);
		

	}

}
