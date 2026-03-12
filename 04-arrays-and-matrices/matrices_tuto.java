
import java.util.Scanner;

public class matrices_tuto {
    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese cantidad de filas: ");
        int n=scanner.nextInt();
            System.out.print("Ingrese cantidad de columnas: ");
        int m=scanner.nextInt();

        // creacion de la matriz segun lo que nos de el usuario
        System.out.println();
            int [][] mat = llenarMatriz(n,m);
            System.out.println("\n--- Matriz Generada ---");
            imprimirMatriz(mat);
        }

    public static int[][] llenarMatriz(int f, int c){
        int mat[][] = new int[f][c];


        for(int i=0; i<f; i++)
        {
            for (int j=0; j<c; j++)
            {
                // generacion de un numero aleatorio entre 0 y 1000
                mat[i][j] = (int) (Math.random()*1000);
            }


        }
        return mat;
    }

    public static void imprimirMatriz(int[][]  mat ){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++)
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

