package EjerciciosClase;

public class EjemplosMatrices {

	public static void main(String[] args) {
		
		//Llena una matriz 4x6 (4 filas x 6 columnas) de int aleatorios (1-100)
		// xxxxxx - fila 0 - matriz[0]
		// xxxxxx - fila 1 - matriz[1]
		// xxxxxx - fila 2 - matriz[2]
		// xxxxxx - fila 3 - matriz[3]
		
		int matriz[][] = new int[4][6];
		System.out.println("Filas= " + matriz.length);
		System.out.println("Columnas= " + matriz[0].length);
		
		//Cada fila
		for(int i=0; i < matriz.length; i++) {
			System.out.print("Fila " + i);
			
			//Cada columna
			for(int j=0; j < matriz[0].length; j++) {
				System.out.print(" Col " + j);
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
			
			System.out.println();
		}
		
		//Pintamos matriz
		for(int i=0; i < matriz.length; i++) {
			//Cada columna
			for(int j=0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
