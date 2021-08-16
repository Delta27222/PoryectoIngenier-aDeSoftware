package Vista;

import Controller.LoginControladora;
import Controller.UsuarioControladora;
import controller.Controladora;
import java.awt.Dimension;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;
import org.json.simple.JSONArray;

public class AALogin extends javax.swing.JFrame {

    Controladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray(); 
    LoginControladora control1 = new LoginControladora(); 
    UsuarioControladora control2 = new UsuarioControladora();
    
    public AALogin() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");          
    }
    
    public AALogin(JSONArray jsonVehiculos, JSONArray jsonClientes, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos; 
        this.jsonUsuarios = jsonUsuarios; 
        this.jsonVentas = jsonVentas; 

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir2 = new javax.swing.JButton();
        btnACEPTAR = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jMostrar = new javax.swing.JCheckBox();
        userName1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        userName = new javax.swing.JLabel();
        btnCVentas = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir2.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir2.setBorderPainted(false);
        btnSalir2.setContentAreaFilled(false);
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir2.setFocusPainted(false);
        btnSalir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 90, 80));

        btnACEPTAR.setBackground(new java.awt.Color(153, 153, 153));
        btnACEPTAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnACEPTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkGrandore.png"))); // NOI18N
        btnACEPTAR.setBorderPainted(false);
        btnACEPTAR.setContentAreaFilled(false);
        btnACEPTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnACEPTAR.setFocusPainted(false);
        btnACEPTAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnACEPTAR.setName(""); // NOI18N
        btnACEPTAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkpequeno.png"))); // NOI18N
        btnACEPTAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkpequeno.png"))); // NOI18N
        btnACEPTAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACEPTARActionPerformed(evt);
            }
        });
        getContentPane().add(btnACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 90, 80));

        jPasswordField1.setText("27222633");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 240, 40));

        jMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jMostrar.setText("Mostrar");
        jMostrar.setContentAreaFilled(false);
        jMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 80, 30));

        userName1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userName1.setForeground(new java.awt.Color(255, 255, 255));
        userName1.setText("Contraseña:");
        getContentPane().add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, 40));

        txtUserName.setText("DELTA27222");
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 240, 40));

        userName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("UserName:");
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, 40));

        btnCVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnCVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnCVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login1.png"))); // NOI18N
        btnCVentas.setToolTipText("");
        btnCVentas.setBorderPainted(false);
        btnCVentas.setContentAreaFilled(false);
        btnCVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCVentas.setFocusPainted(false);
        btnCVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 120));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Bienvenido a WheelsManagers");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 540, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVentasActionPerformed

    }//GEN-LAST:event_btnCVentasActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        if (txtUserName.getText().length()>=10){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Este campo soloacepta un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void jMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarActionPerformed
        if (jMostrar.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('•');
        }
    }//GEN-LAST:event_jMostrarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
        String contrasena = String.valueOf(jPasswordField1.getPassword());  
        if (!contrasena.equals("") && !txtUserName.getText().equals("")){
            System.out.println("antes de entar"); Boolean hola = control1.comprobarUserName(jsonUsuarios, txtUserName.getText());
            if (hola){
                
                if (control1.comprobarMatch(jsonUsuarios, txtUserName.getText(), contrasena)){
                    AMenu menu = null;  
                    menu = new AMenu(jsonVehiculos, jsonClientes, jsonUsuarios,  jsonVentas, control2.crearUsuarioDelJsonUserName(jsonUsuarios, txtUserName.getText()));
                    menu.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "La contrasena no es valida, intente de nuevo");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No existe el UserName en el sistema , intente de nuevo.");
            }           
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos por favor.");
            btnACEPTAR.setVisible(true);
        }

    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(AALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AALogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnCVentas;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBox jMostrar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userName1;
    // End of variables declaration//GEN-END:variables
}
