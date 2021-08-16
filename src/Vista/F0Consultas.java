package Vista;

import Controller.ClienteControladora;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;

public class F0Consultas extends javax.swing.JFrame {

  ClienteControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();



       public F0Consultas() {
        initComponents();
        control = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

    }   
    
    
    public F0Consultas(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
    }   
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida1 = new javax.swing.JLabel();
        Bienvenida2 = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnGClientes = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnCClientes = new javax.swing.JButton();
        btnCVentas = new javax.swing.JButton();
        btnCVehiculos = new javax.swing.JButton();
        btnCUsuarios = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida1.setText(" que desee realizar. ");
        getContentPane().add(Bienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 250, 90));

        Bienvenida2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida2.setText("Seleccione la pestana del requerimientos ");
        getContentPane().add(Bienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 350, 90));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Consultas: ");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 240, 100));

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
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 140, 130));

        btnGClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnGClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnGClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casitaMini.png"))); // NOI18N
        btnGClientes.setBorderPainted(false);
        btnGClientes.setContentAreaFilled(false);
        btnGClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGClientes.setFocusPainted(false);
        btnGClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 80, 90));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 90, 80));

        btnCClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnCClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnCClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClientePequeno.png"))); // NOI18N
        btnCClientes.setText("Consultar Clientes");
        btnCClientes.setBorderPainted(false);
        btnCClientes.setContentAreaFilled(false);
        btnCClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCClientes.setFocusPainted(false);
        btnCClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClienteGrande.png"))); // NOI18N
        btnCClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClienteGrande.png"))); // NOI18N
        btnCClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 380, 200));

        btnCVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnCVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnCVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasPequena.png"))); // NOI18N
        btnCVentas.setText("     Consultar Ventas");
        btnCVentas.setToolTipText("");
        btnCVentas.setBorderPainted(false);
        btnCVentas.setContentAreaFilled(false);
        btnCVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCVentas.setFocusPainted(false);
        btnCVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasGrandes.png"))); // NOI18N
        btnCVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasGrandes.png"))); // NOI18N
        btnCVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 380, 200));

        btnCVehiculos.setBackground(new java.awt.Color(153, 153, 153));
        btnCVehiculos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btnCVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vehiculoPequeno.png"))); // NOI18N
        btnCVehiculos.setText("     Consultar Vehiculos");
        btnCVehiculos.setToolTipText("");
        btnCVehiculos.setBorderPainted(false);
        btnCVehiculos.setContentAreaFilled(false);
        btnCVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCVehiculos.setFocusPainted(false);
        btnCVehiculos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCVehiculos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VehiculoGrande.png"))); // NOI18N
        btnCVehiculos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VehiculoGrande.png"))); // NOI18N
        btnCVehiculos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVehiculosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 380, 200));

        btnCUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        btnCUsuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnCUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsuarioPequeno.png"))); // NOI18N
        btnCUsuarios.setText("     Consultar Usuarios");
        btnCUsuarios.setToolTipText("");
        btnCUsuarios.setBorderPainted(false);
        btnCUsuarios.setContentAreaFilled(false);
        btnCUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCUsuarios.setFocusPainted(false);
        btnCUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCUsuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsiarioGrande.png"))); // NOI18N
        btnCUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsiarioGrande.png"))); // NOI18N
        btnCUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 380, 200));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        AMenu atras = new AMenu(jsonVehiculos ,jsonClientes, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGClientesActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
         System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnCClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCClientesActionPerformed
        F3ConsultarUsuarios adelante = new F3ConsultarUsuarios(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCClientesActionPerformed

    private void btnCVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVentasActionPerformed
        F4ConsultarVentas adelante = new F4ConsultarVentas(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCVentasActionPerformed

    private void btnCVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVehiculosActionPerformed
        F2ConsultarVehiculos adelante = new F2ConsultarVehiculos(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCVehiculosActionPerformed

    private void btnCUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCUsuariosActionPerformed
        F3ConsultarUsuarios adelante = new F3ConsultarUsuarios(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(F0Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F0Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F0Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F0Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new F0Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Bienvenida1;
    private javax.swing.JLabel Bienvenida2;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCClientes;
    private javax.swing.JButton btnCUsuarios;
    private javax.swing.JButton btnCVehiculos;
    private javax.swing.JButton btnCVentas;
    private javax.swing.JButton btnGClientes;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
