package Principal;

import Clases.Persona;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			//Error al dividir por cero
			int valor = 10;
			valor = 10/0;
			
			//Error al utilizar un objeto null
			Persona persona = null;
			persona.setnIdentificacion(123456);
			
		}catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
