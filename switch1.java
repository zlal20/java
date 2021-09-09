import javax.swing.JOptionPane;
public class switch1{
   public static void main(String args[]){
   
   String dia = JOptionPane.showInputDialog("introduce un dia de la semana");
   
   
      switch(dia){
      
      case"lunes":
       case"martes":
        case"miercoles":
         case"jueves":
          case"viernes":
       System.out.println("es un dia laboral");
       break;   
       
       case "sabado":
       case"domingo":
       System.out.println("no es un dia laboral");
       default:
         System.out.println("introduce un dia");
       
                
      
      
      }
   
   
   
   
   
   
   
   }

}