package ejercicio8;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 7, 9, 9, 9);
        Ejercicio8 estadisticas = new Ejercicio8(numeros);

        System.out.println("Números: " + numeros);
        System.out.println("Mínimo: " + estadisticas.valorMinimo());
        System.out.println("Máximo: " + estadisticas.valorMaximo());
        System.out.println("Media: " + estadisticas.getMedia());
        System.out.println("Mediana: " + estadisticas.getMediana());
        System.out.println("Moda: " + estadisticas.getModa());
        System.out.println("Rango: " + estadisticas.getRango());
        System.out.println("Varianza: " + estadisticas.getVarianza());
    }
}


