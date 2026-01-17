
/*Precísase un método de nome divisores() que reciba un num enteiro e presente pola
pola pantalla todos os seus divisores(num%i==0) diferentes do 1, e de si mesmo,
indicando cantos son. O usuario introducirá por teclado un num enteiro en main()
 que se enviará ao método divisores se é correcto ou provocará unha mensaxe de erro
 producida usando unha estructura try/catch se non é un enteiro */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_divisores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un enteiro: ");

        while (true) {
            try {

                int numero;
                numero = sc.nextInt();

                // Chamamos o método divisores:
                divisores(numero);

            } catch (InputMismatchException e) {
                System.out.println("O número introducido non é un enteiro :( ");
                break;

            }

        }

    }

    static void divisores(int numero) {
        int i = 2;
        int contador = 0;
        for (i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contador++;
                System.out.println(i);

            }

        }
        System.out.println("Número: " + numero + ", total de divisores: " + contador);

    }

}
