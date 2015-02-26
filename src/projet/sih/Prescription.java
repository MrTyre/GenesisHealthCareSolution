/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.sih;

import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tommy
 */
public class Prescription {
    private String nomPrescription;
    private PH phPrescripteur;
    private Date datePrescription;
    private DefaultListModel<Medicament> medicaments;
    private static int compteur=0;

    public Prescription() {
        this.nomPrescription ="";
        this.phPrescripteur = null;
        this.medicaments = new DefaultListModel();
        this.datePrescription = null;
    }

    /**
     * @return the phPrescripteur
     */
    
    public Prescription(String nom, PH phRes, Date date, DefaultListModel<Medicament> medocs){
        this.nomPrescription = nom;
        this.phPrescripteur = phRes;
        this.datePrescription = date;
        this.medicaments = medocs;
    }
    
    public static int getIDPresc() {
        try {
            String sql = "SELECT * FROM prescription";
            ResultSet resultat=CHUPP.getRequete(sql);
            resultat.last();
            compteur = resultat.getRow() + 1;
            return compteur;
        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
            return 0;
        }
    }
    public int getIDPrescNonStatic() {
        try {
            String sql = "SELECT * FROM prescription";
            ResultSet resultat=CHUPP.getRequete(sql);
            resultat.last();
            compteur = resultat.getRow() + 1;
            return compteur;
        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
            return 0;
        }
    }
    
    public PH getPhPrescripteur() {
        return phPrescripteur;
    }
    
    /**
     * @param phPrescripteur the phPrescripteur to set
     */
    public void setPhPrescripteur(PH phPrescripteur) {
        this.phPrescripteur = phPrescripteur;
    }

    /**
     * @return the datePrescription
     */
    public Date getDatePrescription() {
        return datePrescription;
    }

    /**
     * @param datePrescription the datePrescription to set
     */
    public void setDatePrescription(Date datePrescription) {
        this.datePrescription = datePrescription;
    }

    /**
     * @return the nomPrescription
     */
    public String getNomPrescription() {
        return nomPrescription;
    }

    /**
     * @param nomPrescription the nomPrescription to set
     */
    public void setNomPrescription(String nomPrescription) {
        this.nomPrescription = nomPrescription;
    }

    /**
     * @return the medicaments
     */
    public DefaultListModel<Medicament> getMedicaments() {
        return medicaments;
    }

    /**
     * @param medicaments the medicaments to set
     */
    public void setMedicaments(DefaultListModel<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
}
