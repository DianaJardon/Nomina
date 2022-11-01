import java.io.FileWriter;   // Import the FileWriter class  Esta clase es usada para escribir caracteres en archivos. Su método write() permite escribir caracteres o strings a un fichero.
import java.io.IOException;  // Import the IOException class to handle errors Significa que se ha producido un error en la entrada/salida.
import java.text.DecimalFormat;//dar formato de numero de decimales a los resultados


public class Archivos{ //clase archivos para almacenar los datos generados en el resto de las clases

static DecimalFormat df = new DecimalFormat("0.##");//Establece el limite de 2 decimales en las cantidades, creando el objeto df para su uso
	public void escribir(Personas personas){ // int String double 

		String [] arreglo_nombres = personas.obtenerNombres();//crea un objeto de la clase persona de tipo String mandando a llamar el metodo obtenerNombre
		Double [] arreglo_sueldos = personas.obtenerSueldos();
		String [] arreglo_puestos = personas.obtenerPuestos();
		Double [] sueldo_bruto = personas.obtenerSueldoBrutoQuincenal();
		Double [] total_deducciones = personas.obtenerTotalDeducciones();
		System.out.println("el elemento es" + arreglo_sueldos[0]);

		try{

			FileWriter miArchivo = new FileWriter("Empleados.txt", true); //genera el archivo donde almacenaran los datos 
			
				
			for (int i = 0; i < Personas.count; i++){ //for donde hara la escritura de datos respecto al numero de datos ingresados
				
             // if(i==1){
               // miArchivo.write("------------------------------------------------------------------------------------------------------------------\n");
               //miArchivo.write("| Nombre                       |           Puesto           |   SalarioM    |   Ingresos   |  deducciones          |\n");
               //miArchivo.write("-------------------------------------------------------------------------------------------------------------------\n");
            //}

				miArchivo.write(arreglo_nombres[i] + "                      "); //escirtura de cada dato recuperado 
				miArchivo.write(arreglo_puestos[i] + "                   ");
				miArchivo.write(Double.toString(arreglo_sueldos[i]) + "     ");
				miArchivo.write(Double.toString(sueldo_bruto[i]) + "          ");
				miArchivo.write(Double.toString(total_deducciones[i]) + "    ");
				System.out.println("\n");
				
		    }

			System.out.println("Registros completados");
			miArchivo.close();

		}catch (Exception e) {
			System.out.println("Error al abrir archivo ");
			System.out.println(e);
		}

	}

}