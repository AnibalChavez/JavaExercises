package ExercisesG1;

public class Exercise09 {
	public static int hola(int[]array, int[]array2) {
		 int resultado = 0;
		 for (int i=0 ; i< array.length;i++) {
			 
			 resultado = resultado + array[i]* array2[i] ; 
		 }
		 return resultado ;
		 
	 }
	public static void main (String[] args){
	int[] array ={1,15,3,7,8};
	int[] array2 ={1,15,3,7,8};
	int resultado =hola(array,array2);
	 System.out.println("El resultado es: "+resultado);
	}
}
