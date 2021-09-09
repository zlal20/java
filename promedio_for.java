//programa que pide datos al usuario para sacar el promedio

import java.util.Scanner;

public class promedio_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma, promedio, valor;
        suma = 0;
        // pide 7 numeros por teclado y los suma
        for (int i = 0; i <= 7; i++) {
            System.out.println("ingresa el valor");
            valor = sc.nextInt();
            suma = suma + valor;

        }

        System.out.println("el valor de la suma es" + suma);
        promedio = suma / 7;
        System.out.println("el promedio es " + promedio);

    }

}
