
//programa que pide la nota de 7 alumnos  y dice si estan aprobados o no
import java.util.Scanner;

public class for_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i <= 7; i++) {

            System.out.println("igresa la nota de los alumnos");
            nota = sc.nextDouble();

            if (nota > 7) {
                aprobados = aprobados + 1;

            } else {
                reprobados = reprobados + 1;

            }

        }

        System.out.println("alumnos aprobados" + aprobados);
        System.out.println("alumnos reprobados" + reprobados);

    }

}
