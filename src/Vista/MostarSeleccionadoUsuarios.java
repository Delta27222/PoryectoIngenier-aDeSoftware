package Vista;

import Controller.UsuarioControladora;
import javax.swing.JFrame;
import modelo.Usuario;
import org.json.simple.JSONArray;

public class MostarSeleccionadoUsuarios extends javax.swing.JFrame {

    UsuarioControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    JFrame atras; 
    
    public MostarSeleccionadoUsuarios() {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

    }   
    
    
    public MostarSeleccionadoUsuarios(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
    }  
    
        public MostarSeleccionadoUsuarios(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas, Usuario usuario, JFrame atras) {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;


        this.atras = atras; 
        
        //LLENAMOS CON LOS DATOS DEL USUARIO
        //USUARIO
        userName1.setText(usuario.getUserName());
        cedula1.setText(String.valueOf(usuario.getCedula()));
        nombre1.setText(usuario.getNombre());
        apellidos1.setText(usuario.getApellido());
        fecha1.setText(usuario.getFechaDeNacimiento());
        tipo1.setText(usuario.getTipoDeCuenta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo1 = new javax.swing.JLabel();
        apellido2 = new javax.swing.JLabel();
        idVentas = new javax.swing.JLabel();
        btnCVentas = new javax.swing.JButton();
        cedula1 = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        userName1 = new javax.swing.JLabel();
        montoVenta = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        apellido1 = new javax.swing.JLabel();
        apellidos1 = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tipo1.setForeground(new java.awt.Color(255, 255, 255));
        tipo1.setText("tipo:");
        getContentPane().add(tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 170, 40));

        apellido2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellido2.setForeground(new java.awt.Color(255, 255, 255));
        apellido2.setText("Tipo de Cuenta:");
        getContentPane().add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 150, 40));

        idVentas.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        idVentas.setForeground(new java.awt.Color(255, 255, 255));
        idVentas.setText("Usuario selecionado:");
        getContentPane().add(idVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 300, 60));

        btnCVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnCVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnCVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioPequeno.png"))); // NOI18N
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
        getContentPane().add(btnCVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 120));

        cedula1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("cedula");
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 160, 40));

        cedula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Cedula: ");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 150, 40));

        userName1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userName1.setForeground(new java.awt.Color(255, 255, 255));
        userName1.setText("user");
        getContentPane().add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, 40));

        montoVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        montoVenta.setForeground(new java.awt.Color(255, 255, 255));
        montoVenta.setText("UserName (usua):");
        getContentPane().add(montoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, 40));

        nombre1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setText("Nombre");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 200, 40));

        nombres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombres.setForeground(new java.awt.Color(255, 255, 255));
        nombres.setText("Nombres:");
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, 40));

        fecha1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fecha1.setForeground(new java.awt.Color(255, 255, 255));
        fecha1.setText("Fecha Nac: ");
        getContentPane().add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 180, 40));

        apellido1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellido1.setForeground(new java.awt.Color(255, 255, 255));
        apellido1.setText("Fecha de Nac:");
        getContentPane().add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 120, 40));

        apellidos1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidos1.setForeground(new java.awt.Color(255, 255, 255));
        apellidos1.setText("apellido");
        getContentPane().add(apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, 40));

        apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setText("Apellidos:");
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 40));

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
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 140, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCVentasActionPerformed

    }//GEN-LAST:event_btnCVentasActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        this.atras.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(MostarSeleccionadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostarSeleccionadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostarSeleccionadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostarSeleccionadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostarSeleccionadoUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel apellido2;
    private javax.swing.JLabel apellidos1;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCVentas;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel idVentas;
    private javax.swing.JLabel montoVenta;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel tipo1;
    private javax.swing.JLabel userName1;
    // End of variables declaration//GEN-END:variables
}
