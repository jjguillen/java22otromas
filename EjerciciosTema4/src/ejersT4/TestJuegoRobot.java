package ejersT4;

public class TestJuegoRobot {

	public static void main(String[] args) {
		
		//Salida del tablero es (6,9)
		int pX = 60;
		int pY = 99;
		
		
		Robot cortocircuito = new Robot();
		
		//Mientras no llegue al final que se mueva
		while(!cortocircuito.haLlegado(pX, pY)) {
			int mov = (int) (Math.random() * 4);
			switch (mov) {
				case 0: {
					cortocircuito.irAbajo();
					break;
				}
				case 1: {
					cortocircuito.irArriba();
					break;
				}
				case 2: {
					cortocircuito.irDerecha();
					break;
				}
				case 3: {
					cortocircuito.irIzquierda();
					break;
				}				
			}	
			
			cortocircuito.pintarRobot();
		}
		
		System.out.println("Ha tardado en llegar "+cortocircuito.getNumPasos());
		
	}

}
