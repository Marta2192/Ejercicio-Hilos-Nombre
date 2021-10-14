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
	



	
	
	

}
