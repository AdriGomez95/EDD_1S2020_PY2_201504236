
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
    private int protot;
    private ArbolB arbol; 
    private String  cp;
    private String memory;
    

    
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
     * @return the carnet
     */
    public int getProtot() {
        return protot;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setProtot(int protot) {
        this.protot = protot;
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
     * @return the nombre
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }
    /**
     * @return the nombre
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setMemory(String memory) {
        this.memory = memory;
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
