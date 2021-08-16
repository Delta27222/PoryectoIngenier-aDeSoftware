
package Vista;

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
import modelo.Cliente;
import modelo.Usuario;
import org.json.simple.JSONArray;

/**
 *
 * @author user
 */
public class DG2ModificarUsuario extends javax.swing.JFrame {

    UsuarioControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    
    public DG2ModificarUsuario() {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        jPanel2.setVisible(false);
    }   
    
    
    public DG2ModificarUsuario(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new UsuarioControladora(this);
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

        btnInicio = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        Bienvenida2 = new javax.swing.JLabel();
        btnACEPTAR = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCedula1 = new javax.swing.JTextField();
        cedula1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        fechaNac = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        Username = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        Contrasena = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Contrasena1 = new javax.swing.JLabel();
        jComboBoxTipoCuenta = new javax.swing.JComboBox<>();
        jMostrar = new javax.swing.JCheckBox();
        btnModificarS = new javax.swing.JButton();
        fondo3 = new javax.swing.JLabel();
        txtCedulaI = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
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
        Bienvenida2.setText("Usuario a modificar:");
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
        getContentPane().add(btnACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 90, 80));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 90, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedula1ActionPerformed(evt);
            }
        });
        txtCedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedula1KeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, -1));

        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("Cedula:");
        jPanel2.add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombres: ");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 40));

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
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

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
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, -1));

        fechaNac.setForeground(new java.awt.Color(255, 255, 255));
        fechaNac.setText("Fecha Nac: ");
        jPanel2.add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jdFechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaNacKeyTyped(evt);
            }
        });
        jPanel2.add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, -1));

        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("UserName:");
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

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
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, -1));

        Contrasena.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena.setText("Contraseña:");
        jPanel2.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, 30));

        Contrasena1.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena1.setText("Tipo de Cuenta:");
        jPanel2.add(Contrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, -1));

        jComboBoxTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        jPanel2.add(jComboBoxTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, 30));

        jMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jMostrar.setText("Mostrar");
        jMostrar.setContentAreaFilled(false);
        jMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(jMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 100, 30));

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
        jPanel2.add(btnModificarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 100, 100));

        fondo3.setForeground(new java.awt.Color(255, 255, 255));
        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        jPanel2.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 510, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 420, 510));

        txtCedulaI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaIKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedulaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Cedula: ");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        fondo2.setForeground(new java.awt.Color(255, 255, 255));
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        D0GestionarUsuario atras = new D0GestionarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (control.hayAlguien(jsonClientes)){
            DG3EliminarUsuario adelante = new DG3EliminarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No hay clientes en el sistema.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DG1AgregarUsuario atras = new DG1AgregarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
        if (!txtCedulaI.getText().equals("")){
            boolean bandera = control.verificarCedulaUsuarioJson(jsonUsuarios, txtCedulaI.getText()); 
            if (bandera){
                jPanel2.setVisible(true);
                txtCedulaI.setEnabled(false);
                Usuario usuarioJson = control.crearUsuarioDelJson(jsonUsuarios, txtCedulaI.getText());         
                btnACEPTAR.setVisible(false);
                txtCedula1.setText(String.valueOf(usuarioJson.getCedula()));
                txtNombres.setText(usuarioJson.getNombre());
                txtApellidos.setText(usuarioJson.getApellido()); 
                txtUserName.setText(usuarioJson.getUserName());
                jPasswordField1.setText(usuarioJson.getContrasena());
                jComboBoxTipoCuenta.setSelectedItem(usuarioJson.getTipoDeCuenta());
                String fecha = usuarioJson.getFechaDeNacimiento(); 
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                try { 
                    Date fechaDate = dFormat.parse(fecha);
                    jdFechaNac.setDate(fechaDate);
                } catch (ParseException ex) {
                    Logger.getLogger(BG2ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }  
                
                
            }else{
                JOptionPane.showMessageDialog(null, "La cedula no se encuentre registrada en el sistema");
                btnACEPTAR.setVisible(true);
                txtCedulaI.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene el campo de la cedula, por favor.");
        }
 
    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void btnModificarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSActionPerformed

    if ( !txtCedula1.getText().equals("") && !txtNombres.getText().equals("") && !txtApellidos.getText().equals("") && !txtUserName.getText().equals("") && !jPasswordField1.equals("")){
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea modificar el usuario" + txtUserName.getText() + "de cedula = "+ txtCedula1.getText() + "?","Modificar",JOptionPane.YES_NO_OPTION);
            if (respuesta==0){
                btnACEPTAR.setVisible(true); 
                txtCedulaI.setText("");
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                String fechaNacimiento = dFormat.format(jdFechaNac.getDate());
                String contrasena = String.valueOf(jPasswordField1.getPassword());        
                String tipoCuenta = (String) jComboBoxTipoCuenta.getSelectedItem();
                Usuario usuarioActualizado = new Usuario(Integer.parseInt(txtCedula1.getText()),txtNombres.getText(), txtApellidos.getText(), fechaNacimiento, tipoCuenta, txtUserName.getText(), contrasena); 
                jsonUsuarios = control.modificarUsuarioJson(jsonUsuarios, txtCedula1.getText(), usuarioActualizado); 
                
                
                JOptionPane.showMessageDialog(null, "Se ha modificado el usuario" + txtUserName.getText() + "de cedula = "+ txtCedula1.getText() + " con exito."); 
                txtCedula1.setText(""); 
                txtNombres.setText("");
                txtApellidos.setText("");
                txtUserName.setText("");
                jPasswordField1.setText("");
                jPanel2.setVisible(false);
                txtCedulaI.setText("");
                txtCedulaI.setEnabled(true); 
                
        //ACA ACTUALIZA EL ARCHIVO
                  StringWriter out1 = new StringWriter(); 
                  try {
                        jsonUsuarios.writeJSONString(out1);                     
                  } catch (IOException e) {
                        e.printStackTrace(); 
                  }  
                  String archivoUsuarios = out1.toString();
                  try{
                        FileWriter file = new FileWriter("src/Archivos/3myJSONUsuarios.json");
                        file.write(archivoUsuarios);
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

    private void txtCedulaIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaIKeyTyped
        if (txtCedulaI.getText().length()>=8){
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
    }//GEN-LAST:event_txtCedulaIKeyTyped

    private void txtCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedula1ActionPerformed

    private void txtCedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedula1KeyTyped
        if (txtCedula1.getText().length()>=8){
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
    }//GEN-LAST:event_txtCedula1KeyTyped

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

    private void jMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarActionPerformed
        if (jMostrar.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('•');
        }
    }//GEN-LAST:event_jMostrarActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(DG2ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DG2ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DG2ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DG2ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DG2ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida2;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JLabel Contrasena1;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarS;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JComboBox<String> jComboBoxTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jMostrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCedulaI;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
