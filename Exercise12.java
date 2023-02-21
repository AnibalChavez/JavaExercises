package ExercisesG1;

public class Exercise12 {
	public static int[] asc(int[]array) {
		int auxiliar=0;
		for (int i =0; i< array.length-1; i++) {
			for(int h=0;h<array.length-1;h++) {
				if (array[h]> array[h+1]) {
				auxiliar = array[h];
				array[h] = array[h+1];
				array[h+1] = auxiliar;
					
				}	
			}
			
			
		}
		
		return array;
		}
	public static int[] des(int[]array) {
		int auxiliar=0;
		for (int i =0; i< array.length-1; i++) {
			for(int h=0;h<array.length-1;h++) {
				if (array[h]<array[h+1]) {
				auxiliar = array[h];
				array[h] = array[h+1];
				array[h+1] = auxiliar;
					
				}	
			}
			
			
		}
		
		return array;
		}
	
	
		public static void main(String[]args) {
			int[]array = {8,2,3,10,1,8};
			int []array2 = asc(array);
			int []array3 = des(array);
	   for(int i = 0; i<array2.length;i++) {
		   
		  System.out.println(array2[i]);
	   }   for(int i = 0; i<array3.length;i++) {
		   
		  System.out.println(array3[i]);
	   }
		}
		
}
