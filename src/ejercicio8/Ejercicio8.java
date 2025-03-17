package ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio8 {

	/*
	 * 8. Crea una clase Java que que reciba en el constructor una colección de
	 * números enteros (pueden existir repetidos) y contenga funciones que
	 * devuelvan: a. El valor mínimo. b. El valor máximo. c. La media aritmética. d.
	 * La mediana. e. La moda. f. El rango o recorrido: diferencia entre el valor
	 * máximo y mínimo. g. La varianza.
	 */

	private List<Integer> numeros;

	public Ejercicio8(List<Integer> numeros) {
		super();
		this.numeros = new ArrayList<>(numeros);
	}

	public int valorMinimo() {
		return Collections.min(numeros);
	}

	public int valorMaximo() {
		return Collections.max(numeros);
	}

	public double getMedia() {
		int suma = 0;
		for (int num : numeros) {
			suma += num;
		}
		return (double) suma / numeros.size();
	}

	public double getMediana() {
		int tamanio = numeros.size();
		double mediana;

		if (tamanio % 2 == 0) {
			// Si el tamaño es par, se promedian los dos valores centrales
			mediana = (numeros.get(tamanio / 2 - 1) + numeros.get(tamanio / 2)) / 2.0;
		} else {
			// Si el tamaño es impar, se devuelve el valor central
			mediana = numeros.get(tamanio / 2);
		}

		return mediana;
	}

	public List<Integer> getModa() {
		List<Integer> modas = new ArrayList<>();
		int maxFrecuencia = 0;

		// Recorrer la lista para encontrar la frecuencia máxima
		for (int i = 0; i < numeros.size(); i++) {
			int frecuencia = 1; // La frecuencia mínima es 1
			for (int j = i + 1; j < numeros.size(); j++) {
				if (numeros.get(i).equals(numeros.get(j))) {
					frecuencia++;
				}
			}

			// Si la frecuencia actual es mayor que la máxima, actualizamos la moda
			if (frecuencia > maxFrecuencia) {
				maxFrecuencia = frecuencia;
				modas.clear(); // Limpiamos la lista de modas anteriores
				modas.add(numeros.get(i)); // Añadimos el nuevo número con la frecuencia máxima
			} else if (frecuencia == maxFrecuencia) {
				// Si la frecuencia es igual a la máxima, añadimos el número a la lista de modas
				modas.add(numeros.get(i));
			}
		}

		// Eliminar duplicados en la lista de modas
		List<Integer> modasUnicas = new ArrayList<>();
		for (int num : modas) {
			if (!modasUnicas.contains(num)) {
				modasUnicas.add(num);
			}
		}

		return modasUnicas;
	}

	public int getRango() {
		return valorMaximo() - valorMinimo();
	}

	public double getVarianza() {
		double media = getMedia();
		double sumaCuadrados = 0;
		for (int num : numeros) {
			sumaCuadrados += Math.pow(num - media, 2);
		}
		return sumaCuadrados / numeros.size();
	}

}
