package proyecto2;

import Bibliotecam.AVL;
import Bibliotecam.Categoria;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import static proyecto2.MenuPrincipal.ArbolCategorias;
import static proyecto2.MenuPrincipal.raizAvl;

import static proyecto2.MenuPrincipal.arrayCategoriasGeneral;
import static proyecto2.MenuPrincipal.arrayISBNGeneral;
import static proyecto2.MenuPrincipal.arbolBGeneral;
import static proyecto2.MenuPrincipal.matrizLibros;
//import static proyecto2.MenuPrincipal.categorial;

/**
 *
 * @author Adriana Gomez
 */
public class Biblioteca extends javax.swing.JFrame {
    ArbolB arbolB = new ArbolB();
    
    //para el registro de libros
    int posMatriz=1;
    int ISBN,carnet,edicion,año;
    String titulo,autor,editorial,categoria,idioma;
    
    //para la busqueda de libros
    String nombreLibro;
//    int x;
    
    //para las coincidencias
    int y, cantidadLetras,c;
    String tituloCoincidencia="", ultimo;
    String[][] matrizSustituta = new String[1][100];
    
    //para guardar las categorias individuales
    public static String[] arrayMisCategorias = new String[100];  
    
    public Biblioteca() {
        initComponents();
        setLocationRelativeTo(null);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnVerCategorias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCoincidencias = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtISBNBorrar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRazon = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoLibro = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVerCategorias.setBackground(new java.awt.Color(255, 204, 255));
        btnVerCategorias.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnVerCategorias.setText("Ver categorias");
        btnVerCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCategoriasActionPerformed(evt);
            }
        });
        jPanel6.add(btnVerCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Biblioteca");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\X\\Desktop\\EDD\\EDD_1S2020_PY2_201504236\\Proyecto2\\book.png")); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, 33));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel3.setText("ISBN");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel4.setText("Titulo");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel5.setText("Autor");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel6.setText("Editorial");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel7.setText("Año");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel8.setText("Edicion");

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel9.setText("Categoria");

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel10.setText("Idioma");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel11.setText("Carnet");

        txtISBN.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtAutor.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtEditorial.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtAño.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtEdicion.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtCategoria.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtIdioma.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtCarnet.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        jButton5.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton5.setText("agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAño, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addComponent(txtEdicion))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel12.setText("Titulo");

        jButton4.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton4.setText("buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton1.setText("coincidencias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coincidencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        txtCoincidencias.setColumns(20);
        txtCoincidencias.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtCoincidencias.setRows(5);
        jScrollPane3.setViewportView(txtCoincidencias);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 230, 150));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrar libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel13.setText("ISBN");

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel14.setText("Razon por la que se dara de baja:");

        txtISBNBorrar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtRazon.setColumns(20);
        txtRazon.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtRazon.setRows(5);
        jScrollPane2.setViewportView(txtRazon);

        jButton3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton3.setText("borrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(36, 36, 36)
                        .addComponent(txtISBNBorrar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtISBNBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info del libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        txtInfoLibro.setColumns(20);
        txtInfoLibro.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtInfoLibro.setRows(5);
        jScrollPane1.setViewportView(txtInfoLibro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 180, 270));

        jButton2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton2.setText("carga masiva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 230, -1));

        jButton7.setBackground(new java.awt.Color(255, 204, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton7.setText("Cerrar sesion");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos.JSON", "JSON");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filtro);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.showOpenDialog(this);
        File users = chooser.getSelectedFile();
        try {
            JSONParser parser = new JSONParser();
            Object objects = parser.parse(new FileReader(users));
            JSONObject jsonObject = (JSONObject) objects;
            JSONArray libros = (JSONArray) jsonObject.get("libros");
            
            for (int i = 0; i < libros.size(); i++) {
                JSONObject obj = (JSONObject) libros.get(i);
                     ISBN = Integer.parseInt(obj.get("ISBN").toString());
                     titulo= obj.get("Titulo").toString();
                     autor= obj.get("Autor").toString();
                     editorial = obj.get("Editorial").toString();
                     año = Integer.parseInt(obj.get("Año").toString());
                     edicion= Integer.parseInt(obj.get("Edicion").toString());
                     idioma = obj.get("Idioma").toString();
                     categoria = obj.get("Categoria").toString();
//                Usuario nuevo = new Usuario(Nombre, Apellido, Carrera, Password, Integer.parseInt(Carnet));
//                servidor.nuevaOperacion(Operacion.Tipo.CREAR_USUARIO, nuevo);
                

                
                int k=0;
                boolean bandera = false;
                for(k=0; k<=1000; k++){
                    if(arrayISBNGeneral[k]!=0){
                        if(ISBN==arrayISBNGeneral[k]){
                            JOptionPane.showMessageDialog(null, "El ISBN ya existe \n ingrese otro \n"); 
                            bandera=false;
                            break;
                        }
                    }else{
        //                JOptionPane.showMessageDialog(null, "agregado \n");
                       bandera=true;
                        break;
                    }
                }


                if(bandera==true){

                    arbolB.insertar(ISBN,funcionReemplazarEspacios(titulo),funcionReemplazarEspacios(autor),funcionReemplazarEspacios(editorial),
                                    año,edicion,funcionReemplazarEspacios(categoria),funcionReemplazarEspacios(idioma),carnet);

                    arbolBGeneral.insertar(ISBN,funcionReemplazarEspacios(titulo),funcionReemplazarEspacios(autor),funcionReemplazarEspacios(editorial),
                                                año,edicion,funcionReemplazarEspacios(categoria),funcionReemplazarEspacios(idioma),carnet);

                    arbolBGeneral.GenerarGrafoGeneral();
                    arbolB.GenerarGrafo();


                        int j,jj,p;
                        for(j=0; j<=100; j++){
                            if(arrayMisCategorias[j] == null ? categoria == null : arrayMisCategorias[j].equals(categoria)){
                                JOptionPane.showMessageDialog(null, "Categoria ya existente: "+categoria);
                                break;
                            }else{
                                if(arrayMisCategorias[j]==null){
                                    arrayMisCategorias[j]=categoria;
//                                    JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                                    break;
                                }
                            }
                        }
                        for(jj=0; jj<=1000; jj++){
                            if(arrayCategoriasGeneral[jj] == null ? categoria == null : arrayCategoriasGeneral[jj].equals(categoria)){
                                JOptionPane.showMessageDialog(null, "Categoria ya existente: "+categoria);
                                break;
                            }else{
                                if(arrayCategoriasGeneral[jj]==null){
                                    arrayCategoriasGeneral[jj]=categoria;
            //                        JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                                    break;
                                }
                            }
                        }
                            for(p=0; p<=1000; p++){
                                if(arrayISBNGeneral[p]==0){
                                    arrayISBNGeneral[p]=ISBN;
                                    break;
                                }
                            }


                    Categoria categoriam = new Categoria ();
                    categoriam.setNombre(categoria); 
                    categoriam.setCarnet(carnet);  
                    raizAvl = ArbolCategorias.insert(raizAvl, categoriam);
                    ArbolCategorias.Graficar(raizAvl);





            //        System.out.println("llenado: "+posMatriz);
                    if(matrizLibros[0][posMatriz]==null){
                        matrizLibros[0][posMatriz]=Integer.toString(ISBN);
                        matrizLibros[1][posMatriz]=titulo;
                        matrizLibros[2][posMatriz]=autor;
                        matrizLibros[3][posMatriz]=editorial;
                        matrizLibros[4][posMatriz]=Integer.toString(año);
                        matrizLibros[5][posMatriz]=Integer.toString(edicion);
                        matrizLibros[6][posMatriz]=categoria;
                        matrizLibros[7][posMatriz]=idioma;
//                        matrizLibros[8][posMatriz]=txtCarnet.getText();
            //            posMatriz++;
                    }else{
                        for(int s=1; s==matrizLibros.length; s++){
                            s++;
                            posMatriz=s;
                            if(matrizLibros[0][posMatriz]==null){
                                matrizLibros[0][posMatriz]=Integer.toString(ISBN);
                                matrizLibros[1][posMatriz]=titulo;
                                matrizLibros[2][posMatriz]=autor;
                                matrizLibros[3][posMatriz]=editorial;
                                matrizLibros[4][posMatriz]=Integer.toString(año);
                                matrizLibros[5][posMatriz]=Integer.toString(edicion);
                                matrizLibros[6][posMatriz]=categoria;
                                matrizLibros[7][posMatriz]=idioma;
//                                matrizLibros[8][posMatriz]=txtCarnet.getText();

                            }
                        }
                    }

                                JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                    posMatriz++;
                }else{
                        JOptionPane.showMessageDialog(null, "Error en la creacion del libro: "+ISBN+"\nTitulo: "+titulo); 

                }
                
               
            }
//            servidor.nuevoBloque();
        } catch (IOException | NumberFormatException | ParseException e) {
            System.out.println("Error en la lectura del archivo de configuracion " + e);
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ISBN = Integer.parseInt(txtISBN.getText());
        titulo = txtTitulo.getText();
        autor = txtAutor.getText();
        editorial = txtEditorial.getText();
        año = Integer.parseInt(txtAño.getText());
        edicion = Integer.parseInt(txtEdicion.getText());
        categoria = txtCategoria.getText();
        idioma = txtIdioma.getText();
        carnet = Integer.parseInt(txtCarnet.getText());
        
        int k=0;
        boolean bandera = false;
        for(k=0; k<=1000; k++){
            if(arrayISBNGeneral[k]!=0){
                if(ISBN==arrayISBNGeneral[k]){
                    JOptionPane.showMessageDialog(null, "El ISBN ya existe \n ingrese otro \n"); 
                    bandera=false;
                    break;
                }
            }else{
//                JOptionPane.showMessageDialog(null, "agregado \n"); 
               bandera=true;
                break;
            }
        }
        
        if(bandera==true){
            
            arbolB.insertar(ISBN,funcionReemplazarEspacios(titulo),funcionReemplazarEspacios(autor),funcionReemplazarEspacios(editorial),
                            año,edicion,funcionReemplazarEspacios(categoria),funcionReemplazarEspacios(idioma),carnet);
            
            arbolBGeneral.insertar(ISBN,funcionReemplazarEspacios(titulo),funcionReemplazarEspacios(autor),funcionReemplazarEspacios(editorial),
                                        año,edicion,funcionReemplazarEspacios(categoria),funcionReemplazarEspacios(idioma),carnet);
            
            arbolBGeneral.GenerarGrafoGeneral();
            arbolB.GenerarGrafo();
            
            Categoria categoriam = new Categoria ();
            categoriam.setNombre(txtCategoria.getText()); 
            categoriam.setCarnet(Integer.parseInt(txtCarnet.getText()));  
            raizAvl = ArbolCategorias.insert(raizAvl, categoriam);
            ArbolCategorias.Graficar(raizAvl);
            


                int i,ii,o;
            for(i=0; i<=100; i++){
                if(arrayMisCategorias[i] == null ? txtCategoria.getText() == null : arrayMisCategorias[i].equals(txtCategoria.getText())){
                    JOptionPane.showMessageDialog(null, "Categoria ya existente \n");
                    break;
                }else{
                    if(arrayMisCategorias[i]==null){
                        arrayMisCategorias[i]=txtCategoria.getText();
                        JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                        break;
                    }
                }
            }
            for(ii=0; ii<=1000; ii++){
                if(arrayCategoriasGeneral[ii] == null ? txtCategoria.getText() == null : arrayCategoriasGeneral[ii].equals(txtCategoria.getText())){
//                    JOptionPane.showMessageDialog(null, "Categoria ya existente \n");
                    break;
                }else{
                    if(arrayCategoriasGeneral[ii]==null){
                        arrayCategoriasGeneral[ii]=txtCategoria.getText();
//                        JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                        break;
                    }
                }
            }
                for(o=0; o<=1000; o++){
                    if(arrayISBNGeneral[o]==0){
                        arrayISBNGeneral[o]=ISBN;
                        break;
                    }
                }





    //        System.out.println("llenado: "+posMatriz);
            if(matrizLibros[0][posMatriz]==null){
                matrizLibros[0][posMatriz]=txtISBN.getText();
                matrizLibros[1][posMatriz]=txtTitulo.getText();
                matrizLibros[2][posMatriz]=txtAutor.getText();
                matrizLibros[3][posMatriz]=txtEditorial.getText();
                matrizLibros[4][posMatriz]=txtAño.getText();
                matrizLibros[5][posMatriz]=txtEdicion.getText();
                matrizLibros[6][posMatriz]=txtCategoria.getText();
                matrizLibros[7][posMatriz]=txtIdioma.getText();
                matrizLibros[8][posMatriz]=txtCarnet.getText();
    //            posMatriz++;
            }else{
                for(int s=1; s==matrizLibros.length; s++){
                    s++;
                    posMatriz=s;
                    if(matrizLibros[0][posMatriz]==null){
                        matrizLibros[0][posMatriz]=txtISBN.getText();
                        matrizLibros[1][posMatriz]=txtTitulo.getText();
                        matrizLibros[2][posMatriz]=txtAutor.getText();
                        matrizLibros[3][posMatriz]=txtEditorial.getText();
                        matrizLibros[4][posMatriz]=txtAño.getText();
                        matrizLibros[5][posMatriz]=txtEdicion.getText();
                        matrizLibros[6][posMatriz]=txtCategoria.getText();
                        matrizLibros[7][posMatriz]=txtIdioma.getText();
                        matrizLibros[8][posMatriz]=txtCarnet.getText();

                    }
                }
            }

                        JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
            posMatriz++;
        }else{
                JOptionPane.showMessageDialog(null, "Error en la creacion del libro \n"); 
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        nombreLibro = txtBusqueda.getText();
//        Respuesta(nombreLibro);
//        x=0;
        txtInfoLibro.setText(Respuesta(nombreLibro));
//        if(matrizLibros[1][1].equals(nombreLibro)){
//            txtInfoLibro.setText("ISBN: "+matrizLibros[0][1]+"\nTitulo: "+matrizLibros[1][1]+"\nAutor: "+matrizLibros[2][1]+
//                    "\nEditorial: "+matrizLibros[3][1]+"\nAño: "+matrizLibros[4][1]+"\nEdicion: "+matrizLibros[5][1]+
//                    "\nCategoria: "+matrizLibros[6][1]+"\nIdioma: "+matrizLibros[7][1]+"\nCarnet: "+matrizLibros[8][1]);
//        }

        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        c=1;
        tituloCoincidencia=txtBusqueda.getText();
        cantidadLetras=tituloCoincidencia.length();
        ultimo = tituloCoincidencia.substring(tituloCoincidencia.length() - 1);
//        txtInfoLibro.setText("Ultima letra: "+ultimo+"\nCantidad de letras: "+cantidadLetras);
        
        txtCoincidencias.setText(Coincidencias(ultimo));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCategoriasActionPerformed
        // TODO add your handling code here:
        Categorias categoriasV = new Categorias();
        categoriasV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerCategoriasActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here
        MenuPrincipal inicio = new MenuPrincipal();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    
   
    //*****  METODO PARA VERIFICAR COINCIDENCIA DE LIBROS *****
    public String Coincidencias(String info){
//        String[] matrizSustituta = new String[100];
//        int c=1;

        for(y=1; y<=matrizLibros.length; y++){
            
//                System.out.println("Entro");
                String titulo = matrizLibros[1][y];
                char letraFinal=titulo.charAt(cantidadLetras-1);
//                System.out.println("agarro el nombre de la matriz");
                
                
                if(Character.toString(letraFinal) == null ? ultimo == null : Character.toString(letraFinal).equals(ultimo)){
//                    System.out.println("correcto");
//                    matrizSustituta[0][c]=matrizLibros[0][y];
//                    matrizSustituta[1][c]=matrizLibros[1][y];
//                    c++;
//                      Llenado(matrizLibros[0][y],matrizLibros[1][y]);
//                        for(c=1; c==f; c++){
//                                    matrizSustituta[0][c]=matrizLibros[0][y];
//                                    matrizSustituta[1][c]=matrizLibros[1][y];
//                                }
//                      f++;
                    return info="ISBN: "+matrizLibros[0][y]+"\nTitulo: "+matrizLibros[1][y];
                }
        }
        return info="No hay coincidencias";
    }
    
    
    //*****  METODO PARA VERIFICAR LA EXISTENCIA DE LIBROS *****
    public String Respuesta(String info){
        int x=0;
        for(x=1; x<=1000; x++){
            while(matrizLibros[1][x]!=null){
                if(matrizLibros[1][x].equals(nombreLibro)){
                return info="ISBN: "+matrizLibros[0][x]+"\nTitulo: "+matrizLibros[1][x]+"\nAutor: "+matrizLibros[2][x]+
                        "\nEditorial: "+matrizLibros[3][x]+"\nAño: "+matrizLibros[4][x]+"\nEdicion: "+matrizLibros[5][x]+
                        "\nCategoria: "+matrizLibros[6][x]+"\nIdioma: "+matrizLibros[7][x]+"\nCarnet: "+matrizLibros[8][x];
                }else if(!matrizLibros[1][x].equals(nombreLibro)){
                    return info="No existe ese libro";
                }
                x++;
            }
        
        }
        return info="No existe ese libro";
    }
    
    
    //*****  METODO PARA REEMPLAZAR ESPACIOS *****
    public static String funcionReemplazarEspacios(String cadena) {
    return cadena.replace(" ", "_");
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerCategorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtCoincidencias;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBNBorrar;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextArea txtInfoLibro;
    private javax.swing.JTextArea txtRazon;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
