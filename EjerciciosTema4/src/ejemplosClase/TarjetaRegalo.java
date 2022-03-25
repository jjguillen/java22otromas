package ejemplosClase;

public class TarjetaRegalo {

	//PROPIEDADES
	private double saldo;
	private int numero;
	
	private static int num=0;
	
	
	//CONSTRUCTORES
	TarjetaRegalo() {
		this.saldo = 0;
		TarjetaRegalo.num++;
		this.numero = TarjetaRegalo.num;
	}
	
	//Otro constructor
	TarjetaRegalo(double cantidad) {
		this.saldo = cantidad;
		TarjetaRegalo.num++;
		this.numero = TarjetaRegalo.num;
	}

	
	//MÉTODOS
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void gasta(double cantidad) {
		if ((this.saldo - cantidad) > 0)
			this.saldo -= cantidad;
	}
	
	public void fusionar(TarjetaRegalo otraT) {
		this.saldo += otraT.getSaldo();
		otraT.setSaldo(0);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaRegalo [saldo=");
		builder.append(saldo);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
