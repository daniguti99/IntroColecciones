package ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
	
	/* 1. Crea una función que genere una colección de números aleatorios (entre 1 y 100)
ordenados en el que no se repita ningún número.*/

	private static final int MAX_ARRAY = 30;
	int[] arrayNumeros = generarNumerosAleatorios(MAX_ARRAY);
	
	
	public static int[] generarNumerosAleatorios(int cantidad) {
		
	int[] numerosUnicos = new int[cantidad];
	Random random = new Random();
	int indice = 0;
	
	while(indice<cantidad) {
		int numeroAleatorio = random.nextInt(100);
		
		boolean existe = false;
		
		for (int i = 0; i < indice; i++) {
			if(numerosUnicos[i]==numeroAleatorio) {
				existe = true;
			}
		}
		
		if(!existe ) {
			numerosUnicos[indice] = numeroAleatorio;
			indice++;
		}
	}
	
	Arrays.sort(numerosUnicos);
	return numerosUnicos;
	}
	
	public static void main(String[] args) {
		int[] numerosAleatorios = generarNumerosAleatorios(MAX_ARRAY);
		
		System.out.println("Los numeros generados son: " + Arrays.toString(numerosAleatorios));
		
	}

}
