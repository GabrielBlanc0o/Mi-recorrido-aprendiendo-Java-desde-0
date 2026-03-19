public class test {
    // Definición de la estructura del Nodo
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cabezaAuxiliar = new ListNode(0);
        ListNode actual = cabezaAuxiliar;
        int acarreo = 0;

        while (l1 != null || l2 != null || acarreo != 0) {
            int suma = acarreo;
            if (l1 != null) {
                suma += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                suma += l2.val;
                l2 = l2.next;
            }
            acarreo = suma / 10;
            actual.next = new ListNode(suma % 10);
            actual = actual.next;
        }
        return cabezaAuxiliar.next;
    }

    // MÉTODO PARA PROBAR EN TU IDE
    public static void main(String[] args) {
        test solucion = new test();

        // Creamos L1: [2, 4, 3] (que representa 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);
        /*
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
*/
        // Creamos L2: [5, 6, 4] (que representa 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(9);

        // Ejecutamos la suma
        ListNode resultado = solucion.addTwoNumbers(l1, l2);

        // Imprimimos el resultado: debería ser [7, 0, 8] (807)
        System.out.print("Resultado: [");
        while (resultado != null) {
            System.out.print(resultado.val + (resultado.next != null ? ", " : ""));
            resultado = resultado.next;
        }
        System.out.println("]");
    }
}
