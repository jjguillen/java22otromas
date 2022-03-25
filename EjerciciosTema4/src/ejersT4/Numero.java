package ejersT4;

public class Numero {

	private Integer numero;
	
	
	public Numero() {
		this.numero = 0;
	}
	
	public Numero(int num) {
		this.numero = num;
	}
	
	
	public int suma(int numero) {
		return this.numero + numero;
	}
	
	public int resta(int numero) {
		return this.numero - numero;
	}
	
	public int getValor() {
		return this.numero;
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public double getDouble() {
		return this.numero.doubleValue();
	}
	
	public float getFloat() {
		return this.numero.floatValue();
	}
	
	public int getDoble() {
		return this.numero * 2;
	}
	
	
}
