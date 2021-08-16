
package Vista;

import Controller.UsuarioControladora;
import javax.swing.JFrame;
import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Venta;
import org.json.simple.JSONArray;

public class MostrarSeleccionadoVentas extends javax.swing.JFrame {

    UsuarioControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    Cliente clienteVenta;
    Vehiculo vehiculosVenta; 
    Venta venta; 
    JFrame atras; 
    
    public MostrarSeleccionadoVentas() {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

    }   
    
    
    public MostrarSeleccionadoVentas(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
    }  
    
        public MostrarSeleccionadoVentas(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas, Venta venta, Cliente cliente, Vehiculo vehiculo, JFrame atras) {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
        this.venta = venta;
        this.clienteVenta = cliente; 
        this.vehiculosVenta = vehiculo; 
        this.atras = atras; 
        
        //LLENAMOS CON LOS DATOS DE LA VENTA, CLIENTE Y VEHICULO Y TODO
        //VENTA
        idVenta1.setText(venta.getIdVenta());
        montoVenta1.setText(String.valueOf(venta.getMontoVenta()));
        montoAbonado1.setText(String.valueOf(venta.getMontoAbono()));
        userName1.setText(venta.getUserNameVendedor());
        fechaVenta1.setText(venta.getFechaVenta());
        //CLIENTE
        nombre1.setText(cliente.getNombre());
        apellido1.setText(cliente.getApellido());
        cedula1.setText(String.valueOf(cliente.getCedula()));
        fechanacimiento1.setText(cliente.getFechaDeNacimiento());
        //VEHICULO
        placa1.setText(vehiculo.getPlaca());
        marca1.setText(vehiculo.getMarca());
        modelo1.setText(vehiculo.getModelo());
        precio1.setText(String.valueOf(vehiculo.getPrecio()));

    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idVenta1 = new javax.swing.JLabel();
        idVentas = new javax.swing.JLabel();
        vehiculoVenta2 = new javax.swing.JLabel();
        btnCVentas = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        apellido1 = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        cedula1 = new javax.swing.JLabel();
        fechanacimiento = new javax.swing.JLabel();
        fechanacimiento1 = new javax.swing.JLabel();
        montoAbonado1 = new javax.swing.JLabel();
        montoAbonado = new javax.swing.JLabel();
        montoVenta1 = new javax.swing.JLabel();
        montoVenta = new javax.swing.JLabel();
        userName1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        fechaVenta1 = new javax.swing.JLabel();
        fechaVenta = new javax.swing.JLabel();
        vehiculoVenta1 = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        placa1 = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        marca1 = new javax.swing.JLabel();
        modelo1 = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idVenta1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        idVenta1.setForeground(new java.awt.Color(255, 255, 255));
        idVenta1.setText("idVenta");
        getContentPane().add(idVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 140, 60));

        idVentas.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        idVentas.setForeground(new java.awt.Color(255, 255, 255));
        idVentas.setText("ID Venta:");
        getContentPane().add(idVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, 60));

        vehiculoVenta2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        vehiculoVenta2.setForeground(new java.awt.Color(255, 255, 255));
        vehiculoVenta2.setText("Cliente de venta:");
        getContentPane().add(vehiculoVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 200, 60));

        btnCVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnCVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnCVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasPequena.png"))); // NOI18N
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

        nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombres: ");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 90, 40));

        nombre1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setText("Monto venta: ");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, 40));

        Apellidos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        Apellidos.setText("Apellidos:");
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 90, 40));

        apellido1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellido1.setForeground(new java.awt.Color(255, 255, 255));
        apellido1.setText("Monto Abnonado: ");
        getContentPane().add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 160, 40));

        cedula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Cedula:");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 80, 40));

        cedula1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("UserName (vend):");
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 40));

        fechanacimiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechanacimiento.setForeground(new java.awt.Color(255, 255, 255));
        fechanacimiento.setText("Fecha de Nac:");
        getContentPane().add(fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 120, 40));

        fechanacimiento1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechanacimiento1.setForeground(new java.awt.Color(255, 255, 255));
        fechanacimiento1.setText("Fecha Venta: ");
        getContentPane().add(fechanacimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 120, 40));

        montoAbonado1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        montoAbonado1.setForeground(new java.awt.Color(255, 255, 255));
        montoAbonado1.setText("Monto Abnonado: ");
        getContentPane().add(montoAbonado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 40));

        montoAbonado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        montoAbonado.setForeground(new java.awt.Color(255, 255, 255));
        montoAbonado.setText("Monto Abnonado: ");
        getContentPane().add(montoAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 40));

        montoVenta1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        montoVenta1.setForeground(new java.awt.Color(255, 255, 255));
        montoVenta1.setText("Monto venta: ");
        getContentPane().add(montoVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, 40));

        montoVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        montoVenta.setForeground(new java.awt.Color(255, 255, 255));
        montoVenta.setText("Monto venta: ");
        getContentPane().add(montoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 40));

        userName1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userName1.setForeground(new java.awt.Color(255, 255, 255));
        userName1.setText("UserName (vend):");
        getContentPane().add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 40));

        userName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("UserName (vend):");
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 150, 40));

        fechaVenta1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechaVenta1.setForeground(new java.awt.Color(255, 255, 255));
        fechaVenta1.setText("Fecha Venta: ");
        getContentPane().add(fechaVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 120, 40));

        fechaVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechaVenta.setForeground(new java.awt.Color(255, 255, 255));
        fechaVenta.setText("Fecha Venta: ");
        getContentPane().add(fechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 40));

        vehiculoVenta1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        vehiculoVenta1.setForeground(new java.awt.Color(255, 255, 255));
        vehiculoVenta1.setText("Vehiculo de venta:");
        getContentPane().add(vehiculoVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 200, 60));

        placa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Placa:");
        getContentPane().add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 60, 40));

        placa1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        placa1.setForeground(new java.awt.Color(255, 255, 255));
        placa1.setText("Monto venta: ");
        getContentPane().add(placa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 110, 40));

        marca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca:");
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 60, 40));

        marca1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        marca1.setForeground(new java.awt.Color(255, 255, 255));
        marca1.setText("Monto Abnonado: ");
        getContentPane().add(marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 160, 40));

        modelo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        modelo1.setForeground(new java.awt.Color(255, 255, 255));
        modelo1.setText("UserName (vend):");
        getContentPane().add(modelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 150, 40));

        modelo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 70, 40));

        precio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setText("Precio:");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 70, 40));

        precio1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 255));
        precio1.setText("Fecha Venta: ");
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 120, 40));

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
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 140, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 780));

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
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarSeleccionadoVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel apellido1;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCVentas;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel fechaVenta;
    private javax.swing.JLabel fechaVenta1;
    private javax.swing.JLabel fechanacimiento;
    private javax.swing.JLabel fechanacimiento1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel idVenta1;
    private javax.swing.JLabel idVentas;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel marca1;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel modelo1;
    private javax.swing.JLabel montoAbonado;
    private javax.swing.JLabel montoAbonado1;
    private javax.swing.JLabel montoVenta;
    private javax.swing.JLabel montoVenta1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel placa1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userName1;
    private javax.swing.JLabel vehiculoVenta1;
    private javax.swing.JLabel vehiculoVenta2;
    // End of variables declaration//GEN-END:variables
}
