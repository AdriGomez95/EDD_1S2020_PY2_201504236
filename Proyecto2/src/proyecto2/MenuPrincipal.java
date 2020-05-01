
package proyecto2;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriana Gómez
 */
public class MenuPrincipal extends javax.swing.JFrame {
    TablaDispersa tabla = new TablaDispersa(45);
    public static int[] carnetArrayHash = new int[45];//Para guardarlo y verificar los 45 espacios de la hash
    ListaSimple Lista1 = null;
    ListaSimple Lista2 = null;
    ListaSimple Lista3 = null;
    ListaSimple Lista4 = null;
    ListaSimple Lista5 = null;
    ListaSimple Lista6 = null;
    ListaSimple Lista7 = null;
    ListaSimple Lista8 = null;
    ListaSimple Lista9 = null;
    ListaSimple Lista10 = null;
    ListaSimple Lista11 = null;
    ListaSimple Lista12 = null;
    ListaSimple Lista13 = null;
    ListaSimple Lista14 = null;
    ListaSimple Lista15 = null;
    ListaSimple Lista16 = null;
    ListaSimple Lista17 = null;
    ListaSimple Lista18 = null;
    ListaSimple Lista19 = null;
    ListaSimple Lista20 = null;
    ListaSimple Lista21 = null;
    ListaSimple Lista22 = null;
    ListaSimple Lista23 = null;
    ListaSimple Lista24 = null;
    ListaSimple Lista25 = null;
    ListaSimple Lista26 = null;
    ListaSimple Lista27 = null;
    ListaSimple Lista28 = null;
    ListaSimple Lista29 = null;
    ListaSimple Lista30 = null;
    ListaSimple Lista31 = null;
    ListaSimple Lista32 = null;
    ListaSimple Lista33 = null;
    ListaSimple Lista34 = null;
    ListaSimple Lista35 = null;
    ListaSimple Lista36 = null;
    ListaSimple Lista37 = null;
    ListaSimple Lista38 = null;
    ListaSimple Lista39 = null;
    ListaSimple Lista40 = null;
    ListaSimple Lista41 = null;
    ListaSimple Lista42 = null;
    ListaSimple Lista43 = null;
    ListaSimple Lista44 = null;
    ListaSimple Lista45 = null;
    
    public static String nombre, apellido, carrera, password;
    public static int carnet;

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        btnCrearUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setText("Carga \nmasiva");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jButton4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton4.setText("Configuracion IP");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jButton6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton6.setText("Reportes");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

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

        btnCrearUsuario.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnCrearUsuario.setText("Crear");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
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
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtCarnet)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnCrearUsuario)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCarnet.getAccessibleContext().setAccessibleName("");
        txtNombre.getAccessibleContext().setAccessibleName("");
        txtApellido.getAccessibleContext().setAccessibleName("");
        txtCarrera.getAccessibleContext().setAccessibleName("");
        txtPassword.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 230, 230));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("Accion sobre usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("Crear usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, -1));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 220, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        // TODO add your handling code here:
        carnet = Integer.parseInt(txtCarnet.getText());
        nombre = txtNombre.getText();
        carrera = txtCarrera.getText();
        apellido = txtApellido.getText();
        password = txtPassword.getText();
        
        //palabrita="12345";
        getMD5(password); //El password le pasamos en texto plano
        //Ahora voy a imprimir
        //System.out.print(getMD5(password));
        //Esto nos mostraría lo siguiente
        //827ccb0eea8a706c4c34a16891f84e7b
        
        int IDLlave = (carnet) % 45;
        insertandoHashLista(IDLlave);
        
        
            
            tabla.GraficarTabla();
        
        
        
        
//        JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
//        txtCarnet.setText(null);
//        txtNombre.setText(null);
//        txtApellido.setText(null);
//        txtCarrera.setText(null);
//        txtPassword.setText(null);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        InicioSesion iniciarSesion = new InicioSesion();
        iniciarSesion.setVisible(true);
        this.setVisible(false);
        
        
//        Biblioteca menuBiblioteca = new Biblioteca();
//        menuBiblioteca.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        InicioSesion iniciarSesion = new InicioSesion();
        iniciarSesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        // TODO add your handling code here:
        EditarUsuario editarUsuario = new EditarUsuario();
        editarUsuario.setVisible(true);
        this.setVisible(false);
        
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
                    System.out.println(carnetArrayHash[i]+", ");
                    
                    
                    
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

                    
                    carnetArrayHash[i]=IDLlave;
                    System.out.println(carnetArrayHash[i]);
                    
                }//fin del if comparador de posicion ocupada o vacia
            }//fin del if de posicion
            
        }//fin del for
        
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
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
