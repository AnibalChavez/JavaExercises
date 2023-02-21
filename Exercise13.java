package ExercisesG1;

public class Exercise13 {
	public static int hola(int[] arreglo , int busqueda) {
		 int auxiliar=-1;
		 int tmp =0;
		for(int i = 0; i < arreglo.length - 1; i++)
	      {
	          for(int j = 0; j < arreglo.length - 1; j++)
	          {
	              if (arreglo[j] > arreglo[j + 1])
	              {
	                  tmp = arreglo[j+1];
	                  arreglo[j+1] = arreglo[j];
	                  arreglo[j] = tmp;
	              }
	          }
	      }
		  for (int i=0;i< arreglo.length ;i++) {
			  if (arreglo[i]== busqueda) {
				  auxiliar = i;
				  break;
			  }
		  }
		return auxiliar;
	}
	public static void main (String[] args) {
		int []array = {6,1,8,5,6,3,2,1,4,8,5,6,4,4,5};
		int numero= 7;
		int r= hola(array,numero);
		
		if (r>=0) {
			System.out.println("el numero que ingreso se encuentra "+r);		
		}
		else {System.out.println("el numero que ingreso no se encuentra");}
	    
	}
}
