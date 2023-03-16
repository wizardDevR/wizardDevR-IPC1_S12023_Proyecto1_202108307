package rpg2;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        lblKiosko.setVisible(false);
        cbKiosko.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        lblClase = new javax.swing.JLabel();
        brnRegresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblContraseña1 = new javax.swing.JLabel();
        txtConfirmacionContra = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        cbGenero = new javax.swing.JComboBox<>();
        cbRol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSobrenombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbNacionalidad = new javax.swing.JComboBox<>();
        cbKiosko = new javax.swing.JComboBox<>();
        lblKiosko = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setText("Nombre");

        txtNombre2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblClase.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblClase.setText("Rol");

        brnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        brnRegresar.setText("Regresar");
        brnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnRegresarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        txtDPI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblError.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Correo Electronico");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Genero");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("DPI");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Apellido");

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblContraseña1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblContraseña1.setText("Confirmacion de contraseña");

        txtConfirmacionContra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jdFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cbGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        cbRol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario Individual", "Usuario Empresarial", "Kiosko" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Nacionalidad");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Sobrenombre");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");

        txtSobrenombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cbNacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemalteco/a", "Mexicano/a", "Salvadoreño/a", "Hondureño/a", "Panameño/a", "Costarricense", "Colombiano/a" }));

        cbKiosko.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbKiosko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKioskoActionPerformed(evt);
            }
        });

        lblKiosko.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblKiosko.setText("Kiosko");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Registro Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(brnRegresar)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblError)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSobrenombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(lblContraseña)
                                    .addComponent(jLabel5))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContraseña1)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtConfirmacionContra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblClase))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKiosko)
                                    .addComponent(cbKiosko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 43, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblError))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraseña)
                            .addComponent(lblContraseña1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmacionContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobrenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKiosko)
                    .addComponent(lblClase))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbKiosko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnRegresar)
                    .addComponent(btnRegistrar))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    usuario[] usr;
    Inicio_sesion is;
    Kioskos[] kiosko;

    public void cargarClase(Inicio_sesion is, usuario[] usr, Kioskos[] kiosko) {
        this.is = is;
        this.usr = usr;
        this.kiosko = kiosko;
    }

    private void brnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnRegresarActionPerformed
        this.setVisible(false);
        is.setVisible(true);
    }//GEN-LAST:event_brnRegresarActionPerformed

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+/=_\\-!¡¿?])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtCorreo.getText().equals("") || txtNombre2.getText().equals("") || txtApellido.getText().equals("") || txtContraseña.getText().equals("") || txtConfirmacionContra.getText().equals("") || txtDPI.getText().equals("") || jdFechaNacimiento.toString().equals("") || txtSobrenombre.getText().equals("") || txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay algun dato que no ha sido ingresado");
        } else {
            boolean registrado = false;
            lblError.setText("");
            for (int i = 0; i < usr.length; i++) {
                if (usr[i] != null) {
                    if (usr[i].getNombre_usuario().equals(txtNombre2.getText()) || usr[i].getCorreo().equals(txtCorreo.getText()) || usr[i].getDPI() == Integer.parseInt(txtDPI.getText()) || usr[i].getTelefono() == Integer.parseInt(txtTelefono.getText())) {
                        JOptionPane.showMessageDialog(null, "Error, ya hay un usuario con los mismos datos");
                        registrado = true;
                        break;
                    }
                }
            }

            if (!isValidPassword(txtContraseña.getText())) {
                JOptionPane.showMessageDialog(null, "Error, la contraseña debe contener los datos que se le piden");
                registrado = true;
            }

            if (!txtContraseña.getText().equals(txtConfirmacionContra.getText())) {
                JOptionPane.showMessageDialog(null, "Error, las contraseñas no coinciden");
                registrado = true;
            }

            if (!registrado) {
                usuario sr = new usuario();

                sr.setCorreo(txtCorreo.getText());
                sr.setNombre_usuario(txtNombre2.getText());
                sr.setApellido(txtApellido.getText());
                sr.setContraseña(txtContraseña.getText());
                sr.setConfirmacionContra(txtConfirmacionContra.getText());
                sr.setDPI((int) Long.parseLong(txtDPI.getText()));
                sr.setRol(cbRol.getSelectedItem().toString());
                sr.setFechaNacimiento(jdFechaNacimiento.getDateFormatString());
                sr.setGenero(cbGenero.getSelectedItem().toString());
                sr.setNacionalidad(cbNacionalidad.getSelectedItem().toString());
                sr.setSobrenombre(txtSobrenombre.getText());
                sr.setTelefono(Integer.parseInt(txtTelefono.getText()));
                if(opcionKiosko == true){
                    sr.setCodigoKiosko(cbKiosko.getSelectedItem().toString());
                }

                for (int i = 0; i < usr.length; i++) {
                    if (usr[i] == null) {
                        JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                        lblError.setForeground(Color.blue);
                        usr[i] = sr;
                        break;
                    }
                }
                is.actualizarUsuario(usr);
            }
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed
 boolean opcionKiosko = false;
    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
       
        if (cbRol.getSelectedItem().equals("Kiosko")) {
            lblKiosko.setVisible(true);
            cbKiosko.setVisible(true);
            opcionKiosko = true;
        } else {
            lblKiosko.setVisible(false);
            cbKiosko.setVisible(false);
        }
        cbKiosko.removeAllItems();
        for (int i = 0; i < kiosko.length; i++) {
            if (kiosko[i] != null) {
                cbKiosko.addItem(kiosko[i].getNombre());
            }
        }
    }//GEN-LAST:event_cbRolActionPerformed
    Kioskos kio = new Kioskos();
    private void cbKioskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKioskoActionPerformed


    }//GEN-LAST:event_cbKioskoActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnRegresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbKiosko;
    private javax.swing.JComboBox<String> cbNacionalidad;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblKiosko;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtConfirmacionContra;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtSobrenombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
