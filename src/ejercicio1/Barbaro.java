package ejercicio1;

import ejercicio1.ManeraPelear.ManeraPelear;
import ejercicio1.ManeraSaludar.ManeraSaludar;

public class Barbaro extends Guerrero{
	String nombre;
	String arma = "hacha";

	public Barbaro(String nombre, ManeraPelear maneraPelear, ManeraSaludar maneraSaludar) {
		super(nombre, maneraPelear, maneraSaludar);
	}
}
