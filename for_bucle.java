import java.util.Scanner;

public class for_bucle
{
    public static void main (String[] args)
    {
        System.out.print("Ingresa un numero para escribirlo linea de por medio desde el 1 : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            for ( int i=1; i<=n; i++)
            // para i sea 1 i menor igual a n y incremento de i en i
                // (declaracion,condicion, incremento )
            {
                System.out.println("N "+i);
            }

    }
 /*
 * Veamos como funcionan los incrementos
 *
 * i++ incrementa en 1 el valor de i y retorna el valor anterior
 * ++i incrementa en 1 el valor de i pero retorna el nuevo
 * i+=[] segun el valor que este dentro de los [] suma
 * igual con += -= *= para operadores unarios y binarios
 *
 * */

}
