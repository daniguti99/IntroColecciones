package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio2 {
	
	/*2. Crea una función que reciba una colección de números y los devuelva ordenados
ascendentemente y otra función que los devuelva ordenados descendentemente.*/
	
	private List<Integer> numeros;

	public Ejercicio2(List<Integer> numeros) {
		super();
		this.numeros = numeros;
	}
	
	
	public static List<Integer> ordenarAscendentemente(List<Integer> numeros) {
		Collections.sort(numeros);
		return numeros;
	}
	
	public static List<Integer> ordenarDescendentemente(List<Integer> numeros) {
		Collections.reverse(numeros);
		return numeros;
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList(List.of(1, 56, 76, 23, 45, 65, 90));
		Ejercicio2 ejercicio2 = new Ejercicio2(numeros);
		System.out.println(ordenarAscendentemente(ejercicio2.getNumeros()));
		System.out.println(ordenarDescendentemente(ejercicio2.getNumeros()));
	}


	public List<Integer> getNumeros() {
		return numeros;
	}
	
	

}
