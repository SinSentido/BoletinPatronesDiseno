package ejercicio2;

public abstract class Guerrero {
	
	private String nombre;
	private int poder;
	
	public abstract void mostrarMensajeDescripcion();

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	public String toString() {
		return String.format("Nombre: %s%nPoder: %d%n", nombre, poder);
	}
}
