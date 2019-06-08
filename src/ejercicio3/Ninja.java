package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ninja {
	
	//Atributos Ninja (inmutable)
	private String nombre, vestimenta;
	private int fuerza, valentia;
	private List<String> listaDeArmas = new ArrayList<>();
	
	//Ponemos el constructor como privado porque solo se pueden crear ninjas desde la clase builder
	private Ninja(Builder builder) {
		nombre = builder.nombre;
		fuerza = builder.fuerza;
		valentia = builder.valentia;
		vestimenta = builder.vestimenta;
		listaDeArmas = builder.listaDeArmas;
	}
	
	public abstract static class Builder{
			protected final String tipoNinja;
			protected String nombre, vestimenta;
			protected int fuerza, valentia;
			protected List<String> listaDeArmas = new ArrayList<>();
			
			public Builder(String tipoNinja) {
				this.tipoNinja = tipoNinja;
			}
			
			//Metodos set de la clase Builder
			public abstract void setNombre(String nombre);
			public abstract void setFuerza(int fuerza);
			public abstract void setValentia(int valentia);
			public abstract void setVestimenta(String vestimenta);
			public abstract void addArmas(String arma);
			
			public Ninja build() {
				comprobarCamposObligatorios();
				Ninja ninja = new Ninja(this);
				reset();
				return ninja;
			}
			
			private void comprobarCamposObligatorios() {
				if(nombre == null) {
					throw new IllegalStateException("El nombre es obligatorio");
				}
			}
			
			private void reset() {
				nombre = null;
				vestimenta = null;
				fuerza = 0;
				valentia = 0;
				listaDeArmas.clear();
			}
	}
	
	public String toString() {
		return String.format("Nombre: %s%n"
				+ "Fuerza: %d%n"
				+ "Valentia: %d%n"
				+ "Vestimenta: %s%n%n", nombre, fuerza, valentia, vestimenta);
	}

}
