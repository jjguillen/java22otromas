package ejersT2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int opcion=0;
		double n1=0, n2=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			//Inicializar operandos
			n1=0;
			n2=0;
			
			//Mostrar men�
			System.out.println("CALCULADORA. Selecciona opcion:");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Salir");
			
			//Leemos opci�n
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Opci�n no v�lida");
				continue; //Si hay error termina esta pasada del bucle y vuelve a mostrar el men�
			}
			
			//Si la opci�n no es 5 pedimos los operandos, si no se saldr� del programa en el switch
			if (opcion != 5) {
				//Leemos operandos
				System.out.println("Introduce primer operando");
				try {
					n1 = Double.parseDouble(sc.nextLine());
				} catch (Exception ex) {
					System.out.println("Primer n�mero incorrecto " + ex.getMessage());
					continue; //Si hay error termina esta pasada del bucle y vuelve a mostrar el men�
				}
				
				System.out.println("Introduce segundo operando");
				try {
					n2 = Double.parseDouble(sc.nextLine());
				} catch (Exception ex) {
					System.out.println("Segundo n�mero incorrecto " + ex.getMessage());
					continue; //Si hay error termina esta pasada del bucle y vuelve a mostrar el men�
				}
			}
			
			
			//Seg�n la opci�n operamos los dos n�meros
			switch (opcion) {
				case 1: {
					System.out.println("Sumando "+n1+" con "+n2+" = "+(n1+n2));
					break;
				}
				case 2: {
					System.out.println("Restando "+n1+" con "+n2+" = "+(n1-n2));
					break;
				}
				case 3: {
					System.out.println("Multiplicando "+n1+" con "+n2+" = "+(n1*n2));
					break;
				}
				case 4: {
					System.out.println("Dividiendo "+n1+" con "+n2+" = "+(n1/n2));
					break;
				}
				case 5: {
					System.out.println("Adi�s ...");
					return;
				}
			}
			
			
		} while (opcion != 5);

	}

}
