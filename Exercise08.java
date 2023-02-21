package ExercisesG1;

public class Exercise08 {
	public static double[] hola(double[]array) {
		double[] array2 = new double[array.length];
		for(int i=0; i< array2.length ;i++){
	     array2[i] =  (array[i] * 3.14);	
		}
		return array2 ;
	}
	public static void main (String[] args){
	double[] array ={1,15,3,7,8};
	double[] p =hola(array);
	 for ( int i= 0 ; i<p.length; i++){
	System.out.println(p[i]);

	}
	}
}
