package ejersT3;

public class Shuffle {

	public static void intercambiar(int posicion, int[] vector) {
		int aux = vector[posicion];
		vector[posicion] = vector[posicion+1];
		vector[posicion+1] = aux;
	}
	
	public static void shuffle(int vector[]) {
	
		for(int i=0; i<vector.length; i++) {
			intercambiar((int) (Math.random() * vector.length-2) + 1 , vector);
		}
	}
	
	public static void main(String[] args) {
		//Desordena un array
		
		//Nos crearemos una función shuffle, que para cada posición del array,
		//intercambie el valor en una posición aleatoria por la posición siguiente.
	
		int vector[] = new int[10];
		for(int i=0; i<vector.length; i++) {
			vector[i] = i*5;
			System.out.print(vector[i]+" ");
		}
		
		shuffle(vector);
		
		System.out.println();
		for(int i=0; i<vector.length; i++) {			
			System.out.print(vector[i]+" ");
		}
		
		

	}

}
