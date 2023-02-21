package ExercisesG1;

/* Crear un arreglo de N elementos enteros. Llenar el arreglo con N números enteros provistos
por el usuario. Escribir una función que tome como parámetro el arreglo y devuelva la posición
del elemento más grande del arreglo. Imprimir por pantalla el mayor de los elementos del
arreglo. */
public class Exercise02 {
	
		public static int max (int[]array) {
				int maximo=0;
				for (int i=1;i<array.length;i++) {
					if(array[maximo]<array[i]) {
					maximo = i;
					}
				}
				return maximo;
			}
			public static void main (String[] args) {
			    int[] a = {11, 5, 8, 4, 7};
			    int posmaxima = max(a);
			    System.out.println("La posicion del maximo es: " + posmaxima);
			}
		


}
