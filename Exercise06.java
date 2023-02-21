package ExercisesG1;

public class Exercise06 {
	public static int[] hola(int[]A, int[]B) {
		int[] c = new int [A.length];
			 for (int i=0; i<c.length; ++i) {
			c[i]= A[i] * B[B.length-i -1];
			 
		}
			 return c ;
		}
		
		public static void main(String[]args) {
			int[] a = {1,1,1,1,1} ;
			int [] b= {1,1,1,1,8};
			int [] c = hola(a,b);
			for(int t=0; t < c.length; t++ ){
				
				
				System.out.println(c[t]);
				
			} 
				}
				
				
}

