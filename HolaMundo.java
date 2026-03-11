
/*
public class HolaMundo
{
    public static void main(String[] args)
    {
        System.out.println("Hola Mundo !!!");
    }
}
 Entrada y salida de datos por consola  tipo print y inputs
*/


import java.util.Scanner;

public class HolaMundo
{
    public static void main(String[] args)
    {
        // esta clase permite leer datos por el teclado
        Scanner scanner = new Scanner(System.in);

        // mensaje para el usuario
        System.out.print("Ingrese su nombre: ");

        // leer el valor entero por teclado del usuario
        String nom = scanner.nextLine();

        System.out.println("Bienvenido: "+ nom);

    }
}

