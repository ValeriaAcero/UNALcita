package co.edu.unal.ing.pc.unalcita.inicio;

import java.util.Scanner;

import co.edu.unal.ing.pc.unalcita.seguridad.ContraseniasUNAL;
import co.edu.unal.ing.pc.unalcita.seguridad.FacultadUNAL;
import co.edu.unal.ing.pc.unalcita.seguridad.UsuarioUNAL;

public class Login {

	public static void main(String[] args) {

		System.out.println(
				"Con el fin de realizar una verificación de los datos personales, \ningrese la siguiente información:");

		Scanner scanL = new Scanner(System.in);

		UsuarioUNAL usuario = new UsuarioUNAL();

		System.out.println("Nombre. \nRecuerde usar mayúscula inicial.");
		usuario.setNombre(scanL.nextLine());
		System.out.println("Apellido \nRecuerde usar mayúscula inicial.");
		usuario.setApellidos(scanL.nextLine());
		System.out.println("Por favor ingrese su contraseña.");
		ContraseniasUNAL.main(args);

		System.out.println("Ya que completó la verificación de sus datos, ingrese su nombre de usuario.");

		UsuarioUNAL.main1(args);

		System.out.println("Ingrese nuevamente su contraseña.");
		ContraseniasUNAL.main1(args);

		boolean respuesta = false;

		System.out.println("¿Desea recordar el día que tiene asignado su facultad? Ingrese \"si\" o \"no\".");
		
		do {

			String confirmacion = scanL.nextLine();
			switch (confirmacion) {

			case "si":

				FacultadUNAL.main(args);
				respuesta = true;
				break;
			case "no":
				
				respuesta = true;
				break;
			default:
				System.out.println("Opción inválida, intente una vez más.");
				respuesta = false;
			}

		} while (!respuesta);
		
		
		
		AgendamientoUNAL.main(args);

	
	}

}
