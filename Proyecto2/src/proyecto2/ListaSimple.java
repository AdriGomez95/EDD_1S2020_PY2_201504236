
package proyecto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Adriana Gómez
 */
public class ListaSimple {
    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private SimpleNodo inicio;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;
    
    
    
    /**
     * Constructor por defecto.
     */
    public void ListaSimple(){
        inicio = null;
        tamanio = 0;
    }
    
    
    
    /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    
    
    
    /*** Consulta cuantos elementos (nodos) tiene la lista.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    
    
    
    
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     * @param valor a agregar.
     */   
    public void agregarAlInicio(int carnet, String nombre, String apellido, String carrera, String password){
        // Define un nuevo nodo.
        SimpleNodo nuevo = new SimpleNodo();
        // Agrega al valor al nodo.
        nuevo.setCarnet(carnet);
        nuevo.setNombre(nombre);
        nuevo.setApellido(apellido);
        nuevo.setCarrera(carrera);
        nuevo.setPassword(password);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
    
    
    
    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param valor a agregar.
     */
    public void agregarAlFinal(int carnet, String nombre, String apellido, String carrera, String password){
        // Define un nuevo nodo.
        SimpleNodo nuevo = new SimpleNodo();
        // Agrega al valor al nodo.
        nuevo.setCarnet(carnet);
        nuevo.setNombre(nombre);
        nuevo.setApellido(apellido);
        nuevo.setCarrera(carrera);
        nuevo.setPassword(password);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea una copia de la lista.
            SimpleNodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }
    
    
    
    /**
     * Obtiene el valor de un nodo en una determinada posición.
     * @param posicion del nodo que se desea obtener su valor.
     * @return un numero entero entre [0,n-1] n = numero de nodos de la lista.
     * @throws Exception
     */
    public int getValor(int posicion) throws Exception{
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.getCarnet();
            }else{
                // Crea una copia de la lista.
                SimpleNodo aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getCarnet();
            }
        // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    
    
    
    /**
     * Busca si existe un valor en la lista.
     * @param referencia valor a buscar.
     * @return true si existe el valor en la lista.
     */
    public boolean buscar(int referencia){
        // Crea una copia de la lista.
        SimpleNodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getCarnet()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    public boolean buscarPassword(String referencia){
        // Crea una copia de la lista.
        SimpleNodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontradopass = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontradopass != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getPassword()){
                // Canbia el valor de la bandera.
                encontradopass = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontradopass;
    }
    public boolean buscarCarnetPassword(int carnet,String password){
        // Crea una copia de la lista.
        SimpleNodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (carnet == aux.getCarnet()){
                // Canbia el valor de la bandera.
               if(password==aux.getPassword()){
                    encontrado = true;
               }
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    
    
    
    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado
     * por un valor de referencia.
     * @param referencia valor del nodo el cual se desea actualizar.
     * @param valor nuevo valor para el nodo.
     */
    public void editarPorReferencia(int referencia, int carnet, String nombre, String apellido, String carrera, String password){
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea ua copia de la lista.
            SimpleNodo aux = inicio;
            // Recorre la lista hasta llegar al nodo de referencia.
            while(aux.getCarnet() != referencia){
                aux = aux.getSiguiente();
            }
            // Actualizamos el valor del nodo
            aux.setCarnet(carnet);
            aux.setNombre(nombre);
            aux.setApellido(apellido);
            aux.setCarrera(carrera);
            aux.setPassword(password);
        }
    }
    
    
    
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por un valor de referencia.
     * @param referencia valor del nodo que se desea eliminar.
     */
    public void removerPorReferencia(int referencia){
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.getCarnet() == referencia) {
                // El primer nodo apunta al siguiente.
                inicio = inicio.getSiguiente();
            } else{
                // Crea ua copia de la lista.
                SimpleNodo aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while(aux.getSiguiente().getCarnet() != referencia){
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                SimpleNodo siguiente = aux.getSiguiente().getSiguiente();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setSiguiente(siguiente);  
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
   
    
    
    /**
     * Elimina la lista
     */
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }
    
    
    
    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            SimpleNodo aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getCarnet()+"," + aux.getNombre()+"," + aux.getApellido() 
                                            +","+ aux.getCarrera()+"," + aux.getPassword() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }

    
    
    
    

    
public void CodigoLista(){
    String cadena="";
    int contador=0;
    Dato="digraph G{\n";
   if (this.inicio == null) {//Revisa si la lista no esta vacia, de estar retorna NULL
       Dato += "Lista_Vacia";

   } else {

       SimpleNodo temporal = inicio;
       while(temporal !=null)
       {
           cadena += "node"+contador+"[shape = record,label = \""+ temporal.getCarnet() +"\"];\n";
           //cadena2 += "\"node""\" -> \"node"+ to_string(contador) +"\";\n";

           temporal=temporal.getSiguiente();
           contador++;
       }
       temporal =inicio;
       contador=0;
       if(temporal!=null)
       {
           while (temporal.getSiguiente() !=null)
           {
               cadena+="node"+contador;
               if(temporal.getSiguiente() != null)
               {
                   cadena+="->";
               }
               else
               {
                   cadena +=";";
               }
               temporal =temporal.getSiguiente();
               contador++;
               //cout<<"Punteo: "<<temporal->punteo<<"->";
           }
           cadena+="node"+contador;
       }

   }
   //contador++;
   Dato+=cadena;

Dato+="}";
//       return Dato;
}

String Dato;
public void GraficarLista()
{
        try {
            String ruta = "ListaSimple.dot";
            CodigoLista();
            //  GraficarPrimero();
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Dato);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ProcessBuilder pbuilder;

            /*
			 * Realiza la construccion del comando    
			 * en la linea de comandos esto es: 
			 * dot -Tpng -o archivo.png archivo.dot
             */
            pbuilder = new ProcessBuilder("dot", "-Tpng", "-o", "ListaSimple.png", "ListaSimple.dot");
            pbuilder.redirectErrorStream(true);
            //Ejecuta el proceso
            pbuilder.start();
            Process p = Runtime.getRuntime().exec("cmd /c ListaSimple.png");

        } catch (Exception e) {
            e.printStackTrace();
        }

}


}
