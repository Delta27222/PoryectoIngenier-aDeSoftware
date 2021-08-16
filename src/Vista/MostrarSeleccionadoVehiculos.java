
package Vista;

import Controller.UsuarioControladora;
import javax.swing.JFrame;
import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Venta;
import org.json.simple.JSONArray;

public class MostrarSeleccionadoVehiculos extends javax.swing.JFrame {

    UsuarioControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    Cliente Cliente;
    Vehiculo Vehiculo;     
    JFrame atras; 
    
    public MostrarSeleccionadoVehiculos() {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

    }   
    
    
    public MostrarSeleccionadoVehiculos(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
    }  
    
        public MostrarSeleccionadoVehiculos(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas,Vehiculo vehiculo, Cliente cliente, JFrame atras) {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;       
        this.Cliente = cliente; 
        this.Vehiculo = vehiculo; 
        this.atras = atras; 
        
        
        //LLENAMOS CON LOS DATOS DE LA VENTA, CLIENTE Y VEHICULO Y TODO
        //VENTA
        Placa1.setText(Vehiculo.getPlaca());      
        
        
        //VEHICULO
        
        Placa1.setText(Vehiculo.getPlaca());
        Marca1.setText(Vehiculo.getMarca());
        Modelo1.setText(Vehiculo.getModelo());
        Ano1.setText(String.valueOf(Vehiculo.getAno()));
        PaisManufactura1.setText(Vehiculo.getPaismanufactura());
        TipoMotor1.setText(Vehiculo.getTipoMotor());
        SerieMotor1.setText(Vehiculo.getNumSerieMotor());
        SerieChasis1.setText(Vehiculo.getNumSerieChasis());
        Kilometraje1.setText(String.valueOf(Vehiculo.getKilometraje()));
        Color1.setText(String.valueOf(Vehiculo.getColor()));        
        Precio1.setText(String.valueOf(Vehiculo.getPrecio()));
        
        
        //CLIENTE
        
        Nombre1.setText(Cliente.getNombre());
        Apellido1.setText(Cliente.getApellido());
        Cedula1.setText(String.valueOf(Cliente.getCedula()));
            
        
        
        

    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        Placa1 = new javax.swing.JLabel();
        Placa = new javax.swing.JLabel();
        ClienteVenta = new javax.swing.JLabel();
        btnCVentas = new javax.swing.JButton();
        SerieMotor = new javax.swing.JLabel();
        TipoMotor1 = new javax.swing.JLabel();
        SerieChasis = new javax.swing.JLabel();
        SerieMotor1 = new javax.swing.JLabel();
        Kilometraje = new javax.swing.JLabel();
        SerieChasis1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Kilometraje1 = new javax.swing.JLabel();
        Modelo1 = new javax.swing.JLabel();
        Modelo = new javax.swing.JLabel();
        Marca1 = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        Ano1 = new javax.swing.JLabel();
        Ano = new javax.swing.JLabel();
        PaisManufactura1 = new javax.swing.JLabel();
        PaisManufactura = new javax.swing.JLabel();
        TipoMotor = new javax.swing.JLabel();
        Color1 = new javax.swing.JLabel();
        Precio1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        Color = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        Cedula1 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Apellido1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Placa1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        Placa1.setForeground(new java.awt.Color(255, 255, 255));
        Placa1.setText("Placa");
        getContentPane().add(Placa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 140, 60));

