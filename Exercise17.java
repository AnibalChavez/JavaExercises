package ExercisesG1;

public class Exercise17 {
	public static int hola(int[]array) {
        int resultado =0;
	
        for(int d=0 ; d<array.length-1;d++) {
        	 
        	
        	if(array[d]>=array[d+1]) {
        	resultado++;
        }
	
			 }
		 
			 return resultado;	
      }
			public static void main(String[]args) {
		 int []array = {1,2,3,2,1,2,4,5,6};
		 int resultado = hola(array);
	    System.out.println("Se rompio el orden: "+resultado+" veces");
			}
		
}
