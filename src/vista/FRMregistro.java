
package vista;


public class FRMregistro extends javax.swing.JInternalFrame {

    public FRMregistro() {
        initComponents();
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTNRegistrar = new javax.swing.JButton();
        TXTCorreo = new javax.swing.JTextField();
        TXTNombres = new javax.swing.JTextField();
        LBLNombre = new javax.swing.JLabel();
        LBLCorreo = new javax.swing.JLabel();
        LBLContrasena = new javax.swing.JLabel();
        LBLContrasena1 = new javax.swing.JLabel();
        LBLTelefono = new javax.swing.JLabel();
        TXTTelefono = new javax.swing.JTextField();
        TXTContrasena = new javax.swing.JPasswordField();
        TXTidRegistro = new javax.swing.JFormattedTextField();
        BTNVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Formulario Registros");
        setEnabled(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setEnabled(false);

        BTNRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/001-enter.png"))); // NOI18N
        BTNRegistrar.setText("Registrar");
        BTNRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrarActionPerformed(evt);
            }
        });

        TXTCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCorreoActionPerformed(evt);
            }
        });

        TXTNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LBLNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLNombre.setText("Nombres:");

        LBLCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLCorreo.setText("Correo:");

        LBLContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLContrasena.setText("Contraseña:");

        LBLTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLTelefono.setText("Telefono:");

        TXTTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTTelefonoActionPerformed(evt);
            }
        });

        TXTContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TXTContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTContrasenaActionPerformed(evt);
            }
        });

        BTNVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/001-left-arrow.png"))); // NOI18N
        BTNVolver.setText("VOLVER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLNombre)
                            .addComponent(LBLCorreo)
                            .addComponent(LBLTelefono)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(LBLContrasena1))
                            .addComponent(LBLContrasena))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TXTidRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BTNRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TXTidRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre)
                    .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLTelefono)
                    .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCorreo)
                    .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLContrasena)
                    .addComponent(TXTContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBLContrasena1))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/001-group.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarActionPerformed
   
    }//GEN-LAST:event_BTNRegistrarActionPerformed

    private void TXTCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCorreoActionPerformed

    private void TXTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTTelefonoActionPerformed

    private void TXTContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTContrasenaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTNRegistrar;
    private javax.swing.JButton BTNVolver;
    private javax.swing.JLabel LBLContrasena;
    private javax.swing.JLabel LBLContrasena1;
    private javax.swing.JLabel LBLCorreo;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBLTelefono;
    private javax.swing.JPasswordField TXTContrasena;
    public javax.swing.JTextField TXTCorreo;
    public javax.swing.JTextField TXTNombres;
    public javax.swing.JTextField TXTTelefono;
    private javax.swing.JFormattedTextField TXTidRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
