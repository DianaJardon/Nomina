import java.io.*;//gestionar las operaciones de entrada/salida.
import java.util.*;
import java.text.DecimalFormat;



public class Puestos{

static DecimalFormat df = new DecimalFormat("0.##");
			static Hashtable <String, Double> puestosS= new Hashtable<>();//hash table, indica que se uso porque se necesita establecer una relación entre puesto y sueldo (establecer una relacion entre dos)
			
			static{
				puestosS.put("Ayudante general", 4500.13);//contenido de la Hashtable
				puestosS.put("Tecnico", 10978.32);
				puestosS.put("Tecnico calificado", 11654.14);
				puestosS.put("Oficinista", 4780.12);
				puestosS.put("Empleado confianza", 10897.23);
				puestosS.put("Asistente de direccion", 7890.00);
				puestosS.put("Secretaria", 6871.25);
				puestosS.put("Director de oficina", 15065.12);
			}
			
			

		public static void mostrarPuestos(){
			int cont=1; //Creacion de un objeto para mostrar los puestos en cual alamcena y despues muestra con ayuda del for 
			for(Enumeration puestos=puestosS.keys(); puestos.hasMoreElements();){
				System.out.println("\t\t"+cont+"  "+puestos.nextElement());
				cont ++;
			}
		}
			static double cajaAhorro = .1;//definicion de los valores a evaluar deducciones
			static double seguridadSocial = .05;//son static por que no se van a crear objetos de la clase
			static double ISR = .03;
			static double bonoProductividad = 0.067;//bono extra sobre el salario 

			public static double sueldoNeto(String puesto, int horasExtra){//metodo que calcula el sueldo neto con parametros del puesto y las horas extra que realiza el empleado

				double sueldoQuincenalN = puestosS.get(puesto) / 2; 
				double sueldoB=puestosS.get(puesto)/2;
				double auxiliar=puestosS.get(puesto)/2;
				double sueldoQuincenal;
				//horasExtra
				if  (puestosS.get(puesto)> 10000){

					sueldoQuincenalN = ( (sueldoQuincenalN / 12) / 8)  * horasExtra;
					System.out.println("12 dias quincenales");
				}else{
					sueldoQuincenalN = ( (sueldoQuincenalN/ 10) / 8)  * horasExtra; 
					System.out.println("10 dias quincenales");
				}
					
					double deducciones = totalDeducciones(puesto);
					System.out.println("Deducciones: " + deducciones);
					
					sueldoQuincenal= sueldoQuincenalN + sueldoB + (auxiliar * bonoProductividad);
					System.out.println("Sueldo Quincenal sin deducciones y con ingresos: " + sueldoQuincenal); 
					
					sueldoQuincenal = sueldoQuincenal - deducciones; // 
					System.out.println("Sueldo quincenal neto: "+ df.format(sueldoQuincenal));
				return sueldoQuincenal;
			}

			public static double totalDeducciones(String puesto){//fmetodo para calcular el total de deducciones como unico parametro el puesto
				double totalDeduccion = 0;
				double sueldoQuincenal = puestosS.get(puesto) / 2;
				totalDeduccion += (sueldoQuincenal * cajaAhorro);
				totalDeduccion +=  (sueldoQuincenal * seguridadSocial);
				totalDeduccion += (sueldoQuincenal * ISR);

				return totalDeduccion;//retorna las deducciones calculadas previamente 
			}


			public static double ingresoSinImpuesto(String puesto, int horasExtra){
				double sueldoQuincenal;
				double sueldoQuincenalN = puestosS.get(puesto)/2;
				double sueldoB = puestosS.get(puesto)/2;
				double auxiliar = puestosS.get(puesto)/2;
				
				if  (puestosS.get(puesto) > 10000){
			
					sueldoQuincenalN = ( (sueldoQuincenalN / 12) / 8)  * horasExtra;
				}else{
					sueldoQuincenalN = ( (sueldoQuincenalN/ 10) / 8)  * horasExtra; //
				}

				//deducciones
				sueldoQuincenal = sueldoQuincenalN + sueldoB + (auxiliar * bonoProductividad);;
	

					return sueldoQuincenal;

			}


}