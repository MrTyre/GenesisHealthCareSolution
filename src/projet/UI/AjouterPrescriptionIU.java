
package projet.UI;

import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projet.sih.*;

/**
 *
 * @author Tommy
 */
public class AjouterPrescriptionIU extends javax.swing.JFrame {

    private int l = 0;
    private CHUPP chupp;
    DefaultTableModel dtm;

    /**
     * Creates new form AjouterPrescriptionIU
     */
    public AjouterPrescriptionIU() {
        initComponents();
        dtm = new DefaultTableModel(0, 0);
        jTableMedocs.setModel(dtm);
        dtm.addColumn("Nom du médicament");
        dtm.addColumn("Posologie");
        dtm.addColumn("Dose");
        dtm.addColumn("Date de fin de traitement");
        jComboBox1.setModel(new DefaultComboBoxModel<>(UnitePosologie.values()));
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
        jLabelDateFinTraitement = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedocs = new javax.swing.JTable();
        jLabelMedicament = new javax.swing.JLabel();
        jTextFieldMedicament = new javax.swing.JTextField();
        jTextFieldPosologie = new javax.swing.JTextField();
        jTextFieldFinTraitementJour = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFinTraitementMois = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFinTraitementAnnee = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButtonAddMed = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelNouvellePrescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelDateFinTraitement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDateFinTraitement.setText("Date de fin de traitement :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Dose/posologie :");

        jTableMedocs.setAutoCreateRowSorter(true);
        jTableMedocs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableMedocs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom médicament", "Posologie", "Unité posologie", "Date fin du traitement"
            }
        ));
        jScrollPane1.setViewportView(jTableMedocs);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)
        );

        jLabelMedicament.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMedicament.setText("Médicament :");

        jTextFieldMedicament.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldMedicament.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedicamentActionPerformed(evt);
            }
        });

        jTextFieldPosologie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPosologie.setText(" ");
        jTextFieldPosologie.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldFinTraitementJour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("/");

        jTextFieldFinTraitementMois.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("/");

        jTextFieldFinTraitementAnnee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldFinTraitementAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFinTraitementAnneeActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mg", "g" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButtonAddMed.setBackground(new java.awt.Color(0, 51, 153));
        jButtonAddMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddMed.setText("+");
        jButtonAddMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMedicament)
                            .addComponent(jTextFieldMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPosologie, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldFinTraitementJour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFinTraitementMois, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFinTraitementAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDateFinTraitement)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddMed)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelDateFinTraitement)
                    .addComponent(jLabelMedicament)
                    .addComponent(jButtonAddMed))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPosologie)
                    .addComponent(jTextFieldFinTraitementJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFinTraitementMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFinTraitementAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonValider.setBackground(new java.awt.Color(0, 51, 153));
        jButtonValider.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonValider.setText("Valider prescription");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButtonAnnuler.setBackground(new java.awt.Color(0, 51, 153));
        jButtonAnnuler.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jLabelNouvellePrescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNouvellePrescription.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNouvellePrescription.setText("Nouvelle prescription");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNouvellePrescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNouvellePrescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonValider))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        ajouterMedicament();
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jTextFieldFinTraitementAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFinTraitementAnneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFinTraitementAnneeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedicamentActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonAddMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMedActionPerformed
        ajouterMedicament();
    }//GEN-LAST:event_jButtonAddMedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMed;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDateFinTraitement;
    private javax.swing.JLabel jLabelMedicament;
    private javax.swing.JLabel jLabelNouvellePrescription;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedocs;
    private javax.swing.JTextField jTextFieldFinTraitementAnnee;
    private javax.swing.JTextField jTextFieldFinTraitementJour;
    private javax.swing.JTextField jTextFieldFinTraitementMois;
    private javax.swing.JTextField jTextFieldMedicament;
    private javax.swing.JTextField jTextFieldPosologie;
    // End of variables declaration//GEN-END:variables

    public void ajouterMedicament() {
        if ((jTextFieldMedicament.getText().equals("")) || (jTextFieldPosologie.getText().equals("")) || (jTextFieldFinTraitementJour.getText().equals("")) || (jTextFieldFinTraitementMois.getText().equals("")) || (jTextFieldFinTraitementAnnee.getText().equals(""))){
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null,"Veuillez entrer toutes les informations nécessaires","Attention",JOptionPane.WARNING_MESSAGE);
        }
        String medicament = jTextFieldMedicament.getText();
        String posologie = jTextFieldPosologie.getText();
        Object dose = jComboBox1.getSelectedItem();
        String doseString = "";
        if (dose == UnitePosologie.cc) {
            doseString = "cc";
        }
        if (dose == UnitePosologie.comprimés) {
            doseString = "comprimés";
        }
        if (dose == UnitePosologie.cs) {
            doseString = "cs";
        }
        if (dose == UnitePosologie.dL) {
            doseString = "dL";
        }
        if (dose == UnitePosologie.g) {
            doseString = "g";
        }
        if (dose == UnitePosologie.mL) {
            doseString = "mL";
        }
        if (dose == UnitePosologie.mg) {
            doseString = "mg";
        }
        if (dose == UnitePosologie.pulvérisations) {
            doseString = "pulvérisations";
        }

        Date d = new Date(Integer.parseInt(jTextFieldFinTraitementAnnee.getText()), Integer.parseInt(jTextFieldFinTraitementMois.getText()), Integer.parseInt(jTextFieldFinTraitementJour.getText()));
        String date = d.getDate() + "/" + d.getMonth() + "/" + d.getYear();
        dtm.addRow(new Object[] {medicament,posologie,doseString,date});       

        jTextFieldMedicament.setText("");
        jTextFieldPosologie.setText("");
        jTextFieldFinTraitementJour.setText("");
        jTextFieldFinTraitementMois.setText("");
        jTextFieldFinTraitementAnnee.setText("");
        jPanel2.validate();
        jPanel2.repaint();
        //ajouter a la BD
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox getjComboBox1() {
        return jComboBox1;
    }
}