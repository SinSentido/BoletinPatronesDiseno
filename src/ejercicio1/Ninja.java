package ejercicio1;

import ejercicio1.ManeraPelear.*;
import ejercicio1.ManeraSaludar.*;


public class Ninja extends Guerrero{
	String arma = "kunai";
	
	public Ninja(String nombre, ManeraPelear maneraPelear, ManeraSaludar maneraSaludar) {
		super(nombre, maneraPelear, maneraSaludar);
	}
}
