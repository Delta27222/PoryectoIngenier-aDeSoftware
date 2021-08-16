
package Vista;

import Controller.ClienteControladora;
import Controller.UsuarioControladora;
import Controller.VehiculoControladora;
import Controller.VentaControladora;
import java.awt.Color;
import static java.awt.SystemColor.control;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.StringWriter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Venta;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class F2ConsultarVehiculos extends javax.swing.JFrame {

    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    VehiculoControladora control; 
    ClienteControladora controladoraClientes = new ClienteControladora(); 
    VehiculoControladora controladoraVehiculos = new VehiculoControladora(); 
    UsuarioControladora controladoraUsuarios = new UsuarioControladora(); 
    DefaultTableModel model = new DefaultTableModel(); 

       public F2ConsultarVehiculos() {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

    }   
    
    
    public F2ConsultarVehiculos(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  

        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
       //ACA SE LLENA LA TABLADE LAS VNETAS CHAMITO        
       this.model = control.llenarTablaPrincipal(jsonVehiculos); 
        miTablaVentas.setModel(this.model);

//        miTablaVentas.setEnabled(false);

        miTablaVentas.setGridColor(Color.DARK_GRAY);
    }   
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        montoVenta = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnSalir2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTablaVentas = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        montoVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        montoVenta.setForeground(new java.awt.Color(255, 255, 255));
        montoVenta.setText("Coloque el atributo a filtrar: ");
        getContentPane().add(montoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 240, 40));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Consultar Vehiculo: ");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 440, 100));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 220, 30));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 90, 80));

        miTablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        miTablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miTablaVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(miTablaVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 640, 130));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (txtBuscar.getText().length()>=10){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Este campo soloacepta un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void miTablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miTablaVentasMouseClicked

        int seleccionar = miTablaVentas.rowAtPoint(evt.getPoint()); 
        String placa = String.valueOf(miTablaVentas.getValueAt(seleccionar, 0)); 
        //CREA EL VEHICULO SELECCIONADA
        Vehiculo vehiculoSeleccionado = control.crearVehiculoDelJson(jsonVehiculos, placa); 
        //CREA EL CLIENTE Y LA VENTA SELECCIONADO
        if(vehiculoSeleccionado.getCedulaDueno()==0){
            Cliente clienteDeVenta = new Cliente();
            clienteDeVenta.setCedula(0);
            clienteDeVenta.setNombre("No hay comprador");
            clienteDeVenta.setApellido("No hay comprador");
            MostrarSeleccionadoVehiculos adelante = new MostrarSeleccionadoVehiculos(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas, vehiculoSeleccionado, clienteDeVenta,this);
            adelante.setVisible(true);
            this.setVisible(false);
        }else{
            String cedula0 = String.valueOf(vehiculoSeleccionado.getCedulaDueno()); 
            Cliente clienteDeVenta = controladoraClientes.crearClienteDelJson(jsonClientes, cedula0);
            MostrarSeleccionadoVehiculos adelante = new MostrarSeleccionadoVehiculos(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas, vehiculoSeleccionado, clienteDeVenta,this);
            adelante.setVisible(true);
            this.setVisible(false);
        }           
        //ABRIMOS LA PESTANA PARA VER LOS DATOS COMPLETOS
        
    }//GEN-LAST:event_miTablaVentasMouseClicked
     TableRowSorter trs;  
    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
     txtBuscar.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent ke) {
            super.keyReleased(ke); 
            trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtBuscar.getText(), 0,1,2,3,4));                       
        }   
     });
    trs = new TableRowSorter(this.model); 
    miTablaVentas.setRowSorter(trs);
        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        /*D0GestionarUsuario atras = new D0GestionarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();*/
        F0Consultas atras = new F0Consultas(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(F2ConsultarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F2ConsultarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F2ConsultarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F2ConsultarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F2ConsultarVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTablaVentas;
    private javax.swing.JLabel montoVenta;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables


}
