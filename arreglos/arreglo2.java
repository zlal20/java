//llenar un arreglo con multiplos de 5

public class arreglo2{
   public static void main(String args[]){
   
   int num[] = new int[20];
   
   
    //recorriendo el arreglo
    
    int multiplo = 5;
    
      for(int i =0; i<num.length; i++, multiplo+=5){
        //el valor del contador incrementa de 5 en 5 y se guarda en multiplo
         num[i] = multiplo;
      
         System.out.println(num[i]);    
  
  
  
      
      }
      
  

   }



}