
import java.util.Scanner;
/*
* Los arrayz inician siempre desde 0
* */
public class arraysIntro


{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // asi se definen
        int arr[] = new int[10];

        // tambien un array de n elementos siendo n una variable::
       // int n = 10;
        //int arr2[] = new int[n];
        // un array es estatico una vez definido su tamaño este serafijo no se pueden agrerar
        // ni eliminar los elementos de el

        // para entrar al array lo hacemos por un subindice
        arr[5] = 123;
        System.out.println(arr);


    }
}
