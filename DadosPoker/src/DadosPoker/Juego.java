package DadosPoker;

public class Juego {

	public static void main(String[] args) {
		Jugada jug1 = new Jugada("Javier");
		Jugada jug2 = new Jugada("Emi");
		
		jug1.tirada();
		jug2.tirada();
		
		Resultado r1 = jug1.valorTirada();
		Resultado r2 = jug2.valorTirada();
		
		switch (r1.ganador(r2)) {
			case 0: {
				System.out.println("Gana "+jug1.getNombre());
				break;
			}
			case 1: {
				System.out.println("Gana "+jug2.getNombre());
				break;
			}
			case 2: {
				System.out.println("Empate");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + r1.ganador(r2));
		}
		
		System.out.println(jug1);
		System.out.println(jug2);
		
		

	}

}
