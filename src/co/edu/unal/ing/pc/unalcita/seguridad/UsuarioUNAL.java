package co.edu.unal.ing.pc.unalcita.seguridad;


import java.util.Scanner;

public class UsuarioUNAL {

	static String nombre;

	static String apellidos;

	public static void setNombre(String nombre1) {
		nombre = nombre1;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setApellidos(String apellido1) {
		apellidos = apellido1;
	}

	public static String getApellidos() {
		return apellidos;
	}

	public static void main(String[] args) {

		String usuario = nombre + apellidos;

		System.out.println(
				"Gracias por completar el registro " + String.valueOf(nombre) + " " + String.valueOf(apellidos));
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("El nombre de usuario corresponde a: " + usuario);

	}

	static String nombreIngreso;

	public static void main1(String[] args) {
		Scanner scanU = new Scanner(System.in);

		String usuario = nombre + apellidos;

		boolean ingresoUsuario = false;

		do {
			nombreIngreso = scanU.nextLine();

			if (nombreIngreso.equals(usuario)) {

				ingresoUsuario = true;
			}

			else {
				System.out.println("Nombre de usuario incorrecto. Intente nuevamente.");

				ingresoUsuario = false;
			}
		} while (!ingresoUsuario);
	}
}
