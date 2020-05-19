
package Bibliotecam;
import static proyecto2.MenuPrincipal.todascategorias;
import Bibliotecam.Categoria;
import Bibliotecam.Libro;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.*;
import static java.lang.Thread.sleep;
import java.util.LinkedList;
import java.util.logging.*;

/**
 *
 * @author Adriana Gómez
 */
public class AVL implements Serializable{
    
public class Node implements Serializable{
        private Node left, right;
        private int height = 1;
        private Categoria value;

        public Node (Categoria val) {
            this.value = val;
        }
    }
    private int height (Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    public Node insert(Node node, Categoria value) {
        /* 1.  Perform the normal BST rotation */
        if (node == null) {
            return(new Node(value));
        }
           //value < node.value
        if (value.getNombre().compareTo(node.value.getNombre()) < 0 )
            node.left  = insert(node.left, value);
        else
            node.right = insert(node.right, value);

        /* 2. Update height of this ancestor node */
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        /* 3. Get the balance factor of this ancestor node to check whether
           this node became unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case        value < node.left.value
        if (balance > 1 && value.getNombre().compareTo(node.left.value.getNombre()) < 0)
            return rightRotate(node);

        // Right Right Case     value > node.right.value
        if (balance < -1 && value.getNombre().compareTo(node.right.value.getNombre()) > 0)
            return leftRotate(node);

        // Left Right Case   value > node.left.value
        if (balance > 1 && value.getNombre().compareTo(node.left.value.getNombre()) > 0)
        {
            node.left =  leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case    value < node.right.value
        if (balance < -1 && value.getNombre().compareTo(node.right.value.getNombre()) < 0)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        /* return the (unchanged) node pointer */
        return node;
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right))+1;
        x.height = Math.max(height(x.left), height(x.right))+1;

        // Return new root
        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.height = Math.max(height(x.left), height(x.right))+1;
        y.height = Math.max(height(y.left), height(y.right))+1;

