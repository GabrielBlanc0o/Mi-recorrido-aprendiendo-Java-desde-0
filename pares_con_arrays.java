import java.util.Scanner;

public class pares_con_arrays {
    public static void main (String[] args){
        float numeros[] = new float[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suma de pares, ingresa lista de numeros para sumar.");


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa el "+(i+1)+ " numero: ");
            numeros[i] = scanner.nextFloat();
        }
        float sumaPares = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                sumaPares += numeros[i] ;
        }
    }
        System.out.println("La suma de los numeros pares es "+ sumaPares);

    }
}
