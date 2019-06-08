package ejercicio4;

public class Samurai {
	
	private final Estado normal = new Normal();
	private final Estado dormido = new Dormido();
	private final Estado deprimido = new Deprimido();
	
	private int potenciaAtaque = 1000;
	private Estado estado = normal;
	
	
	public int getPotenciaAtaque() {
		return potenciaAtaque;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void moveToNormalState() {
		System.out.println("El Samurai está normal\n");
		estado = normal;
		potenciaAtaque = 1000;
	}
	
	public void moveToDormidoState() {
		System.out.println("El Samurai está dormido\n");
		estado = dormido;
	}
	
	public void moveToDeprimidoState() {
		System.out.println("El Samurai está deprimido\n");
		estado = deprimido;
		potenciaAtaque /= 2;
	}

}
