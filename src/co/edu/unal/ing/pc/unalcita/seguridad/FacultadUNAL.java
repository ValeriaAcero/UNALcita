package co.edu.unal.ing.pc.unalcita.seguridad;

import java.util.Scanner;

public class FacultadUNAL {
	public static String Facultad;
	public static String asignacion = " tiene asignado los días ";



	public static void main(String[] args) {
		Scanner scanF = new Scanner(System.in);
		

		boolean encontrado = false;

		System.out.println(
				"A continuación se mostrarán las facultades disponibles. \nIngresela en el mismo formato en el que la observa.");
		System.out.println(" \t");

		String facultades[] = new String[11];

		facultades[0] = "- Ingenieria";
		facultades[1] = "- Artes";
		facultades[2] = "- Ciencias";
		facultades[3] = "- Ciencias Agrarias";
		facultades[4] = "- Ciencias Economicas";
		facultades[5] = "- Ciencias Humanas";
		facultades[6] = "- Ciencias Politicas";
		facultades[7] = "- Enfermeria";
		facultades[8] = "- Medicina";
		facultades[9] = "- Veterinaria y Zootecnia";
		facultades[10] = "- Odontologia";

		for (int x = 0; x < facultades.length; x++) {

			System.out.println(facultades[x]);

		}
		
	
		
		do {

			String Facultad = scanF.nextLine();
			String asignacion = " tiene asignado los días ";

			switch (Facultad) {
			case "Ingenieria":
				System.out.print("Ingenieria" + asignacion + "Lunes. ");
				encontrado = true;
				break;
			case "Artes":
				System.out.print("Artes" + asignacion + "Martes. ");
				encontrado = true;
				break;
			case "Ciencias":
				System.out.print("Ciencias" + asignacion + "Martes. ");
				encontrado = true;
				break;
			case "Ciencias Agrarias":
				System.out.print("Ciencias Agrarias" + asignacion + "Miercoles. ");
				encontrado = true;
				break;
			case "Ciencias Economicas":
				System.out.print("Ciencias Economicas" + asignacion + "Miercoles. ");
				encontrado = true;
				break;
			case "Ciencias Humanas":
				System.out.print("Ciencias Humanas" + asignacion + "Jueves. ");
				encontrado = true;
				break;
			case "Ciencias Politicas":
				System.out.print("Ciencias Politicas" + asignacion + "Jueves. ");
				encontrado = true;
				break;
			case "Enfermeria":
				System.out.print("Enfermeria" + asignacion + "Viernes. ");
				encontrado = true;
				break;
			case "Medicina":
				System.out.print("Medicina" + asignacion + "Viernes. ");
				encontrado = true;
				break;
			case "Veterinaria y Zootecnia":
				System.out.print("Veterinaria y Zootecnia" + asignacion + "Sabado. ");
				encontrado = true;
				break;
			case "Odontologia":
				System.out.print("Odontologia" + asignacion + "Sabado. ");
				encontrado = true;
				break;
			default:
				System.out.println("Error en el nombre de la Facultad, intente nuevamente.");
				encontrado = false;
			}

		} while (!encontrado);

	}

}
