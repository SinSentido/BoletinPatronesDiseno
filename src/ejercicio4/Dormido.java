package ejercicio4;

import java.util.Random;

public class Dormido implements Estado{
	Random rdm = new Random();
	
	public void atacar(Samurai samurai) {
		if(rdm.nextInt(2) == 0) {
			System.out.println("El Samurai se ha despertado\n");
			samurai.moveToDeprimidoState();
		}
		else {
			System.out.println("El Samurai está dormido, vuelve a intentarlo.\n");
		}
	}
}
