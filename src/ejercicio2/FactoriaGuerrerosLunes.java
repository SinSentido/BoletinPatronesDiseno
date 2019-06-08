package ejercicio2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FactoriaGuerrerosLunes implements FactoriaGuerreros{

	private static FactoriaGuerrerosLunes instance = new FactoriaGuerrerosLunes();
	
	private FactoriaGuerrerosLunes() {	
	}
	
	@Override
	public Guerrero GenerarGuerreroEnemigo(int zona) {
		Guerrero guerrero = null;
		DayOfWeek fecha = LocalDate.now().getDayOfWeek(); 
		
		if(zona == 1 || zona == 2) {
			if(fecha == DayOfWeek.THURSDAY) {
				guerrero = new Barbaro();
			}
			else {
				guerrero = new Ninja();	
			}
		}
		else if(zona == 3 || zona == 4) {
			guerrero = new Samurai();
		}
		else if(zona == 5 || zona == 6) {
			guerrero = new Barbaro();
		}
		return guerrero;
	}
	
	public static FactoriaGuerrerosLunes getInstance() {
		return instance;
	}

}
