package ProyectoObjects;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class metodosMod{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Desarrollador> equipo = new ArrayList<>();
        boolean menu = true ;

        while (menu){
            // nueva lista de arrays

            System.out.println("Ingresa tu nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Ingresa tu lenguaje de programacion favorito: ");
            String stack = sc.nextLine();

            System.out.println("Ingresa tus años de exp: ");
            int experiencia = sc.nextInt();
            sc.nextLine();

            equipo.add(new Desarrollador(nombre,stack,experiencia));
            System.out.println("Agregado exitosamente.");
            System.out.println("Deseas agregar otro? (S/N): ");
            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("n")){
                menu = false;
            }
        }
        // mostrar todo el equipo

        System.out.println("\n--- Equipo final Registrado ---");
        buscarPorStack(equipo,"");



   }

   public static void buscarPorStack(ArrayList<Desarrollador> lista, String stackBuscado){
        for (Desarrollador dev : lista){
                System.out.println(dev);
            }
        }
   }


