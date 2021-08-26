package co.edu.unal.ing.pc.unalcita.inicio;


import java.util.Scanner;

import co.edu.unal.ing.pc.unalcita.seguridad.FacultadUNAL;
import co.edu.unal.ing.pc.unalcita.seguridad.UsuarioUNAL;

public class AgendamientoUNAL {

	static UsuarioUNAL nombre;
	FacultadUNAL facultad;

	static String nombreUsuario = String.valueOf(nombre);

	public static void main(String[] args) {
		Scanner scanA = new Scanner(System.in);

		System.out.println("A continuación se mostrarán las opciones de los horarios disponibles:");
		System.out.println("\t");

		String horario[][] = new String[6][2];

		horario[0][0] = "1";
		horario[0][1] = " 7:00 am - 9:00 am";
		horario[1][0] = "2";
		horario[1][1] = " 9:00 am - 11:00 am";
		horario[2][0] = "3";
		horario[2][1] = " 11:00 am - 1:00 pm";
		horario[3][0] = "4";
		horario[3][1] = " 1:00 pm - 3:00 pm";
		horario[4][0] = "5";
		horario[4][1] = " 3:00 pm - 5:00 pm";
		horario[5][0] = "6";
		horario[5][1] = " 5:00 pm - 7:00 pm";

		for (int x = 0; x < horario.length; x++) {
			for (int y = 0; y < horario[x].length; y++) {

				System.out.println(horario[x][y]);
			}
		}

		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println("Por favor ingrese el número de opción para el cual desea reservar.");

		boolean opciones = false;
		int contador = 10;
		String despedida = "¡Gracias por usar UNALcita! Disfrute su sesión de estudio bioseguro.";

		do{String opcion = scanA.nextLine();
			
			switch (opcion) {

		case "1":
			contador--;
			System.out.println("Ha elegido la opción 1: 7:00 am - 9:00 am. Quedan " + contador + " cupos disponibles.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Se ha confirmado su reserva" + " de " + horario[0][1]);
			opciones = true;
			System.out.println("\t");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(despedida);
			break;
		case "2":
			contador--;
			System.out.println("Ha elegido la opción 2: 9:00 am - 11:00 am. Quedan " + contador + " cupos disponibles.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Se ha confirmado su reserva" + " de " + horario[1][1]);
			opciones = true;
			System.out.println("\t");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(despedida);
			break;
		case "3":
			contador--;
			System.out.println("Ha elegido la opción 3: 11:00 am - 1:00 pm. Quedan " + contador + " cupos disponibles.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Se ha confirmado su reserva" + " de " + horario[2][1]);
			opciones = true;
			System.out.println("\t");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(despedida);
			break;
		case "4":
			contador--;
			System.out.println("Ha elegido la opción 4: 1:00 pm - 3:00 pm. Quedan " + contador + " cupos disponibles.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Se ha confirmado su reserva" + " de " + horario[3][1]);
			opciones = true;
			System.out.println("\t");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(despedida);
			break;
		case "5":
			contador--;
			System.out.println("Ha elegido la opción 5: 3:00 pm - 5:00 pm. Quedan " + contador + " cupos disponibles.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Se ha confirmado su reserva" + " de " + horario[4][1]);
			opciones = true;
			System.out.println("\t");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(despedida);
			break;
		case "6":
			contador--;
			System.out.println("Ha elegido la opción 1: 7:00 am - 9:00 am. Quedan " + contador + " cupos disponibles.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Se ha confirmado su reserva" + " de " + horario[5][1]);
			opciones = true;
			System.out.println("\t");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(despedida);
			break;
		default :
			System.out.println("Error en opcion, intente nuevamente.");
			opciones=false;

		}
	}while (!opciones);




	
}}