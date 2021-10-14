import java.util.Scanner;

public class Principal {
	private static Scanner sc;
	private static String nombre;
	
	//private static int caracter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		introducirNombre();
		
		NumeroCaracteres numero = new NumeroCaracteres(nombre);
		DevolverLetraA caracter = new DevolverLetraA(nombre);
		Reverso reverso = new Reverso (nombre);
		
		Thread hilo1 = new Thread(numero, "hilo1");
		Thread hilo2 = new Thread(caracter, "hilo2");
		Thread hilo3 = new Thread(reverso, "hilo3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	
	}

	private static void introducirNombre() {
		
		
		System.out.println("Introduzca un nombre: ");
		
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
	}
	
/*
 * 1. Programa en el cual ingresaremos un nombre por teclado. Con este nombre el programa tendrá que:
	- Devolver el número de caracteres. 
	- Devolver el número de letras "a" que contiene, si no contiene que ponga 0.
	- Tendrá que escribir el nombre al revés, por ejemplo, si escribimos Rico tiene que devolver Ocir. 

El orden de salida de la información no importará.

1.B. Mostrar la salida en el mismo orden que los puntos del enunciado. (Optativo)*/


	
	
	

}
