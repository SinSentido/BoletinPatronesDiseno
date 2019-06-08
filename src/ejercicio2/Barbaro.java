package ejercicio2;

public class Barbaro extends Guerrero{
	
	Barbaro(){
		setNombre("Barbaro");
		setPoder(300);
	}
	
	@Override
	public void mostrarMensajeDescripcion() {
		System.out.println("Un barbaro salvaje");
	}

}
