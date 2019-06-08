package ejercicio1;

import ejercicio1.ManeraPelear.ManeraPelear;
import ejercicio1.ManeraSaludar.ManeraSaludar;

public class Samurai extends Guerrero{
	String arma = "katana";
	
	public Samurai(String nombre, ManeraPelear maneraPelear, ManeraSaludar maneraSaludar) {
		super(nombre, maneraPelear, maneraSaludar);
	}

}
