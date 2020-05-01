
package proyecto2;

/**
 *
 * @author Adriana Gómez
 */
public class SimpleNodo {
     // Variable en la cual se va a guardar el valor.
    public int carnet;
    private String nombre;
    private String apellido;
    private String carrera;
    private String password;
    // Variable para enlazar los nodos.
    private SimpleNodo siguiente;
    
    
    
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(int carnet, String nombre, String apellido, String carrera, String password){
        this.carnet = carnet;
        this.nombre=nombre;
        this.apellido=apellido;
        this.carrera=carrera;
        this.password=password;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public SimpleNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(SimpleNodo siguiente) {
        this.siguiente = siguiente;
    }

    
}
