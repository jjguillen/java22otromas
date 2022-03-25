package DadosPoker;

public class Resultado {

	private int jugada;
	private int valor;
	
	public Resultado(int jugada, int valor) {
		super();
		this.jugada = jugada;
		this.valor = valor;
	}

	/**
	 * @return the jugada
	 */
	public int getJugada() {
		return jugada;
	}

	/**
	 * @param jugada the jugada to set
	 */
	public void setJugada(int jugada) {
		this.jugada = jugada;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	public int ganador(Resultado otro) {
		if (this.jugada > otro.getJugada()) {
			return 0;
		} else if (this.jugada < otro.getJugada()) {
			return 1;
		} else {
			if (this.valor > otro.getValor()) {
				return 0;
			} else if (this.valor < otro.getValor()) {
				return 1;
			} else {
				return 2; //Empate
			}
		}
		
		
	}
	
	
}
