import java.util.Locale;

public class matus_y_minus
{
    public static void main (String[] args){
        String s = "Esto Es Una Cadena de caracteres";
        String sMayus = s.toUpperCase();
        String sMinus = s.toLowerCase();

        System.out.println("Original: "+s);
        System.out.println("Mayusculas: "+sMayus);
        System.out.println("Minusculas "+sMinus);

        /*No debemos confuncir el lenght de los arrays y de los strings como vemos abajo
        * su funcionalidad*/

        char c[] = { 'H', 'o', 'l', 'a' };
        System.out.println( c.length );
        String s2 = "Hola";
        System.out.println( s2.length() );

    }
}
