package ejercicio2;

public class Samurai extends Guerrero{

	Samurai(){
		setNombre("Samurai");
		setPoder(200);
	}
	
	@Override
	public void mostrarMensajeDescripcion() {
		System.out.println("Un orgulloso samurai");
	}

}
