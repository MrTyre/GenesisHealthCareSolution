package projet.UI;

import java.sql.ResultSet;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import projet.sih.*;

/**
 *
 * @author Marina
 */
public class ConnexionUI extends javax.swing.JFrame {

    /**
     * @return the currentConnected
     */
    private ServiceCliniqueIU sc;
    private ServiceInformatiqueIU si;
    private ServiceMedicoTechniquesIU smt;
    private ServiceCliniqueInfirmieresUI scinf;
    private ServiceCliniqueInterneUI sci;
    private ServiceAdmissionUI sa;
    private CHUPP chupp;
    private static PersonnelMedical currentConnected;
    //attribut base de donnée
    MyDBConnection connection = new MyDBConnection();
    private String sqlintSC;
    private String sqlintSMT;
    private String sqlinfSMT;
    private String sqlinfSC;
    private String sqlsec;
    private String sqlinfo;
    private String sqlPHSC;
    private String sqlPHSMT;

    /**
     * Creates new form ConnexionUI
     */
    public ConnexionUI() throws FileNotFoundException, IOException {
        initComponents();
        this.chupp = new CHUPP();
        setLocationRelativeTo(null);

        FileInputStream input = new FileInputStream("src/Images/Princeton-Plainsboro.jpg");
        BufferedImage myPicture = ImageIO.read(input);
        ImageIcon image = new ImageIcon(myPicture);

        jLabel1.setIcon(image);
        jLabel1.setVisible(true);
        connection.init();
        connection.getMyConnection();
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
        jLabelId = new javax.swing.JLabel();
        jLabelMdp = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelId.setText("Identifiant : ");

        jLabelMdp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelMdp.setText("Mot de passe : ");

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonOK.setBackground(new java.awt.Color(153, 153, 153));
        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelId)
                                    .addComponent(jLabelMdp))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldId)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMdp)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonOK)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        connexion();
    }//GEN-LAST:event_jButtonOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMdp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables

    public void connexion() {
        String nom = jTextFieldId.getText();
        String mdp = jPasswordField1.getText();
        String spe = "";
        try {
            sqlintSC = "SELECT interne.* FROM interne, service_clinique where interne.specialite=service_clinique.specialite";
            sqlinfSC = "SELECT infirmier.* FROM infirmier, service_clinique where infirmier.service=service_clinique.specialite";
            sqlintSMT = "SELECT interne.* FROM interne, service_medico_technique where interne.specialite=service_medico_technique.specialite";
            sqlinfSMT = "SELECT infirmier.* FROM infirmier, service_medico_technique where infirmier.service=service_medico_technique.specialite";
            sqlsec = "SELECT * FROM secretaire";
            sqlinfo = "SELECT * FROM informaticien";
            sqlPHSC = "SELECT idph, nom, prenom, mdp, practicien_hospitalier.specialite FROM practicien_hospitalier, service_clinique WHERE practicien_hospitalier.specialite=service_clinique.specialite";
            sqlPHSMT = "SELECT idph, nom, prenom, mdp, practicien_hospitalier.specialite FROM practicien_hospitalier, service_medico_technique WHERE practicien_hospitalier.specialite=service_medico_technique.specialite";
            ResultSet resultatPHSC = CHUPP.getRequete(sqlPHSC);
            ResultSet resultatPHSMT = CHUPP.getRequete(sqlPHSMT);
            ResultSet resultatIntSC = CHUPP.getRequete(sqlintSC);
            ResultSet resultatInfSC = CHUPP.getRequete(sqlinfSC);
            ResultSet resultatIntSMT = CHUPP.getRequete(sqlintSMT);
            ResultSet resultatInfSMT = CHUPP.getRequete(sqlinfSMT);
            ResultSet resultatSec = CHUPP.getRequete(sqlsec);
            ResultSet resultatInfo = CHUPP.getRequete(sqlinfo);
            while (spe.equals("")) {

                //parcours du personnel des Service Cliniques
                while (resultatPHSC.next()) {
                    if ((nom.equals(resultatPHSC.getString("nom"))) && (mdp.equals(resultatPHSC.getString("mdp")))) {
                        spe = resultatPHSC.getString("practicien_hospitalier.specialite");
                        currentConnected = new PH(resultatPHSC.getString("idph"), nom, resultatPHSC.getString("prenom"), mdp, spe);
                        sc = new ServiceCliniqueIU();
                        sc.setLocationRelativeTo(this);
                        sc.setCurrentPH(currentConnected);
                        sc.setVisible(true);
                        setVisible(false);
                        sc.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatPHSC.getString("prenom") + "<br>Statut : Practicien Hospitalier</html>");
                        break;
                    }
                }
                while (resultatInfSC.next()) {
                    if ((nom.equals(resultatInfSC.getString("nom"))) && (mdp.equals(resultatInfSC.getString("mdp")))) {
                        spe = resultatInfSC.getString("service");
                        currentConnected = new PersonnelInfirmier(resultatInfSC.getString("idinf"), nom, resultatInfSC.getString("prenom"), mdp, spe);
                        scinf = new ServiceCliniqueInfirmieresUI();
                        scinf.setLocationRelativeTo(this);
                        scinf.setCurrentInf(currentConnected);
                        scinf.setVisible(true);
                        setVisible(false);
                        scinf.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatInfSC.getString("prenom") + "<br>Statut : Personnel Infirmier</html>");
                        break;
                    }
                }
                while (resultatIntSC.next()) {
                    if ((nom.equals(resultatIntSC.getString("nom"))) && (mdp.equals(resultatIntSC.getString("mdp")))) {
                        spe = resultatIntSC.getString("specialite");
                        currentConnected = new Interne(resultatIntSC.getString("idi"), nom, resultatIntSC.getString("prenom"), mdp, spe);
                        sci = new ServiceCliniqueInterneUI();
                        sci.setLocationRelativeTo(this);
                        sci.setCurrentInt(currentConnected);
                        sci.setVisible(true);
                        sci.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatIntSC.getString("prenom") + "<br>Statut : Interne</html>");
                        break;
                    }
                }

                //personnel des service medico techniques
                while (resultatPHSMT.next()) {
                    if ((nom.equals(resultatPHSMT.getString("nom"))) && (mdp.equals(resultatPHSMT.getString("mdp")))) {
                        spe = resultatPHSMT.getString("practicien_hospitalier.specialite");
                        currentConnected = new PH(resultatPHSMT.getString("idph"), nom, resultatPHSMT.getString("prenom"), mdp, spe);
                        smt = new ServiceMedicoTechniquesIU();
                        smt.setLocationRelativeTo(this);
                        smt.setCurrentConnected(currentConnected);
                        smt.setVisible(true);
                        setVisible(false);
                        smt.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatPHSMT.getString("prenom") + "<br>Statut : Practicien Hospitalier</html>");
                        break;
                    }
                }
                while (resultatInfSMT.next()) {
                    if ((nom.equals(resultatInfSMT.getString("nom"))) && (mdp.equals(resultatInfSMT.getString("mdp")))) {
                        spe = resultatInfSMT.getString("service");
                        currentConnected = new PersonnelInfirmier(resultatInfSMT.getString("idinf"), nom, resultatInfSMT.getString("prenom"), mdp, spe);
                        smt = new ServiceMedicoTechniquesIU();
                        smt.setLocationRelativeTo(this);
                        smt.setCurrentConnected(currentConnected);
                        smt.setVisible(true);
                        setVisible(false);
                        smt.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatInfSMT.getString("prenom") + "<br>Statut : Personnel Infirmier</html>");
                        break;
                    }
                }
                while (resultatIntSMT.next()) {
                    if ((nom.equals(resultatIntSMT.getString("nom"))) && (mdp.equals(resultatIntSMT.getString("mdp")))) {
                        spe = resultatIntSMT.getString("specialite");
                        currentConnected = new Interne(resultatIntSMT.getString("idi"), nom, resultatIntSMT.getString("prenom"), mdp, spe);
                        smt = new ServiceMedicoTechniquesIU();
                        smt.setLocationRelativeTo(this);
                        smt.setCurrentConnected(currentConnected);
                        smt.setVisible(true);
                        setVisible(false);
                        smt.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatIntSMT.getString("prenom") + "<br>Statut : Interne</html>");
                        break;
                    }
                }

                //parcours du personnel secrétaire
                while (resultatSec.next()) {
                    if ((nom.equals(resultatSec.getString("nom"))) && (mdp.equals(resultatSec.getString("mdp")))) {
                        spe = "Admission";
                        currentConnected = new Secretaire(resultatSec.getString("ids"), nom, resultatSec.getString("prenom"), mdp, spe);
                        sa = new ServiceAdmissionUI();
                        sa.setLocationRelativeTo(this);
                        sa.setCurrentPers(currentConnected);
                        sa.setVisible(true);
                        setVisible(false);
                        sa.getjLabelService().setText("<html>Service " + spe + "<br>Connecté en tant que : " + nom + " " + resultatSec.getString("prenom") + "<br>Statut : Secrétaire</html>");
                        break;
                    }
                }

                //parcours du personnel informaticien
                while (resultatInfo.next()) {
                    if ((nom.equals(resultatInfo.getString("nom"))) && (mdp.equals(resultatInfo.getString("mdp")))) {
                        spe = "informatique";
                        currentConnected = new PH(resultatInfo.getString("idinfo"), nom, resultatInfo.getString("prenom"), mdp, spe);
                        si = new ServiceInformatiqueIU();
                        si.setLocationRelativeTo(this);
                        si.setVisible(true);
                        setVisible(false);
                        break;
                    }
                }
                break;
            }
            if (spe.equals("")) {
                JOptionPane jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "Connexion impossible, l'identifiant ou le mot de passe est incorrect", "Attention", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
        }
    }

    public static PersonnelMedical getCurrentConnected() {
        return currentConnected;
    }

}
