package Vista;

import Controller.ClienteControladora;
import Controller.UsuarioControladora;
import Controller.VehiculoControladora;
import Controller.VentaControladora;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Venta;
import org.json.simple.JSONArray;

public class EG2ModificarVenta extends javax.swing.JFrame {

   VentaControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();

    public EG2ModificarVenta() {
        initComponents();
        control = new VentaControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        jPanel2.setVisible(false);
    }
    
    public EG2ModificarVenta(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new VentaControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
                this.jsonVentas = jsonVentas;
                String fecha = "06-12-2021"; 
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
       jPanel2.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnACEPTAR = new javax.swing.JButton();
        txtIDVenta = new javax.swing.JTextField();
        cedula2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cedula3 = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        cedula1 = new javax.swing.JLabel();
        txtMontoAbonado = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        fechaNac = new javax.swing.JLabel();
        jdFechaVenta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnAgregarS = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 90, 80));

        txtIDVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDVentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtIDVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, -1));

        cedula2.setForeground(new java.awt.Color(255, 255, 255));
        cedula2.setText("Id de Venta:");
        getContentPane().add(cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventaDesHacerPequena.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventaDesHacerGrande.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventaDesHacerGrande.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, 130));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventaModificarPequena.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventaModificarGrande.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventaModificarGrande.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, 130));

        btnAgregar1.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventaAgregarPequena.png"))); // NOI18N
        btnAgregar1.setBorderPainted(false);
        btnAgregar1.setContentAreaFilled(false);
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar1.setFocusPainted(false);
        btnAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 120, 130));

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Venta a modificar:");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 420, 50));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 90, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula3.setForeground(new java.awt.Color(255, 255, 255));
        cedula3.setText("Datos de venta:");
        jPanel2.add(cedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, -1));

        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Monto de venta:");
        jPanel2.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtMonto.setText("2500");
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        jPanel2.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, -1));

        cedula1.setForeground(new java.awt.Color(255, 255, 255));
        cedula1.setText("Monto abonado:");
        jPanel2.add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtMontoAbonado.setText("200");
        txtMontoAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoAbonadoActionPerformed(evt);
            }
        });
        txtMontoAbonado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAbonadoKeyTyped(evt);
            }
        });
        jPanel2.add(txtMontoAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, -1));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Placa vehiculo:");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 40));

        txtPlaca.setText("AA123AB");
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        jPanel2.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, -1));

        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setText("Cedula comprador:");
        jPanel2.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 40));

        txtCedula.setText("27222633");
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
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, -1));

        fechaNac.setForeground(new java.awt.Color(255, 255, 255));
        fechaNac.setText("Fecha venta: ");
        jPanel2.add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jdFechaVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaVentaKeyTyped(evt);
            }
        });
        jPanel2.add(jdFechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName Vendedor: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtUserName.setText("DELTA27222");
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
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 150, -1));

        btnAgregarS.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btModificar48px.png"))); // NOI18N
        btnAgregarS.setBorderPainted(false);
        btnAgregarS.setContentAreaFilled(false);
        btnAgregarS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarS.setFocusPainted(false);
        btnAgregarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btModificar72px.png"))); // NOI18N
        btnAgregarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btModificar72px.png"))); // NOI18N
        btnAgregarS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 140, 130));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        jPanel2.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 480, 570));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 450, 510));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtMontoAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoAbonadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoAbonadoActionPerformed

    private void txtMontoAbonadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAbonadoKeyTyped
        if (txtMonto.getText().equals("")){
            txtMontoAbonado.setEnabled(false);
        }else{
            try {
                if (Integer.parseInt(txtMontoAbonado.getText()) > Integer.parseInt(txtMonto.getText())){
                    JOptionPane.showMessageDialog(null,"El monto abonado no puede ser mayor al monto de la venta","ERROR",JOptionPane.ERROR_MESSAGE);
                    txtMontoAbonado.setText("");
                }else{
                    if (txtMontoAbonado.getText().length()>=8){
                        evt.consume();
                        getToolkit().beep();

                        JOptionPane.showMessageDialog(null,"El monto de la venta solo tiene un maximo de 8 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
                    }else{
                        char car = evt.getKeyChar();
                        if((car<'0' || car>'9')){
                            evt.consume();
                            JOptionPane.showMessageDialog(null,"El monto a abonar solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_txtMontoAbonadoKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (control.hayAlguien(jsonVentas)){
            EG3DesHacerVenta adelante = new  EG3DesHacerVenta(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
            adelante.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No hay ventas en el sistema.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        if (control.hayAlguien(jsonVentas)){
            EG1RegistrarVenta adelante = new  EG1RegistrarVenta(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
            adelante.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No hay ventas en el sistema.");
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        if (txtMonto.getText().length()>=8){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"El monto de la venta solo tiene un maximo de 8 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El monto solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }else{
                try {
                    txtMontoAbonado.setEnabled(true);
                } catch (Exception e) {
                }

            }
        }
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        if (txtPlaca.getText().length()>=7){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"La placa solo tiene un maximo de 7 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        if (txtUserName.getText().length()>=10){
            evt.consume();
            getToolkit().beep();

            JOptionPane.showMessageDialog(null,"El userName tiene un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void jdFechaVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaVentaKeyTyped

    }//GEN-LAST:event_jdFechaVentaKeyTyped

    private void btnAgregarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
        String fechaVenta = dFormat.format(jdFechaVenta.getDate());

        if(!txtMonto.getText().equals("") && !txtMontoAbonado.getText().equals("") && !txtPlaca.getText().equals("")  && !txtCedula.getText().equals("")  && !txtUserName.getText().equals("")){

            ClienteControladora controladoraClientes = new ClienteControladora();
            VehiculoControladora controladoraVehiculos = new VehiculoControladora();
            UsuarioControladora controladoraUsuarios = new UsuarioControladora();
            if (!controladoraVehiculos.validarFormato(txtPlaca.getText(), "^[A-Z]{2}\\d{3}[A-Z]{2}")) {
                txtPlaca.setText("");
                JOptionPane.showMessageDialog(null, "El formato de la placa es erronea.");
            }else{
                if (controladoraClientes.existeCliente(jsonClientes, txtCedula.getText())){
                    if (controladoraVehiculos.existeVehiculo(jsonVehiculos, txtPlaca.getText())){
                        if (controladoraUsuarios.existeUsuario(jsonUsuarios, txtUserName.getText())){

                            Venta ventaModificada = new Venta(Integer.parseInt(txtMonto.getText()), Integer.parseInt(txtMontoAbonado.getText()), Integer.parseInt(txtCedula.getText()),txtPlaca.getText(), txtIDVenta.getText(),fechaVenta, txtUserName.getText());
                            jsonVentas = control.modificarVentasJson(jsonVentas, txtIDVenta.getText(), ventaModificada); 
                            JOptionPane.showMessageDialog(null, "Se ha modificado la venta de id" + txtIDVenta.getText() +" con exito."); 
                            btnACEPTAR.setVisible(true);
                            txtIDVenta.setText("");
                            txtIDVenta.setEnabled(true);
                            jPanel2.setVisible(false);
                            txtMonto.setText("");
                            txtMontoAbonado.setText("");
                            txtPlaca.setText("");
                            txtCedula.setText("");
                            txtUserName.setText("");
                            //ACA ACTUALIZA EL ARCHIVO
                            StringWriter out1 = new StringWriter();
                            try {
                                jsonVentas.writeJSONString(out1);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            String archivoClientes = out1.toString();
                            try{
                                FileWriter file = new FileWriter("src/Archivos/4myJSONVentas.json");
                                file.write(archivoClientes);
                                file.flush();
                                file.close();
                            }catch(Exception ex){
                                System.out.println("Error: "+ex.toString());
                            }
                            //ACA ACTUALIZA EL ARCHIVO

                        }else{
                            JOptionPane.showMessageDialog(null,"El userName del vendedor no existe en el sistema, coloque uno que si lo este.","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"La placa del vehiculo introducido no existe en el sistema, coloque una que si lo este.","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"La cedula del cliente introducido no existe en el sistema, coloque una que si lo este.","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }

    }//GEN-LAST:event_btnAgregarSActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        E0GestionarVenta atras = new E0GestionarVenta(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed

        if (!txtIDVenta.getText().equals("")){
            boolean bandera = control.esUnico(jsonVentas, txtIDVenta.getText()); 
            if (!bandera){
                jPanel2.setVisible(true);
                txtIDVenta.setEnabled(false);
                btnACEPTAR.setVisible(false);
                Venta ventaJson = control.crearVentaDelJson(jsonVentas, txtIDVenta.getText()); 
               txtMonto.setText(String.valueOf(ventaJson.getMontoVenta()));
               txtMontoAbonado.setText(String.valueOf(ventaJson.getMontoAbono()));
               txtPlaca.setText(ventaJson.getPlaca());
               txtCedula.setText(String.valueOf(ventaJson.getCedulaComprador()));
               txtUserName.setText(ventaJson.getUserNameVendedor());

                String fecha = ventaJson.getFechaVenta();
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                try {
                    Date fechaDate = dFormat.parse(fecha);
                    jdFechaVenta.setDate(fechaDate);
                } catch (ParseException ex) {
                    Logger.getLogger(BG2ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El ID de venta no esta en el sistema, introduzca uno que si lo este.");
                txtIDVenta.setText("");
                btnACEPTAR.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene el campo del ID de venta, por favor.");
            btnACEPTAR.setVisible(true);
        }

    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void txtIDVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDVentaKeyTyped
        if (txtIDVenta.getText().length()>=8){
            evt.consume();
            getToolkit().beep();

            JOptionPane.showMessageDialog(null,"El ID de la venta tiene un maximo de 8 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtIDVentaKeyTyped

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
            java.util.logging.Logger.getLogger(EG2ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EG2ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EG2ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EG2ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EG2ModificarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregarS;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel cedula2;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFechaVenta;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtIDVenta;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoAbonado;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
