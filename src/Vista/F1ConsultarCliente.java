
package Vista;

import Controller.ClienteControladora;
import Vista.D0GestionarUsuario;
import Vista.DG1AgregarUsuario;
import Vista.DG3EliminarUsuario;
import Vista.F0Consultas;
import Vista.MostarSeleccionadoClientes;
import Vista.MostarSeleccionadoClientes;
import controller.Controladora;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;

/**
 *
 * @author user
 */
public class F1ConsultarCliente extends javax.swing.JFrame {

    ClienteControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    DefaultTableModel model = new DefaultTableModel();
    String caracteristica;
    public F1ConsultarCliente() {
        initComponents();
        control = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        //jPanel2.setVisible(false);
    }   
    
    
    public F1ConsultarCliente(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        //jPanel2.setVisible(false);
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
        this.model = control.llenarTablaPrincipal(jsonClientes);
        jTable1.setModel(this.model);
    }   
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        txtValorCaracteristica = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnGUsuarios2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir2 = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        btnMostrarTodosClientes = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaPequena.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaGrand.png"))); // NOI18N
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaGrand.png"))); // NOI18N
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 110));

        txtValorCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorCaracteristicaActionPerformed(evt);
            }
        });
        txtValorCaracteristica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorCaracteristicaKeyTyped(evt);
            }
        });
        getContentPane().add(txtValorCaracteristica, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 30));

        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Ingrese valor:");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombre", "Apellido", "Fecha de nacimiento" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 182, -1, -1));

        btnGUsuarios2.setBackground(new java.awt.Color(153, 153, 153));
        btnGUsuarios2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGUsuarios2.setForeground(new java.awt.Color(255, 255, 255));
        btnGUsuarios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarPequeno.png"))); // NOI18N
        btnGUsuarios2.setText("             Consultas");
        btnGUsuarios2.setToolTipText("");
        btnGUsuarios2.setBorderPainted(false);
        btnGUsuarios2.setContentAreaFilled(false);
        btnGUsuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGUsuarios2.setFocusPainted(false);
        btnGUsuarios2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGUsuarios2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarGrande.png"))); // NOI18N
        btnGUsuarios2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarGrande.png"))); // NOI18N
        btnGUsuarios2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGUsuarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUsuarios2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 50, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Fecha de nacimiento"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 630, 140));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 80));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Consultar Clientes: ");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 430, 100));

        btnMostrarTodosClientes.setText("Mostrar todos los clientes");
        btnMostrarTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarTodosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        fondo2.setForeground(new java.awt.Color(255, 255, 255));
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        /*D0GestionarUsuario atras = new D0GestionarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();*/
        F0Consultas atras = new F0Consultas(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtValorCaracteristicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCaracteristicaKeyTyped
        /*if (txtValorCaracteristica.getText().length()>=8){
            evt.consume();
            getToolkit().beep();

            JOptionPane.showMessageDialog(null,"El UserName solo tiene un maximo de 8 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_txtValorCaracteristicaKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Obtener el valor elegido por el comboBox
        //this.caracteristica = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnGUsuarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUsuarios2ActionPerformed
        this.caracteristica = jComboBox1.getSelectedItem().toString();
        this.model = control.llenarTablaConsultarCliente(jsonClientes, caracteristica, txtValorCaracteristica.getText());
        jTable1.setModel(this.model);
        
    }//GEN-LAST:event_btnGUsuarios2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel DefaultTableModel = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        MostarSeleccionadoClientes adelante = new MostarSeleccionadoClientes(DefaultTableModel, selectedRowIndex, this);
        adelante.setVisible(true);
        this.dispose();
        //int selectedRowIndex = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void txtValorCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorCaracteristicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorCaracteristicaActionPerformed

    private void btnMostrarTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosClientesActionPerformed
        // TODO add your handling code here:
        this.model = control.llenarTablaPrincipal(jsonClientes);
        jTable1.setModel(this.model);
    }//GEN-LAST:event_btnMostrarTodosClientesActionPerformed

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
            java.util.logging.Logger.getLogger(F1ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F1ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F1ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F1ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F1ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnGUsuarios2;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMostrarTodosClientes;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel fondo2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtValorCaracteristica;
    // End of variables declaration//GEN-END:variables
}
