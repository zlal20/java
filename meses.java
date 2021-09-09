//programa que solicita el mes y dice los dias que contiene

import java.util.Scanner;

public class meses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes;

        System.out.println("Bienvenido");
        System.out.println("digita un numero del 1 al 12");
        mes = sc.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("el mes seleccionado tiene 31 dias");

        } else if (mes == 2) {
            System.out.println("el mes tiene 28 dias");

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("el mes tiene 30 dias");

        } else {

            System.out.println("error debes escoger un numero entre el 1 y el 12");

        }

    }

}