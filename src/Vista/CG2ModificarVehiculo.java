package Vista;

import Controller.ClienteControladora;
import Controller.VehiculoControladora;
import controller.Controladora;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
import org.json.simple.JSONArray;

public class CG2ModificarVehiculo extends javax.swing.JFrame {

    VehiculoControladora control;  ClienteControladora controlCliente; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray(); 
    
   public CG2ModificarVehiculo() {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        jPanel2.setVisible(false);
    }
   
      public CG2ModificarVehiculo(JSONArray jsonClientes,JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new VehiculoControladora(this);
        controlCliente = new ClienteControladora(); 
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
        jPanel2.setVisible(false);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnEliminar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        Bienvenida2 = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnSalir2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        marca3 = new javax.swing.JLabel();
        txtCedulaDueno = new javax.swing.JTextField();
        marca2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBoxAno = new javax.swing.JComboBox<>();
        ano = new javax.swing.JLabel();
        paisManufactura = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox<>();
        btnModificarS = new javax.swing.JButton();
        modelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        tipoMotor = new javax.swing.JLabel();
        txtTmotor = new javax.swing.JTextField();
        numeroDeSerieMotor = new javax.swing.JLabel();
        txtNSM = new javax.swing.JTextField();
        numeroDeSerieChasis = new javax.swing.JLabel();
        txtNSC = new javax.swing.JTextField();
        kilometraje = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        marca1 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        btnACEPTAR = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();

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
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 130));

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
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 110));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarCarroMINI48.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 120, 130));

        btnAgregar1.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarCarroPequeno72.png"))); // NOI18N
        btnAgregar1.setBorderPainted(false);
        btnAgregar1.setContentAreaFilled(false);
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar1.setFocusPainted(false);
        btnAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarCarroGrande96PX.png"))); // NOI18N
        btnAgregar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarCarroGrande96PX.png"))); // NOI18N
        btnAgregar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 130));

        Bienvenida2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida2.setText("Vehiculo a modificar:");
        getContentPane().add(Bienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 370, 50));

        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Placa:");
        getContentPane().add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, -1));

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
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 860, 90, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marca3.setForeground(new java.awt.Color(255, 255, 255));
        marca3.setText("Cedula duaño:");
        jPanel2.add(marca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 40));

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
        jPanel2.add(txtCedulaDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, -1));

        marca2.setForeground(new java.awt.Color(255, 255, 255));
        marca2.setText("Precio:");
        jPanel2.add(marca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 40));

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
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 80, -1));

        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Datos del vehiculo:");
        jPanel2.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 40));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abadal", "Abarth", "Abbott-Detroit", "ABT", "AC", "Acura", "Aixam", "Alfa Romeo", "Alpina", "Alpine", "Alta", "Alvis", "AMC", "Apollo", "Arash", "Arcfox", "Ariel", "ARO", "Arrival", "Arrinera", "Artega", "Ascari", "Askam", "Aspark", "Aston Martin", "Atalanta", "Auburn", "Audi", "Audi Sport", "Austin", "Autobacs", "Autobianchi", "Axon", "BAC", "BAIC Motor", "Baojun", "BeiBen", "Bentley", "Berkeley", "Berliet", "Bertone", "Bestune", "BharatBenz", "Bitter", "Bizzarrini", "BMW", "BMW M", "Borgward", "Bowler", "Brabus", "Brammo", "Brilliance", "Bristol", "Brooke", "Bufori", "Bugatti", "Buick", "BYD", "Byton", "Cadillac", "CAMC", "Canoo", "Caparo", "Carlsson", "Caterham", "Changan", "Changfeng", "Chery", "Chevrolet Corvette", "Chevrolet", "Chrysler", "Cisitalia", "Citroën", "Cizeta", "Cole", "Corre La Licorne", "Dacia", "Daewoo", "DAF", "Daihatsu", "Daimler", "Dartz", "Datsun", "David Brown", "Dayun", "De Tomaso", "Delage", "DeSoto", "Detroit Electric", "Devel Sixteen", "Diatto", "DINA", "DKW", "DMC", "Dodge", "Dodge Viper", "Dongfeng", "Donkervoort", "Drako", "DS", "Duesenberg", "Eagle", "EDAG", "Edsel", "Eicher", "Elemental", "Elfin", "Elva", "Englon", "ERF", "Eterniti", "Exeed", "9ff", "Facel Vega", "Faraday Future", "FAW", "FAW Jiefang", "Ferrari", "Fiat", "Fioravanti", "Fisker", "Foden", "Force Motors", "Ford", "Ford Mustang", "Foton", "FPV", "Franklin", "Freightliner", "FSO", "GAC Group", "Gardner Douglas", "GAZ", "Geely", "General Motors", "Genesis", "Geo", "Geometry", "Gilbern", "Gillet", "Ginetta", "GMC", "Golden Dragon", "Gonow", "Great Wall", "Grinnall", "Gumpert", "Hafei", "Haima", "Haval", "Hawtai", "Hennessey", "Hillman", "Hindustan Motors", "Higer", "Hino", "Hispano-Suiza", "Holden", "Hommell", "Honda", "Hongqi", "Hongyan", "Horch", "HSV", "Hudson", "Hummer", "Hupmobile", "Hyundai", "IC Bus", "Infiniti", "Innocenti", "Intermeccanica", "IH", "International", "IKCO", "Irizar", "Isdera", "Iso", "Isuzu", "Iveco", "JAC", "Jaguar", "Jawa", "JBA Motors", "Jeep", "Jensen", "Jetta", "JMC", "Kaiser", "Kamaz", "Karlmann King", "Karma", "Keating", "Kenworth", "Kia", "King Long", "Koenigsegg", "KTM", "Lada", "Lagonda", "Lamborghini", "Lancia", "Land Rover", "Landwind", "Laraki", "Lexus", "Leyland", "Li Auto", "Lifan", "Ligier", "Lincoln", "Lister", "Lloyd", "Lobini", "LEVC", "Lordstown", "Lotus", "Lucid", "Luxgen", "Lynk & Co", "Mack", "Mahindra", "MAN", "Mansory", "Marcos", "Marlin", "Maserati", "Mastretta", "Maxus", "Maybach", "MAZ", "Mazda", "Mazzanti", "McLaren", "Melkus", "Mercedes-AMG", "Mercedes-Benz", "Mercury", "Merkur", "MEV", "MG", "Microcar", "Mini", "Mitsubishi", "Mitsuoka", "MK", "Morgan", "Morris", "Mosler", "Navistar", "NEVS", "NIO", "Nikola", "Nissan GT-R", "Nissan", "Nissan Nismo", "Noble", "Oldsmobile", "Oltcit", "Opel", "OSCA", "Paccar", "Packard", "Pagani", "Panhard", "Panoz", "Pegaso", "Perodua", "Peterbilt", "Peugeot", "PGO", "Pierce-Arrow", "Pininfarina", "Plymouth", "Polestar", "Pontiac", "Porsche", "Praga", "Premier", "Prodrive", "Proton", "Qoros", "Radical", "RAM", "Rambler", "Ranz", "Renault", "Renault Samsung", "Rezvani", "Riley", "Rimac", "Rinspeed", "Rivian", "Roewe", "Rolls-Royce", "Ronart", "Rossion", "Rover", "RUF", "Saab", "SAIC Motor", "Saipa", "Saleen", "Saturn", "Scania", "Scion", "SEAT", "Setra", "Shacman", "Simca", "Singer", "Singulato", "Sinotruk", "Sisu", "Škoda", "Smart", "Soueast", "Spania GTA", "Spirra", "Spyker", "SsangYong", "SSC", "Sterling", "Studebaker", "Stutz", "Subaru", "Suffolk", "Suzuki", "Talbot", "Tata", "Tatra", "Tauro", "TechArt", "Tesla", "Toyota Alphard", "Toyota Century", "Toyota Crown", "Toyota", "Tramontana", "Trion", "Triumph", "Troller", "Tucker", "TVR", "UAZ", "UD", "Ultima", "Vandenbrink", "Vauxhall", "Vector", "Vencer", "Venturi", "Venucia", "VinFast", "VLF", "Volkswagen", "Volvo", "Wanderer", "W Motors", "Wartburg", "Weltmeister", "Western Star", "Westfield", "WEY", "Wiesmann", "Willys-Overland", "Workhorse", "Wuling", "XPeng", "Yulon", "Yutong", "Zarooq Motors", "Zastava", "ZAZ", "Zenos", "Zenvo", "Zhongtong", "Zinoro", "Zotye" }));
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 120, -1));

        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952" }));
        jPanel2.add(jComboBoxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, -1));

        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setText("Ano: ");
        jPanel2.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        paisManufactura.setForeground(new java.awt.Color(255, 255, 255));
        paisManufactura.setText("Pais/Manufactura:");
        jPanel2.add(paisManufactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "{Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        jPanel2.add(jComboBoxPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        btnModificarS.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btModificar48px.png"))); // NOI18N
        btnModificarS.setBorderPainted(false);
        btnModificarS.setContentAreaFilled(false);
        btnModificarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel2.add(btnModificarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 140, 110));

        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");
        jPanel2.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        jPanel2.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 150, -1));

        tipoMotor.setForeground(new java.awt.Color(255, 255, 255));
        tipoMotor.setText("Tipo motor:");
        jPanel2.add(tipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtTmotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTmotorKeyTyped(evt);
            }
        });
        jPanel2.add(txtTmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 150, -1));

        numeroDeSerieMotor.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieMotor.setText("N/S Motor:");
        jPanel2.add(numeroDeSerieMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 40));

        txtNSM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNSMKeyTyped(evt);
            }
        });
        jPanel2.add(txtNSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, -1));

        numeroDeSerieChasis.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieChasis.setText("N/S Chasis:");
        jPanel2.add(numeroDeSerieChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, 40));

        txtNSC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNSCKeyTyped(evt);
            }
        });
        jPanel2.add(txtNSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 150, -1));

        kilometraje.setForeground(new java.awt.Color(255, 255, 255));
        kilometraje.setText("Kilometraje");
        jPanel2.add(kilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 100, 40));

        txtKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeActionPerformed(evt);
            }
        });
        txtKilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyTyped(evt);
            }
        });
        jPanel2.add(txtKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 150, -1));

        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("Color:");
        jPanel2.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 100, 40));

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 150, -1));

        marca1.setForeground(new java.awt.Color(255, 255, 255));
        marca1.setText("Marca:");
        jPanel2.add(marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 40));

        fondo3.setForeground(new java.awt.Color(255, 255, 255));
        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        jPanel2.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 580, 570));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 430, 570));

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

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        C0GestionarVehiculos atras = new C0GestionarVehiculos(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        CG1AgregarVehiculo adelante = new CG1AgregarVehiculo(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        adelante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
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

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
        if (!txtPlaca.getText().equals("") ){
            Boolean bandera = control.verificarPlacaVehiculoJson(jsonVehiculos, txtPlaca.getText()); 
            if (bandera){
                txtPlaca.setEnabled(false);
                jPanel2.setVisible(true);
                btnACEPTAR.setVisible(false);
                Vehiculo vehiculoJson = control.crearVehiculoDelJson(jsonVehiculos, txtPlaca.getText());   
                txtCedulaDueno.setText(String.valueOf(vehiculoJson.getCedulaDueno()));
                jComboBoxMarca.setSelectedItem(vehiculoJson.getMarca());
                jComboBoxAno.setSelectedItem(vehiculoJson.getAno());
                jComboBoxPais.setSelectedItem(vehiculoJson.getPaismanufactura());
                txtModelo.setText(vehiculoJson.getModelo());
                txtTmotor.setText(vehiculoJson.getTipoMotor());
                txtNSM.setText(String.valueOf(vehiculoJson.getNumSerieMotor()));
                txtNSC.setText(String.valueOf(vehiculoJson.getNumSerieChasis()));
                txtKilometraje.setText(String.valueOf(vehiculoJson.getKilometraje()));
                txtColor.setText(vehiculoJson.getColor()); 
                txtPrecio.setText(String.valueOf(vehiculoJson.getPrecio())); 
            }else{
                JOptionPane.showMessageDialog(null, "La placa no esta en el sistema.");
                txtPlaca.setText("");
                btnACEPTAR.setVisible(true);
            }
    
        }else{            
            JOptionPane.showMessageDialog(null, "Rellene el campo de la placa, por favor.");
            btnACEPTAR.setVisible(true);
        }
    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void btnModificarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSActionPerformed

        
        if (!txtModelo.getText().equals("") && !txtTmotor.getText().equals("") && !txtNSM.getText().equals("") && !txtNSC.getText().equals("") && !txtKilometraje.getText().equals("") && !txtColor.getText().equals("") && !txtPrecio.getText().equals("")){
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea modificar el vehiculo de placa = "+ txtPlaca.getText() + "?","Modificar",JOptionPane.YES_NO_OPTION);
            if (respuesta==0){
                if (txtCedulaDueno.getText().equals("") || txtCedulaDueno.getText().equals("0")){
                    Vehiculo vehiculoJson = new Vehiculo(txtPlaca.getText(), jComboBoxMarca.getSelectedItem().toString(), txtModelo.getText(), Integer.parseInt(jComboBoxAno.getSelectedItem().toString()), jComboBoxPais.getSelectedItem().toString(), txtTmotor.getText(), txtNSM.getText(), txtNSC.getText(), Integer.parseInt(txtKilometraje.getText()), txtColor.getText(), Integer.parseInt(txtPrecio.getText()), 0);    
                    jsonVehiculos = control.modificarVehiculoJson(jsonVehiculos, txtPlaca.getText(), vehiculoJson);                
                    btnACEPTAR.setVisible(true);
                    txtModelo.setText("");
                    txtTmotor.setText("");
                    txtNSM.setText("");
                    txtNSC.setText("");
                    txtKilometraje.setText("");
                    txtColor.setText("");  
                    txtPlaca.setText("");
                    txtPrecio.setText("");
                    jPanel2.setVisible(false);
                    txtPlaca.setEnabled(true);

                    JOptionPane.showMessageDialog(null, "Se ha modificado el vehiculo con exito.");
                    control.sacarDelArchivoJSONVehiculos(jsonVehiculos);
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
                    if (controlCliente.existeCliente(jsonClientes, txtCedulaDueno.getText().toString())){
                        Vehiculo vehiculoJson = new Vehiculo(txtPlaca.getText(), jComboBoxMarca.getSelectedItem().toString(), txtModelo.getText(), Integer.parseInt(jComboBoxAno.getSelectedItem().toString()), jComboBoxPais.getSelectedItem().toString(), txtTmotor.getText(), txtNSM.getText(), txtNSC.getText(), Integer.parseInt(txtKilometraje.getText()), txtColor.getText(), Integer.parseInt(txtPrecio.getText()), Integer.parseInt(txtCedulaDueno.getText()));    
                        jsonVehiculos = control.modificarVehiculoJson(jsonVehiculos, txtPlaca.getText(), vehiculoJson);                 
                        txtModelo.setText("");
                        btnACEPTAR.setVisible(true);
                        txtTmotor.setText("");
                        txtNSM.setText("");
                        txtNSC.setText("");
                        txtKilometraje.setText("");
                        txtColor.setText("");  
                        txtPlaca.setText("");
                        txtPrecio.setText("");
                        jPanel2.setVisible(false);
                        txtPlaca.setEnabled(true);

                        JOptionPane.showMessageDialog(null, "Se ha modificado el vehiculo con exito.");
                        control.sacarDelArchivoJSONVehiculos(jsonVehiculos);
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
                          JOptionPane.showMessageDialog(null,"La cedula del cliente introducida, no existe. Introduzca una valida o deje un 0 (cero) si no tiene un comprador aun","ERROR",JOptionPane.ERROR_MESSAGE);
                          txtCedulaDueno.setText("");                          
                          btnACEPTAR.setVisible(true); 
                       } 
                    }             
                }
            }
        }else{        
            JOptionPane.showMessageDialog(null, "Rellene los campos, por favor.");
        }     
    }//GEN-LAST:event_btnModificarSActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
      if (txtPlaca.getText().length()>=7){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"La placa solo tiene un maximo de 7 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtNSMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNSMKeyTyped
     if (txtNSM.getText().length()>=10){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El numero de serie del motor acepta hasta 10 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_txtNSMKeyTyped

    private void txtNSCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNSCKeyTyped
     if (txtNSC.getText().length()>=17){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El numero de serie del chasis acepta hasta 17 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNSCKeyTyped

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

    private void txtKilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyTyped
 int control = Integer.parseInt(txtKilometraje.getText());
        if (txtKilometraje.getText().length()>10){
            evt.consume();
            getToolkit().beep();


            JOptionPane.showMessageDialog(null,"Este campo tiene un maximo de 10 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El kilometraje solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
                txtKilometraje.setText("");
            }else {
                if(control > 999999 || control < 0){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El kilometraje No puede ser mayo a 999.999 km","ERROR",JOptionPane.ERROR_MESSAGE);
                txtKilometraje.setText("");
            }
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

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
 int control = Integer.parseInt(txtPrecio.getText());
        if (txtPrecio.getText().length()>10){
            evt.consume();
            getToolkit().beep();


            JOptionPane.showMessageDialog(null,"Este campo tiene un maximo de 10 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El Precio solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
                txtKilometraje.setText("");
            }else {
                if(control > 999999 || control < 0){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El Precio No puede ser mayo a 999.999$","ERROR",JOptionPane.ERROR_MESSAGE);
                txtKilometraje.setText("");
            }
            }
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCedulaDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaDuenoActionPerformed

    private void txtCedulaDuenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaDuenoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaDuenoKeyTyped

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
            java.util.logging.Logger.getLogger(CG2ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CG2ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CG2ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CG2ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CG2ModificarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida2;
    private javax.swing.JLabel ano;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarS;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel color;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo3;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxPais;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kilometraje;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel marca1;
    private javax.swing.JLabel marca2;
    private javax.swing.JLabel marca3;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel numeroDeSerieChasis;
    private javax.swing.JLabel numeroDeSerieMotor;
    private javax.swing.JLabel paisManufactura;
    private javax.swing.JLabel placa;
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
