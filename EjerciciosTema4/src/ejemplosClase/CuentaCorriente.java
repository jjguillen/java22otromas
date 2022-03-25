package ejemplosClase;

public class CuentaCorriente {
	
	//Propiedades
	private String numero;
	private double saldo;
		
	//Constructores
	CuentaCorriente() {
		this.saldo = 0;
		this.numero = CuentaCorriente.generarNumero();
	}

	public CuentaCorriente(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	//Métodos	
	
	/**
	 * Devuelve un String con un número de cuenta generado aleatoriamente.
	 * @return
	 */
	public static String generarNumero() {
		//Generar un número de cuenta aleatorio
		StringBuilder sb = new StringBuilder("ES204005"); //Faltan 12 números
		for(int i=0; i<12; i++) {
			int num = (int) (Math.random()*10);  //0 a 9
			sb.append(num);
		}	
		
		return sb.toString();
	}
	
	/**
	 * Incrementa el saldo en la cantidad que se pasa como parámetro
	 * @param cantidad
	 */
	public void ingreso(double cantidad) {
		this.saldo += cantidad; 
	}
	
	/**
	 * Si hay suficiente saldo en la cuenta, se resta la cantidad del cargo al saldo
	 * @param cantidad
	 */
	public void cargo(double cantidad) {
		if ((this.saldo - cantidad) >= 0)
			this.saldo -= cantidad;
	}
	
	/**
	 * Traspaso cantidad de esta cuenta, a la cuenta pasado como parámetro
	 * @param otra
	 */
	public void transferencia(CuentaCorriente otra, double cantidad) {
		if ((this.saldo - cantidad) > 0) {
			this.saldo -= cantidad; //Me quito yo la cantidad
			otra.setSaldo(cantidad + otra.getSaldo());
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CC = ");
		builder.append(numero);
		builder.append(", saldo = ");
		builder.append(saldo);
		return builder.toString();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}
	
	
	
	

}
