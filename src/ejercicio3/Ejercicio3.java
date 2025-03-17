package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
	
	/*3. Crea una clase java que almacene una colección de números ordenados
crecientemente. Esta clase agregará un valor numérico en cada ocasión y lo
posicionará de forma ordenada en la posición que le corresponda sin hacer uso del
método sort, pudiendo existir valores repetidos.*/
	
	private List<Integer> numeros;

	public Ejercicio3() {
		super();
		this.numeros = new ArrayList<>();
	}
	
	public void agregarNumero(int numero) {
		int indice = 0;
		
		while(indice < numeros.size() && numeros.get(indice)<numero) {
			indice++;
		}
		numeros.add(indice, numero);
	}

	public List<Integer> getNumeros() {
		return numeros;
	}
	
	public void imprimirColeccion() {
		for (int numero : numeros) {
			System.out.println(numero + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Ejercicio3 numeros = new Ejercicio3();
		
		numeros.agregarNumero(5);
		numeros.agregarNumero(2);
		numeros.agregarNumero(5);
		
		numeros.imprimirColeccion();
		
		numeros.agregarNumero(10);
		numeros.agregarNumero(11);
		numeros.agregarNumero(34);
		numeros.agregarNumero(2);
		numeros.agregarNumero(1);
		
		numeros.imprimirColeccion();
	}
	
	

	
}
