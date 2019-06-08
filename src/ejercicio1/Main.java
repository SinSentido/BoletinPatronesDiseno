package ejercicio1;

import ejercicio1.ManeraPelear.*;
import ejercicio1.ManeraSaludar.*;


public class Main {
	public static void main(String[] args) {
		ManeraPelear a2Manos = new PelearArma2Manos();
		ManeraPelear sigilo = new PelearSigiloso();
		ManeraSaludar reverencia = new SaludarReverencia();
		ManeraSaludar grito = new SaludarGrito();
		
		Samurai samurai = new Samurai("Yoshimitsu", a2Manos, reverencia);
		Ninja ninja = new Ninja("Naruto", sigilo, reverencia);
		Barbaro barbaro = new Barbaro("Regar", a2Manos, grito);
		
		System.out.println("Samurai");
		samurai.maneraSaludar.saludar();
		samurai.maneraPelear.pelear();
		
		System.out.println("\n\nNinja");
		ninja.maneraSaludar.saludar();
		ninja.maneraPelear.pelear();
		
		System.out.println("\n\nBarbaro");
		barbaro.maneraSaludar.saludar();
		barbaro.maneraPelear.pelear();
	}
}
