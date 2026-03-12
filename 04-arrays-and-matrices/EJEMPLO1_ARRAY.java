import java.util.Scanner;

public class EJEMPLO1_ARRAY
{
    public static void main (String[] args){

        //definimos un arrary de 10 enteros
        int arrayy[] = new int[10];

        Scanner scanner = new Scanner(System.in);
        //ler 1er valor
        System.out.print("Ingrese un valor (0=>fin): ");
        int v = scanner.nextInt();

        int i = 0;

        //mientras v sea distinto de cero Y i sea menor que 10
        while( v != 0 && i<10)
        {
            // asignar v el arrary [i] y incrementar el valor de i
            arrayy[i++] = v;
            //leemos el siguiente valor
            System.out.print("Ingrese el siguiente valor (0=>fin): ");
            v = scanner.nextInt();
        }
        for ( int j= 0; j<i; j++)
        {
            System.out.println(arrayy[j]);
        }
    }
}

