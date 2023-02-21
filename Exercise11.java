package ExercisesG1;

public class Exercise11 {
	public static int hola(int[]array, int busqueda) {
		int num =-1;
		for (int i =0; i< array.length; i++) {
			if (array[i]== busqueda) {
				num = i ;
				break;
			}
			
		}
		
		return num;
		}
		public static void main(String[]args) {
			int[]array = {1,2,3,4,5,8};
			int busqueda= 8;
			int resultado = hola(array,busqueda);
		 if (resultado !=-1) {
			 System.out.println("se encuentra en la pos "+resultado);
		 }
		 else {
			 System.out.println("el numero no se encuentra");
		 }
		}

}
