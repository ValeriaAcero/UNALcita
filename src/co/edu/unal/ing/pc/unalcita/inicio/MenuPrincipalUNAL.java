package co.edu.unal.ing.pc.unalcita.inicio;


import java.util.Scanner;

public class MenuPrincipalUNAL {

	public static void main(String[] args) {

		Scanner scanMP = new Scanner(System.in);

		System.out.println(
				"¡Bienvenid@ a UNALcita! \nAquí vas a poder tener la información necesaria para poder entrar a la biblioteca \ny que se logre el regreso al campus de manera biosegura. ");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("¿Es su primera vez en UNALcita? Escriba \"si\" o \"no\".");

		boolean respuesta = false;

		do {

			String confirmacion = scanMP.nextLine();
			switch (confirmacion) {

			case "si":
				System.out.println("Al no haber ingresado antes, realice su registro.");
				RegistroUNAL.main(args);
				respuesta = true;
				break;
			case "no":
				Login.main(args);
				respuesta = true;
				break;
			default:
				System.out.println("Opción inválida, intente una vez más.");
				respuesta = false;
			}

		} while (!respuesta);

	
	}

}
