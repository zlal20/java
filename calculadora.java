
//simple calculadora en java
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        double numero1, numero2, resultado;

        // menu de opciones
        System.out.print("1-suma");
        System.out.print("2-resta");
        System.out.print("3-multiplicacion");
        System.out.print("4-division");

        System.out.println("ingresa un numero");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("selecionaste suma");
                System.out.println("digita el primer valor");
                numero1 = sc.nextDouble();

                System.out.println("digita el segundo valor");
                numero2 = sc.nextDouble();

                resultado = (numero1 + numero2);
                System.out.println("el resultado es" + resultado);

                break;

            case 2:

                System.out.println("selecionaste resta");
                System.out.println("digita el primer valor");
                numero1 = sc.nextDouble();

                System.out.println("digita el segundo valor");
                numero2 = sc.nextDouble();

                resultado = (numero1 - numero2);
                System.out.println("el resultado es" + resultado);

                break;

            case 3:
                System.out.println("selecionaste multiplicacion");
                System.out.println("digita el primer valor");
                numero1 = sc.nextDouble();

                System.out.println("digita el segundo valor");
                numero2 = sc.nextDouble();

                resultado = (numero1 * numero2);
                System.out.println("el resultado es" + resultado);

                break;

            case 4:
                System.out.println("selecionaste division");
                System.out.println("digita el primer valor");
                numero1 = sc.nextDouble();

                System.out.println("digita el segundo valor");
                numero2 = sc.nextDouble();

                resultado = (numero1 / numero2);
                System.out.println("el resultado es" + resultado);

                break;

            default:
                System.out.println("error debes de ingresar un numero valido");
                break;

        }

    }

}
