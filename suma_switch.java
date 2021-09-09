
//simple calculadora en java
import java.util.Scanner;

public class suma_switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        double numero1, numero2, resultado;

        System.out.println("ingresa un numero del 1 al 2");
        opcion = sc.nextInt();

        switch (opcion) {

            case 0:
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
            default:
                System.out.println("error debes de ingresar un numero valido");
                break;

        }

    }

}
