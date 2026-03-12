import java.util.Scanner;


public class bucleswhilefor

{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //leo el valor de n
        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();
        int i = 1;

        while ( i <= n )
        {
            //muestro el valor de i
            System.out.println(i);
            // incremento el valor de i
            i++;
        }
    }
}
