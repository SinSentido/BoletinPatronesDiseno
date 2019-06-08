package ejercicio3;

public class NinjaDirector {
	
	private final Ninja.Builder builder;
	
	public NinjaDirector(Ninja.Builder builder) {
		this.builder = builder;
	}
	
	public Ninja crearNinja(TipoNinja tipoNinja) {
		
		switch(tipoNinja) {
		case ANCIANO:
			builder.setNombre("Ninja Anciano");
			builder.setFuerza(1000);
			builder.setValentia(1000);
			builder.setVestimenta("Túnica");
			builder.addArmas("Baston");
			return builder.build();
			
		case MAESTRO:
			builder.setNombre("Ninja Maestro");
			builder.setFuerza(500);
			builder.setValentia(500);
			builder.setVestimenta("Armadura ninja");
			builder.addArmas("Espada");
			return builder.build();
			
		case APRENDIZ:
			builder.setNombre("Ninja Aprendiz");
			builder.setFuerza(100);
			builder.setValentia(100);
			builder.setVestimenta("Ropa normal");
			builder.addArmas("Puños");
			return builder.build();
		
		default:
			throw new RuntimeException("Tipo de ninja desconocido");
		}
		
		
	}

}
