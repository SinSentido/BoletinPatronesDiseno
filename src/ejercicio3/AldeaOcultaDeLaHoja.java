package ejercicio3;

public class AldeaOcultaDeLaHoja extends Ninja.Builder{
	
	private static final String tipoNinja = "Hoja";
	
	public AldeaOcultaDeLaHoja() {
		super(tipoNinja);
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void setValentia(int valentia) {
		this.valentia = valentia + 100; // Los ninjas de la hoja son más valientes que los de la nube
	}

	@Override
	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}

	@Override
	public void addArmas(String arma) {
		listaDeArmas.add(arma);
	}
	
	

}
