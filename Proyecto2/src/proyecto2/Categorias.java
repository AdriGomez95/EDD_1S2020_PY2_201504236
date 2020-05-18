
package proyecto2;

import javax.swing.JOptionPane;
import static proyecto2.MenuPrincipal.ArbolCategorias;
import static proyecto2.MenuPrincipal.raizAvl;
import static proyecto2.MenuPrincipal.carnetActual;
import static socket.Puerto.listaAcciones;
import Bibliotecam.Categoria;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static proyecto2.Biblioteca.arrayMisCategorias;
import static proyecto2.MenuPrincipal.arrayCategoriasGeneral;
/**
 *
 * @author Adriana Gómez
 */
public class Categorias extends javax.swing.JFrame {
    
    public Categorias() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreAgregar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCarnetAgregar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEliminar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExcusa = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCategorias = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCategoriasBiblioteca = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombreAgregar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel5.setText("Carnet");

        txtCarnetAgregar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtCarnetAgregar))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCarnetAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 84, 212, 135));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel3.setText("Nombre");

        txtNombreEliminar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        txtExcusa.setColumns(20);
        txtExcusa.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtExcusa.setRows(5);
        jScrollPane1.setViewportView(txtExcusa);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel4.setText("Razon por la que se eliminará:");

        btnEliminar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(txtNombreEliminar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 237, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        txtCategorias.setEditable(false);
        txtCategorias.setColumns(20);
        txtCategorias.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtCategorias.setRows(5);
        jScrollPane2.setViewportView(txtCategorias);

        jButton3.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton3.setText("ver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 84, -1, 355));

        btnRegresar.setBackground(new java.awt.Color(255, 204, 255));
        btnRegresar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias de biblioteca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N

        txtCategoriasBiblioteca.setEditable(false);
        txtCategoriasBiblioteca.setColumns(20);
        txtCategoriasBiblioteca.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtCategoriasBiblioteca.setRows(5);
        jScrollPane3.setViewportView(txtCategoriasBiblioteca);

        jButton4.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton4.setText("ver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(82, 82, 82))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 84, 240, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\X\\Desktop\\EDD\\EDD_1S2020_PY2_201504236\\Proyecto2\\categoria.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 130, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        Biblioteca biblio = new Biblioteca();
        biblio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(txtNombreEliminar.getText().isEmpty()||txtExcusa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene los campos");
        }else{
            Categoria nueva = new Categoria ();
            nueva.setNombre(txtNombreEliminar.getText());
            
            JSONObject obj10 = new JSONObject();
            obj10.put("Nombre", txtNombreEliminar.getText());
            JSONArray list5 = new JSONArray();
            list5.add(obj10);
            JSONObject obj11 = new JSONObject();
            obj11.put("ELIMINAR_CATEGORIA", list5);
            listaAcciones.add(obj11);
            
            
            for(int l=0; l<=1000; l++){
                if(arrayCategoriasGeneral[l]!=null){
                    if(txtNombreEliminar.getText().equals(arrayCategoriasGeneral[l])){
                        arrayCategoriasGeneral[l]="";
                        raizAvl = ArbolCategorias.deleteNode(raizAvl, nueva);
                        
//                        ArbolCategorias.Graficar(raizAvl);
                        break;
                    }
                }else{
                    break;
                }
            }
            
            for(int l=0; l<=100; l++){
                if(arrayMisCategorias[l]!=null){
                    if(txtNombreEliminar.getText().equals(arrayMisCategorias[l])){
                        arrayMisCategorias[l]="";

                        JOptionPane.showMessageDialog(null, "Eliminado exitosamente \n"); 
                        txtCategorias.setText("");
                        txtNombreEliminar.setText("");
                        txtExcusa.setText("");

                        break;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No existe esa categoria en tu lista \n");
                    break;
                }
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(txtNombreAgregar.getText().isEmpty()||txtCarnetAgregar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene los campos");
        }else{
            
            Categoria ct = new Categoria ();
            ct.setNombre(txtNombreAgregar.getText());  
            
            int i,ii;
            for(i=0; i<=100; i++){
                if(arrayMisCategorias[i] == null ? txtNombreAgregar.getText() == null : arrayMisCategorias[i].equals(txtNombreAgregar.getText())){
                    JOptionPane.showMessageDialog(null, "Categoria ya existente \n");
                    break;
                }else{
                    if(arrayMisCategorias[i]==null){
                        arrayMisCategorias[i]=txtNombreAgregar.getText();
                        JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                        break;
                    }
                }
            }
            for(ii=0; ii<=1000; ii++){
                if(arrayCategoriasGeneral[ii] == null ? txtNombreAgregar.getText() == null : arrayCategoriasGeneral[ii].equals(txtNombreAgregar.getText())){
//                    JOptionPane.showMessageDialog(null, "Categoria ya existente \n");
                    break;
                }else{
                    if(arrayCategoriasGeneral[ii]==null){
                        arrayCategoriasGeneral[ii]=txtNombreAgregar.getText();
//                        JOptionPane.showMessageDialog(null, "Agregado exitosamente \n"); 
                        break;
                    }
                }
            }
            
//            if(arrayMisCategorias[i]==null){
//                arrayMisCategorias[i]=txtNombreAgregar.getText();
//                i++;
//            }else{
//                i++;
//                arrayMisCategorias[i]=txtNombreAgregar.getText();
//            }
             
//            if(arrayCategoriasGeneral[i]==null){
//                arrayCategoriasGeneral[ii]=txtNombreAgregar.getText();
//                ii++;
//            }else{
//                ii++;
//                arrayCategoriasGeneral[ii]=txtNombreAgregar.getText();
//            }
            
            
            ct.setCarnet(Integer.parseInt(txtCarnetAgregar.getText()));  
            raizAvl = ArbolCategorias.insert(raizAvl, ct);
            ArbolCategorias.Graficar(raizAvl);
            
        }
        
        txtNombreAgregar.setText(null);
        txtCarnetAgregar.setText(null);

        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
            int j=0,z=1;
            String respuesta="";
            
            while(arrayMisCategorias[j]!=null){
                respuesta=respuesta+arrayMisCategorias[j]+"\n";
               
                j++;
                z++;
                
            }
            txtCategorias.setText(respuesta);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int j=0;
            String respuesta="";
            
            while(arrayMisCategorias[j]!=null){
                respuesta=respuesta+arrayCategoriasGeneral[j]+"\n";
               
                j++;
            }
            txtCategoriasBiblioteca.setText(respuesta);
            
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCarnetAgregar;
    private javax.swing.JTextArea txtCategorias;
    private javax.swing.JTextArea txtCategoriasBiblioteca;
    private javax.swing.JTextArea txtExcusa;
    private javax.swing.JTextField txtNombreAgregar;
    private javax.swing.JTextField txtNombreEliminar;
    // End of variables declaration//GEN-END:variables
}
