/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.ClienteControladora;
import Controller.VehiculoControladora;
import controller.Controladora;
import java.awt.Color;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
import org.json.simple.JSONArray;

/**
 *
 * @author user
 */
public class CG1AgregarVehiculo extends javax.swing.JFrame {

    VehiculoControladora control; 
    ClienteControladora controlCliente; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray();
    
   public CG1AgregarVehiculo() {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
   
      public CG1AgregarVehiculo(JSONArray jsonClientes, JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png"); 
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios; 
        this.jsonVentas = jsonVentas;
        controlCliente = new ClienteControladora();    
    }   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroDeSerieChasis1 = new javax.swing.JLabel();
        txtCedulaDueno = new javax.swing.JTextField();
        placa1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        btnSalir2 = new javax.swing.JButton();
        ano = new javax.swing.JLabel();
        jComboBoxAno = new javax.swing.JComboBox<>();
        paisManufactura = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox<>();
        txtModelo = new javax.swing.JTextField();
        modelo = new javax.swing.JLabel();
        tipoMotor = new javax.swing.JLabel();
        txtTmotor = new javax.swing.JTextField();
        numeroDeSerieMotor = new javax.swing.JLabel();
        txtNSM = new javax.swing.JTextField();
        numeroDeSerieChasis = new javax.swing.JLabel();
        txtNSC = new javax.swing.JTextField();
        txtKilometraje = new javax.swing.JTextField();
        kilometraje = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btnAgregarS = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroDeSerieChasis1.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieChasis1.setText("Cedula dueño:");
        getContentPane().add(numeroDeSerieChasis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 100, 40));

