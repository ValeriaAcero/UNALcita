package co.edu.unal.ing.pc.unalcita.seguridad;

import java.util.Scanner;

public class ContraseniasUNAL {
	static String REFERENCIA = "caracter";
	static String NEGACION = "Ingreso de contraseña incorrecto, intente una vez más.";
	static String contrasenia;

	public void setContrasenia(String Contrasenia) {
		contrasenia = Contrasenia;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public static void main(String[] args) {
		Scanner scanC = new Scanner(System.in);

		boolean busqueda = false;

		do {

			contrasenia = scanC.nextLine();

			if (contrasenia.length() == REFERENCIA.length()) {

				busqueda = true;
			} else {
				System.out.println(NEGACION);
				busqueda = false;
			}

		} while (!busqueda);


	}

	static String contraseniaIngreso;

	public static void main1(String[] args) {
		Scanner scanC2 = new Scanner(System.in);

		boolean ingresoContrasenia = false;

		do {
			contraseniaIngreso = scanC2.nextLine();

			if (contraseniaIngreso.equals(contrasenia)) {

				System.out.println("Credenciales correctas.");
				System.out.println("---------------------------------------------------------------------------------------");
				ingresoContrasenia = true;
			}

			else {
				System.out.println("Contraseña incorrecta. Intente nuevamente.");

				ingresoContrasenia = false;
			}
		} while (!ingresoContrasenia);


	}
}