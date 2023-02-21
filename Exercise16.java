package ExercisesG1;

public class Exercise16 {
	public static boolean hola(int[]array) {
        boolean resultado= true;
	
        for (int i=0 ; i < array.length-1;i++) {
       for(int d=0 ; d<array.length-1;d++) {
       	 
       	
       	if(array[d]>array[d+1]) {
       	
       	resultado = false;
       	break;
       }
	
			 }}
		 
			 return resultado;	
     }
			public static void main(String[]args) {
		 int []array = {2,2,3,4,5,6,7,8,9,11,1};
		 boolean resultado = hola(array);
	  if(resultado == true) {
		  System.out.println("Es estrictamente creciente");
		  
	  }else {
		  System.out.println("NO es estrictamente creciente");
	  }
			}
}
