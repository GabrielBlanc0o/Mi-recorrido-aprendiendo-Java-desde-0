
import javax.lang.model.type.ArrayType;
import java.util.Scanner;
import java.util.ArrayList;
public class calculadoraTEst {
    public static double Sumar(double d1, double d2){
        return d1 + d2;
    }
    public static double Resta(double d1, double d2){
        return d1 - d2;
    }
    public static double Multiplicar(double d1, double d2){
        return d1 * d2;
    }
    public static double Dividir(double d1, double d2){
        return d1 / d2;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean status = false;

        while (!status){
            try {
                System.out.println("Ingresa la cantidad de numero que quieres operar:");
                int operador = scanner.nextInt();
                scanner.nextLine();

                ArrayList<Double> lista= new ArrayList<>();
                double acumulador = 0;

                for (int i = 0; i < operador; i++){
                    double nuevovalor;
                    System.out.println("Numero " + (i + 1) + ":");
                    nuevovalor = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer después de un número

                    lista.add(nuevovalor);

                    if (i == 0) {
                        acumulador = nuevovalor;
                        continue;
                    }
                    System.out.println("¿Que operacion deseas hacer con el anterior? (+, -, *, /):");
                    String opcion = scanner.nextLine();

                    if (opcion.equals("+")){
                        acumulador = Sumar(acumulador, lista.get(i));
                    } else if (opcion.equals("-")){
                        acumulador = Resta(acumulador, lista.get(i));
                    } else if (opcion.equals("*")){
                        acumulador = Multiplicar(acumulador, lista.get(i));
                    } else if (opcion.equals("/")){
                        acumulador = Dividir(acumulador, lista.get(i));
                    }

                    System.out.println("Resultado actual: " + acumulador);
                }

                System.out.println("--- Resultado final de la operacion: " + acumulador + " ---");
                status = true;

            } catch (Exception e){
                System.out.println("Ocurrio un error, intenta de nuevo.");
                scanner.nextLine();
            }
        }
    }
}