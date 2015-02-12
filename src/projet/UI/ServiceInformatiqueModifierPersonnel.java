/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.UI;

/**
 *
 * @author Manounette
 */
public class ServiceInformatiqueModifierPersonnel extends javax.swing.JFrame {
    private ServiceInformatiqueIU si;
    /**
     * Creates new form ServiceInformatiqueModifierPersonnel
     */
    public ServiceInformatiqueModifierPersonnel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelStatut = new javax.swing.JLabel();
        jLabelService = new javax.swing.JLabel();
        jComboBoxStatut = new javax.swing.JComboBox();
        jComboBoxService = new javax.swing.JComboBox();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabelNouveauStatut = new javax.swing.JLabel();
        jComboBoxNouveauStatut = new javax.swing.JComboBox();
        jLabelNouveauService = new javax.swing.JLabel();
        jComboBoxNouveauService = new javax.swing.JComboBox();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Modifier personnel médical");

        jLabelStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelStatut.setText("Statut :");

        jLabelService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelService.setText("Service :");

        jComboBoxStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxStatut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chef de service", "Praticien hospitalier", "Infirmière", "Interne", "Secrétaire médicale" }));

        jComboBoxService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anesthésie/Réanimation", "Bactériologie", "Cardiologie", "Chirurgie générale", "Cytologie", "Dermatologie", "Endocrinologie", "Gériatrie", "Gynécologie", "Neurologie", "Oncologie", "Pédiatrie", "Pneumologie", "Psychiatrie", "Radiologie" }));

        jLabelNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNom.setText("Nom :");

        jLabelPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPrenom.setText("Prénom :");

        jTextFieldPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelNouveauStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNouveauStatut.setText("Nouveau statut :");

        jComboBoxNouveauStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxNouveauStatut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chef de service", "Praticien hospitalier", "Infirmière", "Interne", "Secrétaire médicale" }));

        jLabelNouveauService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNouveauService.setText("Nouveau service :");

        jComboBoxNouveauService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxNouveauService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anesthésie/Réanimation", "Bactériologie", "Cardiologie", "Chirurgie générale", "Cytologie", "Dermatologie", "Endocrinologie", "Gériatrie", "Gynécologie", "Neurologie", "Oncologie", "Pédiatrie", "Pneumologie", "Psychiatrie", "Radiologie" }));

        jButtonOK.setBackground(new java.awt.Color(0, 51, 153));
        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonOK.setText("OK");

        jButtonAnnuler.setBackground(new java.awt.Color(0, 51, 153));
        jButtonAnnuler.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldNom)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelStatut)
                                .addGap(54, 54, 54)
                                .addComponent(jComboBoxStatut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNouveauService)
                                    .addComponent(jLabelService))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxService, 0, 180, Short.MAX_VALUE)
                                    .addComponent(jComboBoxNouveauService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNouveauStatut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxNouveauStatut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPrenom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatut)
                    .addComponent(jComboBoxStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNouveauStatut)
                    .addComponent(jComboBoxNouveauStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelService))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNouveauService)
                    .addComponent(jComboBoxNouveauService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonAnnuler))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
        si = new ServiceInformatiqueIU();
        si.setLocationRelativeTo(null);
        si.setResizable(false);  
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceInformatiqueModifierPersonnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxNouveauService;
    private javax.swing.JComboBox jComboBoxNouveauStatut;
    private javax.swing.JComboBox jComboBoxService;
    private javax.swing.JComboBox jComboBoxStatut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNouveauService;
    private javax.swing.JLabel jLabelNouveauStatut;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JLabel jLabelStatut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}