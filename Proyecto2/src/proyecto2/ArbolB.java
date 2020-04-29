
package proyecto2;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adriana Gómez
 */

public class ArbolB {
    
    PaginaB raiz;
    boolean getUp;
    NodoB mediana;
    String noumbre;
    PaginaB nd;
    PaginaB temporal;
    String grafo = "";
    int k;

    public ArbolB() {
        this.raiz = null;
    }
    
    
    void insertar(int ISBN, String nombre) {
        NodoB nuevo = new NodoB(ISBN, nombre);
        this.raiz = insertar(this.raiz, nuevo);
    }

    
    void insertar(NodoB nodoCL) {
        this.raiz = insertar(this.raiz, nodoCL);
    }
    
    PaginaB insertar(PaginaB raiz, NodoB nodoCL) {
        PaginaB p;
        this.getUp = push(raiz, nodoCL);
        if (this.getUp) {
            p = new PaginaB();
            p.account = 1;
            p.keys[1] = mediana;
            p.ramas[0] = raiz;
            p.ramas[1] = nd;
            raiz = p;
        }
        return raiz;
    }
boolean siSube = false;

    boolean push(PaginaB raiz, NodoB nodoCL) {
        if (raiz == null) {
            siSube = true;
            this.mediana = nodoCL;
            this.nd = null;
        } else {
            boolean esta = buscarNodo(raiz, nodoCL);
            if (esta) {
                siSube = false;
                return siSube;
            }

            push(raiz.ramas[this.k], nodoCL);

            if (siSube) {
                if (raiz.fullNode()) {
                    dividirNodo(raiz, this.mediana);
                } else {
                    siSube = false;
                    insertarHoja(raiz, this.mediana);
                }
            }
        }
        return siSube;
    }

    void dividirNodo(PaginaB raiz, NodoB nodoCL) {
        int i, posM;
        PaginaB nueva = nd;

        posM = (this.k <= 5 / 2) ? 5 / 2 : 5 / 2 + 1;
        nueva = new PaginaB();

        for (i = posM + 1; i < 5; i++) {
            nueva.keys[i - posM] = raiz.keys[i];
            nueva.ramas[i - posM] = raiz.ramas[i];
        }
        nueva.account = 4 - posM;
        raiz.account = posM;

        if (this.k <= 5 / 2) {
            insertarHoja(raiz, nodoCL);
        } else {
            this.k = this.k - posM;
            insertarHoja(nueva, nodoCL);
        }

        this.mediana = raiz.keys[raiz.account];
        nueva.ramas[0] = raiz.ramas[raiz.account];
        raiz.account--;
        this.nd = nueva;
    }

    void insertarHoja(PaginaB raiz, NodoB nodoCL) {

        int i;

        for (i = raiz.account; i >= this.k + 1; i--) {
            raiz.keys[i + 1] = raiz.keys[i];
            raiz.ramas[i + 1] = raiz.ramas[i];
        }

        raiz.keys[this.k + 1] = nodoCL;
        raiz.ramas[this.k + 1] = this.nd;
        raiz.account++;

    }
    int in;

    PaginaB buscar(NodoB nodoCL) {
        return buscar(this.raiz, nodoCL, nodoCL.ISBN);
    }

    PaginaB buscar(PaginaB raiz, NodoB nodoCL, int indice) {
        in = indice;
        if (raiz == null) {
            return null;
        } else {
            boolean esta = buscarEnB(raiz, nodoCL);
            if (esta) {
                return raiz;
            } else {
                return buscar(raiz.ramas[indice], nodoCL, indice);
            }
        }
    }

    boolean buscarEnB(PaginaB raiz, NodoB nodoCL) {
        if (nodoCL.ISBN < raiz.keys[1].ISBN) {
            this.in = 0;
            return false;
        } else {
            this.in = raiz.account;
            while (nodoCL.ISBN < raiz.keys[this.in].ISBN && this.in > 1) {
                this.in--;
            }
            return (nodoCL.ISBN == raiz.keys[this.in].ISBN);
        }
    }

    boolean buscarNodo(PaginaB raiz, NodoB nodoCL) {
        if (nodoCL.ISBN < raiz.keys[1].ISBN) {
            this.k = 0;
            return false;
        } else {
            this.k = raiz.account;
            while (nodoCL.ISBN < raiz.keys[this.k].ISBN && this.k > 1) {
                this.k--;
            }
            return (nodoCL.ISBN == raiz.keys[this.k].ISBN);
        }
    }
    
    

    public void graficar() {

        grafo = "";
        if (raiz != null) {

            grafo = "digraph matriz{\n rankdir=TB;\n";
            grafo = grafo + "node [ shape=ellipse fontsize=9 color= lightskyblue fontname = Verdana ];\n";
            grafo = grafo + "edge [];\n";

            Graficar(raiz);
            Relaciones(raiz);

            grafo = grafo + "\n}";
        }

    }

    void Graficar(PaginaB actual) {
        if (actual != null) {
            int j;
            grafo = grafo + "Nodo" + actual.keys[1].nombre + actual.keys[1].ISBN;
            grafo = grafo + "[shape = record fillcolor= lightskyblue,label=\"<p";
            grafo = grafo + 0 + ">";
            for (j = 1; j < actual.account + 1; j++) {
                grafo = grafo + "|<cont" + j + ">";
                grafo = grafo + "ISBN:" + actual.keys[j].ISBN + "    ";
                grafo = grafo + "Nombre:" + actual.keys[j].nombre;//*****************************
                grafo = grafo + "|<p" + j + ">\n";
            }
            grafo = grafo + "\"];";
            Graficar(actual.ramas[0]);
            for (j = 1; j < actual.account + 1; j++) {
                Graficar(actual.ramas[j]);
            }
        }
    }

    void Relaciones(PaginaB temp) {
        if (temp != null) {
            int j;
            Relaciones(temp.ramas[0]);
            if (temp.ramas[0] != null) {
                grafo = grafo + "Nodo" + temp.keys[1].nombre + temp.keys[1].ISBN + ":p" + 0;
                grafo = grafo + "->" + "Nodo" + temp.ramas[0].keys[1].nombre;
                grafo = grafo + temp.ramas[0].keys[1].ISBN;
                grafo = grafo + "[constraint=true];\n";
            }
            for (j = 1; j < temp.account + 1; j++) {
                if (temp.ramas[j] != null) {
                    grafo = grafo + "Nodo" + temp.keys[1].nombre;
                    grafo = grafo + temp.keys[1].ISBN;
                    grafo = grafo + ":p" + j + "->" + "Nodo" + temp.ramas[j].keys[1].nombre;
                    grafo = grafo + temp.ramas[j].keys[1].ISBN;
                    grafo = grafo + "[constraint=true];\n";
                }
                Relaciones(temp.ramas[j]);
            }
        }
    }

    void GenerarDot() {
        graficar();
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("C:\\Users\\X\\Desktop\\EDD\\Proyecto2\\arbol1.dot");
            try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                bfwriter.write(grafo);
            }
            System.out.println("Archivo creado satisfactoriamente...");

        } catch (IOException e) {
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                }
            }
        }
    }

    void GenerarGrafo() {
        try {
            GenerarDot();
            
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = "C:\\Users\\X\\Desktop\\EDD\\Proyecto2\\arbol1.dot";
            String fileOutputPath = "C:\\Users\\X\\Desktop\\EDD\\Proyecto2\\arbol1.jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            
            rt.exec(cmd);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }
}
