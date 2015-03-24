/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import projet.sih.CHUPP;
import projet.sih.PH;

/**
 *
 * @author Manounette
 */
public class ServiceInformatiqueModifierPersonnel extends javax.swing.JFrame {

    private ServiceInformatiqueIU si;
    private ConnexionUI connexionUI;
    private String nom;
    private String prenom;

    /**
     * Creates new form ServiceInformatiqueModifierPersonnel
     */
    public ServiceInformatiqueModifierPersonnel() throws FileNotFoundException, IOException {
        initComponents();
        setResizable(false);
        FileInputStream input = new FileInputStream("src/Images/GenesisHealthCareSolution.png");
        BufferedImage myPicture = ImageIO.read(input);
        ImageIcon image = new ImageIcon(myPicture);
        jLabel2.setIcon(image);
        jLabel2.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabelStatut = new javax.swing.JLabel();
        jLabelService = new javax.swing.JLabel();
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
        jLabelStatutActuel = new javax.swing.JLabel();
        jLabelServiceActuel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Modifier personnel médical");

        jLabelStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelStatut.setText("Statut :");

        jLabelService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelService.setText("Service :");

        jLabelNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNom.setText("Nom :");

        jLabelPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPrenom.setText("Prénom :");

        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jTextFieldPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });
        jTextFieldPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPrenomKeyPressed(evt);
            }
        });

        jLabelNouveauStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNouveauStatut.setText("Nouveau statut :");

        jComboBoxNouveauStatut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelNouveauService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNouveauService.setText("Nouveau service :");

        jComboBoxNouveauService.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
        jButtonAnnuler.setText("Retour");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrenom)
                                    .addComponent(jLabelStatut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelStatutActuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNouveauStatut)
                                        .addGap(8, 8, 8)
                                        .addComponent(jComboBoxNouveauStatut, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNouveauService)
                                            .addComponent(jLabelService))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxNouveauService, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelServiceActuel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelStatutActuel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNouveauStatut)
                    .addComponent(jComboBoxNouveauStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabelService))
                    .addComponent(jLabelServiceActuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNouveauService)
                    .addComponent(jComboBoxNouveauService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonOK))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
        try {
            si = new ServiceInformatiqueIU();
            si.setLocationRelativeTo(null);
            si.setResizable(false);
            si.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            modifierPersonnel();
            jTextFieldNom.setText("");
            jTextFieldPrenom.setText("");
            jLabelServiceActuel.setText("");
            jLabelStatutActuel.setText("");
            jComboBoxNouveauStatut.setModel(new DefaultComboBoxModel());
            jComboBoxNouveauService.setModel(new DefaultComboBoxModel());
        } catch (SQLException ex) {
            Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed

    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed

    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jTextFieldPrenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrenomKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nom = jTextFieldNom.getText().substring(0, 1).toUpperCase();
            nom += jTextFieldNom.getText().substring(1, jTextFieldNom.getText().length()).toLowerCase().replaceAll("'","''");
            prenom = jTextFieldPrenom.getText().substring(0, 1).toUpperCase();
            prenom += jTextFieldPrenom.getText().substring(1, jTextFieldPrenom.getText().length()).toLowerCase().replaceAll("'","''");
            try {
                DefaultComboBoxModel cbStatut = new DefaultComboBoxModel();
                DefaultComboBoxModel cbService = new DefaultComboBoxModel();
                String sqlph = "select distinct * from practicien_hospitalier where nom='" + nom + "' and prenom ='" + prenom + "'";
                ResultSet resultph = CHUPP.getRequete(sqlph);
                String sqlint = "select distinct * from interne where nom='" + nom + "' and prenom ='" + prenom + "'";
                ResultSet resultint = CHUPP.getRequete(sqlint);
                String sqlinf = "select distinct * from infirmier where nom='" + nom + "' and prenom ='" + prenom + "'";
                ResultSet resultinf = CHUPP.getRequete(sqlinf);

                resultph.last();
                resultint.last();
                resultinf.last();
                System.out.println(resultph.getRow() + " " + resultint.getRow() + " " + resultinf.getRow());

                if (resultph.getRow() != 0) {
                    resultph.beforeFirst();
                    while (resultph.next()) {
                        cbStatut.addElement("Praticien hospitalier");
                        cbStatut.addElement("Chef de Service");
                        jComboBoxNouveauStatut.setModel(cbStatut);
                        jComboBoxNouveauStatut.setSelectedIndex(-1);
                        jComboBoxNouveauStatut.setVisible(true);
                        jLabelNouveauStatut.setVisible(true);
                        jLabelStatutActuel.setText("Practicien hospitalier");
                        jLabelServiceActuel.setText(resultph.getString("specialite"));
                        String spe = "select specialite from service_clinique where specialite !='" + resultph.getString("specialite") + "'";
                        ResultSet resultspe = CHUPP.getRequete(spe);
                        while (resultspe.next()) {
                            cbService.addElement(resultspe.getString("specialite"));
                        }
                    }
                    jComboBoxNouveauService.setModel(cbService);
                    jComboBoxNouveauService.setSelectedIndex(-1);
                } else if (resultint.getRow() != 0) {
                    resultint.beforeFirst();
                    while (resultint.next()) {
                        cbStatut.addElement("Practicien hospitalier");
                        jComboBoxNouveauStatut.setModel(cbStatut);
                        jComboBoxNouveauStatut.setSelectedIndex(-1);
                        jComboBoxNouveauStatut.setVisible(true);
                        jLabelNouveauStatut.setVisible(true);
                        jLabelStatutActuel.setText("Interne");
                        jLabelServiceActuel.setText(resultint.getString("specialite"));
                        String spe = "select specialite from service_clinique where specialite !='" + resultint.getString("specialite") + "'";
                        ResultSet resultspe = CHUPP.getRequete(spe);
                        while (resultspe.next()) {
                            cbService.addElement(resultspe.getString("specialite"));
                        }
                    }
                    jComboBoxNouveauService.setModel(cbService);
                    jComboBoxNouveauService.setSelectedIndex(-1);
                } else if (resultinf.getRow() != 0) {
                    resultinf.beforeFirst();
                    while (resultinf.next()) {
                        jComboBoxNouveauStatut.setVisible(false);
                        jLabelNouveauStatut.setVisible(false);
                        jLabelStatutActuel.setText("Personnel Infirmier");
                        jLabelServiceActuel.setText(resultinf.getString("service"));
                        String spe = "select specialite from service_clinique where specialite !='" + resultinf.getString("service") + "'";
                        ResultSet resultspe = CHUPP.getRequete(spe);
                        while (resultspe.next()) {
                            cbService.addElement(resultspe.getString("specialite"));
                        }
                    }
                    jComboBoxNouveauService.setModel(cbService);
                    jComboBoxNouveauService.setSelectedIndex(-1);
                }
                revalidate();
                repaint();
            } catch (SQLException ex) {
                Logger.getLogger(ServiceInformatiqueModifierPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldPrenomKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxNouveauService;
    private javax.swing.JComboBox jComboBoxNouveauStatut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNouveauService;
    private javax.swing.JLabel jLabelNouveauStatut;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JLabel jLabelServiceActuel;
    private javax.swing.JLabel jLabelStatut;
    private javax.swing.JLabel jLabelStatutActuel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables

    public void modifierPersonnel() throws SQLException {
        String nouveauStatut = (String) jComboBoxNouveauStatut.getSelectedItem();
        String nouveauService = (String) jComboBoxNouveauService.getSelectedItem();

        String sqlph = "select distinct * from practicien_hospitalier where nom='" + nom + "' and prenom ='" + prenom + "'";
        ResultSet resultph = CHUPP.getRequete(sqlph);
        String sqlint = "select distinct * from interne where nom='" + nom + "' and prenom ='" + prenom + "'";
        ResultSet resultint = CHUPP.getRequete(sqlint);
        String sqlinf = "select distinct * from infirmier where nom='" + nom + "' and prenom ='" + prenom + "'";
        ResultSet resultinf = CHUPP.getRequete(sqlinf);

        resultph.last();
        resultint.last();
        resultinf.last();

        if (resultph.getRow() != 0) {
            resultph.beforeFirst();
            while (resultph.next()) {
                String sql2 = "select * from service_clinique where specialite ='" + resultph.getString("specialite") + "'";
                String sql3 = "select * from service_medico_technique where specialite ='" + resultph.getString("specialite") + "'";
                ResultSet result2 = CHUPP.getRequete(sql2);
                ResultSet result3 = CHUPP.getRequete(sql3);
                while (result2.next()) {
                    if ((jComboBoxNouveauStatut.getSelectedIndex() < 0) && (jComboBoxNouveauService.getSelectedIndex() >= 0)) {
                        if (result2.getInt("chef_service") == resultph.getInt("idph")) {
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Attention, le praticien que vous souhaitez changer de service est Chef du Service " + resultph.getString("specialite") + ".\nMerci de nommer un nouveau Chef de Service avant d'effectuer ce changement", "Attention", JOptionPane.WARNING_MESSAGE);
                            break;
                        } else {
                            String update = "update practicien_hospitalier set specialite ='" + nouveauService + "' where nom='" + nom + "' and prenom='" + prenom + "'";
                            CHUPP.getInsert(update);
                            JOptionPane j2 = new JOptionPane();
                            j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    } else if ((jComboBoxNouveauStatut.getSelectedIndex() >= 0) && (jComboBoxNouveauService.getSelectedIndex() >= 0)) {
                        if (result2.getInt("chef_service") == resultph.getInt("idph")) {
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Attention, le praticien que vous souhaitez passer Chef du Service " + nouveauService + " est déjà Chef du Service " + resultph.getString("specialite") + ".\nMerci de nommer un nouveau Chef de Service pour ce dernier avant d'effectuer ce changement", "Attention", JOptionPane.WARNING_MESSAGE);
                            break;
                        } else {
                            String update = "update service_clinique set chef_service=" + resultph.getInt("idph") + " where specialite='" + nouveauService + "'";
                            CHUPP.getInsert(update);
                            String update2 = "update practicien_hospitalier set specialite='" + nouveauService + "' where nom='" + nom + "' and prenom='" + prenom + "'";
                            CHUPP.getInsert(update2);
                            JOptionPane j2 = new JOptionPane();
                            j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    } else if ((jComboBoxNouveauStatut.getSelectedIndex() >= 0) && (jComboBoxNouveauService.getSelectedIndex() < 0)) {
                        if (result2.getInt("chef_service") == resultph.getInt("idph")) {
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Attention, le praticien dont vous souhaitez changer le statut est Chef du Service " + resultph.getString("specialite") + ".\nMerci de directement nommer un nouveau Chef de Service pour effectuer ce changement", "Attention", JOptionPane.WARNING_MESSAGE);
                            break;
                        } else {
                            String update = "update service_clinique set chef_service=" + resultph.getInt("idph") + " where specialite='" + resultph.getString("specialite") + "'";
                            CHUPP.getInsert(update);
                            JOptionPane j2 = new JOptionPane();
                            j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    } else {
                        JOptionPane j = new JOptionPane();
                        int retour = j.showConfirmDialog(null, "Aucun changement demandé. Voulez-quitter ce menu ?", "Attention", JOptionPane.OK_CANCEL_OPTION);
                        if (retour == JOptionPane.OK_OPTION) {
                            setVisible(false);
                        } else {
                            j.setVisible(false);
                        }
                    }
                    break;
                }
                while (result3.next()) {
                    if ((jComboBoxNouveauStatut.getSelectedIndex() < 0) && (jComboBoxNouveauService.getSelectedIndex() >= 0)) {
                        if (result3.getInt("chef_service") == resultph.getInt("idph")) {
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Attention, le praticien que vous souhaitez changer de service est Chef du Service " + resultph.getString("specialite") + ".\nMerci de nommer un nouveau Chef de Service avant d'effectuer ce changement", "Attention", JOptionPane.WARNING_MESSAGE);
                            break;
                        } else {
                            String update = "update practicien_hospitalier set specialite ='" + nouveauService + "' where nom='" + nom + "' and prenom='" + prenom + "'";
                            CHUPP.getInsert(update);
                            JOptionPane j2 = new JOptionPane();
                            j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    } else if ((jComboBoxNouveauStatut.getSelectedIndex() >= 0) && (jComboBoxNouveauService.getSelectedIndex() >= 0)) {
                        if (result3.getInt("chef_service") == resultph.getInt("idph")) {
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Attention, le praticien que vous souhaitez passer Chef du Service " + nouveauService + " est déjà Chef du Service " + resultph.getString("specialite") + ".\nMerci de nommer un nouveau Chef de Service pour ce dernier avant d'effectuer ce changement", "Attention", JOptionPane.WARNING_MESSAGE);
                            break;
                        } else {
                            String update = "update service_clinique set chef_service=" + resultph.getInt("idph") + " where specialite='" + nouveauService + "'";
                            CHUPP.getInsert(update);
                            String update2 = "update practicien_hospitalier set specialite='" + nouveauService + "' where nom='" + nom + "' and prenom='" + prenom + "'";
                            CHUPP.getInsert(update2);
                            JOptionPane j2 = new JOptionPane();
                            j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    } else if ((jComboBoxNouveauStatut.getSelectedIndex() >= 0) && (jComboBoxNouveauService.getSelectedIndex() < 0)) {
                        if (result3.getInt("chef_service") == resultph.getInt("idph")) {
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Attention, le praticien dont vous souhaitez changer le statut est Chef du Service " + resultph.getString("specialite") + ".\nMerci de directement nommer un nouveau Chef de Service pour effectuer ce changement", "Attention", JOptionPane.WARNING_MESSAGE);
                            break;
                        } else {
                            String update = "update service_clinique set chef_service=" + resultph.getInt("idph") + " where specialite='" + resultph.getString("specialite") + "'";
                            CHUPP.getInsert(update);
                            JOptionPane j2 = new JOptionPane();
                            j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    } else {
                        JOptionPane j = new JOptionPane();
                        int retour = j.showConfirmDialog(null, "Aucun changement demandé. Voulez-quitter ce menu ?", "Attention", JOptionPane.OK_CANCEL_OPTION);
                        if (retour == JOptionPane.OK_OPTION) {
                            setVisible(false);
                        } else {
                            j.setVisible(false);
                        }
                    }
                    break;
                }
                break;
            }
        } else if (resultint.getRow()
                != 0) {
            resultint.beforeFirst();
            while (resultint.next()) {
                if ((jComboBoxNouveauStatut.getSelectedIndex() < 0) && (jComboBoxNouveauService.getSelectedIndex() >= 0)) {
                    String update = "update interne set specialite ='" + nouveauService + "' where nom='" + nom + "' and prenom ='" + prenom + "'";
                    CHUPP.getInsert(update);
                    JOptionPane j2 = new JOptionPane();
                    j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else if ((jComboBoxNouveauStatut.getSelectedIndex() >= 0) && (jComboBoxNouveauService.getSelectedIndex() >= 0)) {
                    String update = "update interne set specialite ='" + nouveauService + "' where nom='" + nom + "' and prenom ='" + prenom + "'";
                    CHUPP.getInsert(update);
                    String update2 = "insert into practicien_hospitalier values (" + PH.getIDPH()
                            + ",'" + nom
                            + "','" + prenom
                            + "','" + nouveauService
                            + "','" + resultint.getString("mdp")
                            + "','src/LettresSorties')";
                    CHUPP.getInsert(update2);
                    String update3 = "delete from interne where nom='" + nom + "' and prenom ='" + prenom + "'";
                    CHUPP.getInsert(update3);
                    JOptionPane j2 = new JOptionPane();
                    j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else if ((jComboBoxNouveauStatut.getSelectedIndex() >= 0) && (jComboBoxNouveauService.getSelectedIndex() < 0)) {
                    String update2 = "insert into practicien_hospitalier values (" + PH.getIDPH()
                            + ",'" + nom
                            + "','" + prenom
                            + "','" + resultint.getString("specialite")
                            + "','" + resultint.getString("mdp") + "')";
                    CHUPP.getInsert(update2);
                    String update3 = "delete from interne where nom='" + nom + "' and prenom ='" + prenom + "'";
                    CHUPP.getInsert(update3);
                    JOptionPane j2 = new JOptionPane();
                    j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    JOptionPane j = new JOptionPane();
                    int retour = j.showConfirmDialog(null, "Aucun changement demandé. Voulez-vous quitter ce menu ?", "Attention", JOptionPane.OK_CANCEL_OPTION);
                    if (retour == JOptionPane.OK_OPTION) {
                        setVisible(false);
                    } else {
                        j.setVisible(false);
                    }
                }
                break;
            }
        } else if (resultinf.getRow()
                != 0) {
            resultinf.beforeFirst();
            while (resultinf.next()) {
                if (jComboBoxNouveauService.getSelectedIndex() >= 0) {
                    String update = "update infirmier set service ='" + nouveauService + "' where nom ='" + nom + "' and prenom='" + prenom + "'";
                    CHUPP.getInsert(update);
                    JOptionPane j2 = new JOptionPane();
                    j2.showMessageDialog(null, "Modification enregistrée !", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    JOptionPane j = new JOptionPane();
                    int retour = j.showConfirmDialog(null, "Aucun changement demandé. Voulez-vous quitter ce menu ?", "Attention", JOptionPane.OK_CANCEL_OPTION);
                    if (retour == JOptionPane.OK_OPTION) {
                        setVisible(false);
                    } else {
                        j.setVisible(false);
                    }
                }
                break;
            }
        }
    }
}
