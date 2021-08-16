
package Vista;

import Controller.UsuarioControladora;
import controller.Controladora;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.Usuario;
import org.json.simple.JSONArray;

/**
 *
 * @author user
 */
public class DG3EliminarUsuario extends javax.swing.JFrame {

    UsuarioControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();


    public DG3EliminarUsuario() {
        initComponents();
        control = new UsuarioControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        jPanel2.setVisible(false);
    }     
    
    public DG3EliminarUsuario(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
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

        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTipo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        actuales = new javax.swing.JLabel();
        btnEliminarS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cedula1 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        Username = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        Contrasena1 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        Bienvenida2 = new javax.swing.JLabel();
        txtCedulaI = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnACEPTAR = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarClienteSeleccionado.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 130));

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
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 120, 130));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 90, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 150, -1));

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });
        jPanel2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 150, -1));

        actuales.setForeground(new java.awt.Color(255, 255, 255));
        actuales.setText("Datos del usuario: ");
        jPanel2.add(actuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 130, 40));

        btnEliminarS.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btEliminar58px.png"))); // NOI18N
        btnEliminarS.setBorderPainted(false);
        btnEliminarS.setContentAreaFilled(false);
        btnEliminarS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarS.setFocusPainted(false);
        btnEliminarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btEliminar72px.png"))); // NOI18N
        btnEliminarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btEliminar72px.png"))); // NOI18N
        btnEliminarS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 120));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de cuenta:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("Cedula:");
        jPanel2.add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

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
        jPanel2.add(txtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, -1));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombres: ");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 40));

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
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

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
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, -1));

        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("UserName:");
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

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
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));

        Contrasena1.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena1.setText("Contraseña:");
        jPanel2.add(Contrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        fondo3.setForeground(new java.awt.Color(255, 255, 255));
        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        jPanel2.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 580, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 470, 470));

        Bienvenida2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida2.setText("Usuario a eliminar:");
        getContentPane().add(Bienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 370, 50));

        txtCedulaI.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaI.setText("Cedula: ");
        getContentPane().add(txtCedulaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       DG1AgregarUsuario atras = new DG1AgregarUsuario(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    private void btnEliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSActionPerformed

        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea eliminar al usuario de UserName = "+ txtUserName.getText() + "?","Eliminar",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario " + txtUserName.getText() + " de cedula = "+ txtCedula1.getText() + " con exito."); 
            jsonUsuarios = control.eliminarUsuarioDelJson(jsonUsuarios, txtCedula1.getText());
                btnACEPTAR.setVisible(true);
                txtCedula.setText("");
                jPanel2.setVisible(false);
                txtCedula.setText("");
                txtCedula.setEnabled(true);
                txtCedula1.setText("");
                txtNombres.setText("");
                txtApellidos.setText("");
                txtContrasena.setText("");
                txtTipo.setText("");
                txtUserName.setText("");
                
                
                
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
    }//GEN-LAST:event_btnEliminarSActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
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

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
        if (!txtCedula.getText().equals("")){
            boolean bandera = control.verificarCedulaUsuarioJson(jsonUsuarios, txtCedula.getText()); 
            if (bandera){
                jPanel2.setVisible(true);
                btnACEPTAR.setVisible(false);
                Usuario q = control.crearUsuarioDelJson(jsonUsuarios, txtCedula.getText()); 
                

                txtCedula1.setText(String.valueOf(q.getCedula()));
                txtNombres.setText(q.getNombre());
                txtApellidos.setText(q.getApellido());
                txtContrasena.setText(q.getContrasena());
                txtTipo.setText(q.getTipoDeCuenta());
                txtUserName.setText(q.getUserName());
                txtCedula.setEditable(false);
                txtCedula1.setEditable(false);
                txtNombres.setEditable(false);
                txtApellidos.setEditable(false);
                txtContrasena.setEditable(false);
                txtTipo.setEditable(false);
                txtUserName.setEditable(false);              
            }else{
                JOptionPane.showMessageDialog(null, "El usuario de cedula "+ txtCedula.getText() +"  no esta registrado en el sistema");
                btnACEPTAR.setVisible(true);
                txtCedula.setText("");
            }       
        }else{
            JOptionPane.showMessageDialog(null, "Rellene el campo de la cedula, por favor.");
        }



    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void txtCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedula1ActionPerformed

    private void txtCedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedula1KeyTyped
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

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped

    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoKeyTyped

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
            java.util.logging.Logger.getLogger(DG3EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DG3EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DG3EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DG3EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DG3EliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida2;
    private javax.swing.JLabel Contrasena1;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel actuales;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarS;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JLabel txtCedulaI;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
