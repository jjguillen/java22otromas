package Profesores;

import java.time.LocalDate;
import java.util.ArrayList;

public class DepartamentoInformatica {

	public static void main(String[] args) {
		
		ArrayList<Profesor> depInf = new ArrayList<>();
		depInf.add(new ProfesorTitular("Inf22334", "Javier", "Guillén", LocalDate.of(1987, 10,10), 2500.0, false));
		depInf.add(new ProfesorInterino("Inf696699", "Amador", "Sánchez", LocalDate.of(1982, 4, 4), 1900.0, LocalDate.of(2021, 10, 1)));
		depInf.add(new ProfesorTitular("Inf1111", "Cati", "Flores", LocalDate.of(1972, 1,15), 2700.0, false));
		
		for(Profesor p : depInf) {
			System.out.print(p.getNombre()+" gana "+p.nominaBase()+"€. ");
			
			//Esto no se suele hacer, preguntar por el tipo
			if (p instanceof ProfesorInterino) {
				((ProfesorInterino) p).tiempoTrabajado();
			}
			
			System.out.println();
		}
		


	}

}
