package Repaso;

import java.util.Scanner;

public class TresEnRaya {

	public static void pintarMatriz(String matriz[][]) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ " | ");
			}
			System.out.println();
		}
		
	}
	
	public static boolean comprobacionX(String matriz[][]) {
		boolean ganadorX= false;
		
				if (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X") {
					ganadorX=true;
				}
				if (matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2] == "X") {
					ganadorX=true;
				}
				if (matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2] == "X") {
					ganadorX=true;
				}
				if (matriz[0][0] == "X" && matriz[1][0] == "X" && matriz[2][0] == "X") {
					ganadorX=true;
				}
				if (matriz[0][1] == "X" && matriz[1][1] == "X" && matriz[2][1] == "X") {
					ganadorX=true;
				}
				if (matriz[0][2] == "X" && matriz[1][2] == "X" && matriz[2][2] == "X") {
					ganadorX=true;
				}
				if (matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2] == "X") {
					ganadorX=true;
				}
				if (matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X") {
					ganadorX=true;
				}
			
		
		
	
		return ganadorX;
	}
	
	public static boolean comprobacionO(String matriz[][]) {
		
			boolean ganadorO=false;
			if (matriz[0][0] == "O" && matriz[0][1] == "O" && matriz[0][2] == "O") {
				ganadorO=true;
			}
			if (matriz[1][0] == "O" && matriz[1][1] == "O" && matriz[1][2] == "O") {
				ganadorO=true;
			}
			if (matriz[2][0] == "O" && matriz[2][1] == "O" && matriz[2][2] == "O") {
				ganadorO=true;
			}
			if (matriz[0][0] == "O" && matriz[1][0] == "O" && matriz[2][0] == "O") {
				ganadorO=true;
			}
			if (matriz[0][1] == "O" && matriz[1][1] == "O" && matriz[2][1] == "O") {
				ganadorO=true;
			}
			if (matriz[0][2] == "O" && matriz[1][2] == "O" && matriz[2][2] == "O") {
				ganadorO=true;
			}
			if (matriz[0][0] == "O" && matriz[1][1] == "O" && matriz[2][2] == "O") {
				ganadorO=true;
			}
			if (matriz[0][2] == "O" && matriz[1][1] == "O" && matriz[2][0] == "O") {
				ganadorO=true;
			}

		return ganadorO;
		
	}

	public static boolean ocupado(String matriz[][], int num1, int num2) {
		boolean ocupado=false;
		for (int i=0; i<matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[num1-1][num2-1] == "X" || matriz[num1-1][num2-1] == "O") {
					ocupado=true;
				}
				
				
			}
		}
		
		return ocupado;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String matriz [][] = new String [3][3];
		int num1=0;
		int num2=0;
		Scanner sc = new Scanner(System.in);
		int cont=0;
		pintarMatriz(matriz);
		
		do {			
				
					System.out.println("Jugador X, elige la fila");
					num1 = sc.nextInt();
					System.out.println("Jugador X, elige la columna");
					num2= sc.nextInt();
					if (ocupado(matriz, num1, num2) == true) {
						do { System.out.println("ELIGE OTRA POSICION");
							System.out.println("Jugador X, elige la fila");
							num1 = sc.nextInt();
							System.out.println("Jugador X, elige la columna");
							num2= sc.nextInt();	
						}while (ocupado(matriz, num1, num2)!=false);
						
					}
					matriz[num1-1][num2-1] = "X";
					if (comprobacionX(matriz) == true) {
						System.out.println("Ha ganado el jugador X");
						break;
					}
					
					pintarMatriz(matriz);
								
					System.out.println("Jugador O, elige la fila");
					num1 = sc.nextInt();
					System.out.println("Jugador O, elige la columna");
					num2= sc.nextInt();
					if (ocupado(matriz, num1, num2) == true) {
						do { System.out.println("ELIGE OTRA POSICION");
							System.out.println("Jugador O, elige la fila");
							num1 = sc.nextInt();
							System.out.println("Jugador O, elige la columna");
							num2= sc.nextInt();	
						}while (ocupado(matriz, num1, num2)!=false);
						
					}
					matriz[num1-1][num2-1] = "O";
					pintarMatriz(matriz);
					if (comprobacionO(matriz) == true) {
						System.out.println("Ha ganado el jugador O");
						break;
					}
	
			cont++;
		
		}while (comprobacionX(matriz)==false && comprobacionO(matriz)==false);  
		//Falta controlar las tablas, empate, no gana ninguno, en ese caso sigue pidiendo
		//Intenta hacerlo tú
		
	}

}
