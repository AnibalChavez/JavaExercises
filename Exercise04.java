package ExercisesG1;

public class Exercise04 {
	public static int bol(boolean []arraybol)
    {
        int verdadero=0;
        int falso=0;
        for (int i=0; i<arraybol.length; ++i)
        {
            if (i %2 == 0 && arraybol[i] == true && i!=0)
            {
                verdadero++;
            }
            else if (i %2 !=0 && arraybol[i]== false)
            {
                falso++;
            }
        }
    return verdadero*falso;
}
    public static void main(String[] args) {
        boolean [] a={false,false,true,false,true};
        int productofinal=bol(a);
        System.out.println("resultado: "+productofinal);
    }
}
