package ejersT2;

public class Ejer4 {

	public static void main(String[] args) {
		
		int euros = 297;
		
		int b200=0, b100=0, b50=0, b20=0, b10=0, monedas=0;
		int resto=0;
		
		//200
		b200 = (int) euros / 200;
		//100
		if (euros % 200 != 0) {
			resto = (euros % 200);
			b100 = (int) (resto) / 100;
			
			//50
			resto = (resto % 100);
			if (resto != 0) {
				b50 = (int) (resto) / 50;
				
				//20
				resto = (resto % 50);
				b20 = (int) (resto) / 20;
				
				if (resto != 0) {
					//10
					resto = (resto % 20);
					b10 = (int) (resto) / 10;
					
					monedas = (resto % 10);					
				}
				
			}
			
		}
		
		
		System.out.println("200: " + b200);
		System.out.println("100: " + b100);
		System.out.println("50: " + b50);
		System.out.println("20: " + b20);
		System.out.println("10: " + b10);
		System.out.println("€: " + monedas);
	}

}
