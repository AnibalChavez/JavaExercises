package ExercisesG1;

public class Exercise14 {
	public static int[] hola(int[]array) {
		 int[] array2 = new int [array.length * 2] ;
		 
		 for (int i=0 ; i < array2.length;i++) {
				if(i<array.length) {
			 array2[i]= array[i];
			 	}else {
			 		array2[i]=10;
			 	}
		 }
			 return array2;	
		   }
			public static void main(String[]args) {
		 int []array = {1,2,3,4,5,6,7,8,9,11};
		 int [] arrayX2 = hola(array);
		for (int w= 0; w< arrayX2.length; w++) {
			
			System.out.println (arrayX2[w]);
		}
			}
}
