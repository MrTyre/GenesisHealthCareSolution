package projet.UI;

import java.sql.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projet.sih.*;

/**
 *
 * @author Tommy
 */
public class AjouterPrescriptionIU extends javax.swing.JFrame {

    //attributs
    private DefaultTableModel dtm;
    private String sql;
    private String sql2;
    private Patient currentPatient;
    private Prescription prescription = new Prescription();
    private DefaultListModel<Medicament> listeMed = new DefaultListModel();
    private ServiceCliniqueIU scUI;

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

        jPanel1.setPreferredSize(new java.awt.Dimension(702, 321));

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        jTextFieldPosologie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldPosologie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPosologieActionPerformed(evt);
            }
        });

        jTextFieldFinTraitementJour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("/");

        jTextFieldFinTraitementMois.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldFinTraitementMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFinTraitementMoisActionPerformed(evt);
            }
        });

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

        jButtonAddMed.setBackground(new java.awt.Color(153, 153, 255));
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMedicament)
                            .addComponent(jTextFieldMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPosologie, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addComponent(jTextFieldFinTraitementAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddMed))
                            .addComponent(jLabelDateFinTraitement))
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelDateFinTraitement)
                    .addComponent(jLabelMedicament))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPosologie)
                    .addComponent(jTextFieldFinTraitementJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFinTraitementMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFinTraitementAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddMed))
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonValider.setBackground(new java.awt.Color(153, 153, 255));
        jButtonValider.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonValider.setText("Valider prescription");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButtonAnnuler.setBackground(new java.awt.Color(153, 153, 255));
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
                        .addContainerGap(683, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonValider)
                        .addGap(163, 163, 163))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNouvellePrescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonValider))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        System.out.println(dtm.getRowCount());
        if (dtm.getRowCount() >= 1) {
            JOptionPane j = new JOptionPane();
            int retour = j.showConfirmDialog(this, "Êtes-vous sûr de vouloir ajouter cette prescription ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
            if (retour == JOptionPane.OK_OPTION) {
                ajouterPrescription();
                setVisible(false);
            } else {
                j.setVisible(false);
            }
        } else {
            JOptionPane j = new JOptionPane();
            j.showConfirmDialog(this, "Vous n'avez ajouté aucun médicament à la prescription", "Attention", JOptionPane.OK_CANCEL_OPTION);
        }
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

    private void jTextFieldPosologieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPosologieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPosologieActionPerformed

    private void jTextFieldFinTraitementMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFinTraitementMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFinTraitementMoisActionPerformed

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
        int jour = Integer.parseInt(jTextFieldFinTraitementJour.getText());
        int mois = Integer.parseInt(jTextFieldFinTraitementMois.getText());
        int annee = Integer.parseInt(jTextFieldFinTraitementAnnee.getText());
        Date d1 = new Date(System.currentTimeMillis());
        if ((jTextFieldMedicament.getText().equals("")) || (jTextFieldPosologie.getText().equals("")) || (jTextFieldFinTraitementJour.getText().equals("")) || (jTextFieldFinTraitementMois.getText().equals("")) || (jTextFieldFinTraitementAnnee.getText().equals(""))) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Veuillez entrer toutes les informations nécessaires", "Attention", JOptionPane.WARNING_MESSAGE);
        } else if ((jour > 31)
                || (mois > 12)
                || (annee < d1.getYear() + 1900)
                || ((annee == d1.getYear() + 1900) && (mois < d1.getMonth() + 1))
                || ((annee == d1.getYear() + 1900) && (mois == d1.getMonth() + 1) && (jour < d1.getDate()))) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Attention, la date de fin n'est pas correcte", "Attention", JOptionPane.WARNING_MESSAGE);
        } else {
            String medicament = jTextFieldMedicament.getText().substring(0, 1).toUpperCase().replaceAll("'", "''");
            medicament += jTextFieldMedicament.getText().substring(1, jTextFieldMedicament.getText().length()).toLowerCase().replaceAll("'", "''");
            String posologie = jTextFieldPosologie.getText().replaceAll("'", "''");
            Object dose = jComboBox1.getSelectedItem();
            UnitePosologie up = null;
            String doseString = "";
            if (dose == UnitePosologie.cc) {
                doseString = "cc";
                up = UnitePosologie.cc;
            }
            if (dose == UnitePosologie.comprimés) {
                doseString = "comprimés";
                up = UnitePosologie.comprimés;
            }
            if (dose == UnitePosologie.cs) {
                doseString = "cs";
                up = UnitePosologie.cs;
            }
            if (dose == UnitePosologie.dL) {
                doseString = "dL";
                up = UnitePosologie.dL;
            }
            if (dose == UnitePosologie.g) {
                doseString = "g";
                up = UnitePosologie.g;
            }
            if (dose == UnitePosologie.mL) {
                doseString = "mL";
                up = UnitePosologie.mL;
            }
            if (dose == UnitePosologie.mg) {
                doseString = "mg";
                up = UnitePosologie.mg;
            }
            if (dose == UnitePosologie.pulvérisations) {
                doseString = "pulvérisations";
                up = UnitePosologie.pulvérisations;
            }

            Date d = new Date(Integer.parseInt(jTextFieldFinTraitementAnnee.getText()) - 1900, Integer.parseInt(jTextFieldFinTraitementMois.getText()) - 1, Integer.parseInt(jTextFieldFinTraitementJour.getText()));
            String date = d.getDate() + "/" + (d.getMonth()+1) + "/" + (d.getYear()+1900);
            dtm.addRow(new Object[]{medicament, posologie, doseString, date});
            Medicament med = new Medicament(medicament, Double.parseDouble(posologie), up, d);
            prescription.getMedicaments().addElement(med);
            listeMed.addElement(med);
            jTextFieldMedicament.setText("");
            jTextFieldPosologie.setText("");
            jTextFieldFinTraitementJour.setText("");
            jTextFieldFinTraitementMois.setText("");
            jTextFieldFinTraitementAnnee.setText("");
            jPanel2.validate();
            jPanel2.repaint();
        }
    }

    public void ajouterPrescription() {

        try {
            for (int i = 0; i < listeMed.size(); i++) {
                sql = "INSERT INTO Medicament VALUES (" + Medicament.getIDMed() + ", "
                        + Prescription.getIDPresc() + ", '"
                        + listeMed.get(i).getNomMedoc() + "',"
                        + listeMed.get(i).getPosologie() + ", '"
                        + listeMed.get(i).getUnitePosoString(listeMed.get(i).getUnitePosologie()) + "','"
                        + listeMed.get(i).getDateFin() + "')";
                CHUPP.getInsert(sql);
            }
            java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
            sql2 = "INSERT INTO Prescription VALUES (" + Prescription.getIDPresc() + ","
                    + currentPatient.getIPP() + "," + ConnexionUI.getCurrentConnected().getID() + ",'"
                    + date + "')";
            CHUPP.getInsert(sql2);
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "La prescription a bien été ajoutée !", "Ajout prescription", JOptionPane.INFORMATION_MESSAGE);
            scUI.getjTextArea1().setText(currentPatient.getDpi().getDm().afficherPrescriptions(currentPatient));
            scUI.revalidate();
            scUI.repaint();
        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
        }
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox getjComboBox1() {
        return jComboBox1;
    }

    /**
     * @param currentPatient the currentPatient to set
     */
    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    /**
     * @param scUI the scUI to set
     */
    public void setScUI(ServiceCliniqueIU scUI) {
        this.scUI = scUI;
    }
}
