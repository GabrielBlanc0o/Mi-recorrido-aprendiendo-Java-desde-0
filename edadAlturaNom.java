/*
* * El siguiente programa pide al usuario que ingrese su nombre, edad y altura. Estos datos
deben ingresarse separados por un espacio en blanco. Luego los muestra por consola.
* */

import java.util.Scanner;

public class edadAlturaNom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nom = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        Integer edad = scanner.nextInt();

        System.out.print("Ingresa tu altura: ");
        Integer altura = scanner.nextInt();

        System.out.println("Bienvenido "+ nom +
                " tienes "+ edad +" años" +
                " y mides " +altura +"cm");
    }
}

