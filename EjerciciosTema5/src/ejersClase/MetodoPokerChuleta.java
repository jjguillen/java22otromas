package ejersClase;


public class MetodoPokerChuleta {

	/*
public Resultado valorTirada() {
		
		//Poker real
		if ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) 
				&& (tirada[0] == tirada[4]) ) {
			Resultado r = new Resultado(8,tirada[0]);
			return r;
		}
		
		//Poker
		if ( ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) ) ) {
			Resultado r = new Resultado(7,tirada[0]);
			return r;
		}
		if ( (tirada[1] == tirada[2]) && (tirada[1] == tirada[3]) && (tirada[1] == tirada[4]) ) {
			Resultado r = new Resultado(7,tirada[1]);
			return r;
		}
		
		//Full
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
			Resultado r = new Resultado(6,tirada[0]);
			return r;
		}
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4] && tirada[0] == tirada[1]) {
			Resultado r = new Resultado(6,tirada[2]);
			return r;
		}
		
		//Escalera Mayor
		if (tirada[0] == 2 && tirada[1] == 3 && tirada[2] == 4 && tirada[3] == 5 && tirada[4] == 6) {
			Resultado r = new Resultado(5,0);
			return r;
		}
		
		//Escalera Menor
		if (tirada[0] == 1 && tirada[1] == 2 && tirada[2] == 3 && tirada[3] == 4 && tirada[4] == 5) {
			Resultado r = new Resultado(4,0);
			return r;
		}
		
		//Piernas o Trío
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2]) {
			Resultado r = new Resultado(3,tirada[2]);
			return r;
		}
		if (tirada[1] == tirada[2] && tirada[2] == tirada[3]) {
			Resultado r = new Resultado(3,tirada[2]);
			return r;
		}
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4]){
			Resultado r = new Resultado(3,tirada[2]);
			return r;
		}
		
		//Dobles parejas
		if (tirada[0] == tirada[1] && tirada[2] == tirada[3]) {
			if (tirada[0] > tirada[2]) {
				Resultado r = new Resultado(2,tirada[0]);
				return r;
			} else {
				Resultado r = new Resultado(2,tirada[2]);
				return r;
			}
		}
		
		if (tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
			if (tirada[1] > tirada[3]) {
				Resultado r = new Resultado(2,tirada[1]);
				return r;
			} else {
				Resultado r = new Resultado(2,tirada[3]);
				return r;
			}
		}
			
		if (tirada[0] == tirada[1] && tirada[3] == tirada[4]) {
			if (tirada[0] > tirada[3]) {
				Resultado r = new Resultado(2,tirada[0]);
				return r;
			} else {
				Resultado r = new Resultado(2,tirada[3]);
				return r;
			}
		}
		
		
		//Parejas
		if (tirada[0] == tirada[1]) {
			return new Resultado(1,tirada[0]);
		}
		if (tirada[1] == tirada[2]) {
			return new Resultado(1,tirada[1]);
		}
		if (tirada[2] == tirada[3]) {
			return new Resultado(1,tirada[2]);
		}
		if (tirada[3] == tirada[4]) {
			return new Resultado(1,tirada[3]);
		}
		
		
		return new Resultado(-1,-1);
	}
	*/
}
