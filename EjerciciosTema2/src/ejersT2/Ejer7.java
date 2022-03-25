package ejersT2;

public class Ejer7 {

	public static void main(String[] args) {
		int acumulador=0;
		
		/*
		for(int i=1; i<200;i=i+2) {
			//acumulador += i;
			acumulador = acumulador + i;
		}
		*/
		
		int i=1;
		while (i<200) {
			acumulador = acumulador + i;
			i = i + 2;
		}
		
		System.out.println(acumulador);

	}

}
