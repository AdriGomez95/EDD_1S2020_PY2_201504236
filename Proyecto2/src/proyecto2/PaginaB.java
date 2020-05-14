
package proyecto2;

/**
 *
 * @author Adriana Gómez
 */
public class PaginaB {

    public NodoB[] keys;
    public PaginaB[] ramas;
    public String[] names;
    public int account;
    public int tamArbol;

    public PaginaB() {
        keys = new NodoB[5];
        ramas = new PaginaB[5];
        names = new String[5];
        for (int j = 0; j < 5; j++) {
            keys[j] = null;
            ramas[j] = null;
            names[j] = "";
        }
        account = 0;
        tamArbol = 5;
    }

    public boolean fullNode() {
        return (account == 5 - 1);
    }

    public boolean nodeHalEmpty() {
        return (account < 5 / 2);
    }

    
    
    
}
