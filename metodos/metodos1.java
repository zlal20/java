package metodos;

import java.util.Scanner;

class llamada_metodo {

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

class metodos1 {

    public static void main(String[] args) {

        llamada_metodo objeto = new llamada_metodo();
        objeto.PedirDatos();
        objeto.calcular();
        objeto.mostrar();

    }

}
