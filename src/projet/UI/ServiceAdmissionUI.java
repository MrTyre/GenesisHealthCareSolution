/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.UI;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import projet.sih.*;

/**
 *
 * @author Marina
 */
public class ServiceAdmissionUI extends javax.swing.JFrame {

    /**
     * @param aCurrentPatient the currentPatient to set
     */
    public static void setCurrentPatient(Patient aCurrentPatient) {
        currentPatient = aCurrentPatient;
    }

    private AjouterPatientIU apIU;
    private AjoutRdvUI ardvUI;
    private CHUPP chupp;
    private ConnexionUI connexionUI;
    private static Patient currentPatient;
    private PersonnelMedical currentPers;
    private JList1ActionPerformed jll;

    private DefaultListModel dlm = new DefaultListModel();
//attribut base de donnée
    MyDBConnection connection = new MyDBConnection();
    private String sql;
    


    /**
     * Creates new form ServiceCliniqueSecretaire
     */
    public ServiceAdmissionUI() throws FileNotFoundException, IOException {
        initComponents();
        setExtendedState(Frame.MAXIMIZED_BOTH);
        FileInputStream input = new FileInputStream("src/Images/GenesisHealthCareSolution.png");
        BufferedImage myPicture = ImageIO.read(input);
        ImageIcon image = new ImageIcon(myPicture);
        jLabel6.setIcon(image);
        jLabel6.setVisible(true);
        jll = new JList1ActionPerformed();
        jList1.addListSelectionListener(jll);
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
        sql = "SELECT nom, prenom, date_naissance FROM Patient";
        try {
            ResultSet resultat =CHUPP.getRequete(sql);
            while(resultat.next()) {
                dlm.addElement(resultat.getString("nom") + " " + resultat.getString("prenom") + " / " + resultat.getString("date_naissance"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCliniqueIU.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("bla");
        }
        jList1.setModel(dlm);
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButtonEditDMA = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButtonAjoutRDV = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Patient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IPP = new javax.swing.JTextField();
        AjoutPatient = new javax.swing.JButton();
        jButtonDeconnexion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        ListePatient = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelService = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setMinimumSize(new java.awt.Dimension(200, 102));
        jSplitPane2.setPreferredSize(new java.awt.Dimension(1278, 648));

        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 153));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane1.setName("Prescriptions"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Observations", new javax.swing.ImageIcon(getClass().getResource("/Images/observationchecklist.png")), jPanel5); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Résultats", new javax.swing.ImageIcon(getClass().getResource("/Images/résultats-médicaux-30214840.png")), jPanel6); // NOI18N

        jButtonEditDMA.setBackground(new java.awt.Color(153, 153, 255));
        jButtonEditDMA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEditDMA.setText("Editer DMA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(953, Short.MAX_VALUE)
                .addComponent(jButtonEditDMA)
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jButtonEditDMA)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("DMA", new javax.swing.ImageIcon(getClass().getResource("/Images/img_dossier_page_sante_10061.png")), jPanel7); // NOI18N

        jButtonAjoutRDV.setBackground(new java.awt.Color(153, 153, 255));
        jButtonAjoutRDV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAjoutRDV.setText("+ RDV");
        jButtonAjoutRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutRDVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(971, Short.MAX_VALUE)
                .addComponent(jButtonAjoutRDV)
                .addGap(27, 27, 27))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jButtonAjoutRDV)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Gestion RDV", new javax.swing.ImageIcon(getClass().getResource("/Images/rdv.png")), jPanel8); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hospitalisations", new javax.swing.ImageIcon(getClass().getResource("/Images/CDT64-tfinal-Hopital.jpg")), jPanel9); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Patient : ");

        Patient.setBackground(new java.awt.Color(240, 240, 240));
        Patient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Patient.setBorder(null);
        Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("IPP : ");

        IPP.setBackground(new java.awt.Color(240, 240, 240));
        IPP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IPP.setBorder(null);
        IPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPPActionPerformed(evt);
            }
        });

        AjoutPatient.setBackground(new java.awt.Color(153, 153, 255));
        AjoutPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AjoutPatient.setText("+ Patient");
        AjoutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutPatientActionPerformed(evt);
            }
        });

        jButtonDeconnexion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDeconnexion.setForeground(new java.awt.Color(204, 0, 0));
        jButtonDeconnexion.setText("Deconnexion");
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tranfert du patient dans le service : ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AjoutPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeconnexion)))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(IPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeconnexion)
                    .addComponent(AjoutPatient))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        jSplitPane2.setRightComponent(jPanel1);

        jList1.setMinimumSize(new java.awt.Dimension(250, 434));
        jList1.setPreferredSize(new java.awt.Dimension(250, 434));
        jScrollPane1.setViewportView(jList1);

        ListePatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListePatient.setForeground(new java.awt.Color(0, 51, 153));
        ListePatient.setText("Liste des patients");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Service : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListePatient)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelService, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelService, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(ListePatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientActionPerformed

    }//GEN-LAST:event_PatientActionPerformed

    private void IPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IPPActionPerformed

    private void AjoutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutPatientActionPerformed
        apIU = new AjouterPatientIU();
        apIU.setVisible(true);
        apIU.setServiceAdmission(this);
        apIU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AjoutPatientActionPerformed

    private void jButtonAjoutRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutRDVActionPerformed
        try {
            ardvUI = new AjoutRdvUI();
            ardvUI.setVisible(true);
            ardvUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ardvUI.setCurrentPatient(currentPatient);
            ardvUI.setServiceAdmission(this);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceAdmissionUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAjoutRDVActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
         JOptionPane j=new JOptionPane();
         int retour =j.showConfirmDialog(this, "Êtes-vous sûr de vouloir vous déconnecter ?","Confirmation",JOptionPane.OK_CANCEL_OPTION);
         if(retour == JOptionPane.OK_OPTION){
          setVisible(false);
             try {
                 connexionUI = new ConnexionUI();
             } catch (IOException ex) {
                 Logger.getLogger(ServiceAdmissionUI.class.getName()).log(Level.SEVERE, null, ex);
             }
         connexionUI.setVisible(true);
  
        }
        else {
            j.setVisible(false);
        }
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutPatient;
    private javax.swing.JTextField IPP;
    private javax.swing.JLabel ListePatient;
    private javax.swing.JTextField Patient;
    private javax.swing.JButton jButtonAjoutRDV;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonEditDMA;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the chupp
     */
    public CHUPP getChupp() {
        return chupp;
    }

    /**
     * @param chupp the chupp to set
     */
    public void setChupp(CHUPP chupp) {
        this.chupp = chupp;
    }

    /**
     * @return the jLabelService
     */
    public javax.swing.JLabel getjLabelService() {
        return jLabelService;
    }
    
    public JList getJList1(){
        return jList1;
    }

    /**
     * @return the dlm
     */
    public DefaultListModel getDlm() {
        return dlm;
    }

    /**
     * @return the jPanel8
     */
    public javax.swing.JPanel getJPanel8() {
        return jPanel8;
    }

    /**
     * @param currentPers the currentPers to set
     */
    public void setCurrentPers(PersonnelMedical currentPers) {
        this.currentPers = currentPers;
    }
    
     public class JList1ActionPerformed implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent lse) {

            try {

                ResultSet result = CHUPP.getRequete("SELECT * FROM patient");
                while (result.next()) {
                    if (jList1.getSelectedValue().equals(result.getString("nom") + " " + result.getString("prenom") + " / " + result.getString("date_naissance"))) {
                        setCurrentPatient(new Patient(result.getInt("ipp"), result.getString("nom"), result.getString("prenom"), result.getDate("date_naissance"), result.getString("sexe"), result.getString("adresse")));
                        IPP.setText(currentPatient.getIPP());
                        Patient.setText(currentPatient.getNom());
//                        jTextArea1.setText(currentPatient.getDpi().getDm().afficherPrescriptions(currentPatient));
//                        jTextArea2.setText(currentPatient.getDpi().getDm().afficherObservationsPH(currentPatient));
//                        jTextArea3.setText(currentPatient.getDpi().getDma().afficherConsultations(currentPatient) + "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••\n\n" + currentPatient.getDpi().getDma().afficherHospitalisations(currentPatient));
                        repaint();
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(ServiceCliniqueIU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
