package ejercicio2;

public class Ninja extends Guerrero{

	Ninja(){
		setNombre("Ninja");
		setPoder(100);
	}
	
	@Override
	public void mostrarMensajeDescripcion() {
		System.out.println("Un sigiloso ninja");
		
	}

}
