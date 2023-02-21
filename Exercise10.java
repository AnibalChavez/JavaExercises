package ExercisesG1;

public class Exercise10 {
	public static int prodescalar(int[]array) {
		int resultado=0 ;
		 int[] array2 =  inverso(array);
		for (int i=0 ; i <array2.length;i++) {
		 
		resultado= array[i] * array2[i] + resultado ;	
			
			
		}
		
		
		
		return resultado;
	}
	public static int[] inverso(int[]array){
		int[] array2 = new int[array.length];
		for(int i=0 ; i< array2.length; i++) {
		array2[i]= array[array.length-i-1];
	 }
		return array2; 
		}
	public static void main (String[] args){
	int[] array ={1,2,3,4,5,6,7,8,9,10};
	int resultado =prodescalar(array);
	 System.out.println("El resultado es: "+resultado);
	}
}
