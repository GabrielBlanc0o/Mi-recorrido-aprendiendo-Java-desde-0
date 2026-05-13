package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu peso: ");
        double peso = sc.nextDouble();

        Usuario usuario = new Usuario(nombre,peso,edad);

        var verificarDatosUsuario = new UsuarioService();

        if (verificarDatosUsuario.esAptoParaEntrenamiento(usuario))
        {
            System.out.println("¡Felicidades "+usuario.getNombre() + " ! Cumples con el perfil para el entrenamiento.");
        } else{
            System.out.println("Lo sentimos, no cumples con los requisitos mínimos de edad o peso.");
        }
    sc.close();
    }
}
