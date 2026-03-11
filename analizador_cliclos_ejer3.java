import java.util.Scanner;


public class analizador_cliclos_ejer3
{

    public static final int PAR = 1;
    public static final int IMPAR = 2;
    public static final int SALIR= 3;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero (limite  ciclo): ");
        int n = scanner.nextInt();
        System.out.print("ESCRIBE una opcion:   1 PAR  2 IMPAR  3 SALIR :");
        int v = scanner.nextInt();

        for (int i=1; i<n; ++i)
        {
            switch (v)
            {
                case PAR :
                    if (i % 2 == 0 ){
                        System.out.println(i+" Es par.");
                    }
                    break;

                case IMPAR:
                    if (i % 2 != 0 ) {
                        System.out.println(i+" Es impar.");
                    }
                    break;

                case SALIR:
                   System.out.println("Saliste");
                   return;

                default:
                    System.out.println("No valido.");
                    return;
            }
         }
                   if (n % 2 ==0){
                    System.out.println(n+" Es par.");
        }
    }
}

