package proyecto2;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Adriana Gomez
 */
public class Biblioteca extends javax.swing.JFrame {
    ArbolB arbolB = new ArbolB();
    JLabel lbl,lbl2,lbl3;
    JPanel panel;
    JScrollPane scrollPane;
    JTextArea area;
    
    //para el registro de libros
    int posMatriz=1;
    String[][] matrizLibros = new String[9][1000];
    int ISBN,carnet,edicion,año;
    String titulo,autor,editorial,categoria,idioma;
    
    //para la busqueda de libros
    String nombreLibro;
    int x;
    //para las coincidencias
    int y, cantidadLetras,c;
    String tituloCoincidencia="", ultimo;
        String[][] matrizSustituta = new String[1][100];

    public Biblioteca() {
        initComponents();
        setLocationRelativeTo(null);
        
        scrollPane = new JScrollPane();
        panel = new JPanel();
        scrollPane.setBounds(20,60,430,368);
        panel.setPreferredSize(new Dimension(500,500));
        scrollPane.setViewportView(panel);
        panel.setBackground(Color.pink);
        scrollPane.setVisible(false);

        this.add(scrollPane);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoLibro = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtISBNBorrar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRazon = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCoincidencias = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Biblioteca");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\X\\Desktop\\EDD\\EDD_1S2020_PY2_201504236\\Proyecto2\\book.png")); // NOI18N

        jButton2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton2.setText("carga masiva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(45, 45, 45)
                .addComponent(jButton5)
                .addContainerGap(65, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info del libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11))); // NOI18N

        txtInfoLibro.setColumns(20);
        txtInfoLibro.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtInfoLibro.setRows(5);
        jScrollPane1.setViewportView(txtInfoLibro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11))); // NOI18N

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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrar libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11))); // NOI18N

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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coincidencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11))); // NOI18N

        txtCoincidencias.setColumns(20);
        txtCoincidencias.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtCoincidencias.setRows(5);
        jScrollPane3.setViewportView(txtCoincidencias);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        jButton6.setText("ver coincidencias");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButton6)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("inicio ejecucion");
        generarLabels();
        scrollPane.setVisible(true);
        System.out.println("termino ejecucion");
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
        
        arbolB.insertar(ISBN,funcionReemplazarEspacios(titulo),funcionReemplazarEspacios(autor),funcionReemplazarEspacios(editorial),
                        año,edicion,funcionReemplazarEspacios(categoria),funcionReemplazarEspacios(idioma),carnet);
        arbolB.GenerarGrafo();
        
        System.out.println("llenado: "+posMatriz);
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
        
        for(int i=0;i<9;i++){
            if(posMatriz==3){
                System.out.println("aqui3: "+matrizLibros[i][1]);
                System.out.println("aqui3: "+matrizLibros[i][2]);
                System.out.println("aqui3: "+matrizLibros[i][3]);
            }else if(posMatriz==2){
                System.out.println("aqui2: "+matrizLibros[i][1]);
                System.out.println("aqui2: "+matrizLibros[i][2]);
            }else{
                System.out.println("aqui2: "+matrizLibros[i][1]);
            }
        }
        posMatriz++;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        nombreLibro = txtBusqueda.getText();
//        Respuesta(nombreLibro);
        x=0;
        txtInfoLibro.setText(Respuesta(nombreLibro));
//        if(matrizLibros[1][1].equals(nombreLibro)){
//            txtInfoLibro.setText("ISBN: "+matrizLibros[0][1]+"\nTitulo: "+matrizLibros[1][1]+"\nAutor: "+matrizLibros[2][1]+
//                    "\nEditorial: "+matrizLibros[3][1]+"\nAño: "+matrizLibros[4][1]+"\nEdicion: "+matrizLibros[5][1]+
//                    "\nCategoria: "+matrizLibros[6][1]+"\nIdioma: "+matrizLibros[7][1]+"\nCarnet: "+matrizLibros[8][1]);
//        }

        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        c=1;
        tituloCoincidencia=txtBusqueda.getText();
        cantidadLetras=tituloCoincidencia.length();
        ultimo = tituloCoincidencia.substring(tituloCoincidencia.length() - 1);
        txtInfoLibro.setText("Ultima letra: "+ultimo+"\nCantidad de letras: "+cantidadLetras);
        txtCoincidencias.setText(Coincidencias(ultimo));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        for(int d=1; d<=matrizSustituta.length; d++){
            txtCoincidencias.setText("\n\nISBN: "+matrizLibros[0][d]+"\nTitulo: "+matrizLibros[1][d]);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    
    
    
    public String Coincidencias(String info){
//        String[][] matrizSustituta = new String[1][100];
//        int c=1;
        for(y=1; y<=matrizLibros.length; y++){
            
                System.out.println("Entro");
                String titulo = matrizLibros[1][y];
                char letraFinal=titulo.charAt(cantidadLetras-1);
                System.out.println("agarro el nombre de la matriz");
                
                
                if(Character.toString(letraFinal) == null ? ultimo == null : Character.toString(letraFinal).equals(ultimo)){
                    System.out.println("correcto");
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
    
    public void Llenado(String isbn, String titulo){
        System.out.println(isbn+"   "+titulo);
//        for(c=1; c==f; c++){
//            matrizSustituta[0][c]=isbn;
//            matrizSustituta[1][c]=titulo;
//        }
        
    }
    
    
    
    
    
    
    
    
    //*****  METODO PARA VERIFICAR LA EXISTENCIA DE LIBROS *****
    public String Respuesta(String info){
        
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
    
    
    
    
    
    
    
    
    
    
    public void generarLabels() {
        int i=0;
        for(i=1;i<=50;i++){
            lbl = new JLabel();
            lbl2 = new JLabel("Libro infantil");
            lbl3 = new JLabel("200-120");
            lbl.setIcon(new ImageIcon("libro2.jpg"));
            lbl.setBounds(20, 60, 100, 100);
            lbl2.setBounds(40, 40, 100, 100);
            lbl3.setBounds(40, 60, 100, 100);
            panel.add(lbl);
            panel.add(lbl2);
            panel.add(lbl3);
        }
    }

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
