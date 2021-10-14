import java.util.Scanner;

public class NumeroCaracteres implements Runnable {
	
	private String nombre;
	
	
	
	
	
	public NumeroCaracteres(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	
	
	public void run() {
	
		
		nombre.length();
		System.out.println("Número de Caracteres: " + nombre.length());
		Thread.yield(); 

	}

}
