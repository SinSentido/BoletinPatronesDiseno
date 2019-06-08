package ejercicio4;

public class Deprimido implements Estado{
	public void atacar(Samurai samurai) {
		System.out.printf("El ataque hace un daño de %d%n", samurai.getPotenciaAtaque());
		System.out.println("El samurai se ha animado un poco\n");
		samurai.moveToNormalState();
	}
}
