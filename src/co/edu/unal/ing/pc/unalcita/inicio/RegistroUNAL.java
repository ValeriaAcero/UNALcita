package co.edu.unal.ing.pc.unalcita.inicio;

import java.util.Scanner;

import co.edu.unal.ing.pc.unalcita.seguridad.ContraseniasUNAL;
import co.edu.unal.ing.pc.unalcita.seguridad.FacultadUNAL;
import co.edu.unal.ing.pc.unalcita.seguridad.UsuarioUNAL;

public class RegistroUNAL {
	static String AFIRMACION = "Contrase�a corrrecta establecida";

	public static void main(String[] args) {
		Scanner scanR = new Scanner(System.in);
		UsuarioUNAL usuario = new UsuarioUNAL();

		System.out.println("Nombre.\nRecuerde usar may�scula inicial.");
		usuario.setNombre(scanR.nextLine());
		System.out.println("Apellido. \nRecuerde usar may�scula inicial.");
		usuario.setApellidos(scanR.nextLine());
		System.out.println("Contrase�a.\nRecuerde utilizar 8 caracteres.");
		ContraseniasUNAL.main(args);
		System.out.println(AFIRMACION);
		System.out.println("Registro realizado con �xito.");
		System.out.println("---------------------------------------------------------------------------------------");

		UsuarioUNAL.main(args);

		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Ingrese Facultad a la que pertenece para conocer el dia que tiene asignado.");
		System.out.println("\t");

		FacultadUNAL.main(args);

		System.out.println(
				"\n�Desea realizar de una vez su agendamiento para asistir a la biblioteca? Escriba \"si\" o \"no\".");

		boolean asistencia = false;

		do {

			String confirmacion = scanR.nextLine();
			switch (confirmacion) {

			case "si":
				AgendamientoUNAL.main(args);
				asistencia = true;
				break;
			case "no":
				System.out.println("Gracias por hacer su registro, nos vemos en su pr�xima sesi�n de estudio.");
				asistencia = true;
				break;
			default:
				System.out.println("Opci�n inv�lida, intente una vez m�s.");
				asistencia = false;
			}

		} while (!asistencia);


	}

}
