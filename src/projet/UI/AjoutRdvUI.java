package projet.UI;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import projet.sih.*;

/**
 *
 * @author Marina
 */
public class AjoutRdvUI extends javax.swing.JFrame {

    private Patient currentPatient;
    private PH medecinConcerne;
    private String serviceConcerne;
    private String sql;
    private DefaultComboBoxModel dcbm;
    private DefaultListModel<PH> dlm;
    private ServiceAdmissionUI serviceAdmission;

    /**
     * Creates new form AjoutRdvUI
     */
    public AjoutRdvUI() throws SQLException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        jComboBoxService.setModel(CHUPP.getListeService());
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
        jLabelNouveauRDV = new javax.swing.JLabel();
        jLabelService = new javax.swing.JLabel();
        jComboBoxService = new javax.swing.JComboBox();
        jLabelMedecin = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabelDateRDV = new javax.swing.JLabel();
        jTextFieldJourRDV = new javax.swing.JTextField();
        jTextFieldMois = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAnnee = new javax.swing.JTextField();
        jLabelHeure = new javax.swing.JLabel();
        jTextFieldHeure = new javax.swing.JTextField();
        jLabelH = new javax.swing.JLabel();
        jTextFieldMinute = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(267, 244));

        jLabelNouveauRDV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNouveauRDV.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNouveauRDV.setText("Nouveau RDV");

        jLabelService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelService.setText("Service : ");

        jComboBoxService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServiceActionPerformed(evt);
            }
        });

        jLabelMedecin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMedecin.setText("Médecin : ");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabelDateRDV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDateRDV.setText("Date : ");

        jTextFieldJourRDV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMois.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("/");

        jLabel2.setText("/");

        jTextFieldAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnneeActionPerformed(evt);
            }
        });

        jLabelHeure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelHeure.setText("Heure : ");

        jTextFieldHeure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelH.setText("h");

        jTextFieldMinute.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButtonOK.setBackground(new java.awt.Color(153, 153, 255));
        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNouveauRDV)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelHeure)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldHeure))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelDateRDV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldJourRDV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMois))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMinute, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelMedecin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelService)
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 180, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNouveauRDV)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelService)
                    .addComponent(jComboBoxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedecin)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDateRDV)
                        .addComponent(jTextFieldJourRDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHeure)
                    .addComponent(jTextFieldHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelH)
                    .addComponent(jTextFieldMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonOK))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnneeActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        for (int i = 0; i < dlm.size(); i++) {
            if ((dlm.get(i).getNom() + " " + dlm.get(i).getPrenom()).equals((String) ((JComboBox) evt.getSource()).getSelectedItem())) {
                medecinConcerne = dlm.get(i);
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        JOptionPane j = new JOptionPane();
        int retour = j.showConfirmDialog(this, "Êtes-vous sûr de valider ce nouveau RDV ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
        if (retour == JOptionPane.OK_OPTION) {
            ajouterRDV();
            serviceAdmission.getJPanel8().revalidate();
            serviceAdmission.getJPanel8().repaint();
            JOptionPane j1 = new JOptionPane();
            j1.showMessageDialog(null, "Le rendez-vous a bien été ajouté !", "RDV ajouté", JOptionPane.INFORMATION_MESSAGE);
        } else {
            j.setVisible(false);
        }
        setVisible(false);
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jComboBoxServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServiceActionPerformed
        serviceConcerne = (String) jComboBoxService.getSelectedItem();
        try {
            sql = "select * from practicien_hospitalier where specialite='" + serviceConcerne + "'";
            ResultSet resultat = CHUPP.getRequete(sql);
            dcbm = new DefaultComboBoxModel();
            dlm = new DefaultListModel<>();
            while (resultat.next()) {
                medecinConcerne = new PH(resultat.getString("idph"), resultat.getString("nom"), resultat.getString("prenom"));
                dlm.addElement(medecinConcerne);
                dcbm.addElement(medecinConcerne.getNom() + " " + medecinConcerne.getPrenom());
            }

            jComboBox2.setModel(dcbm);
        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBoxServiceActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBoxService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDateRDV;
    private javax.swing.JLabel jLabelH;
    private javax.swing.JLabel jLabelHeure;
    private javax.swing.JLabel jLabelMedecin;
    private javax.swing.JLabel jLabelNouveauRDV;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAnnee;
    private javax.swing.JTextField jTextFieldHeure;
    private javax.swing.JTextField jTextFieldJourRDV;
    private javax.swing.JTextField jTextFieldMinute;
    private javax.swing.JTextField jTextFieldMois;
    // End of variables declaration//GEN-END:variables
    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    public void ajouterRDV() {
        Date d = new Date(System.currentTimeMillis());
        if(((Integer.parseInt(jTextFieldJourRDV.getText()))>31)
                || ((Integer.parseInt(jTextFieldMois.getText()))>12)
                || ((Integer.parseInt(jTextFieldAnnee.getText()))<d.getYear())
                || ((Integer.parseInt(jTextFieldHeure.getText()))>24)
                || ((Integer.parseInt(jTextFieldMinute.getText()))>60)){
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Attention, la date ou l'heure du RDV n'est pas correcte", "Attention", JOptionPane.WARNING_MESSAGE);       
        }
        if ((jTextFieldJourRDV.getText().equals(""))
                || (jTextFieldMois.getText().equals(""))
                || (jTextFieldAnnee.getText().equals(""))
                || (jTextFieldHeure.getText().equals(""))
                || (jTextFieldMinute.getText().equals(""))) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Il manque des informations relatives au RDV", "Attention", JOptionPane.WARNING_MESSAGE);
        } else {
            String date = jTextFieldAnnee.getText() + "-" + jTextFieldMois.getText() + "-" + jTextFieldJourRDV.getText();
            int heure = Integer.parseInt(jTextFieldHeure.getText());
            int minute = Integer.parseInt(jTextFieldMinute.getText());
            String sql;
            try {
                sql = "INSERT INTO Consultation VALUES (" + Consultation.getIDConsult() + ","
                        + medecinConcerne.getID() + ","
                        + currentPatient.getIPP()
                        + ", '" + date + "',"
                        + heure + ","
                        + minute
                        + ",'RDV médical')";
                CHUPP.getInsert(sql);
            } catch (Exception e) {
                System.out.println("Failed to get Statement");
                e.printStackTrace();
            }

        }
    }

    /**
     * @return the serviceAdmission
     */
    public ServiceAdmissionUI getServiceAdmission() {
        return serviceAdmission;
    }

    /**
     * @param serviceAdmission the serviceAdmission to set
     */
    public void setServiceAdmission(ServiceAdmissionUI serviceAdmission) {
        this.serviceAdmission = serviceAdmission;
    }
}
