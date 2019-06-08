package ejercicio3;

public class AldeaOcultaDeLaNube extends Ninja.Builder{
	
	private static final String tipoNinja = "Nube";
	
	public AldeaOcultaDeLaNube() {
		super(tipoNinja);
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza+100; //Los ninjas de la nube son ḿás fuertes que los de la hoja
	}

	@Override
	public void setValentia(int valentia) {
		this.valentia = valentia;
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
