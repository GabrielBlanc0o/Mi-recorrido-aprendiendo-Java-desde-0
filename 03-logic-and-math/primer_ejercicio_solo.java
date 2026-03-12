import java.util.Scanner;

public class primer_ejercicio_solo
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero (donde inicia el conteo) :");
        int x = scanner.nextInt();
        System.out.print("Ingresa el segundo numero (donde termina el conteo):");
        int y = scanner.nextInt();
        System.out.print("Ingresa el numero de cuanto va incrementar : ");
        int z = scanner.nextInt();

        for (int i=x; i<=y; )
        {
            do {
                System.out.println("Valor actual: "+ i);
                i += z;
            }
            while ( i <= y );
        }
    }
}
