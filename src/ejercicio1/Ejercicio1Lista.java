package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio1Lista {
	
	private static final int LIMITE_SUPERIOR = 101;
	protected Collection<Integer> numeros;
	protected static final int TAMANIO = 30;
	
	public Ejercicio1Lista() {
		super();
		this.numeros = generarLista(TAMANIO);
	}
	
	public Collection<Integer> generarLista(int tamanio) {
		Collection<Integer> lista = new ArrayList<>();
		Random num = new Random();
		
		while(lista.size()<tamanio) {
			int aleatorio = num.nextInt(LIMITE_SUPERIOR);
			
			if(!lista.contains(aleatorio)) {
				lista.add(aleatorio);
			}
		}
		
		Collections.sort((List)lista);
		
		return lista;
	}
	
	public static void main(String[] args) {
		System.out.println(new Ejercicio1Lista().generarLista(TAMANIO));
	}
}
