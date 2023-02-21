package ExercisesG1;

public class Exercise07 {
	public static int[] hola(int[]array){
		int[] array2 = new int[array.length];
		for(int i=0 ; i< array.length; i++) {
		array2[i]= array[array.length-i-1];
	 }
		return array2; 
		}
		
		public static void main(String[]args) {
			int[] array1 = {1,2,3,4,5} ;
			int [] array2 = hola(array1);
			for(int t=0; t < array2.length; t++ ){
				
				
				System.out.println(array2[t]);
				
			}
			
			
		}
}
