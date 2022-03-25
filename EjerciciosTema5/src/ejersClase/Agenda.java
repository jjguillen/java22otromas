package ejersClase;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contacto> contactos;

	public Agenda() {
		super();
		contactos = new ArrayList<>();
	}
	
	/**
	 * Añade un contacto a la agenda si no está previamente en ella
	 * @param c
	 * @return false si no se pudo añadir, true si sí se pudo añadir
	 */
	public boolean addContacto(Contacto c) {
		
		if (this.existeContacto(c))
			return false;
		else {
			contactos.add(c);
			return true;
		}
	}
	
	/**
	 * Detecta si un contacto c está ya en la Agenda (por nombre)
	 * @param c
	 * @return
	 */
	public boolean existeContacto(Contacto c) {
		if (contactos.indexOf(c) >= 0) //Existe
			return true;
		else //No existe
			return false;
	}
	
	/**
	 * Lista todos los contactos de la agenda
	 */
	public void listarContactos() {
		System.out.println(contactos);
	}
	
	/**
	 * Busca un contacto por nombre y devuelve su teléfono si lo encuentra
	 * Si no lo encuentra devuelve "No encontrado"
	 * @param nombre
	 * @return
	 */
	public String buscarContacto(String nombre) {
		if (existeContacto(new Contacto(nombre,""))) {
			return contactos.get(contactos.indexOf(new Contacto(nombre,""))).getTelefono();
		} else {
			return "No encontrado";
		}		
	}
	
	/**
	 * Borra un objeto en contactos igual que el pasado por parámetro (nombre)
	 * @param c
	 * @return
	 */
	public String eliminarContacto(Contacto c) {
		if (contactos.remove(c)) {
			return "Se ha podido borrar el contacto "+c.getNombre();
		} else {
			return "No se ha podido borrar el contacto "+c.getNombre();
		}
	}
	
	
	
	
}
