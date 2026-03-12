
/*
* Imagina que eres un profesor y quieres guardar las notas de 5 estudiantes.
* Debes construir un programa que haga lo siguiente:

Declara el Array: Crea un array de tipo double (para que acepten decimales) con un tamaño fijo de 5.

Pista: Usa la sintaxis double notas[] = new double[5];.

Llena el Array: Usa un ciclo for para pedirle al usuario las 5 notas una por una y guárdalas
*  en el array.

Recuerda que el índice del for debe empezar en 0 y llegar hasta 4.

Calcula el Total: Crea una variable double suma = 0;. Usa otro ciclo for para recorrer el array,
* ir sumando cada nota y guardarla en esa variable.

Muestra el Resultado: Al final, fuera de los ciclos, imprime el promedio (que es suma / 5).
* */

import java.util.Scanner;

public class primerSoloArrarys {

    public static void main(String[] args) {
        double notas [] = new double[5];
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        // 2. primer ciclo para llenar el ARRAY LLENAR
        for (int i = 0; i < 5 ; i++){
            System.out.print("Ingresa la nota del estudiante " + (i+1)+ ": ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5 ; i++){
            suma +=notas[i];
        }
        // 4. Resultado final
        System.out.println("El promedio es: " + (suma / 5));
        }
    }
