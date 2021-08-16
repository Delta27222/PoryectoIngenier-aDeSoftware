/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.ClienteControladora;
import Controller.UsuarioControladora;
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
import modelo.Usuario;
import org.json.simple.JSONArray;

/**
 *
 * @author user
 */
public class DG1AgregarUsuario extends javax.swing.JFrame {

    UsuarioControladora control;
    ClienteControladora control1; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();

    public DG1AgregarUsuario() {
        initComponents();
        control = new UsuarioControladora(this);
        control1 = new ClienteControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
    
    public DG1AgregarUsuario(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new UsuarioControladora(this);
        control1 = new ClienteControladora(this);
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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        Contrasena1 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        cedula1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        fechaNac = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        btnAgregarS = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBoxTipoCuenta = new javax.swing.JComboBox<>();
        jMostrar = new javax.swing.JCheckBox();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarClienteSeleccionado.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 130));

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
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 130));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarClientePequeno.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarClienteGrande.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarClienteGrande.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 120, 130));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Ingrese los datos del nuevo usuario: ");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 480, 50));

        Contrasena1.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena1.setText("Tipo de Cuenta:");
        getContentPane().add(Contrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 100, -1));

        Contrasena.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena.setText("Contraseña:");
        getContentPane().add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("UserName:");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 150, -1));

        btnInicio.setBackground(new java.awt.Color(51, 51, 51));
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
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 110));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 90, 80));

        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("Cedula:");
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 150, -1));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombres: ");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 100, 40));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 150, -1));

        fechaNac.setForeground(new java.awt.Color(255, 255, 255));
        fechaNac.setText("Fecha Nac: ");
        getContentPane().add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jdFechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaNacKeyTyped(evt);
            }
        });
        getContentPane().add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 150, -1));

        btnAgregarS.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btAgregar48px.png"))); // NOI18N
        btnAgregarS.setBorderPainted(false);
        btnAgregarS.setContentAreaFilled(false);
        btnAgregarS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarS.setFocusPainted(false);
        btnAgregarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btAgregar72px.png"))); // NOI18N
        btnAgregarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btAgregar72px.png"))); // NOI18N
        btnAgregarS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 140, 130));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 150, 30));

        jComboBoxTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        getContentPane().add(jComboBoxTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 150, 30));

        jMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jMostrar.setText("Mostrar");
        jMostrar.setContentAreaFilled(false);
        jMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 100, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (control.hayAlguien(jsonUsuarios)){
            DG3EliminarUsuario adelante = new DG3EliminarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No hay usuarios en el sistema.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (control.hayAlguien(jsonUsuarios)){
            DG2ModificarUsuario adelante = new DG2ModificarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No hay usuarios en el sistema.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        if (txtUserName.getText().length()>=10){
            evt.consume();
            getToolkit().beep();

            JOptionPane.showMessageDialog(null,"El usserName tiene un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtUserNameKeyTyped

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        D0GestionarUsuario atras = new D0GestionarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

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

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        if (txtNombres.getText().length()>=20){
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
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        if (txtApellidos.getText().length()>=20){
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
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void jdFechaNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaNacKeyTyped

    }//GEN-LAST:event_jdFechaNacKeyTyped

    private void btnAgregarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSActionPerformed
        String tipoCuenta = jComboBoxTipoCuenta.getSelectedItem().toString(); 
        String contrasena = String.valueOf(jPasswordField1.getPassword());        
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
        String fechaNacimiento = dFormat.format(jdFechaNac.getDate());  
        if(!control1.existeCliente(jsonClientes, txtCedula.getText())){
            if (!control.verificarCedulaUsuarioJson(jsonUsuarios, txtCedula.getText())){
                if (!txtCedula.getText().equals("") && !txtNombres.getText().equals("") && !txtApellidos.getText().equals("") && !txtUserName.getText().equals("") && !tipoCuenta.equals("") && !contrasena.equals("") && !fechaNacimiento.equals("")){
                    Usuario usuarioNuevo = new Usuario(Integer.parseInt(txtCedula.getText()),txtNombres.getText(), txtApellidos.getText(), fechaNacimiento, tipoCuenta, txtUserName.getText(), contrasena); 

                    jsonUsuarios = control.agregarUsuarioJson(usuarioNuevo, jsonUsuarios); 
                    control.sacarDelArchivoJSONUsuarios(jsonUsuarios); 
                    txtCedula.setText("");
                    txtNombres.setText("");
                    txtApellidos.setText("");
                    txtUserName.setText("");
                    jPasswordField1.setText("");

                    JOptionPane.showMessageDialog(null, "Se ha agregado el Usuario en el sistema.");

            //ACA ACTUALIZA EL ARCHIVO
                      StringWriter out1 = new StringWriter(); 
                      try {
                            jsonUsuarios.writeJSONString(out1);                     
                      } catch (IOException e) {
                            e.printStackTrace(); 
                      }  
                      String archivoClientes = out1.toString();
                      try{
                            FileWriter file = new FileWriter("src/Archivos/3myJSONUsuarios.json");
                            file.write(archivoClientes);
                            file.flush();
                            file.close();	
                      }catch(Exception ex){
                            System.out.println("Error: "+ex.toString());
                      }
            //ACA ACTUALIZA EL ARCHIVO                



                }else{            
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
                }                
            }else{
                JOptionPane.showMessageDialog(null, "La cedula "+ txtCedula.getText() + " ya existe en el sistema, como un usuario.");
            }           
        }else{
                JOptionPane.showMessageDialog(null, "La cedula "+ txtCedula.getText() + " ya existe en el sistema, como un cliente. Si desea agregar a un cliente como parte de usuarios, contacte al departamento de desarrolladores.");
            }  

    }//GEN-LAST:event_btnAgregarSActionPerformed

    private void jMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarActionPerformed
        if (jMostrar.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('•');
        }
    }//GEN-LAST:event_jMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(DG1AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DG1AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DG1AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DG1AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DG1AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JLabel Contrasena1;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarS;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> jComboBoxTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jMostrar;
    private javax.swing.JPasswordField jPasswordField1;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
