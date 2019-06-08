package ejercicio1;

import ejercicio1.ManeraPelear.ManeraPelear;
import ejercicio1.ManeraSaludar.ManeraSaludar;

public class Guerrero {
	String nombre;
	ManeraSaludar maneraSaludar;
	ManeraPelear maneraPelear;
	
	public Guerrero(String nombre, ManeraPelear maneraPelear, ManeraSaludar maneraSaludar){
		this.nombre = nombre;
		this.maneraPelear = maneraPelear;
		this.maneraSaludar = maneraSaludar;
	}
	
	
}
