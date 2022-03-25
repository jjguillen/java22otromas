package Fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class FechaUtils {

	
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime hoy = LocalDateTime.now();
		Period p = Period.between(fechaHasta.toLocalDate(), hoy.toLocalDate());
		Duration d = Duration.between(fechaHasta.toLocalTime(), hoy.toLocalTime());
		System.out.println("Han pasado "+p.getYears()+" años "+
									p.getMonths()+" meses "+
									p.getDays()+" dias "+
									d.toHours()+" horas "+
									d.toMinutes()+" minutos "+
									d.toSeconds()+" segundos");
	}
	
	public static String diaCumple(LocalDate fechaCumple, int anio) {
		LocalDate fecha = fechaCumple.withYear(anio);
		Locale loc = Locale.forLanguageTag("da-DK");
		String dia = fecha.format(DateTimeFormatter.ofPattern("EEEE",loc));
		
		return dia;
	}
	
	
	public static int numYears(LocalDate fechaCumple) {
		LocalDate hoy = LocalDate.now();
		Period p = Period.between(fechaCumple, hoy);
		return p.getYears();
	}
	
	public static boolean isIntervalo(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fecha) {	
		if (inicio.isBefore(fecha) && fin.isAfter(fecha))
			return true;
		
		return false;
	}
	
	public static LocalDateTime fechaAzar(LocalDateTime inicio, LocalDateTime fin) {
		ZoneOffset zone = ZoneOffset.of("Z"); //UTC
		long startEpochDay = inicio.toEpochSecond(zone);
	    long endEpochDay = fin.toEpochSecond(zone);
	    long randomDay = ThreadLocalRandom
	      .current()
	      .nextLong(startEpochDay, endEpochDay);

	    return LocalDateTime.ofEpochSecond(randomDay,0,zone);
	}
	
	public static void main(String[] args) {
		System.out.println(FechaUtils.diaCumple(LocalDate.of(1987,10,10), 2000));
		FechaUtils.numYears(LocalDate.of(2000, 3, 2));
		FechaUtils.cuentaAtras(LocalDateTime.of(2000,3,2,18,50,30), null);
		
		
		Duration d = Duration.between(LocalDateTime.of(2022, 3,3,16,00,00), LocalDateTime.now());
		System.out.println(d.toMinutes());
	}
	
}
