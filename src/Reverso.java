

public class Reverso implements Runnable {

	
	private String nombre;
	
	
	
	
	public Reverso(String nombre) {
		super();
		this.nombre = nombre;
	}




	@Override
	public void run() {
		
		StringBuilder stringBuilder = new StringBuilder(nombre);
		// Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
		String invertida = stringBuilder.reverse().toString();
		System.out.println("Cadena invertida: " + invertida);
		
		Thread.yield(); 
	}

}
