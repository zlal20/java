//clase padre

public class Empleado{

//atributos

   protected String nombre;
   
   protected String apellido;
   
   protected int edad;
   
   protected double salario;
   
   //metodos publicos
   
      public String getNombre(){
      
      return nombre;

      }
      
        public void setNombre(String nombre){
         this.nombre = nombre;
        
        }
        
       public int getEdad(){
         return edad;
       
       } 
       
       
       public void setEdad(int edad){
         this.edad = edad;
       
       
       }
       


      public double getSalario(){
         return salario;
      
      }



//metodo que suma un plus si el empleado tiene mas de 40 años

   public boolean plus(double sueldoPlus){
      boolean aumento = false;
         if(edad>40 && compruebaNombre()){
            salario +=sueldoPlus;
            aumento=true;
         
         }
   
      return aumento;
   
   }


//Metodo privado


   private boolean compruebaNombre(){
   
      if(nombre.equals("")){
         return false;
      }
            return true;
   }


//constructores

   public Empleado(){
      this("","",0,0);
   
   }
//constructor con 4 parametros
public Empleado (String nombre, String apellido, int edad, double salario){
   this.nombre = nombre;
   this.apellido = apellido;
   this.edad = edad;
   this.salario = salario;



}


}