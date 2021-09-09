public class EmpleadoFinal{
   
   public static void main(String [] args){
   
//creacion de objetos de las clases hijas

//clase comercial se crea el objeto comercial
Comercial comercial2 = new Comercial("Juan","lopez", 12, 600, 50);

//clase repartidor se crea el objeto repartidor
Repartidor repartidor2 = new Repartidor ("Jose","Jose", 41, 900, "colfer");

//llamada a metodos de la clase padre e hijas
comercial2.plus(300);
repartidor2.plus(300);



   System.out.println("el salario actual comercial es"+ comercial2.getSalario());
    System.out.println("El salario actual del repartidor es "+ repartidor2.getSalario());






   }



}