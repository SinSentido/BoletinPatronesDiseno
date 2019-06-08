package ejercicio2;

public class FactoriaGuerrerosZona implements FactoriaGuerreros{

	private static FactoriaGuerrerosZona instance = new FactoriaGuerrerosZona();
	
	private FactoriaGuerrerosZona() {	
	}
	
	@Override
	public Guerrero GenerarGuerreroEnemigo(int zona) {
		Guerrero guerrero = null;
				
		if(zona == 1 || zona == 2) {
			guerrero = new Ninja();
		}
		else if(zona == 3 || zona == 4) {
			guerrero = new Samurai();
		}
		else if(zona == 5 || zona == 6) {
			guerrero = new Barbaro();
		}
		return guerrero;
	}

	public static FactoriaGuerrerosZona getInstance() {
		return instance;
	}
}
