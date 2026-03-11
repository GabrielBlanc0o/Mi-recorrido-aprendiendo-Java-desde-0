import java.util.Scanner;

public class argumentosLinea
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa numero args: ");

        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
            System.out.println("Total: " +args.length+ " argumentos");
    }
}
