package ejercicio2;

import static keyboard.Keyboard.*;

public class Main {
	public static void main(String[] args) {
		int zonaJugador = 1;
		int eleccionJugador;
		
		Guerrero enemigo;
		
		/*PRUEBAS FACTORIA ZONA*/
		
		System.out.println("El jugador lucha contra su primer enemigo");
		//Se crea un enemigo mediante la factoria
		enemigo = FactoriaGuerrerosZona.getInstance().GenerarGuerreroEnemigo(zonaJugador);
		System.out.println("Luchas contra:\n");
		System.out.println(enemigo.toString());
		
		System.out.printf("%n¿A que zona quieres ir ahora?%n1.Bosque%n2.Templo%n");
		eleccionJugador = readNumberInRange(1, 2, Limit.MAX_MIN_INCLUDED);
		
		if(eleccionJugador == 1) {
			zonaJugador = 6;
		}
		else {
			zonaJugador = 3;
		}
		
		enemigo = FactoriaGuerrerosZona.getInstance().GenerarGuerreroEnemigo(zonaJugador);
		System.out.println("Luchas contra:\n");
		System.out.println(enemigo.toString());
		
		
		
		/*PRUEBAS FACTORIA LUNES (Cambiar dia para probar)*/ 
		
		System.out.println("Hoy es lunes y en lugar de un Ninja me va a salir un Barbaro.\n");
		//Se crea un enemigo mediante la factoria
		enemigo = FactoriaGuerrerosLunes.getInstance().GenerarGuerreroEnemigo(zonaJugador); //Debería salir un barbaro
		System.out.println("Luchas contra:\n");
		System.out.println(enemigo.toString());
	}
}
