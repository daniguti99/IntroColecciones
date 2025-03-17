package ejercicio5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio5 {
	
	/*5. Elabora una función que reciba una colección de elementos que puede contener 
repetidos y devuelva otra donde no existan duplicidades. */
	
	public static List<Integer> eliminarDuplicados(List<Integer> coleccion) {
 
       Set<Integer> coleccionSet = new LinkedHashSet<>(coleccion);
       
       return new ArrayList<>(coleccionSet);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Integer> coleccion = new ArrayList<>();
        coleccion.add(2);
        coleccion.add(2);
        coleccion.add(2);
        coleccion.add(2);
        coleccion.add(4);
        coleccion.add(4);
        coleccion.add(5);

        List<Integer> resultado = eliminarDuplicados(coleccion);
        System.out.println(resultado);
    }
}
