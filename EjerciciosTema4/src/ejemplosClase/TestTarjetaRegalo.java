package ejemplosClase;

public class TestTarjetaRegalo {

	public static void main(String[] args) {
		
		TarjetaRegalo t1 = new TarjetaRegalo(100);
		TarjetaRegalo t2 = new TarjetaRegalo();
		
		t1.gasta(50);
		t2.setSaldo(100);
		t1.fusionar(t2);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
