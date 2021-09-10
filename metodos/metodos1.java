
//calcukar el area de un triangulo con metodos 
import java.util.Scanner;

public class metodos1 {

    double area, base, altura;
    Scanner sc = new Scanner(System.in);

    // metodo que solicita datos
    public void PedirDatos() {
        System.out.println("ingresa la base ");
        base = sc.nextDouble();

        System.out.println("ingresa la altura ");
        altura = sc.nextDouble();

    }

    // metodo que hace la operacion
    public double calcular() {
        area = base * altura / 2;
        return area;

    }

    // metodo que muestra datos
    public void mostrar() {

        System.out.println("el area es" + area);

    }

}
