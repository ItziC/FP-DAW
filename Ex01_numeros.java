import java.util.Scanner;

/*1. Quérese que o programa permita introducir unha serie de num enteiros por teclado
O bucle rematará cando se introduza un num negativo.
Supoñendo que se trata de cantidades vendidas dun producto, haberá que sumalas e multiplicar
o resultado por un prezo que se mantén como unha constante static na clase principal.

*/

public class Ex01_numeros {

    static final double precio = 2.5;
    // Prezo fixo do produto, definido como constante da clase
    // É static final porque non cambia e se pode usar en calquera método static

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cantidades enteiras: \n" + "Negativo para rematar.\n");

        int numero;
        int suma = 0;// suma interpretase como un acumulador, é la variable que sumará os enteiros
                     // introducidos, por isto inicializase con 0.
        // Bucle para ir pedindo números ata que o usuario introduza un negativo
        // Usamos do-while porque queremos que o bucle se execute polo menos unha vez
        do {
            System.out.println("Cantidade: ");
            numero = sc.nextInt();// Pedimos ó usuario un número
            // Só sumamos números positivos ou cero
            // Se o número é negativo, non se suma e o bucle remata
            if (numero >= 0) {
                suma = suma + numero;
            }
        } while (numero >= 0);
        // Calculamos o total multiplicando a suma polo prezo do produto
        double total = suma * precio;
        // Mostramos o total de vendas
        System.out.println("Stock vendido : " + suma);
        System.out.println(suma + "*" + precio + "=" + total);

    }
}
