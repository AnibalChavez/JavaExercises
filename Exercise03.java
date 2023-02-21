package ExercisesG1;

public class Exercise03 {
	public static boolean positivo(int [] arraypos)
    {
        boolean resultado= true;
        for (int i=0; i<arraypos.length; ++i)
        {
            if(arraypos[i] < 0)
            {
                resultado = false;
                break;
            }
            
        }
        return resultado;
    }
    public static void main(String[] args) {
        int [] a= {7,99,23,-31};
        boolean resultado=positivo(a);
        if (resultado== true){
        	System.out.println("Todos los numerso son positivos");
    }
   
    else {System.out.println("no todos positivos");
    }
    
}
}
