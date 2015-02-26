/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import javax.print.attribute.standard.Severity;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projet.sih.*;
import sun.security.krb5.Config;

/**
 *
 * @author Tommy
 */
public class AjouterPatientIU extends javax.swing.JFrame {

    private CHUPP chupp;
    private Pays pays;
    private Sexe sexe;
    private ServiceCliniqueSecretaireUI scs;
    private String sql;

    /**
     * Creates new form AjouterPatientIU
     */
    public AjouterPatientIU() {
        initComponents();
        setLocationRelativeTo(getParent());
        setVisible(true);
        jComboBoxPays.setModel((new DefaultComboBoxModel<>(Pays.values())));
        jComboBoxPays.setSelectedIndex(73);
        jComboBoxSexe.setModel((new DefaultComboBoxModel<>(Sexe.values())));
        

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
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelSexe = new javax.swing.JLabel();
        jLabelDateDeNaissance = new javax.swing.JLabel();
        jLabelAdresse = new javax.swing.JLabel();
        jTextFieldNomNewPatient = new javax.swing.JTextField();
        jTextFieldPrenomNewPatient = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelNouveauPatient = new javax.swing.JLabel();
        jTextFieldAdresseNewPatient = new javax.swing.JTextField();
        jTextFieldCodePostalNewPatient = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldVilleNewPatient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPays = new javax.swing.JComboBox();
        jTextFieldDateNaissJour = new javax.swing.JTextField();
        jTextFieldDateNaissMois = new javax.swing.JTextField();
        jTextFieldDateNaissAnnee = new javax.swing.JTextField();
        jComboBoxSexe = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNom.setText("Nom :");

        jLabelPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPrenom.setText("Prénom :");

        jLabelSexe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSexe.setText("Sexe :");

        jLabelDateDeNaissance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDateDeNaissance.setText("Date de naissance :");

        jLabelAdresse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAdresse.setText("Adresse :");

        jTextFieldNomNewPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNomNewPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNomNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomNewPatientActionPerformed(evt);
            }
        });

        jTextFieldPrenomNewPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPrenomNewPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldPrenomNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomNewPatientActionPerformed(evt);
            }
        });

        jButtonOK.setBackground(new java.awt.Color(0, 51, 153));
        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
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

        jLabelNouveauPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNouveauPatient.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNouveauPatient.setText("Nouveau Patient");

        jTextFieldAdresseNewPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldAdresseNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdresseNewPatientActionPerformed(evt);
            }
        });

        jTextFieldCodePostalNewPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCodePostalNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodePostalNewPatientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Code postal :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ville : ");

        jTextFieldVilleNewPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("PAYS : ");

        jComboBoxPays.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaysActionPerformed(evt);
            }
        });

        jTextFieldDateNaissJour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldDateNaissJour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateNaissJourActionPerformed(evt);
            }
        });

        jTextFieldDateNaissMois.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldDateNaissMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateNaissMoisActionPerformed(evt);
            }
        });

        jTextFieldDateNaissAnnee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldDateNaissAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateNaissAnneeActionPerformed(evt);
            }
        });

        jComboBoxSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("/");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAdresse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAdresseNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldVilleNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodePostalNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelNom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldNomNewPatient))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelPrenom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldPrenomNewPatient))
                        .addComponent(jLabelNouveauPatient, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelSexe)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxSexe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabelDateDeNaissance))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldDateNaissJour, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldDateNaissMois, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldDateNaissAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNouveauPatient)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNomNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenomNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexe)
                    .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDateDeNaissance)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDateNaissJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldDateNaissMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldDateNaissAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdresse)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodePostalNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAdresseNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVilleNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrenomNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomNewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomNewPatientActionPerformed

    private void jTextFieldCodePostalNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodePostalNewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodePostalNewPatientActionPerformed

    private void jTextFieldDateNaissJourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateNaissJourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateNaissJourActionPerformed

    private void jTextFieldDateNaissAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateNaissAnneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateNaissAnneeActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        ajouterPatient();
        setVisible(false);
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jComboBoxPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaysActionPerformed
        pays = (Pays) ((JComboBox) evt.getSource()).getSelectedItem();
    }//GEN-LAST:event_jComboBoxPaysActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jTextFieldDateNaissMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateNaissMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateNaissMoisActionPerformed

    private void jComboBoxSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexeActionPerformed
        sexe = (Sexe) ((JComboBox) evt.getSource()).getSelectedItem();
    }//GEN-LAST:event_jComboBoxSexeActionPerformed

    private void jTextFieldNomNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomNewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomNewPatientActionPerformed

    private void jTextFieldAdresseNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdresseNewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdresseNewPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxPays;
    private javax.swing.JComboBox jComboBoxSexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelDateDeNaissance;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNouveauPatient;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelSexe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAdresseNewPatient;
    private javax.swing.JTextField jTextFieldCodePostalNewPatient;
    private javax.swing.JTextField jTextFieldDateNaissAnnee;
    private javax.swing.JTextField jTextFieldDateNaissJour;
    private javax.swing.JTextField jTextFieldDateNaissMois;
    private javax.swing.JTextField jTextFieldNomNewPatient;
    private javax.swing.JTextField jTextFieldPrenomNewPatient;
    private javax.swing.JTextField jTextFieldVilleNewPatient;
    // End of variables declaration//GEN-END:variables

    public void ajouterPatient() {
        if ((jTextFieldNomNewPatient.getText().equals(""))
                || (jTextFieldPrenomNewPatient.getText().equals(""))
                || (jTextFieldAdresseNewPatient.getText().equals(""))
                || (jTextFieldCodePostalNewPatient.getText().equals(""))
                || (jTextFieldVilleNewPatient.getText().equals(""))
                || (jTextFieldDateNaissJour.getText().equals(""))
                || (jTextFieldDateNaissMois.getText().equals(""))
                || (jTextFieldDateNaissAnnee.getText().equals(""))) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Il manque des informations relatives au patient", "Attention", JOptionPane.WARNING_MESSAGE);
        } else if ((jTextFieldCodePostalNewPatient.getText().length() != 5) && !(jTextFieldCodePostalNewPatient.getText().equals(""))) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Mauvais code postal", "Attention", JOptionPane.WARNING_MESSAGE);

        } else {
            String nom = jTextFieldNomNewPatient.getText();
            String prenom = jTextFieldPrenomNewPatient.getText();
            String date = jTextFieldDateNaissAnnee.getText() + "-" + jTextFieldDateNaissMois.getText() + "-" + jTextFieldDateNaissJour.getText();
            java.sql.Date d = new java.sql.Date(Integer.parseInt(jTextFieldDateNaissAnnee.getText()),
                    Integer.parseInt(jTextFieldDateNaissMois.getText()), Integer.parseInt(jTextFieldDateNaissJour.getText())
            );

            Adresse adresse = new Adresse(jTextFieldAdresseNewPatient.getText(), Integer.parseInt(jTextFieldCodePostalNewPatient.getText()), jTextFieldVilleNewPatient.getText(), pays);
            String adress = adresse.getAdresse();
            Patient p = new Patient(nom, prenom, d, sexe, adress);

            try {
                sql = "INSERT INTO Patient VALUES (" + p.getIPP() + ", '" + nom + "','" + prenom + "','" + date
                        + "','" + sexe + "','" + adress + "')";
                CHUPP.getInsert(sql);
            } catch (Exception e) {
                System.out.println("Failed to get Statement");
                e.printStackTrace();
            }

        }
    }

    /**
     * // * @param chupp the chupp to set
     */
    public void setChupp(CHUPP chupp) {
        this.chupp = chupp;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }
}
