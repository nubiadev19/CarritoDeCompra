/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JOptionPane;
import listaSimple.ListaUsuario;
import listaSimple.Nodo;
import modelo.Usuario;
import util.UsuarioAutenticado;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import modelo.UsuarioFileManager;
import vistaAdmin.PaginaPrincipal;
import vistaCliente.PaginaPrincipalCC;

/**
 *
 * @author LENOVO 14ALC6
 */
public class Login extends javax.swing.JFrame {
 Usuario usuario;
    ListaUsuario lista = new ListaUsuario();
    UsuarioFileManager file = new UsuarioFileManager();
   // UsuarioFileManager file;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        usuario= new Usuario();

        this.setTitle("Inciar sesion");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(197, 22, 244));

        Usuario administrador = new Usuario(1088, "Nubia", "nubia@gmail.com", "123456", "Administrador", "Activo");
        Usuario administrador2 = new Usuario(2098, "Juan", "juan@gmail.com", "123456", "Administrador", "Activo");
        Usuario cliente = new Usuario(1909, "mara ", "mara@gmail.com", "123456", "Cliente", "Activo");
        Usuario cliente2 = new Usuario(2344, "Camila", "Camila@gmail.com", "2", "Cliente", "Activo");

        lista.setAddInicio(cliente);
        lista.setAddInicio(cliente2);
        lista.setAddInicio(administrador);
        lista.setAddInicio(administrador2);

        SetImageLabel(JDog1, "src/Imagenes/huellita perro 1.png");
        SetImageLabel(JDog2, "src/Imagenes/huellita perro 2.png");

        SetImageLabel(JCat1, "src/Imagenes/huellita gato 1.png");
        SetImageLabel(JCat2, "src/Imagenes/huellita gato 2.png");

        SetImageLabel(Jpunto1, "src/Imagenes/punto 2.png");
        SetImageLabel(Jpunto2, "src/Imagenes/punto 4.png");
        SetImageLabel(Jpunto1, "src/Imagenes/punto 2.png");
        SetImageLabel(Jpunto2, "src/Imagenes/punto.png");
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icono = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icono);
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JDog2 = new javax.swing.JLabel();
        JDog1 = new javax.swing.JLabel();
        JCat1 = new javax.swing.JLabel();
        Jpunto3 = new javax.swing.JLabel();
        Jpunto2 = new javax.swing.JLabel();
        Jpunto4 = new javax.swing.JLabel();
        Jpunto1 = new javax.swing.JLabel();
        JCat2 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(197, 222, 244));
        setPreferredSize(new java.awt.Dimension(1240, 500));
        setSize(new java.awt.Dimension(1240, 500));

        jPanel1.setBackground(new java.awt.Color(197, 222, 244));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(197, 222, 244));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtClave.setBackground(new java.awt.Color(197, 222, 244));
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Iniciar Sesion");

        btnAcceder.setBackground(new java.awt.Color(255, 232, 163));
        btnAcceder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(68, 16, 16));
        btnAcceder.setText("Iniciar sesion");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("No tienes una cuenta?,");

        btnRegistro.setBackground(new java.awt.Color(255, 172, 41));
        btnRegistro.setForeground(new java.awt.Color(68, 16, 16));
        btnRegistro.setText("Crear Cuenta");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(69, 69, 69)))
                    .addComponent(jLabel3)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnAcceder)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcceder)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        JDog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huellita perro 2.png"))); // NOI18N

        JDog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huellita perro 1.png"))); // NOI18N

        JCat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huellita gato 1.png"))); // NOI18N

        Jpunto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N

        Jpunto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto 4.png"))); // NOI18N

        Jpunto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto 2.png"))); // NOI18N

        Jpunto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto 2.png"))); // NOI18N

        JCat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huellita gato 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Jpunto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCat2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JCat1)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Jpunto2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDog2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDog1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jpunto1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Jpunto4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Jpunto1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JDog1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Jpunto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDog2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JCat1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jpunto3)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JCat2)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Jpunto4)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        String email = txtEmail.getText();
       
        String clave = new String(txtClave.getPassword());
        UsuarioFileManager.saveUser(usuario);

        if (email.length() > 0 && clave.length() > 0) {
            Nodo usuario = lista.getBuscarPorEmail(email);
            

            if (usuario == null || !usuario.getUsuario().getClave().equals(clave)) {
                JOptionPane.showMessageDialog(this, "Email o clave inválido", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Autenticar y abrir la ventana correspondiente
                if (usuario.getUsuario().getRol().equals("Administrador")) {
                    JOptionPane.showMessageDialog(this, "Has iniciado sesión como administrador");
                    PaginaPrincipal frmPaginaPrincipal = new PaginaPrincipal();
                    this.setVisible(false);
                    frmPaginaPrincipal.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Has iniciado sesión como Cliente");
                    PaginaPrincipalCC frmPaginaPrincipalCC = new PaginaPrincipalCC();
                    this.setVisible(false);
                    frmPaginaPrincipalCC.setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos email y clave son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
        //validar el acceso de usuario
        /*  String email = txtEmail.getText();
        String clave = txtClave.getText();
        
        if(email.length()>0 && clave.length()>0){
            Usuario user = new Usuario(email, clave);
            
            Nodo usuario =  lista.getBuscarPorEmail(email);
            if(usuario==null){
                  JOptionPane.showMessageDialog(this, "Email o clave invalido","Error", JOptionPane.ERROR_MESSAGE);
            }else{
                 UsuarioAutenticado.email = usuario.getUsuario().getEmail();
                 UsuarioAutenticado.identificacion = usuario.getUsuario().getIdentificacion();
                 UsuarioAutenticado.rol = usuario.getUsuario().getRol();
                 UsuarioAutenticado.nombreUsuario = usuario.getUsuario().getNombreUsuario();
                 
                //crear una instancia de la vista de acuerdo al rol
                if(usuario.getUsuario().getRol().equals("Administrador")){
                    //llamar a la vista administrador
                    JOptionPane.showMessageDialog(this, "Has iniciado sesion como administrador");
                    
                   PaginaPrincipal frmPaginaPrincipal = new PaginaPrincipal();
                   this.setVisible(false);
                   frmPaginaPrincipal.setVisible(true);
                }else{
                    //lamar a la vista cliente
                    
                    JOptionPane.showMessageDialog(this, "Has iniciado sesion como Cliente");
                   
                   PaginaPrincipalCC frmPaginaPrincipalCC = new PaginaPrincipalCC();
                   this.setVisible(false);
                   frmPaginaPrincipalCC.setVisible(true);
                    
                }
            }
          
            
        }else{
            JOptionPane.showMessageDialog(this, "Los campos email y clave son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }*/

    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        Registro frmRegistro = new Registro();
        this.setVisible(false);
        frmRegistro.setVisible(true);

    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCat1;
    private javax.swing.JLabel JCat2;
    private javax.swing.JLabel JDog1;
    private javax.swing.JLabel JDog2;
    private javax.swing.JLabel Jpunto1;
    private javax.swing.JLabel Jpunto2;
    private javax.swing.JLabel Jpunto3;
    private javax.swing.JLabel Jpunto4;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
