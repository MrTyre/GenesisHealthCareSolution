/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.UI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import projet.sih.*;

/**
 *
 * @author Tommy
 */
public class ResultatPrestationLaboAnesthesieIU extends javax.swing.JFrame {
    private ConnexionUI connexionUI;
    /**
     * Creates new form ResultatPrestationLaboAnesthesieIU
     */
    public ResultatPrestationLaboAnesthesieIU() {
        initComponents();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelLogo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelResultatPrestation = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelPrenom = new javax.swing.JLabel();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jLabelResultats = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultats = new javax.swing.JTextArea();
        jLabelObservations = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservations = new javax.swing.JTextArea();
        jButtonEnvoyer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelLaboAnesthesie = new javax.swing.JLabel();
        jTextFieldJour = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMois = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAnnee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
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
                .addContainerGap(435, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabelResultatPrestation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelResultatPrestation.setForeground(new java.awt.Color(0, 51, 153));
        jLabelResultatPrestation.setText("Résultat de la prestation");

        jLabelNom.setText("Nom du patient :");

        jLabelPrenom.setText("Prénom du patient :");

        jLabelDate.setText("Date :");

        jLabelResultats.setText("Résultats :");

        jTextAreaResultats.setColumns(20);
        jTextAreaResultats.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultats);

        jLabelObservations.setText("Observations :");

        jTextAreaObservations.setColumns(20);
        jTextAreaObservations.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservations);

        jButtonEnvoyer.setBackground(new java.awt.Color(0, 51, 153));
        jButtonEnvoyer.setText("Envoyer");
        jButtonEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnvoyerActionPerformed(evt);
            }
        });

        jButtonAnnuler.setBackground(new java.awt.Color(0, 51, 153));
        jButtonAnnuler.setText("Annuler");

        jLabelLaboAnesthesie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLaboAnesthesie.setForeground(new java.awt.Color(0, 51, 153));
        jLabelLaboAnesthesie.setText("Laboratoire/Anesthésie");

        jTextFieldJour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("/");

        jTextFieldMois.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoisActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("/");

        jTextFieldAnnee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResultatPrestation)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrenom)
                                    .addComponent(jLabelNom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrenom))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldJour, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMois, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelLaboAnesthesie)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResultats)
                            .addComponent(jLabelObservations))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnvoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultatPrestation)
                    .addComponent(jLabelLaboAnesthesie))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextFieldJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResultats)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObservations)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnvoyer)
                    .addComponent(jButtonAnnuler))
                .addGap(24, 24, 24))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnvoyerActionPerformed
       JOptionPane j=new JOptionPane();
       int retour =j.showConfirmDialog(this, "Êtes-vous sûr de vouloir envoyer ce résultat de prestation ?","Confirmation",JOptionPane.OK_CANCEL_OPTION);
        if(retour == JOptionPane.OK_OPTION){
            
        }
        else {
            j.setVisible(false);
        }
    }//GEN-LAST:event_jButtonEnvoyerActionPerformed

    private void jTextFieldMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoisActionPerformed

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
            java.util.logging.Logger.getLogger(ResultatPrestationLaboAnesthesieIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultatPrestationLaboAnesthesieIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultatPrestationLaboAnesthesieIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultatPrestationLaboAnesthesieIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultatPrestationLaboAnesthesieIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonEnvoyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelLaboAnesthesie;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelObservations;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelResultatPrestation;
    private javax.swing.JLabel jLabelResultats;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextAreaObservations;
    private javax.swing.JTextArea jTextAreaResultats;
    private javax.swing.JTextField jTextFieldAnnee;
    private javax.swing.JTextField jTextFieldJour;
    private javax.swing.JTextField jTextFieldMois;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
