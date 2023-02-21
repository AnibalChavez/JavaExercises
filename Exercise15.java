package ExercisesG1;

public class Exercise15 {
	public static int[] hola(int[]array,int numero) {
        int auxiliar= 0;
        array[array.length-1] = numero;
        for (int i=0 ; i < array.length-1;i++) {

			 for (int d=0 ; d < array.length-1;d++) {
					if(array[d]>array[d+1]) {
						auxiliar = array[d+1];
						array[d+1] = array[d];
						array[d] = auxiliar;
					 
					}
				 
				 
			 }
		 }
			 return array;	
     }
			public static void main(String[]args) {
		 int []array = {1,2,3,4,5,6,7,8,9,11,0};
		 int numero = 5;
		 int [] arrayX2 = hola(array,numero);
		for (int w= 0; w< arrayX2.length; w++) {
			
			System.out.println (arrayX2[w]);
		}
			}
}
