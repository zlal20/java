//referencias en java 

public class referencias {

   public static void main (String [] args){
   
   //arreglo con 10 posiciones
   int array1[] = new int [10];
   array1[0] = 3;
   
   //array sin crear 
   //null no apunta a nada
   
   int array2[]=null;
   
   //referencia  array1 y array2 apuntan al mismo arreglo
   array2 = array1;
   
   //nueva referencia,apunta a un nuevo arreglo
   array1 = new int [20];
   
   //array2 apunta al primer arreglo accedmos a sus datos
   System.out.println("El primervalor del arreglo es"+array2[0]);
   System.out.println("El primer valor del array1 es "+array1[0]);
   
   
   
   
   }



}