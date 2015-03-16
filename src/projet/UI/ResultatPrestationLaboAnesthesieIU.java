/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projet.sih.*;

/**
 *
 * @author Tommy
 */
public class ResultatPrestationLaboAnesthesieIU extends javax.swing.JFrame {

    private ConnexionUI connexionUI;
    private Patient currentPatient;
    private String serviceEmetteur;
    private int idPrestation;
    private PersonnelMedical currentConnected;
    private Date date;
    private ServiceMedicoTechniquesIU smt;
    private int selectedRow;

    /**
     * Creates new form ResultatPrestationLaboAnesthesieIU
     */
    public ResultatPrestationLaboAnesthesieIU() {
        initComponents();
        date = new Date(System.currentTimeMillis());
        DateFormat df1 = new SimpleDateFormat("dd / MM / yyyy");
        jLabelTextDate.setText(df1.format(date));
        JMenuBar jmb = new JMenuBar();
        JMenu menu1 = new JMenu("Fichier");
        JMenu menu2 = new JMenu("Aide");
        JMenuItem deco = new JMenuItem("Deconnexion");
        JMenuItem leave = new JMenuItem("Quitter");
        JMenuItem javadoc = new JMenuItem("Documentation technique");
        JMenuItem helputil = new JMenuItem("Aide utilisateur");
        menu1.add(deco);
        menu1.add(leave);
        menu2.add(javadoc);
        menu2.add(helputil);
        jmb.add(menu1);
        jmb.add(menu2);
        setJMenuBar(jmb);
        deco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    connexionUI = new ConnexionUI();
                } catch (IOException ex) {
                    Logger.getLogger(ServiceCliniqueIU.class.getName()).log(Level.SEVERE, null, ex);
                }
                connexionUI.setLocationRelativeTo(null);
                connexionUI.setVisible(true);
                setVisible(false);
            }
        });
        leave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
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
        jPanelLogo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelResultatPrestation = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelResultats = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultats = new javax.swing.JTextArea();
        jLabelObservations = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservations = new javax.swing.JTextArea();
        jButtonEnvoyer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelCurrentService = new javax.swing.JLabel();
        jLabelNom1 = new javax.swing.JLabel();
        jLabelNomPatient = new javax.swing.JLabel();
        jLabelIPP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNature = new javax.swing.JLabel();
        jLabelTextDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDatePrestation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(571, 511));

        jLabelResultatPrestation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelResultatPrestation.setForeground(new java.awt.Color(0, 51, 153));
        jLabelResultatPrestation.setText("Résultat de la prestation");

        jLabelNom.setText("Nom du patient :");

        jLabelPrenom.setText("IPP");

        jLabelDate.setText("Date :");

        jLabelResultats.setText("Résultats :");

        jTextAreaResultats.setColumns(20);
        jTextAreaResultats.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultats);

        jLabelObservations.setText("Observations :");

        jTextAreaObservations.setColumns(20);
        jTextAreaObservations.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservations);

        jButtonEnvoyer.setBackground(new java.awt.Color(153, 153, 255));
        jButtonEnvoyer.setText("Envoyer");
        jButtonEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnvoyerActionPerformed(evt);
            }
        });

        jButtonAnnuler.setBackground(new java.awt.Color(153, 153, 255));
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jLabelCurrentService.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCurrentService.setForeground(new java.awt.Color(0, 51, 153));

        jLabel3.setText("Demande de prestation : ");

        jLabel1.setText("Date de la prestation :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelResultatPrestation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCurrentService)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnvoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrenom)
                            .addComponent(jLabelNom))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNomPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelIPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelResultats)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelObservations)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNature, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDatePrestation, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultatPrestation)
                    .addComponent(jLabelCurrentService))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNom)
                        .addComponent(jLabelDate)
                        .addComponent(jLabelNom1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIPP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrenom))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNature, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelDatePrestation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResultats)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelObservations))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnvoyer)
                    .addComponent(jButtonAnnuler))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnvoyerActionPerformed
        JOptionPane j = new JOptionPane();
        int retour = j.showConfirmDialog(this, "Êtes-vous sûr de vouloir envoyer ce résultat de prestation ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
        if (retour == JOptionPane.OK_OPTION) {
            try {
                envoyerResultat();
                JOptionPane j2 = new JOptionPane();
                j2.showMessageDialog(this, "Le résultat a bien été pris en compte !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                ((DefaultTableModel)smt.getjTablePrestations().getModel()).removeRow(selectedRow);
                String sql ="DELETE FROM Prestation WHERE idprestation="+idPrestation;
                CHUPP.getInsert(sql);
                smt.revalidate();
                smt.repaint();
            } catch (SQLException ex) {
                Logger.getLogger(ResultatPrestationLaboAnesthesieIU.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            j.setVisible(false);
        }
    }//GEN-LAST:event_jButtonEnvoyerActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonEnvoyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCurrentService;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDatePrestation;
    private javax.swing.JLabel jLabelIPP;
    private javax.swing.JLabel jLabelNature;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNom1;
    private javax.swing.JLabel jLabelNomPatient;
    private javax.swing.JLabel jLabelObservations;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelResultatPrestation;
    private javax.swing.JLabel jLabelResultats;
    private javax.swing.JLabel jLabelTextDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaObservations;
    private javax.swing.JTextArea jTextAreaResultats;
    // End of variables declaration//GEN-END:variables

    public void envoyerResultat() throws SQLException {
        if ((jTextAreaResultats.getText().equals(""))
                || (jTextAreaObservations.getText().equals(""))) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Il manque des informations relatives au Résultats", "Attention", JOptionPane.WARNING_MESSAGE);
        } else {
            String sql2 = "SELECT idsmt from service_medico_technique where specialite='"+currentConnected.getSpecialite()+"'";
            ResultSet resultat = CHUPP.getRequete(sql2);
            resultat.first();
            int idsmt = resultat.getInt("idsmt");
            try {
                String sql = "INSERT INTO Resultat VALUES (" + Resultat.getIDresultat() + ","
                        + Observation.getIDObs() + ","
                        + idsmt + ","
                        + currentPatient.getIPP() + ","
                        + currentConnected.getID() + ", '"
                        + date + "', "
                        +"'"+ jLabelNature.getText() + "','"
                        + jTextAreaResultats.getText() + "')";
                CHUPP.getInsert(sql);
                String sql3 = "INSERT INTO Observation VALUES (" + Observation.getIDObs() + ","
                        + (Resultat.getIDresultat() - 1) + ",'"
                        + date + "','"
                        + jTextAreaObservations.getText() + "')";
                CHUPP.getInsert(sql3);
            } catch (Exception e) {
                System.out.println("Failed to get Statement");
                e.printStackTrace();
            }

        }
    }

    /**
     * @param currentPatient the currentPatient to set
     */
    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    /**
     * @param serviceEmetteur the serviceEmetteur to set
     */
    public void setServiceEmetteur(String serviceEmetteur) {
        this.serviceEmetteur = serviceEmetteur;
    }

     
    public void setCurrentConnected(PersonnelMedical currentConnected) {
        this.currentConnected = currentConnected;
    }

    /**
     * @return the jLabelDatePrestation
     */
    public javax.swing.JLabel getjLabelDatePrestation() {
        return jLabelDatePrestation;
    }

    /**
     * @return the jLabelIPP
     */
    public javax.swing.JLabel getjLabelIPP() {
        return jLabelIPP;
    }

    /**
     * @return the jLabelNature
     */
    public javax.swing.JLabel getjLabelNature() {
        return jLabelNature;
    }

    /**
     * @return the jLabelNomPatient
     */
    public javax.swing.JLabel getjLabelNomPatient() {
        return jLabelNomPatient;
    }

    /**
     * @return the jLabelTextDate
     */
    public javax.swing.JLabel getjLabelTextDate() {
        return jLabelTextDate;
    }

    /**
     * @param smt the smt to set
     */
    public void setSmt(ServiceMedicoTechniquesIU smt) {
        this.smt = smt;
    }

    /**
     * @param selectedRow the selectedRow to set
     */
    public void setSelectedRow(int selectedRow) {
        this.selectedRow = selectedRow;
    }

    /**
     * @param idPrestation the idPrestation to set
     */
    public void setIdPrestation(int idPrestation) {
        this.idPrestation = idPrestation;
    }

    /**
     * @return the jLabelCurrentService
     */
    public javax.swing.JLabel getjLabelCurrentService() {
        return jLabelCurrentService;
    }
}
