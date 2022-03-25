package ejersT3;

public class Ejercicio17 {

	public static void pintar(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	public static void ordenar(int a[]) {
		boolean flag = true;
        int inicio = 0;
        int fin = a.length;
 
        while (flag == true){            
            flag = false;
 
            for (int i = inicio; i < fin - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
            fin = fin - 1;
 
            //Si no hay intercambios está ordenado
            if (flag == false)
                break;
            flag = false;
            
            for (int i = fin - 1; i >= inicio; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
            inicio = inicio + 1;
        }		
	
	}
	
	public static void ordenarFila(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			ordenar(matriz[i]);
		}		
	}
	
	public static void ordenarColumna(int matriz[][]) {
		for(int j=0; j<matriz[0].length; j++) {
			//matriz[0][0], matriz[1][0], matriz[2][0] ... matriz[4][0]
			//matriz[0][1], matriz[1][1], matriz[2][1] ... matriz[4][1]
			
			int vectorC[] = new int[matriz.length];
			for(int i=0; i<matriz.length; i++) {
				vectorC[i] = matriz[i][j];
			}
			
			ordenar(vectorC);
			
			for(int i=0; i<matriz.length; i++) {
				matriz[i][j] = vectorC[i];
			}
		}		
	}

	public static void ordenarColumna2(int matriz[][]) {
		for(int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length; i++) {
				
				//Ordenar
				for(int h=0; h<matriz.length-1; h++) {
					if (matriz[h][j] > matriz[h+1][j]) {
						int aux = matriz[h][j];
						matriz[h][j] = matriz[h+1][j];
						matriz[h+1][j] = aux;
					}
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		
		pintar(matriz);
		System.out.println();
		
		ordenarFila(matriz);
		
		pintar(matriz);
		
		System.out.println();
		//ordenarColumna(matriz);
		
		pintar(matriz);
		
		System.out.println();
		ordenarColumna2(matriz);
		pintar(matriz);
		
		

	}

}
