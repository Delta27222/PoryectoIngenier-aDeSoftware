/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.ClienteControladora;
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
import modelo.Cliente;
import org.json.simple.JSONArray;

/**
 *
 * @author user
 */
public class BG2ModificarCliente extends javax.swing.JFrame {

    ClienteControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    
    public BG2ModificarCliente() {
        initComponents();
        control = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        jPanel2.setVisible(false);
    }   
    
    
    public BG2ModificarCliente(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        jPanel2.setVisible(false);
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
    }   
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnInicio = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        Bienvenida2 = new javax.swing.JLabel();
        btnACEPTAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cedula1 = new javax.swing.JLabel();
        fechaNac = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtNombres1 = new javax.swing.JTextField();
        txtApellidos1 = new javax.swing.JTextField();
        btnModificarS = new javax.swing.JButton();
        fondo3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 110));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarClientePequeno.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarClienteGrande.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarClienteGrande.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 130));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarClienteMINI.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 120, 130));

        btnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarClientePequeno.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarClienteGrande.png"))); // NOI18N
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarClienteGrande.png"))); // NOI18N
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 130));

        Bienvenida2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida2.setText("Cliente a modificar:");
        getContentPane().add(Bienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 370, 50));

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
        getContentPane().add(btnACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("Datos cliente: ");
        jPanel2.add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        fechaNac.setForeground(new java.awt.Color(255, 255, 255));
        fechaNac.setText("Fecha Nac: ");
        jPanel2.add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel2.add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombres: ");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 40));

        txtNombres1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombres1KeyTyped(evt);
            }
        });
        jPanel2.add(txtNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, -1));

        txtApellidos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidos1KeyTyped(evt);
            }
        });
        jPanel2.add(txtApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, -1));

        btnModificarS.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btModificar48px.png"))); // NOI18N
        btnModificarS.setBorderPainted(false);
        btnModificarS.setContentAreaFilled(false);
        btnModificarS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarS.setFocusPainted(false);
        btnModificarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btModificar72px.png"))); // NOI18N
        btnModificarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btModificar72px.png"))); // NOI18N
        btnModificarS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 100, 100));

        fondo3.setForeground(new java.awt.Color(255, 255, 255));
        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        jPanel2.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -70, 510, 370));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 350, 300));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, -1));

        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Cedula:");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        fondo2.setForeground(new java.awt.Color(255, 255, 255));
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        BG1AgregarCliente atras = new BG1AgregarCliente(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (control.hayAlguien(jsonClientes)){
            BG3EliminarCliente adelante = new BG3EliminarCliente(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
            adelante.setVisible(true);
            this.dispose();
         }else{
             JOptionPane.showMessageDialog(null, "No hay clientes en el sistema.");
         }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        B0GestionarCliente atras = new B0GestionarCliente(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed

        if (!txtCedula.getText().equals("")){
            boolean bandera = control.existeCliente(jsonClientes, txtCedula.getText()); 
            if (bandera){
                jPanel2.setVisible(true);
                txtCedula.setEnabled(false);
                btnACEPTAR.setVisible(false);
                Cliente clienteJson = control.crearClienteDelJson(jsonClientes, txtCedula.getText());                 
                
                txtNombres1.setText(clienteJson.getNombre());
                txtApellidos1.setText(clienteJson.getApellido());
                
                String fecha = clienteJson.getFechaDeNacimiento(); 
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                try { 
                    Date fechaDate = dFormat.parse(fecha);
                    jdFechaNac.setDate(fechaDate);
                } catch (ParseException ex) {
                    Logger.getLogger(BG2ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }else{
                JOptionPane.showMessageDialog(null, "La cedula no se encuentre registrada en el sistema");
                txtCedula.setText("");
                btnACEPTAR.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene el campo de la cedula, por favor.");
            btnACEPTAR.setVisible(true);
        }
        
    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void btnModificarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSActionPerformed
    if ( !txtNombres1.getText().equals("") && !txtApellidos1.getText().equals("")){
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea modificar el cliente de cedula= "+ txtCedula.getText() + "?","Modificar",JOptionPane.YES_NO_OPTION);
            if (respuesta==0){
                
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                String fechaNacimiento = dFormat.format(jdFechaNac.getDate());
                Cliente clienteJson = new Cliente(Integer.parseInt(txtCedula.getText()), txtNombres1.getText(), txtApellidos1.getText(), fechaNacimiento); 
                jsonClientes = control.modificarClienteJson(jsonClientes, txtCedula.getText(), clienteJson); 
                
                control.sacarDelArchivoJSONClientes(jsonClientes);
                JOptionPane.showMessageDialog(null, "Se ha modificado el cliente de cedula "+ txtCedula.getText() + " con exito."); 
                txtCedula.setText(""); 
                txtNombres1.setText("");
                txtApellidos1.setText("");
                btnACEPTAR.setVisible(true);
                jPanel2.setVisible(false);
                txtCedula.setEnabled(true); 
        //ACA ACTUALIZA EL ARCHIVO
                  StringWriter out1 = new StringWriter(); 
                  try {
                        jsonClientes.writeJSONString(out1);                     
                  } catch (IOException e) {
                        e.printStackTrace(); 
                  }  
                  String archivoClientes = out1.toString();
                  try{
                        FileWriter file = new FileWriter("src/Archivos/1myJSONClientes.json");
                        file.write(archivoClientes);
                        file.flush();
                        file.close();	
                  }catch(Exception ex){
                        System.out.println("Error: "+ex.toString());
                  }
        //ACA ACTUALIZA EL ARCHIVO                

            }         
    }else{
         JOptionPane.showMessageDialog(null, "Rellene los campos, por favor.");
    }        
    }//GEN-LAST:event_btnModificarSActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
       if (txtCedula.getText().length()>=8){
            evt.consume();
            getToolkit().beep();


            JOptionPane.showMessageDialog(null,"La cedula solo tiene un maximo de 8 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"La cedula solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombres1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombres1KeyTyped
        if (txtNombres1.getText().length()>=20){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo un maximo de 20 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char validar = evt.getKeyChar(); 

            if (Character.isDigit(validar)){
                getToolkit().beep();

                evt.consume();

                JOptionPane.showMessageDialog(null,"Solo letras para este campo por favor");
            }
        }      
        
    }//GEN-LAST:event_txtNombres1KeyTyped

    private void txtApellidos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidos1KeyTyped
        if (txtApellidos1.getText().length()>=20){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo un maximo de 20 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char validar = evt.getKeyChar(); 

            if (Character.isDigit(validar)){
                getToolkit().beep();

                evt.consume();

                JOptionPane.showMessageDialog(null,"Solo letras para este campo por favor");
            }
        }
    }//GEN-LAST:event_txtApellidos1KeyTyped
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
            java.util.logging.Logger.getLogger(BG2ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BG2ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BG2ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BG2ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BG2ModificarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida2;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarS;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombres1;
    // End of variables declaration//GEN-END:variables
}
