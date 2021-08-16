package Vista;

import Vista.BG2ModificarCliente;
import Vista.E0GestionarVenta;
import controller.Controladora;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;




public class MostarSeleccionadoClientes extends javax.swing.JFrame {

    Controladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    JFrame atras;
    
    public MostarSeleccionadoClientes() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
    
    public MostarSeleccionadoClientes(DefaultTableModel DefaultTableModel, int selectedRowIndex, JFrame atras) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png"); 
        /*txtCedula.setText(DefaultTableModel.getValueAt(selectedRowIndex, 0).toString());
        txtNombres.setText(DefaultTableModel.getValueAt(selectedRowIndex, 1).toString());
        txtApellidos.setText(DefaultTableModel.getValueAt(selectedRowIndex, 2).toString());
        txtFechaNacimiento.setText(DefaultTableModel.getValueAt(selectedRowIndex, 3).toString());*/
        jCedula1.setText(DefaultTableModel.getValueAt(selectedRowIndex, 0).toString());
        jNombre1.setText(DefaultTableModel.getValueAt(selectedRowIndex, 1).toString());
        jApellido1.setText(DefaultTableModel.getValueAt(selectedRowIndex, 2).toString());
        jFechaNacimiento1.setText(DefaultTableModel.getValueAt(selectedRowIndex, 3).toString());
        this.atras = atras;
    }
    
    /*public MostarSeleccionadoClientes(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
                this.jsonVentas = jsonVentas;
                String fecha = "06-12-2021"; 
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                try { 
                   Date fechaDate = dFormat.parse(fecha);
                    jdFechaNac.setDate(fechaDate);
                } catch (ParseException ex) {
                    Logger.getLogger(BG2ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }         
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fechaNac = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnGClientes = new javax.swing.JButton();
        jCedula1 = new javax.swing.JLabel();
        jNombre1 = new javax.swing.JLabel();
        jApellido1 = new javax.swing.JLabel();
        jFechaNacimiento1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        cedula1 = new javax.swing.JLabel();
        cedula2 = new javax.swing.JLabel();
        cedula3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Detalles del cliente");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 290, 50));

        cedula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Cédula:");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, 40));

        nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombres:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 100, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 100, 50));

        fechaNac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechaNac.setForeground(new java.awt.Color(255, 255, 255));
        fechaNac.setText("Fecha Nac: ");
        getContentPane().add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 110, 50));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha48px.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha72px.png"))); // NOI18N
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha72px.png"))); // NOI18N
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 140, 130));

        btnGClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnGClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnGClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClientePequeno.png"))); // NOI18N
        btnGClientes.setBorderPainted(false);
        btnGClientes.setContentAreaFilled(false);
        btnGClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGClientes.setFocusPainted(false);
        btnGClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClienteGrande.png"))); // NOI18N
        btnGClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClienteGrande.png"))); // NOI18N
        btnGClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 150));

        jCedula1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCedula1.setForeground(new java.awt.Color(255, 255, 255));
        jCedula1.setText("Cedula");
        getContentPane().add(jCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 100, 60));

        jNombre1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jNombre1.setText("Nombres");
        getContentPane().add(jNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 60));

        jApellido1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jApellido1.setForeground(new java.awt.Color(255, 255, 255));
        jApellido1.setText("Apellidos");
        getContentPane().add(jApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 130, 70));

        jFechaNacimiento1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jFechaNacimiento1.setForeground(new java.awt.Color(255, 255, 255));
        jFechaNacimiento1.setText("Fecha de nacimiento");
        getContentPane().add(jFechaNacimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 190, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 780));

        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("Cédula:");
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 10));

        cedula2.setForeground(new java.awt.Color(255, 255, 255));
        cedula2.setText("Cédula:");
        getContentPane().add(cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 10));

        cedula3.setForeground(new java.awt.Color(255, 255, 255));
        cedula3.setText("Cédula:");
        getContentPane().add(cedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        this.atras.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGClientesActionPerformed
        /*B0GestionarCliente adelante = new B0GestionarCliente(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnGClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MostarSeleccionadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostarSeleccionadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostarSeleccionadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostarSeleccionadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MostarSeleccionadoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGClientes;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel cedula2;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jApellido1;
    private javax.swing.JLabel jCedula1;
    private javax.swing.JLabel jFechaNacimiento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
