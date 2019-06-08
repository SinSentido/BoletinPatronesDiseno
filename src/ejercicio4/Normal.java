package ejercicio4;

public class Normal implements Estado{
	public void atacar(Samurai samurai) {
		System.out.printf("El ataque hace un daño de %d%n", samurai.getPotenciaAtaque());
		samurai.moveToDormidoState();
	}
}
