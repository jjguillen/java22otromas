package ejersT4;

public class TestIncidencia {

	public static void main(String[] args) {
		
		Incidencia i1 = new Incidencia("INC1","Goteras en el 5ºD");
		Incidencia i2 = new Incidencia("INC2","Grieta en la pared del garaje 22F");
		Incidencia i3 = new Incidencia("INC3","Roto espejo del ascensor");
		
		System.out.println(i3);
		System.out.println(Incidencia.getPendientes());
		
		i3.resuelve("Se cambia el espejo");
		System.out.println(i3);
		
		System.out.println(Incidencia.getPendientes());
		
	}

}
