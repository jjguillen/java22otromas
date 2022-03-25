package Formas;

import java.awt.Polygon;
import java.util.Objects;
import javax.swing.JFrame;


public abstract class Forma implements Dibujable {
	
	private static int contF=0;
	protected int id;
	
	//Para dibujar
	protected JFrame mainMap;
    protected Polygon poly;
    //////////////////////////////////////
	
	Forma() {
		Forma.contF++;
		this.id = Forma.contF;
	}
	
	public abstract void dibujar();
	public abstract double area();
	
	/**
	 * @return the contF
	 */
	public static int getContF() {
		return contF;
	}

	/**
	 * @param contF the contF to set
	 */
	public static void setContF(int contF) {
		Forma.contF = contF;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Forma other = (Forma) obj;
		return id == other.id;
	}

	
	

}