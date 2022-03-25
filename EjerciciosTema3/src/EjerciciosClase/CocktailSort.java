package EjerciciosClase;

public class CocktailSort {

	public static void pintar(int vector[]) {
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
		
		System.out.println();
	}
	
	public static void cocktailSort(int a[]) {
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
	
	
	public static void main(String[] args) {
		int vector[] = new int[100000];
		for(int i=0; i<vector.length; i++)
			vector[i] = (int) (Math.random() * 1000) + 1;

		pintar(vector);
		long tiempo = System.currentTimeMillis();
		cocktailSort(vector);
		tiempo = System.currentTimeMillis() - tiempo;
		System.out.println(tiempo);

	}

}