        Placa.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        Placa.setForeground(new java.awt.Color(255, 255, 255));
        Placa.setText("Placa:");
        getContentPane().add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, 60));

        ClienteVenta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ClienteVenta.setForeground(new java.awt.Color(255, 255, 255));
        ClienteVenta.setText("Cliente de venta:");
        getContentPane().add(ClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 200, 60));

        btnCVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnCVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnCVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasPequena.png"))); // NOI18N
        btnCVentas.setToolTipText("");
        btnCVentas.setBorderPainted(false);
        btnCVentas.setContentAreaFilled(false);
        btnCVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCVentas.setFocusPainted(false);
        btnCVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 120));

        SerieMotor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SerieMotor.setForeground(new java.awt.Color(255, 255, 255));
        SerieMotor.setText("Num de Serie motor:");
        getContentPane().add(SerieMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 170, 40));

        TipoMotor1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TipoMotor1.setForeground(new java.awt.Color(255, 255, 255));
        TipoMotor1.setText("TipoMotor");
        getContentPane().add(TipoMotor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 110, 40));

        SerieChasis.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SerieChasis.setForeground(new java.awt.Color(255, 255, 255));
        SerieChasis.setText("Num de Serie chasis:");
        getContentPane().add(SerieChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 180, 40));

        SerieMotor1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SerieMotor1.setForeground(new java.awt.Color(255, 255, 255));
        SerieMotor1.setText("SerieMotor");
        getContentPane().add(SerieMotor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 200, 40));

        Kilometraje.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Kilometraje.setForeground(new java.awt.Color(255, 255, 255));
        Kilometraje.setText("Kilometraje:");
        getContentPane().add(Kilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 140, 40));

        SerieChasis1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SerieChasis1.setForeground(new java.awt.Color(255, 255, 255));
        SerieChasis1.setText("SerieChasis");
        getContentPane().add(SerieChasis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 200, 40));

        Nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre:");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 120, 40));

        Kilometraje1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Kilometraje1.setForeground(new java.awt.Color(255, 255, 255));
        Kilometraje1.setText("Kilometraje");
        getContentPane().add(Kilometraje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 120, 40));

        Modelo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Modelo1.setForeground(new java.awt.Color(255, 255, 255));
        Modelo1.setText("Modelo");
        getContentPane().add(Modelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 40));

        Modelo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Modelo.setForeground(new java.awt.Color(255, 255, 255));
        Modelo.setText("Modelo:");
        getContentPane().add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 40));

        Marca1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Marca1.setForeground(new java.awt.Color(255, 255, 255));
        Marca1.setText("Marca ");
        getContentPane().add(Marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 40));

        Marca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Marca.setForeground(new java.awt.Color(255, 255, 255));
        Marca.setText("Marca:");
        getContentPane().add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 40));

        Ano1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Ano1.setForeground(new java.awt.Color(255, 255, 255));
        Ano1.setText("Ano");
        getContentPane().add(Ano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 150, 40));

        Ano.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Ano.setForeground(new java.awt.Color(255, 255, 255));
        Ano.setText("Año:");
        getContentPane().add(Ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 150, 40));

        PaisManufactura1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PaisManufactura1.setForeground(new java.awt.Color(255, 255, 255));
        PaisManufactura1.setText("Pais");
        getContentPane().add(PaisManufactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 120, 40));

        PaisManufactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PaisManufactura.setForeground(new java.awt.Color(255, 255, 255));
        PaisManufactura.setText("Pais de manufactura:");
        getContentPane().add(PaisManufactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, 40));

        TipoMotor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TipoMotor.setForeground(new java.awt.Color(255, 255, 255));
        TipoMotor.setText("Tipo de motor:");
        getContentPane().add(TipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 130, 40));

        Color1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Color1.setForeground(new java.awt.Color(255, 255, 255));
        Color1.setText("Color");
        getContentPane().add(Color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 180, 40));

        Precio1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Precio1.setForeground(new java.awt.Color(255, 255, 255));
        Precio1.setText("Precio");
        getContentPane().add(Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 190, 40));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha48px.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        Color.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Color.setForeground(new java.awt.Color(255, 255, 255));
        Color.setText("Color:");
        getContentPane().add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 120, 40));

        Precio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("Precio:");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 120, 40));

        Cedula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Cedula.setForeground(new java.awt.Color(255, 255, 255));
        Cedula.setText("Cedula:");
        getContentPane().add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 120, 40));

        Cedula1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Cedula1.setForeground(new java.awt.Color(255, 255, 255));
        Cedula1.setText("Cedula");
        getContentPane().add(Cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 120, 40));

        Nombre1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        Nombre1.setText("Nombre");
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 200, 40));

        Apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido:");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 120, 40));

        Apellido1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Apellido1.setForeground(new java.awt.Color(255, 255, 255));
        Apellido1.setText("Apellido");
        getContentPane().add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 200, 40));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 780));

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
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarSeleccionadoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarSeleccionadoVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ano;
    private javax.swing.JLabel Ano1;
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Apellido1;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Cedula1;
    private javax.swing.JLabel ClienteVenta;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Color1;
    private javax.swing.JLabel Kilometraje;
    private javax.swing.JLabel Kilometraje1;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Marca1;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Modelo1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel PaisManufactura;
    private javax.swing.JLabel PaisManufactura1;
    private javax.swing.JLabel Placa;
    private javax.swing.JLabel Placa1;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Precio1;
    private javax.swing.JLabel SerieChasis;
    private javax.swing.JLabel SerieChasis1;
    private javax.swing.JLabel SerieMotor;
    private javax.swing.JLabel SerieMotor1;
    private javax.swing.JLabel TipoMotor;
    private javax.swing.JLabel TipoMotor1;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCVentas;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    // End of variables declaration//GEN-END:variables
}
