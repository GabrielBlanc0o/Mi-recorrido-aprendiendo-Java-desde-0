public class condicionales1_4_6
    {
    public static void main(String[] args)
    {
        char c;
        System.out.print("____________________________________________________\n");

     for (int i = 'A'; i <= 'Z' ; i++)

        {
            // para asignar un int en un char debemos "castear"
            // pasar i de int a char
            c= (char) i;
            System.out.print(" "+c);
            if (c == 'A'){
                System.out.print("|"+c);
            }
            if (c == 'Z'){
                System.out.println("|");
            }
        }
    }
}
