public class Repartidor extends Empleado{
 
    //Atributos, aunque no indiquemos nada es como si tuviera los atributos del padre
 
    /**
     * Zona del repartidor
     */
    private String zona;
 
    /**
     * Constructor por defecto
     */
    public Repartidor(){
        this.zona="";
    }
 
    /**
     * Constructor con 5 parametros
     * @param nombre nombre del repartidor
     * @param apellido apellido del repartidor
     * @param edad edad del repartidor
     * @param salario salario del repartidor
     * @param zona zona del repartidor
     */
    public Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
        //llamamos a los metodos de la clase padre
        super(nombre, apellido, edad, salario);
        this.zona=zona;
    }
}