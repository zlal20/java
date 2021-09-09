
//calcular las notas ingresadas por teclado
import java.util.*;

public class notas {

    public static void main(String[] args) {

        double promedio1, promedio2, promedio3, promedio4, promedio5, resultado;

        // formula del resultado

        Scanner sc = new Scanner(System.in);

        // captura de calificaciones
        System.out.println("ingresa el promedio de notas 1");
        promedio1 = sc.nextDouble();

        System.out.println("ingresa el promedio de notas 1");
        promedio2 = sc.nextDouble();

        System.out.println("ingresa el promedio de notas 1");
        promedio3 = sc.nextDouble();

        System.out.println("ingresa el promedio de notas 1");
        promedio4 = sc.nextDouble();

        System.out.println("ingresa el promedio de notas 1");
        promedio5 = sc.nextDouble();

        // formula

        resultado = (promedio1 + promedio2 + promedio3 + promedio4 + promedio5);

    }

}
