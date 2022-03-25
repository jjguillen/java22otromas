package ejersT4;

import java.util.Objects;

public class Robot {

	/**
	 * PROPIEDADES
	 */
	private int posicionX;
	private int posicionY;
	private boolean haLlegado;
	private int numPasos;
	
	
	public static int contadorRobots=0;
	private final static int FILASTABLERO=20;
	private final static int COLUMNASTABLERO=20;
	
	
	/**
	 * Constructor 
	 * Coloca el Robot en la posición (0,0)
	 */
	public Robot() {
		this.posicionX = 0;
		this.posicionY = 0;
		this.haLlegado = false;
		this.numPasos = 0;
		Robot.contadorRobots++;
	}
	
	/**
	 * Constructor
	 * Coloca el robot en la posición (pX,pY)
	 * @param pX
	 * @param pY
	 */
	public Robot(int pX, int pY) {
		if ( (pX >= 0 && pX <= Robot.COLUMNASTABLERO-1) &&
			 (pY >= 0 && pY <= Robot.FILASTABLERO-1) ) {
			this.posicionX = pX;
			this.posicionY = pY;
			this.haLlegado = false;
			this.numPasos = 0;
			Robot.contadorRobots++;
		} else {
			System.out.println("Coordenadas no válidas");
		}
	}

	/**
	 * GETTERS Y SETTERS
	 */
	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}

	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	/**
	 * @return the haLlegado
	 */
	public boolean isHaLlegado() {
		return haLlegado;
	}

	/**
	 * @param haLlegado the haLlegado to set
	 */
	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}

	/**
	 * @return the numPasos
	 */
	public int getNumPasos() {
		return numPasos;
	}

	/**
	 * @param numPasos the numPasos to set
	 */
	public void setNumPasos(int numPasos) {
		this.numPasos = numPasos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [");
		builder.append(posicionX);
		builder.append(", ");
		builder.append(posicionY);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append(", numPasos=");
		builder.append(numPasos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(haLlegado, numPasos, posicionX, posicionY);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return haLlegado == other.haLlegado && numPasos == other.numPasos && posicionX == other.posicionX
				&& posicionY == other.posicionY;
	}
	
	
	public void irArriba() {
		//Comprobar que no sale del tablero
		if(this.posicionY < Robot.FILASTABLERO-1) {
			this.posicionY++;
			this.numPasos++;
		}
	}
	
	public void irAbajo() {
		//Comprobar que no sale del tablero
		if(this.posicionY > 0) {
			this.posicionY--;
			this.numPasos++;
		}
	}
	
	public void irDerecha() {
		if(this.posicionX < Robot.COLUMNASTABLERO-1) {
			this.posicionX++;
			this.numPasos++;
		}
	}
	
	public void irIzquierda() {
		if(this.posicionX > 0) {
			this.posicionX--;
			this.numPasos++;
		}
	}
	
	public boolean haLlegado(int pX, int pY) {
		if (this.posicionX == pX && this.posicionY == pY) {
			this.haLlegado = true;
			return true;
		}
		
		return false;
	}
	
	public void pintarRobot() {
		for(int i=0; i<Robot.FILASTABLERO; i++) {
			for(int j=0; j<Robot.COLUMNASTABLERO; j++) {
				if (this.posicionX == i && this.posicionY == j) {
					System.out.print("X");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
        try {
        	Thread.sleep(50);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {

        }
	}
	
	

	
}
