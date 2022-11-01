 

public class Nomina{

	public static void main(String[] args){
		//Crear ojetos
		Archivos archivo = new Archivos(); //se genera el objeto de la clase archivos
		Personas personas = new Personas();//se genera el objeto de la clase personas

		//metodos
		personas.registrarEmpleado(); // ya registre, parametro
		archivo.escribir(personas); // lo almaceno

		
	}
}