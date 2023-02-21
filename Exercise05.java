package ExercisesG1;

public class Exercise05 {
	public static int[] hola(int[]array, int[]array2){
		
		int [] array3 = new int[array.length] ;
		 for (int i=0; i<array.length; ++i)
	     {
	         if(i%2 == 0)
	         {
	          array3[i] = array[i];
	           
	         }
	         else{
	        	 array3[i] = array2[i] ;
	        	 
	        	 
	         }
	     }
		return array3;
	}
	public static void main(String[] args){
		int[] array1 ={1,2,3,4,5,6};
		int[] array2 ={7,8,9,10,11,12};
		int[] array3 = hola(array1,array2);
		for(int i=0;i<array3.length;i++){
			System.out.println(array3[i]);
	}
	}
}
