package ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio6 {
	/* Crea una función que reciba una cadena con una frase y devuelva una colección 
que contenga solo las palabras que aparecen repetidas en esa frase. Por ejemplo, si 
la frase es: "Pues ná, que me dijo no ni ná" devolverá una colección conteniendo las 
palabras {"no", "ná"}. */
	
	private String frase;

	public Ejercicio6(String frase) {
		super();
		this.frase = frase;
	}
	
	public Set<String> guardarRepeticion() {
		frase = frase.trim();
		frase = frase.replaceAll("[,.:;]", "");

		
		String[] fraseArray = frase.split(" ");
		
		Set<String> palabrasRepetidas = new HashSet<>();
		
		String palabraActual = "";
		
		for (int i = 0; i < fraseArray.length; i++) {
			palabraActual = fraseArray[i];
			int contador = 0;
			
			for (int j = 0; j < fraseArray.length; j++) {
				if(fraseArray[j].equals(palabraActual)) {
					contador++;
				}
			}
			if (contador >1) {
				palabrasRepetidas.add(palabraActual);
			}
		}
		return palabrasRepetidas;
	}
	
	
	
}
