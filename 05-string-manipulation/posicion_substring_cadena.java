/*
* Uso de los metodos indexIf y lastIndexOf*/

public class posicion_substring_cadena
{
    public static void main (String[] args){
        String s = "Un buen libro de Java, un buen material";

        int pos1 = s.indexOf("buen"); // queda en 3
        int pos2 = s.lastIndexOf("buen"); // queda en 26

        System.out.println(pos1);
        System.out.println(pos2);



    }
}
