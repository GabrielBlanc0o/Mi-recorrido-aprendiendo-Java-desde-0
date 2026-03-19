import java.util.Scanner;

public class nodosInvertidosFirsttime {

   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Ingresa el primero numero: ");
       float x = scanner.nextFloat();

       System.out.print("Ingresa el segundo numero: ");
       float y = scanner.nextFloat();

       double [][] mat = op(x,y);

       for (int i = 0; i<1 ; i++){
           System.out.println("Suma: "+ (mat[0][0]));
           System.out.println("Resta: "+ (mat[1][0]));
           System.out.println("Multiplicacion: "+(mat[2][0]));
           if(Double.isInfinite((mat[3][0]))){
               System.out.print("Division: No se puede dividir entre 0 ");
           }else{
               System.out.println("Division: "+((mat[3][0])));
           }
       }

   }

    private static double[][] op(float x, float y) {

        float suma = x+y ;
        float resta =x-y;
        float multiplicacion = x*y ;
        double division = x/y;

        double[][] resultado = new double[4][1];
        resultado[0][0] = suma;
        resultado[1][0] = resta;
        resultado[2][0] = multiplicacion;
        resultado[3][0] = division;

        return resultado;

    }
}





