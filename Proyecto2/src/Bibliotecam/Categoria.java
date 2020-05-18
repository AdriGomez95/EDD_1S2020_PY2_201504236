
package Bibliotecam;

import java.io.Serializable;
import proyecto2.ArbolB;

/**
 *
 * @author Adriana Gómez
 */
public class Categoria implements Serializable  {
    
    private int carnet;   
    private String nombre; 
    private ArbolB arbol; 

    
    public Categoria (){
    }
    
    
    public Categoria  ( int carnet, String nombre ,ArbolB arbol) {
       
        this.nombre = nombre ;
        this.carnet = carnet ;
        this.arbol = arbol;
  
            
     }

    /**
     * @return the carnet
     */
    public int getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the arbol
     */
    public ArbolB getArbol() {
        return arbol;
    }

    /**
     * @param arbol the arbol to set
     */
    public void setArbol(ArbolB arbol) {
        this.arbol = arbol;
    }


    
}
