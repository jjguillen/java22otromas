package ejersT3;

public class Ejercicio23 {

	public static void pintarMatriz(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
			
	}
	
	public static void main(String[] args) {
		
		
		int filas=5;
		int columnas=7;
		
		int matriz[][] = new int[filas][columnas];
		int matrizT[][] = new int[columnas][filas];
		
		//Generar matriz aleatoriamente
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		
		//Pinto matriz original
		pintarMatriz(matriz);
		System.out.println("----------------");
		
		//Transformo
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matrizT[j][i] = matriz[i][j];
			}
		}
		
		//Pinto matriz traspuesta
		pintarMatriz(matrizT);

	}

}
