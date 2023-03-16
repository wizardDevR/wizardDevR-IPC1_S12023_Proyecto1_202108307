package rpg2;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Random;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.jTabbedPane1.setTitleAt(0, "Registro tarjetas");
        this.jTabbedPane1.setTitleAt(1, "Registro datos de facturacion");
        this.jTabbedPane1.setTitleAt(2, "Cotizacion de paquetes");
        this.jTabbedPane1.setTitleAt(3, "compra");
        this.jTabbedPane1.setTitleAt(4, "Ver envios solicitados");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTarjeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaVencimiento = new javax.swing.JTextField();
        jButtobtnIngresarTarjeta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbTarjetasDisponibles = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbDepartamentosOrigen = new javax.swing.JComboBox<>();
        cbMunicipiosOrigen = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbMunicipiosDestino = new javax.swing.JComboBox<>();
        cbDepartamentosDestino = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroPaquetes = new javax.swing.JTextField();
        chEspecial = new javax.swing.JCheckBox();
        chMediano = new javax.swing.JCheckBox();
        chGrande = new javax.swing.JCheckBox();
        btnCotizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        chPequeno = new javax.swing.JCheckBox();
        chEstandar = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        lblServicioEspecial = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblll = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lblServicioEstandar1 = new javax.swing.JLabel();
        lll = new javax.swing.JLabel();
        las = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        checkCobraTarjeta = new javax.swing.JCheckBox();
        checkPagoEntrega = new javax.swing.JCheckBox();
        lblIngreseCodigo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbTarjetasDisponibles6 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblNit = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnDescargarFactura = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        lblTipoServicio = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        ghjh = new javax.swing.JLabel();
        ghjhop = new javax.swing.JLabel();
        ghjhmm = new javax.swing.JLabel();
        ghjhpoi = new javax.swing.JLabel();
        pppghjh = new javax.swing.JLabel();
        lbltiposervicioo = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lbltipooooo = new javax.swing.JLabel();
        lbltotaaal = new javax.swing.JLabel();
        lblCodigoPaquete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Usuario:");

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblUsuario.setText("--");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Registro de tarjeta de crédito/débito ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre tarjeta");

        txtNombreTarjeta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTarjetaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero tarjeta");

        txtNumeroTarjeta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumeroTarjeta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de vencimiento(formato mm/dd)");

        txtFechaVencimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));

        jButtobtnIngresarTarjeta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtobtnIngresarTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        jButtobtnIngresarTarjeta.setText("Ingresar");
        jButtobtnIngresarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtobtnIngresarTarjetaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tarjetas disponibles: ");

        cbTarjetasDisponibles.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbTarjetasDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        cbTarjetasDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", " " }));
        cbTarjetasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTarjetasDisponiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtobtnIngresarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTarjetasDisponibles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(158, 158, 158)))
                        .addGap(99, 99, 99))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(txtNombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel30)))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTarjetasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtobtnIngresarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Registro de datos de facturación ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre completo");

        txtNombreCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Direccion");

        txtDireccionCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nit");

        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Ingresar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel31)
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Cotización de paquetes ");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Origen");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        cbDepartamentosOrigen.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbDepartamentosOrigen.setForeground(new java.awt.Color(0, 0, 0));
        cbDepartamentosOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", " " }));
        cbDepartamentosOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentosOrigenActionPerformed(evt);
            }
        });
        jPanel3.add(cbDepartamentosOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 193, -1));

        cbMunicipiosOrigen.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbMunicipiosOrigen.setForeground(new java.awt.Color(0, 0, 0));
        cbMunicipiosOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", " " }));
        cbMunicipiosOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipiosOrigenActionPerformed(evt);
            }
        });
        jPanel3.add(cbMunicipiosOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 193, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Destino");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        cbMunicipiosDestino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbMunicipiosDestino.setForeground(new java.awt.Color(0, 0, 0));
        cbMunicipiosDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", " " }));
        cbMunicipiosDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipiosDestinoActionPerformed(evt);
            }
        });
        jPanel3.add(cbMunicipiosDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 193, -1));

        cbDepartamentosDestino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbDepartamentosDestino.setForeground(new java.awt.Color(0, 0, 0));
        cbDepartamentosDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", " " }));
        cbDepartamentosDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentosDestinoActionPerformed(evt);
            }
        });
        jPanel3.add(cbDepartamentosDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 193, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Numero de paquetes");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        txtNumeroPaquetes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumeroPaquetes.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtNumeroPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 80, -1));

        chEspecial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chEspecial.setForeground(new java.awt.Color(0, 0, 0));
        chEspecial.setText("Servicio Especial");
        chEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chEspecialActionPerformed(evt);
            }
        });
        jPanel3.add(chEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        chMediano.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chMediano.setForeground(new java.awt.Color(0, 0, 0));
        chMediano.setText("Mediano(Q10)");
        chMediano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chMedianoActionPerformed(evt);
            }
        });
        jPanel3.add(chMediano, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        chGrande.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chGrande.setForeground(new java.awt.Color(0, 0, 0));
        chGrande.setText("Grande(Q15)");
        chGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chGrandeActionPerformed(evt);
            }
        });
        jPanel3.add(chGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        btnCotizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(0, 0, 0));
        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 100, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total:    ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        chPequeno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chPequeno.setForeground(new java.awt.Color(0, 0, 0));
        chPequeno.setText(" Pequeño (Q5)");
        chPequeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPequenoActionPerformed(evt);
            }
        });
        jPanel3.add(chPequeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        chEstandar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chEstandar.setForeground(new java.awt.Color(0, 0, 0));
        chEstandar.setText(" Servicio Estandar");
        chEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chEstandarActionPerformed(evt);
            }
        });
        jPanel3.add(chEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 610, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tamaño de los paquetes");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        lblServicioEspecial.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblServicioEspecial.setForeground(new java.awt.Color(0, 0, 0));
        lblServicioEspecial.setText("-");
        jPanel3.add(lblServicioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Total:    ");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        lblll.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblll.setForeground(new java.awt.Color(0, 0, 0));
        lblll.setText("Q");
        jPanel3.add(lblll, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Mostrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        lblServicioEstandar1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblServicioEstandar1.setForeground(new java.awt.Color(0, 0, 0));
        lblServicioEstandar1.setText("-");
        jPanel3.add(lblServicioEstandar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        lll.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lll.setForeground(new java.awt.Color(0, 0, 0));
        lll.setText("Q");
        jPanel3.add(lll, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        las.setText("jLabel12");
        jPanel3.add(las, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jTabbedPane1.addTab("tab4", jPanel3);

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Compra");

        lblSeleccione.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblSeleccione.setForeground(new java.awt.Color(0, 0, 0));
        lblSeleccione.setText("Seleccione la tarjeta");

        checkCobraTarjeta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkCobraTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        checkCobraTarjeta.setText("Cobrar a mi cuenta");
        checkCobraTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCobraTarjetaActionPerformed(evt);
            }
        });

        checkPagoEntrega.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkPagoEntrega.setForeground(new java.awt.Color(0, 0, 0));
        checkPagoEntrega.setText("Pago contra entrega(cobro adicional de Q5)");
        checkPagoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPagoEntregaActionPerformed(evt);
            }
        });

        lblIngreseCodigo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblIngreseCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblIngreseCodigo.setText("Ingrese el codigo CVV de 3 digitos");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Tipo de pago");

        txtCVV.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Datos de facturación");

        cbTarjetasDisponibles6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbTarjetasDisponibles6.setForeground(new java.awt.Color(0, 0, 0));
        cbTarjetasDisponibles6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", " " }));
        cbTarjetasDisponibles6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTarjetasDisponibles6ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Nombre completo");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Direccion");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Nit");

        lblNombreCliente.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCliente.setText("Brayan Oswaldo Rojas Morale");

        lblDireccionCliente.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        lblDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccionCliente.setText("Zona 6 de mixco");

        lblNit.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        lblNit.setForeground(new java.awt.Color(0, 0, 0));
        lblNit.setText("12345678910");

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Descargar Guía");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnDescargarFactura.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDescargarFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnDescargarFactura.setText("Descargar Factura");
        btnDescargarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarFacturaActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Realizar pago");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Servicio: ");

        lblTipoServicio.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTipoServicio.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoServicio.setText("--");

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Total: ");

        lblTotal.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("--");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(lblTipoServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotal))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkPagoEntrega)
                            .addComponent(checkCobraTarjeta)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblSeleccione)
                                .addGap(103, 103, 103))
                            .addComponent(cbTarjetasDisponibles6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIngreseCodigo))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnDescargarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccionCliente)
                                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNit))
                                .addGap(95, 95, 95))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(208, 208, 208))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPagoEntrega)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkCobraTarjeta)
                    .addComponent(lblNombreCliente))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccionCliente))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTarjetasDisponibles6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(lblTotal))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(lblTipoServicio)))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(lblIngreseCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnDescargarFactura))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("tab5", jPanel4);

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Ver envíos solicitados ");

        ghjh.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        ghjh.setForeground(new java.awt.Color(0, 0, 0));
        ghjh.setText("Codigo de paquete");

        ghjhop.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        ghjhop.setForeground(new java.awt.Color(0, 0, 0));
        ghjhop.setText("Destinatario");

        ghjhmm.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        ghjhmm.setForeground(new java.awt.Color(0, 0, 0));
        ghjhmm.setText("Tipo de servicio");

        ghjhpoi.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        ghjhpoi.setForeground(new java.awt.Color(0, 0, 0));
        ghjhpoi.setText("Total de envio");

        pppghjh.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        pppghjh.setForeground(new java.awt.Color(0, 0, 0));
        pppghjh.setText("Tipo de pago");

        lbltiposervicioo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbltiposervicioo.setForeground(new java.awt.Color(0, 0, 0));
        lbltiposervicioo.setText("-");

        lblDestino.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(0, 0, 0));
        lblDestino.setText("-");

        lbltipooooo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbltipooooo.setForeground(new java.awt.Color(0, 0, 0));
        lbltipooooo.setText("-");

        lbltotaaal.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbltotaaal.setForeground(new java.awt.Color(0, 0, 0));
        lbltotaaal.setText("-");

        lblCodigoPaquete.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblCodigoPaquete.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoPaquete.setText("IPC1G1ha7e");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel35))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ghjhpoi)
                            .addComponent(ghjhop)
                            .addComponent(pppghjh)
                            .addComponent(ghjhmm)
                            .addComponent(ghjh))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoPaquete)
                            .addComponent(lbltiposervicioo)
                            .addComponent(lbltipooooo)
                            .addComponent(lblDestino)
                            .addComponent(lbltotaaal))))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel35)
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghjh)
                    .addComponent(lblCodigoPaquete))
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghjhmm)
                    .addComponent(lbltiposervicioo))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghjhop)
                    .addComponent(lblDestino))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghjhpoi)
                    .addComponent(lbltotaaal))
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pppghjh)
                    .addComponent(lbltipooooo))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab9", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnCerrarSesion)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Inicio_sesion is;
    usuario user;
    Datos_facturacion facturacion;
    usuario[] usr;
    Tarjetas_debito[] tar;
    Datos_facturacion[] fac;
    Admin_Departamentos[] admin;
    Admin_Municipios[] muni;

    public void cargarClase(Inicio_sesion is, Tarjetas_debito[] tar, Datos_facturacion[] fac, Admin_Departamentos[] admin, Admin_Municipios[] muni) {
        this.is = is;
        this.tar = tar;
        this.fac = fac;
        this.admin = admin;
        this.muni = muni;
    }

    public void setUsr(usuario user) {
        this.user = user;
        lblUsuario.setText(user.getNombre_usuario());
    }

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.setVisible(false);
        is.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jButtobtnIngresarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtobtnIngresarTarjetaActionPerformed
        if (txtNombreTarjeta.getText().equals("") || txtNumeroTarjeta.getText().equals("") || txtFechaVencimiento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay algun dato que no ha sido ingresado");
        } else {
            boolean tarjetaIngresada = false;
            for (int i = 0; i < tar.length; i++) {
                if (tar[i] != null) {
                    if (tar[i].getNumero().equals(txtNumeroTarjeta.getText())) {
                        JOptionPane.showMessageDialog(null, "Error, ya hay una tarjeta con los mismos datos");
                        tarjetaIngresada = true;
                        break;
                    }
                }
            }

            if (!tarjetaIngresada) {
                Tarjetas_debito tarD = new Tarjetas_debito();

                String numeroSeleccionado = txtNumeroTarjeta.getText();
                String ultimosCuatroDigitos = numeroSeleccionado.substring(numeroSeleccionado.length() - 4);
                String primerosSieteDigitosOfuscados = "*******" + ultimosCuatroDigitos;

                tarD.setNombre(txtNombreTarjeta.getText());
                tarD.setNumero(primerosSieteDigitosOfuscados);
                tarD.setFechaVencimiento(txtFechaVencimiento.getText());

                for (int i = 0; i < tar.length; i++) {
                    if (tar[i] == null) {
                        JOptionPane.showMessageDialog(null, "Tarjeta registrada con exito");
                        tar[i] = tarD;
                        break;
                    }
                }

            }
            cbTarjetasDisponibles.removeAllItems();
            for (int i = 0; i < tar.length; i++) {
                if (tar[i] != null) {
                    cbTarjetasDisponibles.addItem(tar[i].getNumero());
                }
            }

            cbTarjetasDisponibles6.removeAllItems();
            for (int i = 0; i < tar.length; i++) {
                if (tar[i] != null) {
                    cbTarjetasDisponibles6.addItem(tar[i].getNumero());
                }
            }
            is.actualizarTarjetas(tar);
        }
    }//GEN-LAST:event_jButtobtnIngresarTarjetaActionPerformed

    private void cbTarjetasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTarjetasDisponiblesActionPerformed

    }//GEN-LAST:event_cbTarjetasDisponiblesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNombreCliente.getText().equals("") || txtDireccionCliente.getText().equals("") || txtNit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay algun dato que no ha sido ingresado");
        } else {
            boolean ingresadofactu = false;
            for (int i = 0; i < fac.length; i++) {
                if (fac[i] != null) {
                    if (fac[i].getNombreCliente().equals(txtNombreCliente.getText()) || fac[i].getDireccion().equals(txtDireccionCliente.getText()) || fac[i].getNit().equals(txtNit.getText())) {
                        JOptionPane.showMessageDialog(null, "Error, ya hay un cliente con los mismos datos");
                        ingresadofactu = true;
                        break;
                    }
                }
            }

            if (!ingresadofactu) {
                Datos_facturacion factu = new Datos_facturacion();

                factu.setNombreCliente(txtNombreCliente.getText());
                factu.setDireccion(txtDireccionCliente.getText());
                factu.setNit(txtNit.getText());

                for (int i = 0; i < fac.length; i++) {
                    if (fac[i] == null) {
                        JOptionPane.showMessageDialog(null, "Datos registrados con exito");
                        fac[i] = factu;
                        break;
                    }
                }
                is.actualizarDatosFacturacion(fac);

                lblNombreCliente.setText(txtNombreCliente.getText());
                lblDireccionCliente.setText(txtDireccionCliente.getText());
                lblNit.setText(txtNit.getText());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbDepartamentosOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentosOrigenActionPerformed

    }//GEN-LAST:event_cbDepartamentosOrigenActionPerformed

    private void cbMunicipiosOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipiosOrigenActionPerformed

    }//GEN-LAST:event_cbMunicipiosOrigenActionPerformed

    private void cbMunicipiosDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipiosDestinoActionPerformed

    }//GEN-LAST:event_cbMunicipiosDestinoActionPerformed

    private void cbDepartamentosDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentosDestinoActionPerformed

    }//GEN-LAST:event_cbDepartamentosDestinoActionPerformed

    private void cbTarjetasDisponibles6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTarjetasDisponibles6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTarjetasDisponibles6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String tablaP = "";
        // Generacion de html para reportes

        tablaP = "<table>"
                + "    <tr><th >" + "Codigo de paquete: No: 000123A2023" + "</th></tr>"
                + "    <tr><th>" + "Origen: " + cbDepartamentosOrigen.getSelectedItem().toString() + "/" + cbMunicipiosOrigen.getSelectedItem().toString() + "</th></tr>"
                + "    <tr><th>" + "Destino: " + cbDepartamentosDestino.getSelectedItem().toString() + "/" + cbMunicipiosDestino.getSelectedItem().toString() + "</th></tr>"
                + "   <tr><th>" + "Tipo de pago: " + tipo + "</th></tr>"
                + "    <tr><th>" + "Tamaño del paquete: " + elejido + "</th></tr>"
                + "    <tr><th>" + "Numero de paquetes: " + txtNumeroPaquetes.getText() + "</th></tr>"
                + "    <tr><th>" + "Codigo de paquete: " + "IPC1G1ha7e" + "</th></tr>"
                + "    <tr><th>" + "Fecha de envio: " + "15/03/2023" + "</th></tr>"
                + "    <tr><th>" + "Total a pagar: " + lblTotal.getText() + "</th></tr>"
                + "  </table>";

        tablaP += "</table>";
        String estructura_html = "<html><body><h1>Factura</h1>" + tablaP + "</body></html>";
        File archivo = new File("reporte.html");
        try {

            //codigo para escribir el archivo
            archivo.createNewFile();
            FileWriter escritor_archivo = new FileWriter("reporte.html");
            escritor_archivo.write(estructura_html);
            escritor_archivo.close();
            //codigo para abrir el archivo creado 
            Desktop abridor = Desktop.getDesktop();
            abridor.open(archivo);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkPagoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPagoEntregaActionPerformed
        checkPagoEntrega.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkPagoEntrega.isSelected()) {
                    checkCobraTarjeta.setEnabled(false);
                } else {
                    checkCobraTarjeta.setEnabled(true);
                }
                lblSeleccione.setVisible(false);
                cbTarjetasDisponibles6.setVisible(false);
                lblIngreseCodigo.setVisible(false);
                txtCVV.setVisible(false);

            }
        });
    }//GEN-LAST:event_checkPagoEntregaActionPerformed

    private void checkCobraTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCobraTarjetaActionPerformed
        checkCobraTarjeta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkCobraTarjeta.isSelected()) {
                    checkPagoEntrega.setEnabled(false);
                } else {
                    checkPagoEntrega.setEnabled(true);
                }
                lblSeleccione.setVisible(true);
                cbTarjetasDisponibles6.setVisible(true);
                lblIngreseCodigo.setVisible(true);
                txtCVV.setVisible(true);
            }
        });
    }//GEN-LAST:event_checkCobraTarjetaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cbDepartamentosOrigen.removeAllItems();
        cbMunicipiosDestino.removeAllItems();
        cbDepartamentosDestino.removeAllItems();
        cbMunicipiosOrigen.removeAllItems();
        for (int i = 0; i < admin.length; i++) {
            if (admin[i] != null) {
                cbDepartamentosOrigen.addItem(admin[i].getNombreDepartamento());
            }
        }

        for (int i = 0; i < admin.length; i++) {
            if (admin[i] != null) {
                cbDepartamentosDestino.addItem(admin[i].getNombreDepartamento());
            }
        }

        for (int i = 0; i < muni.length; i++) {
            if (muni[i] != null) {
                cbMunicipiosDestino.addItem(muni[i].getNombreMunicipio());
            }
        }

        for (int i = 0; i < muni.length; i++) {
            if (muni[i] != null) {
                cbMunicipiosOrigen.addItem(muni[i].getNombreMunicipio());
            }
        }

    }//GEN-LAST:event_jButton6ActionPerformed
    double rEstandar = 0;
    double rEspecial = 0;
    double totalEstandar = 0;
    double totalEspecial = 0;


    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        las.setText("hola");
        if (txtNumeroPaquetes.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay algun dato que no ha sido ingresado");
        } else {
            int numPaquetes = Integer.parseInt(txtNumeroPaquetes.getText());
            String region = "";
            String texto = "";
            if (chPequeno.isSelected()) {
                for (int i = 0; i < admin.length; i++) {
                    texto = admin[i].getNombreDepartamento();
                    if (cbDepartamentosDestino.getSelectedItem().equals(texto)) {
                        region = admin[i].getCodigoRegion();
                        switch (region) {
                            case "M":
                                rEstandar = 35;
                                rEspecial = 25;
                                break;
                            case "NT":
                                rEstandar = 68.50;
                                rEspecial = 45.55;
                                break;
                            case "NO":
                                rEstandar = 58.68;
                                rEspecial = 35.48;
                                break;
                            case "SO":
                                rEstandar = 38.68;
                                rEspecial = 32.48;
                                break;
                            case "SOC":
                                rEstandar = 34;
                                rEspecial = 29;
                                break;
                            case "NOC":
                                rEstandar = 44.50;
                                rEspecial = 40;
                                break;
                        }
                        totalEstandar = 5 * numPaquetes * rEstandar;
                        totalEspecial = 5 * numPaquetes * rEspecial;
                        break;
                    }
                }
            } else if (chMediano.isSelected()) {
                for (int i = 0; i < admin.length; i++) {
                    texto = admin[i].getNombreDepartamento();
                    if (cbDepartamentosDestino.getSelectedItem().equals(texto)) {
                        region = admin[i].getCodigoRegion();
                        switch (region) {
                            case "M":
                                rEstandar = 35;
                                rEspecial = 25;
                                break;
                            case "NT":
                                rEstandar = 68.50;
                                rEspecial = 45.55;
                                break;
                            case "NO":
                                rEstandar = 58.68;
                                rEspecial = 35.48;
                                break;
                            case "SO":
                                rEstandar = 38.68;
                                rEspecial = 32.48;
                                break;
                            case "SOC":
                                rEstandar = 34;
                                rEspecial = 29;
                                break;
                            case "NOC":
                                rEstandar = 44.50;
                                rEspecial = 40;
                                break;
                        }
                        totalEstandar = 10 * numPaquetes * rEstandar;
                        totalEspecial = 10 * numPaquetes * rEspecial;
                        break;
                    }
                }
            } else if (chGrande.isSelected()) {
                for (int i = 0; i < admin.length; i++) {
                    texto = admin[i].getNombreDepartamento();
                    if (cbDepartamentosDestino.getSelectedItem().equals(texto)) {
                        region = admin[i].getCodigoRegion();
                        switch (region) {
                            case "M":
                                rEstandar = 35;
                                rEspecial = 25;
                                break;
                            case "NT":
                                rEstandar = 68.50;
                                rEspecial = 45.55;
                                break;
                            case "NO":
                                rEstandar = 58.68;
                                rEspecial = 35.48;
                                break;
                            case "SO":
                                rEstandar = 38.68;
                                rEspecial = 32.48;
                                break;
                            case "SOC":
                                rEstandar = 34;
                                rEspecial = 29;
                                break;
                            case "NOC   ":
                                rEstandar = 44.50;
                                rEspecial = 40;
                                break;
                        }
                        totalEstandar = 15 * numPaquetes * rEstandar;
                        totalEspecial = 15 * numPaquetes * rEspecial;
                        break;
                    }
                }
            }
            lblServicioEstandar1.setText(Double.toString(totalEstandar));
            lblServicioEspecial.setText(Double.toString(totalEspecial));
        }
    }//GEN-LAST:event_btnCotizarActionPerformed
    String tipo;

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (checkPagoEntrega.isSelected()) {
            double Total = 0;
            if (chEstandar.isSelected()) {
                lblTipoServicio.setText("Estandar");
                Total = totalEstandar + 5;
                lblTotal.setText(Double.toString(Total));
            } else if (chEspecial.isSelected()) {
                lblTipoServicio.setText("Especial");
                Total = totalEspecial + 5;
                lblTotal.setText(Double.toString(Total));
            }
            tipo = "Pago contra entrega";
        } else if (checkCobraTarjeta.isSelected()) {
            if (txtCVV.getText().length() > 3 || txtCVV.getText().length() < 3) {
                JOptionPane.showMessageDialog(null, "Error, el cvv tiene que ser igual a tres digitos");
            } else {
                double Total = 0;
                if (chEstandar.isSelected()) {
                    lblTipoServicio.setText("Estandar");
                    Total = totalEstandar;
                    lblTotal.setText(Double.toString(Total));
                } else if (chEspecial.isSelected()) {
                    lblTipoServicio.setText("Especial");
                    Total = totalEspecial;
                    lblTotal.setText(Double.toString(Total));
                }
            }
            tipo = "Cobrar con tarjeta";
        }

        lbltiposervicioo.setText(lblTipoServicio.getText());
        lblDestino.setText(cbDepartamentosDestino.getSelectedItem().toString());
        lbltotaaal.setText(lblTotal.getText());
        lbltipooooo.setText(tipo);
    }//GEN-LAST:event_jButton5ActionPerformed
    String elejido;
    private void chPequenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPequenoActionPerformed
        chPequeno.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chPequeno.isSelected()) {
                    chMediano.setEnabled(false);
                    chGrande.setEnabled(false);
                    elejido = "pequeño";
                } else {
                    chMediano.setEnabled(true);
                    chGrande.setEnabled(true);
                }
            }
        });

    }//GEN-LAST:event_chPequenoActionPerformed

    private void chMedianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chMedianoActionPerformed
        chMediano.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chMediano.isSelected()) {
                    chPequeno.setEnabled(false);
                    chGrande.setEnabled(false);
                    elejido = "Mediano";
                } else {
                    chPequeno.setEnabled(true);
                    chGrande.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_chMedianoActionPerformed

    private void chGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chGrandeActionPerformed
        chGrande.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chGrande.isSelected()) {
                    chPequeno.setEnabled(false);
                    chMediano.setEnabled(false);
                    elejido = "Grande";
                } else {
                    chPequeno.setEnabled(true);
                    chMediano.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_chGrandeActionPerformed

    private void chEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chEstandarActionPerformed
        chEstandar.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chEstandar.isSelected()) {
                    chEspecial.setEnabled(false);
                    lblServicioEstandar1.setForeground(Color.blue);
                } else {
                    chEspecial.setEnabled(true);
                    lblServicioEstandar1.setForeground(Color.black);
                }
            }
        });
    }//GEN-LAST:event_chEstandarActionPerformed

    private void chEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chEspecialActionPerformed
        chEspecial.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chEspecial.isSelected()) {
                    chEstandar.setEnabled(false);
                    lblServicioEspecial.setForeground(Color.blue);
                } else {
                    chEstandar.setEnabled(true);
                    lblServicioEspecial.setForeground(Color.black);
                }
            }
        });
    }//GEN-LAST:event_chEspecialActionPerformed

    private void txtNombreTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTarjetaActionPerformed

    private void btnDescargarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarFacturaActionPerformed

        String tablaPrimera = "";
        // Generacion de html para reportes

        tablaPrimera = "<table>"
                + "    <tr><th >" + "NumFactura: No: 000123A2023" + "</th></tr>"
                + "    <tr><th>" + "Codigo paquete: IPC1G1ha7e" + "</th></tr>"
                + "    <tr><th>" + "Origen: " + cbDepartamentosOrigen.getSelectedItem().toString() + "</th></tr>"
                + "    <tr><th>" + "Destino: " + cbDepartamentosDestino.getSelectedItem().toString() + "</th></tr>"
                + "   <tr><th>" + "NIT: " + txtNit.getText() + "</th></tr>"
                + "    <tr><th>" + "Tipo de pago: " + tipo + "</th></tr>"
                + "  </table>";

        String estructura_de_tabla_de_html = "<table><tr>\n"
                + "    <th style=\"border: 1px solid black; padding: 5px;\">Numero de paquete</th>\n"
                + "    <th style=\"border: 1px solid black; padding: 5px;\">Tamaño de paquete</th>\n"
                + "    <th style=\"border: 1px solid black; padding: 5px;\">Total de pago</th>\n"
                + "  </tr>";

        estructura_de_tabla_de_html += "<tr>"
                + "    <th style=\"border: 1px solid black; padding: 5px;\">" + txtNumeroPaquetes.getText() + "</th>"
                + "    <th style=\"border: 1px solid black; padding: 5px;\">" + elejido + "</th>"
                + "    <th style=\"border: 1px solid black; padding: 5px;\">" + lblTotal.getText() + "</th>"
                + "  </tr>";

        estructura_de_tabla_de_html += "</table>";
        String estructura_html = "<html><body><h1>Factura</h1>" + tablaPrimera + estructura_de_tabla_de_html + "</body></html>";
        File archivo = new File("reporte.html");
        try {

            //codigo para escribir el archivo
            archivo.createNewFile();
            FileWriter escritor_archivo = new FileWriter("reporte.html");
            escritor_archivo.write(estructura_html);
            escritor_archivo.close();
            //codigo para abrir el archivo creado 
            Desktop abridor = Desktop.getDesktop();
            abridor.open(archivo);

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnDescargarFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnDescargarFactura;
    private javax.swing.JComboBox<String> cbDepartamentosDestino;
    private javax.swing.JComboBox<String> cbDepartamentosOrigen;
    private javax.swing.JComboBox<String> cbMunicipiosDestino;
    private javax.swing.JComboBox<String> cbMunicipiosOrigen;
    private javax.swing.JComboBox<String> cbTarjetasDisponibles;
    private javax.swing.JComboBox<String> cbTarjetasDisponibles6;
    private javax.swing.JCheckBox chEspecial;
    private javax.swing.JCheckBox chEstandar;
    private javax.swing.JCheckBox chGrande;
    private javax.swing.JCheckBox chMediano;
    private javax.swing.JCheckBox chPequeno;
    private javax.swing.JCheckBox checkCobraTarjeta;
    private javax.swing.JCheckBox checkPagoEntrega;
    private javax.swing.JLabel ghjh;
    private javax.swing.JLabel ghjhmm;
    private javax.swing.JLabel ghjhop;
    private javax.swing.JLabel ghjhpoi;
    private javax.swing.JButton jButtobtnIngresarTarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel las;
    private javax.swing.JLabel lblCodigoPaquete;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblIngreseCodigo;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblServicioEspecial;
    private javax.swing.JLabel lblServicioEstandar1;
    private javax.swing.JLabel lblTipoServicio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblll;
    private javax.swing.JLabel lbltipooooo;
    private javax.swing.JLabel lbltiposervicioo;
    private javax.swing.JLabel lbltotaaal;
    private javax.swing.JLabel lll;
    private javax.swing.JLabel pppghjh;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreTarjeta;
    private javax.swing.JTextField txtNumeroPaquetes;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables

}
