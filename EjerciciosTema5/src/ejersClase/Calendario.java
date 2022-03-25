package ejersClase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {

	public static void main(String[] args) {
		Date fecha = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		
		//Al calendario le asignamos la fecha
		gc.setTime(fecha);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		
		GregorianCalendar gc2 = new GregorianCalendar(2001,2,3,22,22,22);
		System.out.println(gc2.get(Calendar.DAY_OF_WEEK));

	}

}
