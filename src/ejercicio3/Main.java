package ejercicio3;

public class Main {
	public static void main(String[] args) {
		/*Creamos los directores para probar los 2 builder*/
		NinjaDirector creadorNinjasHoja = new NinjaDirector(new AldeaOcultaDeLaHoja());
		NinjaDirector creadorNinjasNube = new NinjaDirector(new AldeaOcultaDeLaNube());
		
		/*Creamos un ninja de cada tipo de la aldea de la hoja*/
		Ninja ancianoHoja = creadorNinjasHoja.crearNinja(TipoNinja.ANCIANO);
		Ninja maestroHoja = creadorNinjasHoja.crearNinja(TipoNinja.MAESTRO);
		Ninja aprendizHoja = creadorNinjasHoja.crearNinja(TipoNinja.APRENDIZ);
	
		/*Creamos un ninja de cada tipo de la aldea de la nube*/
		Ninja ancianoNube = creadorNinjasNube.crearNinja(TipoNinja.ANCIANO);
		Ninja maestroNube = creadorNinjasNube.crearNinja(TipoNinja.MAESTRO);
		Ninja aprendizNube = creadorNinjasNube.crearNinja(TipoNinja.APRENDIZ);
		
		/*Mostramos todos los ninjas por consola para comprobar sus diferencias*/
		System.out.println(ancianoHoja.toString());
		System.out.println(maestroHoja.toString());
		System.out.println(aprendizHoja.toString());
		
		System.out.println("");
		
		System.out.println(ancianoNube.toString());
		System.out.println(maestroNube.toString());
		System.out.println(aprendizNube.toString());
	}
}
