
package Bibliotecam;

/**
 *
 * @author Adriana Gómez
 */
import java.io.Serializable;


public class Libro implements Serializable {
     
    private int ISBN; 
    private String titulo; 
    private String autor; 
    private String editorial;
    private String año;
    private String edicion;
    private String categoria;
    private String idioma;
    private int carnet; 
    
    public Libro (){
    }
    
    
    public Libro  ( int carnet,int ISBN, String titulo ,String autor,String editorial, String edicion,String año, String categoria, String idioma ) {
       
        this.ISBN = ISBN ;
        this.titulo = titulo ;
        this.carnet = carnet ;
        this.autor = autor;
        this.editorial = editorial ;
        this.edicion = edicion;
        this.categoria= categoria;
        this.idioma= idioma;
        this.año = año;
            
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
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the edicion
     */
    public String getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return año;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.año = año;
    }
    
    
    
    
    
    
    
    
}
