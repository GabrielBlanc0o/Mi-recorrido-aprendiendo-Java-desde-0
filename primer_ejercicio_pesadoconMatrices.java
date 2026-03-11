
import java.util.Scanner;

public class primer_ejercicio_pesadoconMatrices {

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

        int suma = sumaMatriz(mat);
        System.out.println("La suma total es: " + suma);

        int  mayor = buscarMayor(mat);
        System.out.println("El numero mayor es: " + mayor);

        int pares = contarPares(mat);
        System.out.println("Total de números pares: " + pares);

    }
    public static int[][] llenarMatriz(int f, int c){
        int mat[][] = new int[f][c];

        for(int i=0; i<f; i++)
        {
            for (int j=0; j<c; j++){
                // generacion de un numero aleatorio entre 0 y 1000
                mat[i][j] = (int) (Math.random()*1000);
            }
        }
        return mat;
    }

    public static void imprimirMatriz(int[][]  mat ){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                //imprimir la celda de la matriz
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int sumaMatriz(int[][] mat ){
            int acumulador = 0;
            for(int i=0; i<mat.length; i++){
                for (int j=0; j< mat[i].length; j++){
                acumulador +=  mat[i][j];
                }
            }
            return acumulador;
    }

    public static int buscarMayor(int[][] mat){
        int mayor = mat[0][0];
        for(int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j]> mayor  ){
                    mayor = mat[i][j];
                }
            }
        }
        return mayor;
    }

    public static int contarPares(int[][] mat){
        int contador = 0;
        for(int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] % 2 == 0){
                    contador++;
                }
            }
        }
        return contador;
    }
}







