package ejercicio4;

import java.util.ArrayList;
import java.util.List;

import ejercicio3.Ejercicio3;

public class Ejercicio4<T extends Comparable<T>> {
	private List<T> elementos;

	public Ejercicio4() {
		super();
		this.elementos = new ArrayList<>();
	}
	
	public void agregarElemento(T elemento) {
		int indice = 0;
		
		while(indice < elementos.size() && elementos.get(indice).compareTo(elemento)<0) {
			indice++;
		}
		elementos.add(indice, elemento);
	}

	public List<T> getElementos() {
		return elementos;
	}
	
	public void imprimirColeccion() {
		for (T elemento : elementos) {
			System.out.println(elemento + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Ejercicio4<Integer> coleccionEnteros = new Ejercicio4<>();
		
        coleccionEnteros.agregarElemento(5);
        coleccionEnteros.agregarElemento(2);
        coleccionEnteros.agregarElemento(8);
        coleccionEnteros.agregarElemento(3);
        coleccionEnteros.agregarElemento(5); // Valor repetido

        coleccionEnteros.imprimirColeccion(); // Debería imprimir: 2 3 5 5 8


        Ejercicio4<String> coleccionCadenas = new Ejercicio4<>();
        coleccionCadenas.agregarElemento("manzana");
        coleccionCadenas.agregarElemento("banana");
        coleccionCadenas.agregarElemento("cereza");
        coleccionCadenas.agregarElemento("arándano");

        coleccionCadenas.imprimirColeccion();
        
        //Con double no funciona
		/*
		 * Ejercicio4<Double> coleccionDouble = new Ejercicio4<>();
		 * coleccionCadenas.agregarElemento(23.00);
		 * coleccionCadenas.agregarElemento(10.21);
		 * coleccionCadenas.agregarElemento(10.22);
		 * coleccionCadenas.agregarElemento(2.99);
		 * 
		 * coleccionDouble.imprimirColeccion();
		 */
	}
	
}
