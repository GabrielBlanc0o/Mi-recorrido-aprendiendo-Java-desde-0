import java.util.Scanner;

public class ejercicio_solo2
{
    public static final int PRIMAVERA = 1;
    public static final int VERANO = 2;
    public static final int OT0NO = 3;
    public static final int INVIERNO = 4;

    public static void main (String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un numero del 1 al 4: ");
    int valor = scanner.nextInt();

    switch ( valor )
    {
         case PRIMAVERA :
             System.out.print("Tiempo de siembra.");
             break;
         case VERANO :
             System.out.print("Tiempo de riego intenso. ");
             break;
         case OT0NO :
             System.out.print("Tiempo de cosecha.");
             break;
        case INVIERNO:
             System.out.print("Tiempo de conservación.");
             break;
         default :
             System.out.print("Estacion no valida.");
    }
  }
}
