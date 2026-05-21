import java.util.Scanner;

public class Main {

    public static void suma(int a,int b){
            System.out.println("Resultado: " + (a + b));
    }

    public static void resta(int a,int b){
        System.out.println("Resultado: " + (a - b));
    }

    public static void multiplicacion(int a,int b){
        System.out.println("Resultado: " + (a * b));
    }

    public static  void division(int a,int b){
        System.out.println("Resultado: " + (a / b));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        while (status){

            System.out.println("Ingresa primer numero: ");
            int primer = scanner.nextInt();

            System.out.println("Ingresa segundo numero: ");
            int segundo = scanner.nextInt();            
            scanner.nextLine();
            System.out.println("Que operacion deseas realizar ? (para salir presiona 6 ) : ");
            String caso = scanner.nextLine();
            try {
                if (caso.equals("+")){
                    suma(primer,segundo);
                }
                else if (caso.equals("-")){
                    resta(primer,segundo);
                }
                else if (caso.equals("*")){
                    multiplicacion(primer, segundo);
                }
                else if (caso.equals("/")){
                    division(primer,segundo);
                }
                else if (caso.equals("6")){
                    status = false;
                    break;
                }
            } catch (ArithmeticException e ){
                System.out.printf("Error aritmetico.. %s reiniciando... " , e.getMessage());

            }
            finally{
                System.out.println("OK");
            }
        }
        scanner.close();
    }
}