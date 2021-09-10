class vehiculo {

    String marca, modelo, color;
    int anio;

    public vehiculo(int anio, String marca, String modelo, String color) {

        marca = marca;
        anio = anio;
        modelo = modelo;
        color = color;

    }

    public void Mostrar() {
        System.out.println("la marca del modelo es " + anio);
        System.out.println("el anio del modelo es " + modelo);
        System.out.println(" modelo es " + marca);
        System.out.println("el color del modelo es " + color);

    }

}

class constructor2 {

    public static void main(String[] args) {

        vehiculo auto = new vehiculo(2020, "jeta", "w", "negro");
        auto.Mostrar();

    }

}