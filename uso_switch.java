/*
* Uso de la estructura de control Switch
*switch( variableEntera )
{
   case valor1:
      accionA;
      accionB;
        :
      break;
   case valor2:
      accionX;
      accionY;
        :
      break;
    :
   default:
      masAcciones;
}
*
*
* */


/**
 * En el siguiente programa pedimos al usuario que ingrese un dia de la semana
 * entre 1 y 7 y mostramos el nombre del dia, si ingresa cualquier otro valor
 * informamos que el dato ingresado
 *
 */


import java.util.Scanner;

public class uso_switch {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un dia de la semana (numero): ");
        int v = scanner.nextInt();

        String dia;
        switch ( v )
        {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7.";
        }
        System.out.println(dia);
    }
}
