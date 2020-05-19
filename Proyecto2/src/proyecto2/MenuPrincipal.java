
package proyecto2;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Bibliotecam.AVL;
import Bibliotecam.Categoria;
import Bibliotecam.Libro;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;





/**
 *
 * 
 * @author Adriana Gómez    
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    public static TablaDispersa tabla = new TablaDispersa(45);
    public static int[] carnetArrayHash = new int[45];//Para guardarlo y verificar los 45 espacios de la hash
    public static ListaSimple Lista1 = null;
    public static ListaSimple Lista2 = null;
    public static ListaSimple Lista3 = null;
    public static ListaSimple Lista4 = null;
    public static ListaSimple Lista5 = null;
    public static ListaSimple Lista6 = null;
    public static ListaSimple Lista7 = null;
    public static ListaSimple Lista8 = null;
    public static ListaSimple Lista9 = null;
    public static ListaSimple Lista10 = null;
    public static ListaSimple Lista11 = null;
    public static ListaSimple Lista12 = null;
    public static ListaSimple Lista13 = null;
    public static ListaSimple Lista14 = null;
    public static ListaSimple Lista15 = null;
    public static ListaSimple Lista16 = null;
    public static ListaSimple Lista17 = null;
    public static ListaSimple Lista18 = null;
    public static ListaSimple Lista19 = null;
    public static ListaSimple Lista20 = null;
    public static ListaSimple Lista21 = null;
    public static ListaSimple Lista22 = null;
    public static ListaSimple Lista23 = null;
    public static ListaSimple Lista24 = null;
    public static ListaSimple Lista25 = null;
    public static ListaSimple Lista26 = null;
    public static ListaSimple Lista27 = null;
    public static ListaSimple Lista28 = null;
    public static ListaSimple Lista29 = null;
    public static ListaSimple Lista30 = null;
    public static ListaSimple Lista31 = null;
    public static ListaSimple Lista32 = null;
    public static ListaSimple Lista33 = null;
    public static ListaSimple Lista34 = null;
    public static ListaSimple Lista35 = null;
    public static ListaSimple Lista36 = null;
    public static ListaSimple Lista37 = null;
    public static ListaSimple Lista38 = null;
    public static ListaSimple Lista39 = null;
    public static ListaSimple Lista40 = null;
    public static ListaSimple Lista41 = null;
    public static ListaSimple Lista42 = null;
    public static ListaSimple Lista43 = null;
    public static ListaSimple Lista44 = null;
    public static ListaSimple Lista45 = null;
    
    
    
    
    
  
  public static int carnetActual;
  
  public static LinkedList<String> todascategorias = new LinkedList<String>();
  public static AVL ArbolCategorias = new AVL();
  public static AVL.Node raizAvl = null;
  public static LinkedList<Libro> MisLibros = new LinkedList<Libro>();
  public static LinkedList<Libro> LibrosCat = new LinkedList<Libro>();
  public static ArbolB arbolBGeneral = new ArbolB();
  public static  String[][] matrizLibros = new String[9][1000];
  
    
  public static String[] arrayCategoriasGeneral = new String[1000]; //para guardar las categorias generales
    public static String[] arrayMisCategorias; //para mis categorias
  public static int[] arrayISBNGeneral = new int[1000]; //para guardar los isbn y comparar
  public static String[] arrayUsuarioGeneral = new String[1000]; //para guardar los isbn y comparar
  
    
    public String nombre, apellido, carrera, password;
    public int carnet;
    
    public  String clave, clave2;//Para password de iniciar sesion y eliminar usuario
    public  int carnetito;//Para iniciar sesion y eliminar usuario
    
    
    
    
    

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
//        jPanelCredenciales.setVisible(false);
//        btnIniciar.setVisible(false);
        btnEliminar.setVisible(false);
//        lblCredenciales.setVisible(false);
        lblEditarUsuario.setVisible(false);
        btnEditar.setVisible(false);
        lblEditarUsuario.setVisible(false);
        lblEliminarUsuario.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCrearUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnCrearUsuario = new javax.swing.JButton();
        jPanelCredenciales = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCarnet2 = new javax.swing.JTextField();
        txtPassword2 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblCredenciales = new javax.swing.JLabel();
        lblEditarUsuario = new javax.swing.JLabel();
        lblEliminarUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton6.setText("Reportes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setText("Carnet");

        txtCarnet.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtCarnet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarnetKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtCarrera.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setText("Carrera");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        btnCrear.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtCarrera)
                            .addComponent(txtPassword)
                            .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        txtCarnet.getAccessibleContext().setAccessibleName("");
        txtNombre.getAccessibleContext().setAccessibleName("");
        txtApellido.getAccessibleContext().setAccessibleName("");
        txtCarrera.getAccessibleContext().setAccessibleName("");
        txtPassword.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 230, 290));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("Accion sobre usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, -1));

        lblCrearUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblCrearUsuario.setText("Crear usuario");
        getContentPane().add(lblCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, -1));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEditarUsuario.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEditarUsuario.setText("Editar usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEliminarUsuario.setText("Eliminar usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnIniciarSesion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCrearUsuario.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnCrearUsuario.setText("Crear usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 230, 130));

        jPanelCredenciales.setBackground(new java.awt.Color(255, 153, 153));
        jPanelCredenciales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel9.setText("Carnet");

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel10.setText("Password");

        txtCarnet2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtCarnet2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarnet2KeyTyped(evt);
            }
        });

        txtPassword2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnIniciar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnIniciar.setText("Iniciar ");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCredencialesLayout = new javax.swing.GroupLayout(jPanelCredenciales);
        jPanelCredenciales.setLayout(jPanelCredencialesLayout);
        jPanelCredencialesLayout.setHorizontalGroup(
            jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCredencialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCredencialesLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar))
                    .addGroup(jPanelCredencialesLayout.createSequentialGroup()
                        .addGroup(jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarnet2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCredencialesLayout.setVerticalGroup(
            jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCredencialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCarnet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCredenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 230, 120));

        lblCredenciales.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblCredenciales.setText("Iniciar sesión");
        getContentPane().add(lblCredenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        lblEditarUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblEditarUsuario.setForeground(new java.awt.Color(255, 109, 18));
        lblEditarUsuario.setText("Editar usuario");
        getContentPane().add(lblEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lblEliminarUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblEliminarUsuario.setForeground(new java.awt.Color(255, 109, 18));
        lblEliminarUsuario.setText("Eliminar usuario");
        getContentPane().add(lblEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setText("Carga \nmasiva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton4.setText("Configuracion IP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 740, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        carnet = Integer.parseInt(txtCarnet.getText());
        nombre = txtNombre.getText();
        carrera = txtCarrera.getText();
        apellido = txtApellido.getText();
        password = txtPassword.getText();
        
        int k=0;
        boolean bandera = false;
        for(k=0; k<=1000; k++){
            if(arrayUsuarioGeneral[k]!=null){
                if(txtCarnet.getText() == null ? arrayUsuarioGeneral[k] == null : txtCarnet.getText().equals(arrayUsuarioGeneral[k])){
                    JOptionPane.showMessageDialog(null, "El carnet ya existe \n ingrese otro \n"); 
                    bandera=false;
                    break;
                }
            }else{
//                JOptionPane.showMessageDialog(null, "agregado \n"); 
                arrayUsuarioGeneral[k]=txtCarnet.getText();
                System.out.println(arrayUsuarioGeneral[k]);
               bandera=true;
                break;
            }
        }
        
        if(bandera==true){
            //palabrita="12345";
            getMD5(password); //El password le pasamos en texto plano
            //Ahora voy a imprimir
            //System.out.print(getMD5(password));
            //Esto nos mostraría lo siguiente
            //827ccb0eea8a706c4c34a16891f84e7b

            int IDLlave = (carnet) % 45;
            insertandoHashLista(IDLlave);//MANDO A LLAMAR AL METODO PARA INSERTAR LOS USUARIOS EN LA HASH

            tabla.GraficarTabla();

            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente\n"
                    + "Carnet: "+carnet+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nCarrera: "+carrera+
                    "\nPassword: "+password+"\nPass MD5: "+getMD5(password));
            txtCarnet.setText(null);
            txtNombre.setText(null);
            txtApellido.setText(null);
            txtCarrera.setText(null);
            txtPassword.setText(null);
            
        }else{
            JOptionPane.showMessageDialog(null, "Error en la creacion de usuario \n"); 
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        jPanelCredenciales.setVisible(true);
        btnIniciar.setVisible(true);
        lblCredenciales.setVisible(true);
        btnEliminar.setVisible(false);
        lblEliminarUsuario.setVisible(false);
        lblCredenciales.setVisible(true);
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        jPanelCredenciales.setVisible(true);
        btnEliminar.setVisible(true);
        lblCredenciales.setVisible(true);
        btnIniciar.setVisible(false);
        lblCredenciales.setVisible(false);
        lblEliminarUsuario.setVisible(true);
        
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        // TODO add your handling code here:
        lblCrearUsuario.setVisible(false);
        lblEditarUsuario.setVisible(true);
        btnCrear.setVisible(false);
        btnEditar.setVisible(true);
        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if( Character.isDigit(car)){

        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCarnetKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        carnetito = Integer.parseInt(txtCarnet2.getText());
        clave = txtPassword2.getText();
        
        int IDLlave = (carnetito) % 45;//ME QUEDE EN AL ELIMINAR EL NUMERO DE CASILLA AUMENTA Y NO PUEDO ARREGLARLO
//        getMD5(clave);                //VERIFICAR EN TABLA HASH SI SE LE PUEDE MANDAR EL IDLLAVE CON UN NUEVO METODO GETNODO Y GETTERS DE LA TABLA EN EL
        System.out.println("Entro");
        
        
        boolean bandera=false;
            for(int l=0; l<=1000; l++){
                if(arrayUsuarioGeneral[l]!=null){
                    if(arrayUsuarioGeneral[l] == null ? txtCarnet2.getText() == null : arrayUsuarioGeneral[l].equals(txtCarnet2.getText())){
                        arrayUsuarioGeneral[l]="";// me quede en eliminar del array a los usuarios, ya esta es de probarlo

//                  JOptionPane.showMessageDialog(null,"Usuario eliminado");
                  bandera=true;

                        break;
                    }
                }else{
//                    JOptionPane.showMessageDialog(null, "No existe ese usuario en tu lista \n");
                    bandera=false;
                    break;
                }
            }
        
        
        
        if(bandera==true){
        
        
        
            if(IDLlave==1){
                    if(Lista1.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista1.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista1.listar();
                        carnetArrayHash[1]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==2){
                    if(Lista2.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista2.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista2.listar();
                        carnetArrayHash[2]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==3){
                    if(Lista3.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista3.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista3.listar();
                        carnetArrayHash[3]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==4){
                    if(Lista4.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista4.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista4.listar();
                        carnetArrayHash[4]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==5){
                    if(Lista5.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista5.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista5.listar();
                        carnetArrayHash[5]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==6){
                    if(Lista6.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista6.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista6.listar();
                        carnetArrayHash[6]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==7){
                    if(Lista7.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista7.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista7.listar();
                        carnetArrayHash[7]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==8){
                    if(Lista8.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista8.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista8.listar();
                        carnetArrayHash[8]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==9){
                    if(Lista9.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista9.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista9.listar();
                        carnetArrayHash[9]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==10){
                    if(Lista10.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista10.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista10.listar();
                        carnetArrayHash[10]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==11){
                    if(Lista11.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista11.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista11.listar();
                        carnetArrayHash[11]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==12){
                    if(Lista12.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista12.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista12.listar();
                        carnetArrayHash[12]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==13){
                    if(Lista13.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista13.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista13.listar();
                        carnetArrayHash[13]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==14){
                    if(Lista14.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista14.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista14.listar();
                        carnetArrayHash[14]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==15){
                    if(Lista15.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista15.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista15.listar();
                        carnetArrayHash[15]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==16){
                    if(Lista16.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista16.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista16.listar();
                        carnetArrayHash[16]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==17){
                    if(Lista17.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista17.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista17.listar();
                        carnetArrayHash[17]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==18){
                    if(Lista18.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista18.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista18.listar();
                        carnetArrayHash[18]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==19){
                    if(Lista19.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista19.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista19.listar();
                        carnetArrayHash[19]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==20){
                    if(Lista20.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista20.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista20.listar();
                        carnetArrayHash[20]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==21){
                    if(Lista21.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista21.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista21.listar();
                        carnetArrayHash[21]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==22){
                    if(Lista22.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista22.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista22.listar();
                        carnetArrayHash[22]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==23){
                    if(Lista23.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista23.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista23.listar();
                        carnetArrayHash[23]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==24){
                    if(Lista24.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista24.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista24.listar();
                        carnetArrayHash[24]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==25){
                    if(Lista25.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista25.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista25.listar();
                        carnetArrayHash[25]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==26){
                    if(Lista26.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista26.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista26.listar();
                        carnetArrayHash[26]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==27){
                    if(Lista27.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista27.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista27.listar();
                        carnetArrayHash[27]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==28){
                    if(Lista28.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista28.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista28.listar();
                        carnetArrayHash[28]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==29){
                    if(Lista29.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista29.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista29.listar();
                        carnetArrayHash[29]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==30){
                    if(Lista30.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista30.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista30.listar();
                        carnetArrayHash[30]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==31){
                    if(Lista31.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista31.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista31.listar();
                        carnetArrayHash[31]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==32){
                    if(Lista32.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista32.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista32.listar();
                        carnetArrayHash[32]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==33){
                    if(Lista33.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista33.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista33.listar();
                        carnetArrayHash[33]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==34){
                    if(Lista34.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista34.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista34.listar();
                        carnetArrayHash[34]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==35){
                    if(Lista35.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista35.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista35.listar();
                        carnetArrayHash[35]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==36){
                    if(Lista36.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista36.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista36.listar();
                        carnetArrayHash[36]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==37){
                    if(Lista37.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista37.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista37.listar();
                        carnetArrayHash[37]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==38){
                    if(Lista38.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista38.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista38.listar();
                        carnetArrayHash[38]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==39){
                    if(Lista39.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista39.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista39.listar();
                        carnetArrayHash[39]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==40){
                    if(Lista40.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista40.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista40.listar();
                        carnetArrayHash[40]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==41){
                if(Lista41.buscar(carnetito)==true){
    //            if(Lista41.buscarPassword(getMD5(clave))==true){
    //                System.out.println("credenciales correctas, usuario eliminado");
                  JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                  Lista41.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista41.listar();
                        carnetArrayHash[41]=IDLlave;
    //            }else{
    //                System.out.println("contraseña incorrecta");
    //            }
                }else{
    //                System.out.println("credenciales incorrectas");
                    JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                }
            }else if(IDLlave==42){
                    if(Lista42.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista42.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista42.listar();
                        carnetArrayHash[42]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==43){
                    if(Lista43.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista43.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista43.listar();
                        carnetArrayHash[43]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==44){
                    if(Lista44.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista44.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista44.listar();
                        carnetArrayHash[44]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }else if(IDLlave==45){
                    if(Lista45.buscar(carnetito)==true){
                      JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                      Lista45.removerPorReferencia(carnetito);
                      tabla.GraficarTabla();
                      Lista45.listar();
                        carnetArrayHash[45]=IDLlave;
                    }else{
                        JOptionPane.showMessageDialog(null,"credenciales incorrectas");
                    }
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "No existe ese usuario en tu lista \n");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCarnet2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnet2KeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if( Character.isDigit(car)){

        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCarnet2KeyTyped

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        // TODO add your handling code here:
        lblCrearUsuario.setVisible(true);
        lblEditarUsuario.setVisible(false);
        btnCrear.setVisible(true);
        btnEditar.setVisible(false);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
         Biblioteca biblioteca = new Biblioteca();
        carnetito = Integer.parseInt(txtCarnet2.getText());
        clave = txtPassword2.getText();
        carnetActual=  carnetito;
        int IDLlave = (carnetito) % 45;
//        getMD5(clave);

        int k=0;
        boolean bandera = false;
        for(k=0; k<=1000; k++){
            if(arrayUsuarioGeneral[k]!=null){
                if(txtCarnet2.getText() == null ? arrayUsuarioGeneral[k] == null : txtCarnet2.getText().equals(arrayUsuarioGeneral[k])){
                    bandera=true;
                    break;
                }
            }else{
               bandera=false;
                break;
            }
        }
        
        if(bandera==true){
            
        arrayMisCategorias = new String[1000];
            JOptionPane.showMessageDialog(null,"credenciales correctas, bienvenido");
            biblioteca.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"credenciales incorrectas");
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        carnet = Integer.parseInt(txtCarnet.getText());
        nombre = txtNombre.getText();
        carrera = txtCarrera.getText();
        apellido = txtApellido.getText();
        password = txtPassword.getText();
        
        
        int IDLlave2 = (carnet) % 45;
        modificandoHashLista(IDLlave2);//MANDO A LLAMAR AL METODO PARA MODIFICAR LOS USUARIOS EN LA HASH

        tabla.GraficarTabla();
        JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
        txtCarnet.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCarrera.setText(null);
        txtPassword.setText(null);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            JSONArray usuarios = (JSONArray) jsonObject.get("Usuarios");
            
            for (int i = 0; i < usuarios.size(); i++) {
                JSONObject obj = (JSONObject) usuarios.get(i);
                String Carnet = obj.get("Carnet").toString();
                carnet = Integer.parseInt(Carnet);
//                nombre = obj.get("Nombre").toString().substring(1);
                nombre = obj.get("Nombre").toString();
                apellido = obj.get("Apellido").toString();
                carrera = obj.get("Carrera").toString();
                password = obj.get("Password").toString();
//                Usuario nuevo = new Usuario(Nombre, Apellido, Carrera, Password, Integer.parseInt(Carnet));
//                servidor.nuevaOperacion(Operacion.Tipo.CREAR_USUARIO, nuevo);
                

                
                int k;
                boolean bandera = false;
                for(k=0; k<=1000; k++){
                    if(arrayUsuarioGeneral[k]!=null){
                        if(arrayUsuarioGeneral[k] == null ? Carnet == null : arrayUsuarioGeneral[k].equals(Carnet)){
                            JOptionPane.showMessageDialog(null, "El carnet ya existe \n ingrese otro \n"); 
                            bandera=false;
                            break;
                        }
                    }else{
        //                JOptionPane.showMessageDialog(null, "agregado \n"); 
                        arrayUsuarioGeneral[k]=Carnet;
//                        System.out.println(arrayUsuarioGeneral[k]);
                       bandera=true;
                        break;
                    }
                }


                if(bandera==true){
                    int IDLlave = (carnet) % 45;
                    insertandoHashLista(IDLlave);//MANDO A LLAMAR AL METODO PARA INSERTAR LOS USUARIOS EN LA HASH

                    tabla.GraficarTabla();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Eror en cargar el usuario: "+Carnet+
                            "\n Nombre: "+nombre); 
                }
                
               
            }
//            servidor.nuevoBloque();
        } catch (IOException | NumberFormatException | ParseException e) {
            System.out.println("Error en la lectura del archivo de configuracion " + e);
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        ArbolCategorias.Graficar(raizAvl);
        ArbolCategorias.RecorreridoPreorden(raizAvl);
          ArbolCategorias.GraficarRecorridoPreorden(raizAvl);
        ArbolCategorias.RecorreridoInorden(raizAvl);
          ArbolCategorias.GraficarRecorridoInorden(raizAvl);
        ArbolCategorias.RecorreridoPostorden(raizAvl);
          ArbolCategorias.GraficarRecorridoPostorden(raizAvl);
          
        arbolBGeneral.GenerarGrafoGeneral();
        tabla.GraficarTabla();
        
        
        
                JOptionPane.showMessageDialog(null, "Reportes generales creados con exito");
        
          
    }//GEN-LAST:event_jButton6ActionPerformed

    
    
    
    
    
    
    
    
    //***** METODO MD5 PARA ENCRIPTAR EL PASSWORD *****
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
            catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    //***** METODO PARA GENERAR LAS LISTAS DE USUARIOS Y AGREGAR A LA HASH *****
    public void insertandoHashLista(int IDLlave){
        int i,j=0;
        for(i=0; i<=45; i++){
            if(IDLlave==i){//SI LA LLAVE GENERADA ES IGUAL A LA POSICION
                if(carnetArrayHash[i]==IDLlave){//VERIFICA SI ESA POSICION ESTA OCUPADA
                    switch(IDLlave){
                        case 1:
                            tabla.InsertarNodoH(Lista1, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista1.listar();
                            break;
                        case 2:
                            tabla.InsertarNodoH(Lista2, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista2.listar();
                            break;
                        case 3:
                            tabla.InsertarNodoH(Lista3, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista3.listar();
                            break;
                        case 4:
                            tabla.InsertarNodoH(Lista4, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista4.listar();
                            break;
                        case 5:
                            tabla.InsertarNodoH(Lista5, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista5.listar();
                            break;
                        case 6:
                            tabla.InsertarNodoH(Lista6, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista6.listar();
                            break;
                        case 7:
                            tabla.InsertarNodoH(Lista7, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista7.listar();
                            break;
                        case 8:
                            tabla.InsertarNodoH(Lista8, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista8.listar();
                            break;
                        case 9:
                            tabla.InsertarNodoH(Lista9, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista9.listar();
                            break;
                        case 10:
                            tabla.InsertarNodoH(Lista10, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista10.listar();
                            break;
                        case 11:
                            tabla.InsertarNodoH(Lista11, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista11.listar();
                            break;
                        case 12:
                            tabla.InsertarNodoH(Lista12, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista12.listar();
                            break;
                        case 13:
                            tabla.InsertarNodoH(Lista13, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista13.listar();
                            break;
                        case 14:
                            tabla.InsertarNodoH(Lista14, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista14.listar();
                            break;
                        case 15:
                            tabla.InsertarNodoH(Lista15, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista15.listar();
                            break;
                        case 16:
                            tabla.InsertarNodoH(Lista16, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista16.listar();
                            break;
                        case 17:
                            tabla.InsertarNodoH(Lista17, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista17.listar();
                            break;
                        case 18:
                            tabla.InsertarNodoH(Lista18, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista18.listar();
                            break;
                        case 19:
                            tabla.InsertarNodoH(Lista19, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista9.listar();
                            break;
                        case 20:
                            tabla.InsertarNodoH(Lista20, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista20.listar();
                            break;
                        case 21:
                            tabla.InsertarNodoH(Lista21, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista21.listar();
                            break;
                        case 22:
                            tabla.InsertarNodoH(Lista22, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista22.listar();
                            break;
                        case 23:
                            tabla.InsertarNodoH(Lista23, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista23.listar();
                            break;
                        case 24:
                            tabla.InsertarNodoH(Lista24, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista24.listar();
                            break;
                        case 25:
                            tabla.InsertarNodoH(Lista25, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista25.listar();
                            break;
                        case 26:
                            tabla.InsertarNodoH(Lista26, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista26.listar();
                            break;
                        case 27:
                            tabla.InsertarNodoH(Lista27, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista27.listar();
                            break;
                        case 28:
                            tabla.InsertarNodoH(Lista28, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista28.listar();
                            break;
                        case 29:
                            tabla.InsertarNodoH(Lista29, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista29.listar();
                            break;
                        case 30:
                            tabla.InsertarNodoH(Lista30, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista30.listar();
                            break;
                        case 31:
                            tabla.InsertarNodoH(Lista31, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista31.listar();
                            break;
                        case 32:
                            tabla.InsertarNodoH(Lista32, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista32.listar();
                            break;
                        case 33:
                            tabla.InsertarNodoH(Lista33, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista33.listar();
                            break;
                        case 34:
                            tabla.InsertarNodoH(Lista34, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista34.listar();
                            break;
                        case 35:
                            tabla.InsertarNodoH(Lista35, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista35.listar();
                            break;
                        case 36:
                            tabla.InsertarNodoH(Lista36, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista36.listar();
                            break;
                        case 37:
                            tabla.InsertarNodoH(Lista37, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista37.listar();
                            break;
                        case 38:
                            tabla.InsertarNodoH(Lista38, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista38.listar();
                            break;
                        case 39:
                            tabla.InsertarNodoH(Lista39, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista39.listar();
                            break;
                        case 40:
                            tabla.InsertarNodoH(Lista40, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista40.listar();
                            break;
                        case 41:
                            tabla.InsertarNodoH(Lista41, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista41.listar();
                            break;
                        case 42:
                            tabla.InsertarNodoH(Lista42, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista42.listar();
                            break;
                        case 43:
                            tabla.InsertarNodoH(Lista43, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista43.listar();
                            break;
                        case 44:
                            tabla.InsertarNodoH(Lista44, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista44.listar();
                            break;
                        case 45:
                            tabla.InsertarNodoH(Lista45, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista45.listar();
                            break;
                    }
                    carnetArrayHash[i]=IDLlave;
//                    System.out.println(carnetArrayHash[i]+", ");
                    
                    
                    
                }else{//SI LA POSICION NO ESTA OCUPADA 
                    switch(IDLlave){
                        case 1:
                            Lista1 = new ListaSimple();
                            tabla.InsertarNodoH(Lista1, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista1.listar();
                            break;
                        case 2:
                            Lista2 = new ListaSimple();
                            tabla.InsertarNodoH(Lista2, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista2.listar();
                            break;
                        case 3:
                            Lista3 = new ListaSimple();
                            tabla.InsertarNodoH(Lista3, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista3.listar();
                            break;
                        case 4:
                            Lista4 = new ListaSimple();
                            tabla.InsertarNodoH(Lista4, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista4.listar();
                            break;
                        case 5:
                            Lista5 = new ListaSimple();
                            tabla.InsertarNodoH(Lista5, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista5.listar();
                            break;
                        case 6:
                            Lista6 = new ListaSimple();
                            tabla.InsertarNodoH(Lista6, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista6.listar();
                            break;
                        case 7:
                            Lista7 = new ListaSimple();
                            tabla.InsertarNodoH(Lista7, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista7.listar();
                            break;
                        case 8:
                            Lista8 = new ListaSimple();
                            tabla.InsertarNodoH(Lista8, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista8.listar();
                            break;
                        case 9:
                            Lista9 = new ListaSimple();
                            tabla.InsertarNodoH(Lista9, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista9.listar();
                            break;
                        case 10:
                            Lista10 = new ListaSimple();
                            tabla.InsertarNodoH(Lista10, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista10.listar();
                            break;
                        case 11:
                            Lista11 = new ListaSimple();
                            tabla.InsertarNodoH(Lista11, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista11.listar();
                            break;
                        case 12:
                            Lista12 = new ListaSimple();
                            tabla.InsertarNodoH(Lista12, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista12.listar();
                            break;
                        case 13:
                            Lista13 = new ListaSimple();
                            tabla.InsertarNodoH(Lista13, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista13.listar();
                            break;
                        case 14:
                            Lista14 = new ListaSimple();
                            tabla.InsertarNodoH(Lista14, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista14.listar();
                            break;
                        case 15:
                            Lista15 = new ListaSimple();
                            tabla.InsertarNodoH(Lista15, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista15.listar();
                            break;
                        case 16:
                            Lista16 = new ListaSimple();
                            tabla.InsertarNodoH(Lista16, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista16.listar();
                            break;
                        case 17:
                            Lista17 = new ListaSimple();
                            tabla.InsertarNodoH(Lista17, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista17.listar();
                            break;
                        case 18:
                            Lista18 = new ListaSimple();
                            tabla.InsertarNodoH(Lista18, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista18.listar();
                            break;
                        case 19:
                            Lista19 = new ListaSimple();
                            tabla.InsertarNodoH(Lista19, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista19.listar();
                            break;
                        case 20:
                            Lista20 = new ListaSimple();
                            tabla.InsertarNodoH(Lista20, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista20.listar();
                            break;
                        case 21:
                            Lista21 = new ListaSimple();
                            tabla.InsertarNodoH(Lista21, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista21.listar();
                            break;
                        case 22:
                            Lista22 = new ListaSimple();
                            tabla.InsertarNodoH(Lista22, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista22.listar();
                            break;
                        case 23:
                            Lista23 = new ListaSimple();
                            tabla.InsertarNodoH(Lista23, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista23.listar();
                            break;
                        case 24:
                            Lista24 = new ListaSimple();
                            tabla.InsertarNodoH(Lista24, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista24.listar();
                            break;
                        case 25:
                            Lista25 = new ListaSimple();
                            tabla.InsertarNodoH(Lista25, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista25.listar();
                            break;
                        case 26:
                            Lista26 = new ListaSimple();
                            tabla.InsertarNodoH(Lista26, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista26.listar();
                            break;
                        case 27:
                            Lista27 = new ListaSimple();
                            tabla.InsertarNodoH(Lista27, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista27.listar();
                            break;
                        case 28:
                            Lista28 = new ListaSimple();
                            tabla.InsertarNodoH(Lista28, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista28.listar();
                            break;
                        case 29:
                            Lista29 = new ListaSimple();
                            tabla.InsertarNodoH(Lista29, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista29.listar();
                            break;
                        case 30:
                            Lista30 = new ListaSimple();
                            tabla.InsertarNodoH(Lista30, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista30.listar();
                            break;
                        case 31:
                            Lista31 = new ListaSimple();
                            tabla.InsertarNodoH(Lista31, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista31.listar();
                            break;
                        case 32:
                            Lista32 = new ListaSimple();
                            tabla.InsertarNodoH(Lista32, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista32.listar();
                            break;
                        case 33:
                            Lista33 = new ListaSimple();
                            tabla.InsertarNodoH(Lista33, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista33.listar();
                            break;
                        case 34:
                            Lista34 = new ListaSimple();
                            tabla.InsertarNodoH(Lista34, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista34.listar();
                            break;
                        case 35:
                            Lista35 = new ListaSimple();
                            tabla.InsertarNodoH(Lista35, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista35.listar();
                            break;
                        case 36:
                            Lista36 = new ListaSimple();
                            tabla.InsertarNodoH(Lista36, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista36.listar();
                            break;
                        case 37:
                            Lista37 = new ListaSimple();
                            tabla.InsertarNodoH(Lista37, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista37.listar();
                            break;
                        case 38:
                            Lista38 = new ListaSimple();
                            tabla.InsertarNodoH(Lista38, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista38.listar();
                            break;
                        case 39:
                            Lista39 = new ListaSimple();
                            tabla.InsertarNodoH(Lista39, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista39.listar();
                            break;
                        case 40:
                            Lista40 = new ListaSimple();
                            tabla.InsertarNodoH(Lista40, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista40.listar();
                            break;
                        case 41:
                            Lista41 = new ListaSimple();
                            tabla.InsertarNodoH(Lista41, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista41.listar();
                            break;
                        case 42:
                            Lista42 = new ListaSimple();
                            tabla.InsertarNodoH(Lista42, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista42.listar();
                            break;
                        case 43:
                            Lista43 = new ListaSimple();
                            tabla.InsertarNodoH(Lista43, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista43.listar();
                            break;
                        case 44:
                            Lista44 = new ListaSimple();
                            tabla.InsertarNodoH(Lista44, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista44.listar();
                            break;
                        case 45:
                            Lista45 = new ListaSimple();
                            tabla.InsertarNodoH(Lista45, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista45.listar();
                            break;
                            
                    }

                    
                    carnetArrayHash[i]=IDLlave;//Llenando el array
//                    System.out.println(carnetArrayHash[i]);
                    
                }//fin del if comparador de posicion ocupada o vacia
            }//fin del if de posicion
            
        }//fin del for
        
    }
    
    //***** METODO PARA MODIFICAR LOS USUARIOS *****
    public void modificandoHashLista(int IDLlave2){
        int i,j=0;
        for(i=0; i<=45; i++){
            if(IDLlave2==i){//SI LA LLAVE GENERADA ES IGUAL A LA POSICION
                if(carnetArrayHash[i]==IDLlave2){//VERIFICA SI ESA POSICION ESTA OCUPADA
                    switch(IDLlave2){
                        case 1:
                            tabla.ModificarNodoH(Lista1, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista1.listar();
                            break;
                        case 2:
                            tabla.ModificarNodoH(Lista2, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista2.listar();
                            break;
                        case 3:
                            tabla.ModificarNodoH(Lista3, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista3.listar();
                            break;
                        case 4:
                            tabla.ModificarNodoH(Lista4, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista4.listar();
                            break;
                        case 5:
                            tabla.ModificarNodoH(Lista5, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista5.listar();
                            break;
                        case 6:
                            tabla.ModificarNodoH(Lista6, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista6.listar();
                            break;
                        case 7:
                            tabla.ModificarNodoH(Lista7, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista7.listar();
                            break;
                        case 8:
                            tabla.ModificarNodoH(Lista8, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista8.listar();
                            break;
                        case 9:
                            tabla.ModificarNodoH(Lista9, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista9.listar();
                            break;
                        case 10:
                            tabla.ModificarNodoH(Lista10, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista10.listar();
                            break;
                        case 11:
                            tabla.ModificarNodoH(Lista11, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista11.listar();
                            break;
                        case 12:
                            tabla.ModificarNodoH(Lista12, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista12.listar();
                            break;
                        case 13:
                            tabla.ModificarNodoH(Lista13, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista13.listar();
                            break;
                        case 14:
                            tabla.ModificarNodoH(Lista14, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista14.listar();
                            break;
                        case 15:
                            tabla.ModificarNodoH(Lista15, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista15.listar();
                            break;
                        case 16:
                            tabla.ModificarNodoH(Lista16, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista16.listar();
                            break;
                        case 17:
                            tabla.ModificarNodoH(Lista17, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista17.listar();
                            break;
                        case 18:
                            tabla.ModificarNodoH(Lista18, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista18.listar();
                            break;
                        case 19:
                            tabla.ModificarNodoH(Lista19, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista9.listar();
                            break;
                        case 20:
                            tabla.ModificarNodoH(Lista20, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista20.listar();
                            break;
                        case 21:
                            tabla.ModificarNodoH(Lista21, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista21.listar();
                            break;
                        case 22:
                            tabla.ModificarNodoH(Lista22, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista22.listar();
                            break;
                        case 23:
                            tabla.ModificarNodoH(Lista23, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista23.listar();
                            break;
                        case 24:
                            tabla.ModificarNodoH(Lista24, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista24.listar();
                            break;
                        case 25:
                            tabla.ModificarNodoH(Lista25, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista25.listar();
                            break;
                        case 26:
                            tabla.ModificarNodoH(Lista26, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista26.listar();
                            break;
                        case 27:
                            tabla.ModificarNodoH(Lista27, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista27.listar();
                            break;
                        case 28:
                            tabla.ModificarNodoH(Lista28, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista28.listar();
                            break;
                        case 29:
                            tabla.ModificarNodoH(Lista29, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista29.listar();
                            break;
                        case 30:
                            tabla.ModificarNodoH(Lista30, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista30.listar();
                            break;
                        case 31:
                            tabla.ModificarNodoH(Lista31, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista31.listar();
                            break;
                        case 32:
                            tabla.ModificarNodoH(Lista32, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista32.listar();
                            break;
                        case 33:
                            tabla.ModificarNodoH(Lista33, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista33.listar();
                            break;
                        case 34:
                            tabla.ModificarNodoH(Lista34, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista34.listar();
                            break;
                        case 35:
                            tabla.ModificarNodoH(Lista35, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista35.listar();
                            break;
                        case 36:
                            tabla.ModificarNodoH(Lista36, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista36.listar();
                            break;
                        case 37:
                            tabla.ModificarNodoH(Lista37, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista37.listar();
                            break;
                        case 38:
                            tabla.ModificarNodoH(Lista38, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista38.listar();
                            break;
                        case 39:
                            tabla.ModificarNodoH(Lista39, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista39.listar();
                            break;
                        case 40:
                            tabla.ModificarNodoH(Lista40, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista40.listar();
                            break;
                        case 41:
                            tabla.ModificarNodoH(Lista41, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista41.listar();
                            break;
                        case 42:
                            tabla.ModificarNodoH(Lista42, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista42.listar();
                            break;
                        case 43:
                            tabla.ModificarNodoH(Lista43, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista43.listar();
                            break;
                        case 44:
                            tabla.ModificarNodoH(Lista44, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista44.listar();
                            break;
                        case 45:
                            tabla.ModificarNodoH(Lista45, carnet, nombre, apellido, carrera, getMD5(password));
                            Lista45.listar();
                            break;
                            
                    }
                }
            }
        }
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCredenciales;
    private javax.swing.JLabel lblCrearUsuario;
    private javax.swing.JLabel lblCredenciales;
    private javax.swing.JLabel lblEditarUsuario;
    private javax.swing.JLabel lblEliminarUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCarnet2;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword2;
    // End of variables declaration//GEN-END:variables
}
