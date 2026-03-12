
import java.util.Locale;
import java.util.Scanner;

public class literales_cadena_caracteres
{
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        System.out.print("Como te llamas??? : ");
        String x = leer.next();
        System.out.println("HOLA !! "+x.toUpperCase());

    }
}
