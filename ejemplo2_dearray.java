import java.util.Scanner;

public class ejemplo2_dearray
{
    public static void main(String[] args )
    {
        int suerte[] = new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i= 0; i < suerte.length ; i++)

        {
        System.out.print("Ingresa el valor " + (i+1)+ ": ");
         suerte[i] = scanner.nextInt();
        }

        System.out.print("Numero a buscar : ");
        int objetivo = scanner.nextInt();

        for (int i= 0; i < suerte.length ; i++){
            if (suerte[i] == objetivo){
                System.out.println("Numero encontrado en la posicion "+ i);

            }
        }
    }
}


