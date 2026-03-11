
import java.util.Scanner;

public class tabla_matriz2z2
{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int tabla [][] = new int[6][6];
        // FILAS FOR EXTERNO

        for (int f = 0; f < 6; f++){
            // ccolumnas FOR interno

            for (int c = 0; c < 6; c++){
            System.out.println("Ingresa el numero poscicion columna ["+(f)+","+""+(c)+"]:");
            tabla[f][c] = scanner.nextInt();
        }
        }
            System.out.println("\n--- TU MATRIZ ---");
        // Impresion misma logica nido

        for (int f = 0; f < 6 ; f++) {
            for (int c = 0; c < 6; c++) {
                System.out.print("["+tabla[f][c] + "]");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
        }
    }