        // Return new root
        return y;
    }

    // Get Balance factor of node N
    private int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    public void preOrder(Node root) {
        if (root != null) {
            preOrder(root.left);
            System.out.printf("%d ", root.value);
            preOrder(root.right);
        }
    }

    private Node minValueNode(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null)
            current = current.left;
        return current;
    }

    public Node deleteNode(Node root, Categoria value) {
      
        if (root == null)
            return root;
         
        if ( value.getNombre().compareTo(root.value.getNombre()) < 0 )
            root.left = deleteNode(root.left, value);


        else if( value.getNombre().compareTo(root.value.getNombre()) > 0)
            root.right = deleteNode(root.right, value);


        else {
            if( (root.left == null) || (root.right == null) ) {

                Node temp;
                if (root.left != null)
                        temp = root.left;
                else
                    temp = root.right;

                // No child case
                if(temp == null) {
                    temp = root;
                    root = null;
                }
                else 
                    root = temp; 

                temp = null;
            }
            else {
                // node with two children: Get the inorder successor (smallest
                // in the right subtree)
                Node temp = minValueNode(root.right);

                // Copy the inorder successor's data to this node
                root.value = temp.value;

                // Delete the inorder successor
                root.right = deleteNode(root.right, temp.value);
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        //  this node became unbalanced)
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left =  leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
     
    
    
    boolean v = false;    
    public boolean Esta ( Node r ,String cate){
        boolean si = false;               
        buscar(r,cate);   
        if (v == true){
            si = true;
            v = false;
        }
        return si;
    }
    
    public void buscar(Node r,String cat){
       
         if(r != null){
             buscar(r.left,cat);            
             buscar(r.right,cat);
             if(r.value.getNombre().compareTo(cat) == 0){
                   System.out.println(r.value.getNombre() + "ya esta ");  
                   v = true;
             }
                     
         }

    }
    
     boolean LibroEsta = false;
    
       
      Categoria[] mias = new Categoria[50];
       int cont = 0;
       public void  RecorrerCategorias(Node r, int carnet){
       
             if(r != null){
             RecorrerCategorias(r.left,carnet);            
             RecorrerCategorias(r.right,carnet);
             if(r.value.getCarnet() == carnet){ 
                   mias[cont] =r.value;
                   cont++;
             }
                     
           } 

       }
       
       
       public Categoria[]  MisCategorias (Node r, int carnet){
            RecorrerCategorias(r, carnet);
            Categoria[] mias2 = new Categoria[50];
            for (int i = 0; i < mias.length; i++) {
                 mias2 [i] = mias[i];
           }
            for (int i = 0; i < mias.length; i++) {
               mias[i] = null;
           }
            cont= 0;
           return mias2;
       
       }
        
       
       
        Categoria[] todas= new Categoria[50];
       int cont2 = 0;
       public void  RecorrerCategoriasT(Node r){
       
             if(r != null){
             RecorrerCategoriasT(r.left);            
             RecorrerCategoriasT(r.right);            
                   todas[cont2] =r.value;
                   cont2++;  
           } 

       }
       
       
       public Categoria[]  TodasCategorias (Node r){
            RecorrerCategoriasT(r);
            Categoria[] t = new Categoria[50];
            for (int i = 0; i < mias.length; i++) {
                 t [i] = todas[i];
           }
            for (int i = 0; i < mias.length; i++) {
               todas[i] = null;
           }
            cont2= 0;
           return t;
       
       }
       
       
       
       
       
 
       LinkedList <Categoria> recorridos = new  LinkedList <Categoria>();
       
        public void  RecorreridoPreorden(Node r){ // raiz-izquierda-derecha
       
             if(r != null){        
             recorridos.add(r.value);
             RecorreridoPreorden(r.left);            
             RecorreridoPreorden(r.right);            

           } 

       }
        
       public void  RecorreridoInorden(Node r){ // izquierda-raiz-derecha
       
             if(r != null){        
             
             RecorreridoInorden(r.left);
             recorridos.add(r.value);
            RecorreridoInorden(r.right);            

           } 

       }
                
          public void  RecorreridoPostorden(Node r){ // izquierda-derecha-raiz
       
             if(r != null){        
             
             RecorreridoPostorden(r.left);
             RecorreridoPostorden(r.right);
             recorridos.add(r.value);

           } 

       }
       
       
       
       
       
        
        public void imprimirB (Node r, String cat){
         
            if(r != null){
             imprimirB(r.left,cat);            
             imprimirB(r.right,cat);
             if(r.value.getNombre().compareTo(cat) == 0){                  
                 r.value.getArbol().graficar();
             }
                     
         }
        }
        
        
        
        
        
           public void GraficarRecorridoPreorden (Node node) {
        
        
           if (node != null) // Si no está vacío ...
            {
                grafic = "digraph G {\n rankdir = LR;"; 
                for (int i = 0; i < recorridos.size(); i++) {
                  grafic =grafic+ recorridos.get(i).getNombre()+"[shape=elipse,label=\""+recorridos.get(i).getNombre()+"\" ];\n";
                  if (i >0){
                      grafic =grafic+ recorridos.get(i-1).getNombre()+" -> "+recorridos.get(i).getNombre()+"\n";
                  }
                  
                }
                
                grafic = grafic + "}";
                
            try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("avlPreorden.dot"));
            writer.write(String.valueOf(grafic));
            writer.close();
            String comando = "dot -Tpng avlPreorden.dot -o avlPreorden.png";
            
            Process p = Runtime.getRuntime().exec(comando);
            sleep(2000);
             File objetofile = new File ("avlPreorden.png");
//            Desktop.getDesktop().open(objetofile);
            } catch (IOException ex) {} catch (InterruptedException ex) {
                   Logger.getLogger(AVL.class.getName()).log(Level.SEVERE, null, ex);
               }
             grafic = " ";
             recorridos.clear();
          
            }
 
    }
           
           public void GraficarRecorridoInorden (Node node) {
        
        
           if (node != null) // Si no está vacío ...
            {
                grafic = "digraph G {\n rankdir = LR;"; 
                for (int i = 0; i < recorridos.size(); i++) {
                  grafic =grafic+ recorridos.get(i).getNombre()+"[shape=record,label=\""+recorridos.get(i).getNombre()+"\" ];\n";
                  if (i >0){
                      grafic =grafic+ recorridos.get(i-1).getNombre()+" -> "+recorridos.get(i).getNombre()+"\n";
                  }
                  
                }
                
                grafic = grafic + "}";
                
            try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("avlInorden.dot"));
            writer.write(String.valueOf(grafic));
            writer.close();
            String comando = "dot -Tpng avlInorden.dot -o avlInorden.png";
            
            Process p = Runtime.getRuntime().exec(comando);
            sleep(2000);
             File objetofile = new File ("avlInorden.png");
//            Desktop.getDesktop().open(objetofile);
            } catch (IOException ex) {} catch (InterruptedException ex) {
                   Logger.getLogger(AVL.class.getName()).log(Level.SEVERE, null, ex);
               }
             grafic = " ";
             recorridos.clear();
          
            }
 
    }
           
        
     public void GraficarRecorridoPostorden (Node node) {
        
        
           if (node != null) // Si no está vacío ...
            {
                grafic = "digraph G {\n rankdir = LR;"; 
                for (int i = 0; i < recorridos.size(); i++) {
                  grafic =grafic+ recorridos.get(i).getNombre()+"[shape=record,label=\""+recorridos.get(i).getNombre()+"\"];\n";
                  if (i >0){
                      grafic =grafic+ recorridos.get(i-1).getNombre()+" -> "+recorridos.get(i).getNombre()+"\n";
                  }
                  
                }
                
                grafic = grafic + "}";
                
            try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("avlPostorden.dot"));
            writer.write(String.valueOf(grafic));
            writer.close();
            String comando = "dot -Tpng avlPostorden.dot -o avlPostorden.png";
            
            Process p = Runtime.getRuntime().exec(comando);
            sleep(2000);
             File objetofile = new File ("avlPostorden.png");
//            Desktop.getDesktop().open(objetofile);
            } catch (IOException ex) {} catch (InterruptedException ex) {
                   Logger.getLogger(AVL.class.getName()).log(Level.SEVERE, null, ex);
               }
             grafic = " ";
             recorridos.clear();
          
            }
 
    }   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
           public void GraficarRecorrido (Node node) {
        
        
           if (node != null) // Si no está vacío ...
            {
                grafic = "digraph G {\n rankdir = LR;"; 
                for (int i = 0; i < recorridos.size(); i++) {
                  grafic =grafic+ recorridos.get(i).getNombre()+"[shape=record,label=\""+recorridos.get(i).getNombre()+"\" style = filled];\n";
                  if (i >0){
                      grafic =grafic+ recorridos.get(i-1).getNombre()+" -> "+recorridos.get(i).getNombre()+"\n";
                  }
                  
                }
                
                grafic = grafic + "}";
                
            try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("recorrido.dot"));
            writer.write(String.valueOf(grafic));
            writer.close();
            String comando = "dot -Tpng recorrido.dot -o recorrido.png";
            
            Process p = Runtime.getRuntime().exec(comando);
            sleep(2000);
             File objetofile = new File ("recorrido.png");
            Desktop.getDesktop().open(objetofile);
            } catch (IOException ex) {} catch (InterruptedException ex) {
                   Logger.getLogger(AVL.class.getName()).log(Level.SEVERE, null, ex);
               }
             grafic = " ";
             recorridos.clear();
          
            }
 
    }
        
        
        
        
        
        
        
        
        
        

    
     String si = " ";
     String grafic;
     String auI= " ";
     String auD= " ";
     int cin = 0;
    
    public void Graficar (Node node){
        
        
           if (node != null) // Si no está vacío ...
            {
                grafic = "digraph G {\n"; 
                //grafic = grafic+ "\"Raíz\"[sides=5,peripheries=2,color=yellow,style=filled];";
                grafic = grafic+ "\""+node.value.getNombre()+"\\"+"n "+"\"[sides=5,color=pink,style=filled];";
               // grafic = grafic+ "\"Raíz\" -> \""+node.value.getNombre()+"\";\n";
                RecorrerNodos2(node);
                grafic = grafic +si+auI+auD;
                grafic = grafic + "}";
                
            try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("avlCategorias.dot"));
            writer.write(String.valueOf(grafic));
            writer.close();
            String comando = "dot -Tpng avlCategorias.dot -o avlCategorias.png";
            Process p = Runtime.getRuntime().exec(comando);
             File objetofile = new File ("avlCategorias.png");
//            Desktop.getDesktop().open(objetofile);
            } catch (IOException ex) {}
             auI = " ";
             auD = " ";
             si = " ";
             grafic = " ";
          
            }
 
    }
    
    
         public void RecorrerNodos2(Node NodoActual){
         
         if (NodoActual != null)
        {
            if (NodoActual.left != null){
             //Resultado = Resultado + "\n" + NodoActual.dato + "->" + NodoActual.hijoIzquierdo.dato + ";";
                
             
                auI = auI+ "\""+NodoActual.left.value.getNombre()+"\\"+"n "+"\"[sides=5,color = pink,style=filled];";
               
             si = si +"\""+ NodoActual.value.getNombre()+"\\"+"n "+"\""+ "->" +"\""+ NodoActual.left.value.getNombre()+"\\"+"n "+"\""+ ";\n"; 
            }
            if (NodoActual.right!= null){
            //Resultado = Resultado + "\n" + NodoActual.dato + "->" +NodoActual.hijoDerecho.dato + ";";
               
                auD= auD+"\""+NodoActual.right.value.getNombre()+"\\"+"n "+"\"[sides=5,color = pink,style=filled];";
               
               si = si +"\""+ NodoActual.value.getNombre()+"\\"+"n "+"\"" + "->" +"\""+NodoActual.right.value.getNombre()+"\\"+"n "+"\""+ ";\n";
                }
                RecorrerNodos2(NodoActual.left); // Llamada recursivapara recorrer el subárbol izquierdo
                RecorrerNodos2(NodoActual.right); // Llamada recursivapara recorrer el subárbol derecho
                
                
         }
 } 
    
    

    
}
