package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio7<T> {
	
	/* 7. Realiza una clase genérica con funciones que implementen la lógica de la unión, 
intersección y diferencia de conjuntos (pertenece al primero pero no al segundo) con 
colecciones. Debe permitir realizar las operaciones para cualquier tipo de elemento.*/
	
	private Set<T> conjunto1;
	private Set<T> conjunto2;
	
	
	public Ejercicio7(Set<T> conjunto1, Set<T> conjunto2) {
		super();
		this.conjunto1 = new HashSet<>(conjunto1);
		this.conjunto2 = new HashSet<>(conjunto2);
	}
	

	public Set<T> metodoUnion() {
		Set<T> union = new HashSet<>(conjunto1);
		union.addAll(conjunto2);
		return union;
		
	}
	
	public Set<T> metodoInterseccion() {
		Set<T> interseccion = new HashSet<>(conjunto1);
		interseccion.retainAll(conjunto2);
		return interseccion;
		
	}
	
	public Set<T> metodoDiferencia() {
		Set<T> diferencia = new HashSet<>(conjunto1);
		diferencia.removeAll(conjunto2);
		return diferencia;
		
	}
	
}
