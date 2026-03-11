
import java.util.Scanner;

public class matrices_tuto
{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas: ");
        int n=scanner.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int m=scanner.nextInt();

        // creacion de la matriz segun lo que nos de el usuario
        int mat[][] = new int[n][m];

        int nro;
        for(int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                // generacion de un numero aleatorio entre 0 y 1000
                nro = (int) (Math.random()*1000);

                //asigno el numero en la matriz
                mat[i][j] = nro;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
            {
                //imprimir la celda de la matriz
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
/**
 * (Math.random()*1000) se usa para generar numeros aleatorios de 0 a mil
 * y al imprimit en la linea 35  usamos mat para q rellene esos valores de f x c
 *
 * al usar .length sirve para identificar la cantidad de filas y o columnas
 *
 * tambien podemos inicializar una matriz con valores previos :
 * int mat[][] = { {3, 2, 1 }
 *                ,{5, 3, 7 }
 *                ,{1, 9, 2 }
 *                ,{4, 6, 5 } }
 *
 *
 */

