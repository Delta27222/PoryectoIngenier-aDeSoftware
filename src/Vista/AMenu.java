package Vista;

import Controller.UsuarioControladora;
import controller.Controladora;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Usuario;
import org.json.simple.JSONArray;


public class AMenu extends javax.swing.JFrame {

    Controladora control; 
    UsuarioControladora control1; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray(); 
    String user; 
    public AMenu() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        
    }
    
public AMenu(JSONArray jsonVehiculos, JSONArray jsonClientes, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos; 
        this.jsonUsuarios = jsonUsuarios; 
        this.jsonVentas = jsonVentas; 
        String texto="";
         try {
            FileReader writer = new FileReader("src/Archivos/5myJSONQuienEntra.txt");
            BufferedReader contenido=new BufferedReader(writer);
            while((texto=contenido.readLine())!=null)
            {
            this.user = texto; 
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
//         Usuario usuario = control1.crearUsuarioDelJsonUserName(this.jsonUsuarios,this.user); 
    
        //Este if sera para saber si es ADMINISTRADOR O EMPLEADO NORMA
        String administrador ="Administrador"; 
        if (administrador.equals("Administrador")){ //ES ADMINISTRADOR
            this.setSize(new Dimension(800, 680)); 
            btnSalir.setVisible(false);
            t1.setText(administrador);
            t2.setText("Angel Hernandez");
            t3.setText("27222631");  
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");    
            t4.setText(dtf2.format(LocalDateTime.now()));
        }else{
            btnSalir2.setVisible(false);
            btnGUsuarios.setVisible(false);
            this.setSize(new Dimension(800, 600)); 
            t1.setText("Empleado");
            t2.setText("Angel Hernandez");
            t3.setText("27222633");  
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");    
            t4.setText(dtf2.format(LocalDateTime.now()));
        }
    }

    AMenu(JSONArray jsonVehiculos, JSONArray jsonClientes, JSONArray jsonUsuarios, JSONArray jsonVentas, Usuario user) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos; 
        this.jsonUsuarios = jsonUsuarios; 
        this.jsonVentas = jsonVentas; 
        
           //ACA ACTUALIZA EL ARCHIVO
                      try{
                            FileWriter file = new FileWriter("src/Archivos/5myJSONQuienEntra.txt");
                            file.write(user.getUserName());
                            file.flush();
                            file.close();	
                      }catch(Exception ex){
                            System.out.println("Error: "+ex.toString());
                      }
            //ACA ACTUALIZA EL ARCHIVO
 
        //Este if sera para saber si es ADMINISTRADOR O EMPLEADO NORMA
        
        if (user.getTipoDeCuenta().equals("Administrador")){ //ES ADMINISTRADOR
            this.setSize(new Dimension(800, 680)); 
            btnSalir.setVisible(false);
            t1.setText("Administrador");
            t2.setText(user.getNombre());
            t3.setText(String.valueOf(user.getCedula()));  
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");    
            t4.setText(dtf2.format(LocalDateTime.now()));
        }else{
            btnSalir2.setVisible(false);
            btnGUsuarios.setVisible(false);
            this.setSize(new Dimension(800, 600)); 
            t1.setText("Usuario");
            t2.setText(user.getNombre()+ " "+user.getApellido());
            t3.setText(String.valueOf(user.getCedula()));  
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");    
            t4.setText(dtf2.format(LocalDateTime.now()));
        }
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnGUsuarios2 = new javax.swing.JButton();
        btnGUsuarios1 = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        btnGClientes = new javax.swing.JButton();
        btnGUsuarios = new javax.swing.JButton();
        btnGVehiculos = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnGUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 380, 200));

        btnGUsuarios1.setBackground(new java.awt.Color(153, 153, 153));
        btnGUsuarios1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        btnGUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasPequena.png"))); // NOI18N
        btnGUsuarios1.setText("     Gestor de ventas");
        btnGUsuarios1.setToolTipText("");
        btnGUsuarios1.setBorderPainted(false);
        btnGUsuarios1.setContentAreaFilled(false);
        btnGUsuarios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGUsuarios1.setFocusPainted(false);
        btnGUsuarios1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGUsuarios1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasGrandes.png"))); // NOI18N
        btnGUsuarios1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monedasGrandes.png"))); // NOI18N
        btnGUsuarios1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUsuarios1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 380, 200));

        t1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("rrr");
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 240, 40));

        t2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("jhgf");
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 290, 40));

        t3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("hhh");
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 220, 40));

        t4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("hhh");
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 230, 40));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Menu Principal");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 120));

        btnGClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnGClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnGClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KClientePequeno.png"))); // NOI18N
        btnGClientes.setText("Gestor de cliente");
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
        getContentPane().add(btnGClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 380, 200));

        btnGUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        btnGUsuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnGUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsuarioPequeno.png"))); // NOI18N
        btnGUsuarios.setText("     Gestor de usuario");
        btnGUsuarios.setToolTipText("");
        btnGUsuarios.setBorderPainted(false);
        btnGUsuarios.setContentAreaFilled(false);
        btnGUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGUsuarios.setFocusPainted(false);
        btnGUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGUsuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsiarioGrande.png"))); // NOI18N
        btnGUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UsiarioGrande.png"))); // NOI18N
        btnGUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 380, 200));

        btnGVehiculos.setBackground(new java.awt.Color(153, 153, 153));
        btnGVehiculos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btnGVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vehiculoPequeno.png"))); // NOI18N
        btnGVehiculos.setText("     Gestor de vehiculo");
        btnGVehiculos.setToolTipText("");
        btnGVehiculos.setBorderPainted(false);
        btnGVehiculos.setContentAreaFilled(false);
        btnGVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGVehiculos.setFocusPainted(false);
        btnGVehiculos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGVehiculos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VehiculoGrande.png"))); // NOI18N
        btnGVehiculos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VehiculoGrande.png"))); // NOI18N
        btnGVehiculos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVehiculosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 380, 200));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 90, 80));

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 90, 80));

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
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 140, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGClientesActionPerformed
        B0GestionarCliente adelante = new B0GestionarCliente(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGClientesActionPerformed

    private void btnGVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVehiculosActionPerformed
      C0GestionarVehiculos adelante = new C0GestionarVehiculos(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
      adelante.setVisible(true);
      this.dispose(); 
    }//GEN-LAST:event_btnGVehiculosActionPerformed

    private void btnGUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUsuariosActionPerformed
        D0GestionarUsuario adelante = new D0GestionarUsuario(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGUsuariosActionPerformed

    private void btnGUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUsuarios1ActionPerformed
        E0GestionarVenta adelante = new E0GestionarVenta(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGUsuarios1ActionPerformed

    private void btnGUsuarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUsuarios2ActionPerformed
      F0Consultas adelante = new F0Consultas(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
      adelante.setVisible(true);
      this.dispose(); 
        
    }//GEN-LAST:event_btnGUsuarios2ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere volver al Login?","Volver",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
               AALogin adelante = new AALogin(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas);
               adelante.setVisible(true);
               this.dispose();
        }
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
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGClientes;
    private javax.swing.JButton btnGUsuarios;
    private javax.swing.JButton btnGUsuarios1;
    private javax.swing.JButton btnGUsuarios2;
    private javax.swing.JButton btnGVehiculos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel fondo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    // End of variables declaration//GEN-END:variables
}
