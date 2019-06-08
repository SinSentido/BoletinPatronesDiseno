package ejercicio4;

import static keyboard.Keyboard.*;

public class Main {
	public static void main(String[] args) {
	
		boolean salir = false;
		Samurai samurai = new Samurai();
		
		do {
			System.out.printf("1.Atacar%n2.Salir%n%n");
			if(readNumberInRange(1,2, Limit.MAX_MIN_INCLUDED) == 1) {
				samurai.getEstado().atacar(samurai);
			}
			else {
				salir = true;
			}
		}while(!salir);
		
	}
}
