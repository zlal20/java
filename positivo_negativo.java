import java.util.Scanner;

public class positivo_negativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("bienvenido ingresa un numero");
        numero = sc.nextInt();

        if (numero > 0) {

            System.out.println("el numero es positivo");

        } else {

            System.out.println("el numero es negativo");

        }

    }

}
