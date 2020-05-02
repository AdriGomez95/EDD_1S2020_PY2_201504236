
package proyecto2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Adriana Gómez
 */
public class TablaDispersa {
    int numeroCasilla=0;
    int IDLlave;
    //NodoH-----------------------------------------------------------------------------------------
    public class NodoH {
    ListaSimple Lista=new ListaSimple();
    int carnet;
     String nombre;
     String apellido;
     String carrera;
     String password;
    
    
    public NodoH(ListaSimple Lista, int carnet, String nombre, String apellido, String carrera, String password){
        this.Lista=Lista;
        this.carnet=carnet;
        this.nombre=nombre;
        this.apellido=apellido;
        this.carrera=carrera;
        this.password=password;
    }
}
    //NodoH---------------------------------------------------------------------------------------
    
    
    int TamanoDispersa;
    NodoH TabalDispersa[];

    public TablaDispersa(int Tamano) {
        TabalDispersa = new NodoH[Tamano];
        this.TamanoDispersa = Tamano;
    }
    
    void InsertarNodoH(ListaSimple Lista, int carnet, String nombre, String apellido, String carrera, String password) {
        numeroCasilla=0;
        NodoH TablaNueva = new NodoH(Lista, carnet, nombre,apellido,carrera, password);
        //RehacerDispersa();
        IDLlave = (carnet) % 45;
//        numeroCasilla=IDLlave;
        if (TabalDispersa[IDLlave] == null) {
            TabalDispersa[IDLlave] = TablaNueva;
            System.out.println("La posicion: " + IDLlave);
            Lista.agregarAlInicio(carnet, nombre, apellido, carrera, password);
            
        } else {
            System.out.println("Sucedio una Colision pero se arreglo");
            Lista.agregarAlFinal(carnet, nombre, apellido, carrera, password);
            //TabalDispersa[IDLlave].Lista.agregarAlFinal(carnet, nombre, apellido, carrera, password);
//            int var = 0;
//            int IDLLaveNueva = 0;
//            while (var < TabalDispersa.length) {
//                IDLLaveNueva = (((carnet)) + (int) Math.pow(var + 1, 2)) % 45;
//                
//                if(TabalDispersa[IDLLaveNueva]==null){
//                    TabalDispersa[IDLLaveNueva]=TablaNueva;
//                    System.out.println("Colisiono pero lo Agregue Guapeton ++");
//                    break;
//                }
//                
//                var++;
//            }

        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String DispersionText;

    public void GraficarTabla() {

        //
        try {
            String ruta = "TablaDispersa.dot";
            GraficarTablaDispersa();
            //  GraficarPrimero();
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(DispersionText);
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
            pbuilder = new ProcessBuilder("dot", "-Tpng", "-o", "TablaDispersa.png", "TablaDispersa.dot");
            pbuilder.redirectErrorStream(true);
            //Ejecuta el proceso
            pbuilder.start();
            Process p = Runtime.getRuntime().exec("cmd /c TablaDispersa.png");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void GraficarTablaDispersa() throws Exception {
        DispersionText = "digraph G{\n node[shape=record fontsize=9 fontcolor=red color= lightskyblue fontname = Verdana];\n rankdir=LR;\n";
        DispersionText = DispersionText + "nodeR[label=\"";
        for (int x = 0; x < TamanoDispersa; x++) {
            DispersionText = DispersionText + "<p" + x + ">" + GetNodosAll(x) + "|";
            numeroCasilla++;
        }

        DispersionText = DispersionText += "\"];\n";
        for (int x = 0; x < TamanoDispersa; x++) {
            if (TabalDispersa[x] != null) {
                String[] Que /*= TabalDispersa[x].Lista.getValor(x)*/;
                
                DispersionText = DispersionText + "node" + x + "[label=\"{";
                for (int y = 0; y < TabalDispersa[x].Lista.getTamanio(); y++) {
                    DispersionText = DispersionText + "<p" + y + ">" + TabalDispersa[x].Lista.getValor(y) + "|";
                    
                }
                DispersionText = DispersionText + "}\"];\n";
                DispersionText = DispersionText + "nodeR:p" + x + "->node" + x + ";\n";
            }
        }

        DispersionText = DispersionText + "\n}";

    }

    String GetNodosAll(int x) {
        if (TabalDispersa[x] != null) {
            return "Casilla: " + numeroCasilla;
        }
        return "";
    }

    
    
    
    
    
}
