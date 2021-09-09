import java.util.Scanner;

public class areaTriangulo {

    public static void main(String[] args) {

        System.out.println("hola mundo");

        Scanner c = new Scanner(System.in);

        double base = 0, altura, area = 0;

        System.out.println("bienvenido");
        System.out.println("digita la base");
        base = c.nextDouble();

        System.out.println("digita la altura");
        altura = c.nextDouble();

        area = (base * altura) / 2;

        System.out.println("el area del triangulo es" + area);

    }

}
