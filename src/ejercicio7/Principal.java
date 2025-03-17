package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Integer> conjunto1 = new HashSet<>(Set.of(1, 2, 3, 4));
		 Set<Integer> conjunto2 = new HashSet<>(Set.of(6, 2, 7, 9));
		 
		 Set<String> conjunto3 = new HashSet<>(Set.of("l", "r", "s", "t"));
		 Set<String> conjunto4 = new HashSet<>(Set.of("t", "r", "s", "m"));
		
		 Ejercicio7 prueba1 = new Ejercicio7(conjunto1, conjunto2);
		 Ejercicio7 prueba2 = new Ejercicio7(conjunto3, conjunto4);
		 
		 System.out.println("Union: " +prueba1.metodoUnion());
		 System.out.println("Intersección: " +prueba1.metodoInterseccion());
		 System.out.println("Diferencia: " +prueba1.metodoDiferencia());
		 
		 System.out.println("Union: " +prueba2.metodoUnion());
		 System.out.println("Intersección: " +prueba2.metodoInterseccion());
		 System.out.println("Diferencia: " +prueba2.metodoDiferencia());
	}

}
