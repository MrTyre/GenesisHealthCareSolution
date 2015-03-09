/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.sih;

import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import projet.UI.ConnexionUI;

/**
 *
 * @author Tommy
 */
public class DM {

    private DefaultListModel<Observation> observationsPH;
    private DefaultListModel<Prescription> prescriptionsPH;
    private DefaultListModel<String> resultatsPH;
    private String lettreSortie;

    public DM() {
        observationsPH = new DefaultListModel<Observation>();
        prescriptionsPH = new DefaultListModel<Prescription>();
        resultatsPH = new DefaultListModel<String>();
        lettreSortie = null;
    }

    /**
     * @return the observationsPH
     */
    public DefaultListModel<Observation> getObservationsPH() {
        return observationsPH;
    }

    /**
     * @return the prescriptionsPH
     */
    public DefaultListModel<Prescription> getPrescriptionsPH() {
        return prescriptionsPH;
    }

    /**
     * @return the resultatsPH
     */
    public DefaultListModel<String> getResultatsPH() {
        return resultatsPH;
    }

    /**
     * @return the lettreSortie
     */
    public String getLettreSortie() {
        return lettreSortie;
    }

    public String afficherPrescriptions(Patient patient) {
        String s = "";
        try {
            String sql = "SELECT * FROM prescription WHERE prescription.ipp=" + patient.getIPP();

            ResultSet resultat = CHUPP.getRequete(sql);
            while (resultat.next()) {
                String sql2 = "SELECT medicament.* FROM medicament, prescription, patient WHERE medicament.idpresc= prescription.idpresc and prescription.ipp=patient.ipp and prescription.ipp=" + patient.getIPP();

                ResultSet resultat2 = CHUPP.getRequete(sql2);
                s += "Prescription du " + resultat.getDate("prescription.date") + ", Dr. " + ConnexionUI.getCurrentConnected().getNom() + "  numero de prescription: " + resultat.getString("idpresc");
                while (resultat2.next()) {
                    if (resultat2.getInt("idpresc") == resultat.getInt("idpresc")) {
                        s += "\n\t\t- " + resultat2.getString("nom");
                        s += "\t\t\t" + resultat2.getString("dose") + " " + resultat2.getString("unite") + "/j  jusqu'au " + resultat2.getString("date_fin");
                    }
                }
                s += "\n------------------------------------------------------------------------------------------------------------------\n";
            }
            return s;
        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
            return "erreur";
        }
    }

    public String afficherObservationsPH(Patient patient) {
        String s = "";
        try {
            s += "OBSERVATIONS RELATIVES A UNE CONSULTATION :";
            String sqlc = "SELECT observation.* FROM observation, consultation WHERE observation.idch=consultation.idconsult AND consultation.ipp=" + patient.getIPP();
            ResultSet resultat = CHUPP.getRequete(sqlc);
            resultat.last();
            int nbrow = resultat.getRow();
            resultat.beforeFirst();
            if (nbrow == 0) {
                s += "\nIl n'y a pas d'observations relatives à une consultation pour ce patient.";
            } else {
                while (resultat.next()) {
                    String sqlc2 = "SELECT DISTINCT practicien_hospitalier.*,consultation.date FROM practicien_hospitalier, consultation WHERE consultation.idph=practicien_hospitalier.idph AND consultation.idconsult=" + resultat.getInt("observation.idch");
                    ResultSet resultat2 = CHUPP.getRequete(sqlc2);
                    resultat2.first();
                    s += "\nObservation du " + resultat.getDate("observation.date") + ", faite par le Dr. " + resultat2.getString("practicien_hospitalier.nom") + " " + resultat2.getString("practicien_hospitalier.prenom") + ", se référant à la consultation du " + resultat2.getDate("consultation.date")+" :";
                    s += "\n\tContenu : "+resultat.getString("observation.contenu");
                    s += "\n------------------------------------------------------------------------------------------------------------------\n";
                }
            }
            
            s += "\n\nOBSERVATIONS RELATIVES A UNE HOSPITALISATION :";
            String sqlh = "SELECT observation.* FROM observation, hospitalisation WHERE observation.idch=hospitalisation.idhosp AND hospitalisation.ipp=" + patient.getIPP();
            ResultSet resultat3 = CHUPP.getRequete(sqlh);
            resultat3.last();
            nbrow = resultat3.getRow();
            resultat3.beforeFirst();
            if (nbrow == 0) {
                s += "\nIl n'y a pas d'observations relatives à une hospitalisation pour ce patient.";
            } else {
                while (resultat3.next()) {
                    String sqlh2 = "SELECT practicien_hospitalier.*,hospitalisation.date, hospitalisation.date_sortie FROM practicien_hospitalier, hospitalisation WHERE hospitalisation.idph=practicien_hospitalier.idph AND hospitalisation.idhosp=" + resultat3.getInt("observation.idch");
                    ResultSet resultat4 = CHUPP.getRequete(sqlh2);
                    resultat4.first();
                    s += "\nObservation du " + resultat3.getDate("observation.date") + ", faite par le Dr. " + resultat4.getString("practicien_hospitalier.nom") + " " + resultat4.getString("practicien_hospitalier.prenom") + ", se référant à l'hospitalisation du " + resultat4.getDate("hospitalisation.date") + " au " + resultat4.getDate("hospitalisation.date_sortie")+" :";
                    s += "\n\tContenu : "+resultat3.getString("observation.contenu");
                    s += "\n------------------------------------------------------------------------------------------------------------------\n";
                }
            }
            return s;
        } catch (Exception e) {
            System.out.println("Failed to get Statement");
            e.printStackTrace();
            return "erreur";
        }
    }
}
