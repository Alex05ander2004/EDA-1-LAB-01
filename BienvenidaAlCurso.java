package Ejercicios;

import java.util.Scanner;

public class BienvenidaAlCurso {
	public static void main(String[] args) {
		Scanner obtener = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre=obtener.nextLine();
		System.out.println("Bienvenido al curso de EDA "+ nombre);
	}
}
