import java.util.Scanner;
public class monitor_temperaturas
{
    public static void main (String[] args){
        double temps [] = new double[7];
        int helada = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Monitor de Temperaturas. ");

        for (int i = 0; i<temps.length; i++ )
        {
            System.out.println("Ingresa la temperatura para el dia "+i);
            temps[i] = scanner.nextDouble();
        }
        double max = temps[0];
        double min = temps[0];
        for (int i = 0; i<temps.length; i++ )
        {
            if (temps[i] > max){
                max = temps[i];
            } if (temps[i]< min){
                min = temps[i];
            }
            if (temps[i] < 10) {
                helada++;
            }
        }
    System.out.println("Temperatura maxima de: "+max);
    System.out.println("Temperatura minima de: " + min);
    System.out.println("Los dias con temp menor a 10 grados fueron en total "+helada);
    }

}



