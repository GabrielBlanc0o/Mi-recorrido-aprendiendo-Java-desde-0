import java.lang.System;
import java.util.Scanner;

public class SimulatorDatos {

    public static double EvaluadorCurso (double notaFinal , boolean entregoLaboratorios){
        if (notaFinal >= 70.0 && entregoLaboratorios) {System.out.println("¡Certificado Aprobado! Felicidades.");}
        else if (notaFinal >= 70.0 && !entregoLaboratorios) {System.out.println("Nota suficiente, pero reprobado por falta de laboratorios.");}
        else {System.out.println("Reprobado. Te sugerimos repetir el curso para reforzar bases.");}
        return notaFinal;
    }

    public static int ContadorEstructural(int modulos){

        for (int i = 1; i <= modulos; i++){
            if (i == 8) {System.out.println("Simulación detenida en el módulo 8 por límite de tiempo"); break;  }
            if (i % 2 != 0){ continue; }
            System.out.printf("Procesando modulo numero: [%d] \n",i);
        }
        return modulos;
    }

    public static int AnalizadorArreglo(int cantidadNumeros){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] numeros = new int[cantidadNumeros];

        for (int i = 0 ; i < cantidadNumeros; i++){
            numeros[i] = sc.nextInt();
        }
        // promedio
        int sumaTotal = 0;
        for (int i = 0 ; i < cantidadNumeros; i++){
            sumaTotal += numeros[i];
        }
        double promedio = (double) sumaTotal / cantidadNumeros; // casting de la variable entera sumaTotal
        System.out.printf("La suma total es: %d y el promedio es : %.1f",sumaTotal,promedio);
        return  cantidadNumeros;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int anio_actual = 2026;
        double precio = 19.99;
        String nombre = "Gabriel";
        String texto = "IBM";

        int suma = (int) (anio_actual + precio);
        System.out.println(suma);
        // casting agregandole (tipoDeDato)

        String orationComplete = texto.concat(" Skills");
        System.out.println(orationComplete);

        System.out.println("Ingresa tu nota final: ");
        double nota = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa tu estado de entrega de laboratorio (true o false): ");
        String estado = sc.nextLine();
        boolean estadoBooleano = true;

        if (estado.equalsIgnoreCase("true")){
            estadoBooleano = true;
        } else if (estado.equalsIgnoreCase("false")){
            estadoBooleano = false;
        } else {
            System.out.println("No valido.");
        }
        EvaluadorCurso(nota,estadoBooleano);
        ContadorEstructural(10);

        System.out.println("Cuantos numeros deseas maximo en el arreglo? ");
        int cantidadNumeros  = sc.nextInt();
        sc.nextLine();

        AnalizadorArreglo(cantidadNumeros);

    }
}


