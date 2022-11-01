
import java.util.Scanner; 



public class Personas{// delcaracion de la clase personas 
//Puestos pues = new Puestos();

	Scanner input = new Scanner(System.in);// declarando el objeto para la entrada de datos 
	static public int count = 0; // 

	String [] nombres = new String [100];//declaracion de los arreglos para el almacen de datos 
	Double [] sueldo = new Double[100];
	String [] puesto = new String[100];
	int    [] horasExtra = new int[100];
	 

	Double [] sueldoBrutoQuincenal = new Double[100]; // con deducciones
	Double [] totalDeducciones = new Double[100]; // solo deducciones
	Double [] ingresoSinDeduccion = new Double[100]; // sin deducciones



	public void registrarEmpleado(){//metodo para registrar empleado 
		String otro = "No"; //si ingresa un NO o un caracter diferente se sale del ciclo 
		do{
			System.out.print("Ingresa el nombre iniciando por apellido paterno: ");//registro de datos del empleado
			nombres[count] =  input.nextLine();
			Puestos.mostrarPuestos();//muestra los empleados disponibles para el reggistro 
			System.out.print("Selecciona el puesto: ");
			int seleccionar = input.nextInt();//almacena el tipo de puesto para acceder al menu segun sea el caso
			
			
			switch(seleccionar){//evalua seleccionar y entra segun el valor al caso
				case 1:
				// conforme el usuario ingrese los datos estos se irán almacenando en los arreglos
					puesto[count] = "Tecnico";
					double subtotal= Puestos.puestosS.get("Tecnico");
									
					sueldo[count] = Puestos.puestosS.get("Tecnico");
					


					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);

					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);

					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);

				break;
				case 2:
					puesto[count] = "Secretaria";
					sueldo[count] = Puestos.puestosS.get("Secretaria");

					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;
				case 3:
					puesto[count] = "Director de oficina";
					sueldo[count] = Puestos.puestosS.get("Director de oficina");

					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;
                 

                 case 4:
					puesto[count] = "Asistente de direccion";
					sueldo[count] = Puestos.puestosS.get(" Asistente de direccion");

					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;
      

           case 5:
					puesto[count] = "Oficinista";
					sueldo[count] = Puestos.puestosS.get("Oficinista");

					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;


           case 6:
					puesto[count] = "Tecnico calificado";
					sueldo[count] = Puestos.puestosS.get("Tecnico calificado");

					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;
          
           case 7:
					puesto[count] = "Empleado confianza";
					sueldo[count] = Puestos.puestosS.get("Empleado confianza");

					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;

case 8:
					puesto[count] = "Ayudante general";
					System.out.println(Puestos.puestosS.get("Ayudante general"));
					sueldo[count] = Puestos.puestosS.get("Ayudante general");


					System.out.print("Ingresa las horas extra: ");
					horasExtra[count] = input.nextInt(); //5

					// sueldoNeto
					sueldoBrutoQuincenal[count] = Puestos.sueldoNeto(puesto[count], horasExtra[count]);


					// total deducciones
					totalDeducciones[count] = Puestos.totalDeducciones(puesto[count]);


					// ingreso sinDeduccion
					ingresoSinDeduccion[count] = Puestos.ingresoSinImpuesto(puesto[count], horasExtra[count]);
				break;







		
		    }

         		
       

	
			input.nextLine();
			System.out.println("Desea registrar otro empleado ? ");
			otro = input.nextLine(); // '\n'
			count ++;
		}while(otro.equals("Si"));


	

	}

	public Double[] obtenerSueldoBrutoQuincenal(){//almacena el sueldo bruto quincenal para retornarlo y usarlo en la clase personas 
		return sueldoBrutoQuincenal;
	}



	public Double[] obtenerTotalDeducciones(){// "                            "                
		return totalDeducciones;
	}


	public Double[] obtenerIngresoSinDeduccion(){// "                            " 
		return ingresoSinDeduccion;
	}


	public String[] obtenerNombres(){// "                            " 
		return nombres;
	}

	


	public Double[] obtenerSueldos(){// "                            " 
		return sueldo;
	}



	public String[] obtenerPuestos(){// "                            " 
		return puesto;
	}

}

