
public class DevolverLetraA implements Runnable {

	
	private String nombre;
	
	
	public DevolverLetraA(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public void run() {

		int contador=0;
		
		
		
		for (int i = 0; i < nombre.length(); i++) {
			
			char caracteres = nombre.charAt(i);
			
			if(caracteres == 'a') {
				contador++;
		}
			
			
		
		}
		System.out.println("Número de Letras A: " + contador);
		Thread.yield();
		
//		OTRA FORMA DE HACERLO:	
//		int contador=0;
//			
//			char[] caracteres = nombre.toCharArray();
//			
//			for (char c : caracteres) {
//				if(c == 'a') {
//					contador++;
//			
//	
//			}
//				
//			}
//				System.out.println("Numero de Letras A: " + contador);
//			
//			Thread.yield();
			
		

	
		
		
	}

}
