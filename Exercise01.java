package ExercisesG1;

/* Crear un arreglo de N elementos enteros. Llenar el arreglo con N números enteros provistos
por el usuario. Escribir una función que tome como parámetro el arreglo y devuelva la posición
del elemento más chico del arreglo. Imprimir por pantalla el menor de los elementos del
arreglo.*/


public class Exercise01 {public class minimo {
	public static int min(int[]array) {
		int minimo=0;
		for (int i=1;i<array.length;i++) {
			if(array[minimo]>array[i]) {
			minimo = i;
			}
		}
		return minimo;
	}
	public static void main (String[] args) {
	    int[] a = {11, 5, 8, 8, 7};
	    int posminima = min(a);
	    System.out.println("La posicion del minimo es: " + posminima);
	}
}


}