        txtCedulaDueno.setForeground(new java.awt.Color(204, 204, 204));
        txtCedulaDueno.setText("VACIO = SIN DUEÑO");
        txtCedulaDueno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaDuenoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaDuenoFocusLost(evt);
            }
        });
        txtCedulaDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaDuenoActionPerformed(evt);
            }
        });
        txtCedulaDueno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaDuenoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedulaDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 150, -1));

        placa1.setForeground(new java.awt.Color(255, 255, 255));
        placa1.setText("Precio:");
        getContentPane().add(placa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        txtPrecio.setText("1234");
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 150, -1));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarCarroPequeno72.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarCarroGrande96px.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarCarroGrande96px.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, 130));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarCarroPequeno72.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarCarroGrande96px.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarCarroGrande96px.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, 130));

        btnAgregar1.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarCarroMINI48.png"))); // NOI18N
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
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, 130));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaPequena.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Ingrese datos del nuevo vehiculo: ");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 370, 50));

        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Placa:");
        getContentPane().add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

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
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, -1));

        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca:");
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 60, 40));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abadal", "Abarth", "Abbott-Detroit", "ABT", "AC", "Acura", "Aixam", "Alfa Romeo", "Alpina", "Alpine", "Alta", "Alvis", "AMC", "Apollo", "Arash", "Arcfox", "Ariel", "ARO", "Arrival", "Arrinera", "Artega", "Ascari", "Askam", "Aspark", "Aston Martin", "Atalanta", "Auburn", "Audi", "Audi Sport", "Austin", "Autobacs", "Autobianchi", "Axon", "BAC", "BAIC Motor", "Baojun", "BeiBen", "Bentley", "Berkeley", "Berliet", "Bertone", "Bestune", "BharatBenz", "Bitter", "Bizzarrini", "BMW", "BMW M", "Borgward", "Bowler", "Brabus", "Brammo", "Brilliance", "Bristol", "Brooke", "Bufori", "Bugatti", "Buick", "BYD", "Byton", "Cadillac", "CAMC", "Canoo", "Caparo", "Carlsson", "Caterham", "Changan", "Changfeng", "Chery", "Chevrolet Corvette", "Chevrolet", "Chrysler", "Cisitalia", "Citroën", "Cizeta", "Cole", "Corre La Licorne", "Dacia", "Daewoo", "DAF", "Daihatsu", "Daimler", "Dartz", "Datsun", "David Brown", "Dayun", "De Tomaso", "Delage", "DeSoto", "Detroit Electric", "Devel Sixteen", "Diatto", "DINA", "DKW", "DMC", "Dodge", "Dodge Viper", "Dongfeng", "Donkervoort", "Drako", "DS", "Duesenberg", "Eagle", "EDAG", "Edsel", "Eicher", "Elemental", "Elfin", "Elva", "Englon", "ERF", "Eterniti", "Exeed", "9ff", "Facel Vega", "Faraday Future", "FAW", "FAW Jiefang", "Ferrari", "Fiat", "Fioravanti", "Fisker", "Foden", "Force Motors", "Ford", "Ford Mustang", "Foton", "FPV", "Franklin", "Freightliner", "FSO", "GAC Group", "Gardner Douglas", "GAZ", "Geely", "General Motors", "Genesis", "Geo", "Geometry", "Gilbern", "Gillet", "Ginetta", "GMC", "Golden Dragon", "Gonow", "Great Wall", "Grinnall", "Gumpert", "Hafei", "Haima", "Haval", "Hawtai", "Hennessey", "Hillman", "Hindustan Motors", "Higer", "Hino", "Hispano-Suiza", "Holden", "Hommell", "Honda", "Hongqi", "Hongyan", "Horch", "HSV", "Hudson", "Hummer", "Hupmobile", "Hyundai", "IC Bus", "Infiniti", "Innocenti", "Intermeccanica", "IH", "International", "IKCO", "Irizar", "Isdera", "Iso", "Isuzu", "Iveco", "JAC", "Jaguar", "Jawa", "JBA Motors", "Jeep", "Jensen", "Jetta", "JMC", "Kaiser", "Kamaz", "Karlmann King", "Karma", "Keating", "Kenworth", "Kia", "King Long", "Koenigsegg", "KTM", "Lada", "Lagonda", "Lamborghini", "Lancia", "Land Rover", "Landwind", "Laraki", "Lexus", "Leyland", "Li Auto", "Lifan", "Ligier", "Lincoln", "Lister", "Lloyd", "Lobini", "LEVC", "Lordstown", "Lotus", "Lucid", "Luxgen", "Lynk & Co", "Mack", "Mahindra", "MAN", "Mansory", "Marcos", "Marlin", "Maserati", "Mastretta", "Maxus", "Maybach", "MAZ", "Mazda", "Mazzanti", "McLaren", "Melkus", "Mercedes-AMG", "Mercedes-Benz", "Mercury", "Merkur", "MEV", "MG", "Microcar", "Mini", "Mitsubishi", "Mitsuoka", "MK", "Morgan", "Morris", "Mosler", "Navistar", "NEVS", "NIO", "Nikola", "Nissan GT-R", "Nissan", "Nissan Nismo", "Noble", "Oldsmobile", "Oltcit", "Opel", "OSCA", "Paccar", "Packard", "Pagani", "Panhard", "Panoz", "Pegaso", "Perodua", "Peterbilt", "Peugeot", "PGO", "Pierce-Arrow", "Pininfarina", "Plymouth", "Polestar", "Pontiac", "Porsche", "Praga", "Premier", "Prodrive", "Proton", "Qoros", "Radical", "RAM", "Rambler", "Ranz", "Renault", "Renault Samsung", "Rezvani", "Riley", "Rimac", "Rinspeed", "Rivian", "Roewe", "Rolls-Royce", "Ronart", "Rossion", "Rover", "RUF", "Saab", "SAIC Motor", "Saipa", "Saleen", "Saturn", "Scania", "Scion", "SEAT", "Setra", "Shacman", "Simca", "Singer", "Singulato", "Sinotruk", "Sisu", "Škoda", "Smart", "Soueast", "Spania GTA", "Spirra", "Spyker", "SsangYong", "SSC", "Sterling", "Studebaker", "Stutz", "Subaru", "Suffolk", "Suzuki", "Talbot", "Tata", "Tatra", "Tauro", "TechArt", "Tesla", "Toyota Alphard", "Toyota Century", "Toyota Crown", "Toyota", "Tramontana", "Trion", "Triumph", "Troller", "Tucker", "TVR", "UAZ", "UD", "Ultima", "Vandenbrink", "Vauxhall", "Vector", "Vencer", "Venturi", "Venucia", "VinFast", "VLF", "Volkswagen", "Volvo", "Wanderer", "W Motors", "Wartburg", "Weltmeister", "Western Star", "Westfield", "WEY", "Wiesmann", "Willys-Overland", "Workhorse", "Wuling", "XPeng", "Yulon", "Yutong", "Zarooq Motors", "Zastava", "ZAZ", "Zenos", "Zenvo", "Zhongtong", "Zinoro", "Zotye" }));
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, -1));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 90, 80));

        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setText("Ano: ");
        getContentPane().add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 40, 30));

        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952" }));
        getContentPane().add(jComboBoxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 150, -1));

        paisManufactura.setForeground(new java.awt.Color(255, 255, 255));
        paisManufactura.setText("Pais/Manufactura:");
        getContentPane().add(paisManufactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "{Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        jComboBoxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaisActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 110, -1));

        txtModelo.setText("12121");
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 130, -1));

        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        tipoMotor.setForeground(new java.awt.Color(255, 255, 255));
        tipoMotor.setText("Tipo motor:");
        getContentPane().add(tipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        txtTmotor.setText("12121");
        txtTmotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTmotorKeyTyped(evt);
            }
        });
        getContentPane().add(txtTmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 130, -1));

        numeroDeSerieMotor.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieMotor.setText("N/S Motor:");
        getContentPane().add(numeroDeSerieMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 100, 40));

        txtNSM.setText("1222222222");
        txtNSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNSMActionPerformed(evt);
            }
        });
        txtNSM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNSMKeyTyped(evt);
            }
        });
        getContentPane().add(txtNSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, -1));

        numeroDeSerieChasis.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieChasis.setText("N/S Chasis:");
        getContentPane().add(numeroDeSerieChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 100, 40));

        txtNSC.setText("12222222222222222");
        txtNSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNSCActionPerformed(evt);
            }
        });
        txtNSC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNSCKeyTyped(evt);
            }
        });
        getContentPane().add(txtNSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 140, -1));

        txtKilometraje.setText("11");
        txtKilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyTyped(evt);
            }
        });
        getContentPane().add(txtKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 130, -1));

        kilometraje.setForeground(new java.awt.Color(255, 255, 255));
        kilometraje.setText("Kilometraje");
        getContentPane().add(kilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 100, 40));

        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("Color:");
        getContentPane().add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 100, 40));

        txtColor.setText("ROJO");
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 130, -1));

        btnAgregarS.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btAgregar48px.png"))); // NOI18N
        btnAgregarS.setBorderPainted(false);
        btnAgregarS.setContentAreaFilled(false);
        btnAgregarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(btnAgregarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 140, 130));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (control.hayAlguien(jsonVehiculos)){
            CG2ModificarVehiculo adelante = new  CG2ModificarVehiculo(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
            this.dispose();
         }else{
             JOptionPane.showMessageDialog(null, "No hay vehiculos en el sistema.");
         }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (control.hayAlguien(jsonVehiculos)){
            CG3EliminarVehiculo adelante = new CG3EliminarVehiculo(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
            this.dispose();           
         }else{
             JOptionPane.showMessageDialog(null, "No hay vehiculos en el sistema.");
         }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        C0GestionarVehiculos atras = new C0GestionarVehiculos(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jComboBoxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPaisActionPerformed

    private void btnAgregarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSActionPerformed

        if (!txtPlaca.getText().equals("") && !txtNSC.getText().equals("") && !txtModelo.getText().equals("") && !txtTmotor.getText().equals("") && !txtNSM.getText().equals("") && !txtKilometraje.getText().equals("") && !txtColor.getText().equals("") && !txtCedulaDueno.getText().equals("")){
            boolean comprobante = true;
            if (!control.validarFormato(txtPlaca.getText(), "^[A-Z]{2}\\d{3}[A-Z]{2}")) {
                txtPlaca.setText("");
                JOptionPane.showMessageDialog(null, "El formato de la placa es erronea.");
                comprobante = false;
            }
            if(control.verificarPlacaVehiculoJson(jsonVehiculos, txtPlaca.getText())){
                txtPlaca.setText("");
                JOptionPane.showMessageDialog(null, "La Placa existe, vuelva a introducir la placa.");
                comprobante = false;
            }
            if(txtNSC.getText().length()!=17){
                txtNSC.setText("");
                JOptionPane.showMessageDialog(null, "El numero de serie de chasis es erroneo (El numero consta de 17 caracateres), vuelva a introducirlo.");
                comprobante = false;
            }
            if(control.verificarPlacaVehiculoJson(jsonVehiculos, txtNSC.getText())){
                txtNSC.setText("");
                JOptionPane.showMessageDialog(null, "El numero de serie de chasis ya esta registrado, vuelva a introducirlo.");
                comprobante = false;
            }
            if(txtNSM.getText().length()!=10){
                txtNSM.setText("");
                JOptionPane.showMessageDialog(null, "El numero de serie del motor es erroneo  (El numero consta de 10 caracateres), vuelva a introducirlo.");
                comprobante = false;
            }
            if(comprobante){
                
               if (txtCedulaDueno.getText().equals("VACIO = SIN DUEÑO") || txtCedulaDueno.getText().equals("")){
                    Vehiculo vechiculoJson = new Vehiculo(txtPlaca.getText(), jComboBoxMarca.getSelectedItem().toString(), txtModelo.getText(), Integer.parseInt(jComboBoxAno.getSelectedItem().toString()), jComboBoxPais.getSelectedItem().toString(), txtTmotor.getText(), txtNSM.getText(), txtNSC.getText(), Integer.parseInt(txtKilometraje.getText()), txtColor.getText(), Integer.parseInt(txtPrecio.getText()), 0);    
                    jsonVehiculos = control.agregarVehiculoJson(vechiculoJson, jsonVehiculos);    
                    control.sacarDelArchivoJSONVehiculos(jsonVehiculos);
                    txtPlaca.setText("");
                    txtNSC.setText("");
                    txtModelo.setText("");
                    txtTmotor.setText("");
                    txtNSM.setText("");
                    txtKilometraje.setText("");
                    txtColor.setText(""); 
                    txtPrecio.setText("");
                    txtCedulaDueno.setText("");
                    JOptionPane.showMessageDialog(null, "Se ha agregado con exito el vehiculo.");
            //ACA ACTUALIZA EL ARCHIVO
                      StringWriter out1 = new StringWriter(); 
                      try {
                            jsonVehiculos.writeJSONString(out1);                     
                      } catch (IOException e) {
                            e.printStackTrace(); 
                      }  
                      String archivoVehiculos = out1.toString();
                      try{
                            FileWriter file = new FileWriter("src/Archivos/2myJSONVehiculos.json");
                            file.write(archivoVehiculos);
                            file.flush();
                            file.close();	
                      }catch(Exception ex){
                            System.out.println("Error: "+ex.toString());
                      }
            //ACA ACTUALIZA EL ARCHIVO
                   
               }else{
                   if (!txtCedulaDueno.getText().equals("VACIO = SIN DUEÑO") && controlCliente.existeCliente(jsonClientes, txtCedulaDueno.getText().toString())){
                            Vehiculo vechiculoJson = new Vehiculo(txtPlaca.getText(), jComboBoxMarca.getSelectedItem().toString(), txtModelo.getText(), Integer.parseInt(jComboBoxAno.getSelectedItem().toString()), jComboBoxPais.getSelectedItem().toString(), txtTmotor.getText(), txtNSM.getText(), txtNSC.getText(), Integer.parseInt(txtKilometraje.getText()), txtColor.getText(), Integer.parseInt(txtPrecio.getText()), Integer.parseInt(txtCedulaDueno.getText()));    

                            jsonVehiculos = control.agregarVehiculoJson(vechiculoJson, jsonVehiculos);    
                            control.sacarDelArchivoJSONVehiculos(jsonVehiculos);
                            txtPlaca.setText("");
                            txtNSC.setText("");
                            txtModelo.setText("");
                            txtTmotor.setText("");
                            txtNSM.setText("");
                            txtKilometraje.setText("");
                            txtColor.setText(""); 
                            txtPrecio.setText("");
                            txtCedulaDueno.setText("");
                            JOptionPane.showMessageDialog(null, "Se ha agregado con exito el vehiculo.");
                    //ACA ACTUALIZA EL ARCHIVO
                              StringWriter out1 = new StringWriter(); 
                              try {
                                    jsonVehiculos.writeJSONString(out1);                     
                              } catch (IOException e) {
                                    e.printStackTrace(); 
                              }  
                              String archivoVehiculos = out1.toString();
                              try{
                                    FileWriter file = new FileWriter("src/Archivos/2myJSONVehiculos.json");
                                    file.write(archivoVehiculos);
                                    file.flush();
                                    file.close();	
                              }catch(Exception ex){
                                    System.out.println("Error: "+ex.toString());
                              }
                    //ACA ACTUALIZA EL ARCHIVO
         
                   }else{
                       if (!controlCliente.existeCliente(jsonClientes, txtCedulaDueno.getText().toString())){
                          JOptionPane.showMessageDialog(null,"La cedula del cliente introducida, no existe. NOTA: VACIO = SIN DUEÑO ","ERROR",JOptionPane.ERROR_MESSAGE);
                          txtCedulaDueno.setText("");
                       }                       
                   }

               }

            }
            
                       
        }else{            
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }       
    }//GEN-LAST:event_btnAgregarSActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
       if (txtPlaca.getText().length()>=7){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"La placa solo tiene un maximo de 7 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtNSCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNSCKeyTyped
      if (txtNSC.getText().length()>=17){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El numero de serie del chasis acepta hasta 17 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNSCKeyTyped

    private void txtNSMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNSMKeyTyped
     if (txtNSM.getText().length()>=10){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El numero de serie del motor acepta hasta 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNSMKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        if (txtColor.getText().length()>=10){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char validar = evt.getKeyChar(); 

            if (Character.isDigit(validar)){
                getToolkit().beep();

                evt.consume();

                JOptionPane.showMessageDialog(null,"Solo letras para este campo por favor");
            }
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtKilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyTyped
  if (txtKilometraje.getText().length()>7){
            evt.consume();
            getToolkit().beep();


            JOptionPane.showMessageDialog(null,"Este campo tiene un maximo de 7 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El kilometraje solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtKilometrajeKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        if (txtModelo.getText().length()>=10){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtTmotorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTmotorKeyTyped
        if (txtTmotor.getText().length()>=10){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo un maximo de 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTmotorKeyTyped

    private void txtKilometrajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeKeyReleased

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNSCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNSCActionPerformed

    private void txtNSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNSMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNSMActionPerformed

    private void txtCedulaDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaDuenoActionPerformed

    private void txtCedulaDuenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaDuenoKeyTyped
    if (txtCedulaDueno.getText().length()>=8){
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
    }//GEN-LAST:event_txtCedulaDuenoKeyTyped

    private void txtCedulaDuenoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaDuenoFocusGained
        if (txtCedulaDueno.getText().equals("VACIO = SIN DUEÑO")){
            txtCedulaDueno.setText("");
            txtCedulaDueno.setForeground(new Color(187,187,187));
        }
    }//GEN-LAST:event_txtCedulaDuenoFocusGained

    private void txtCedulaDuenoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaDuenoFocusLost
        if (txtCedulaDueno.getText().equals("")){
            txtCedulaDueno.setText("VACIO = SIN DUEÑO");
            txtCedulaDueno.setForeground(new Color(187,187,187));
        }
    }//GEN-LAST:event_txtCedulaDuenoFocusLost

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
            java.util.logging.Logger.getLogger(CG1AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CG1AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CG1AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CG1AgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CG1AgregarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel ano;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregarS;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel color;
    private javax.swing.JLabel fondo1;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxPais;
    private javax.swing.JLabel kilometraje;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel numeroDeSerieChasis;
    private javax.swing.JLabel numeroDeSerieChasis1;
    private javax.swing.JLabel numeroDeSerieMotor;
    private javax.swing.JLabel paisManufactura;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel placa1;
    private javax.swing.JLabel tipoMotor;
    private javax.swing.JTextField txtCedulaDueno;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNSC;
    private javax.swing.JTextField txtNSM;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTmotor;
    // End of variables declaration//GEN-END:variables
}
