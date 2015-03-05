/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.sih;

/**
 *
 * @author Tommy
 */
public class PH extends PersonnelMedical {

    
    public PH(){
        super();
        specialite="DefaultSpeciality";
    }
    public PH(String id,String nom, String prenom){
        super(id,nom, prenom);
    }
    public PH(String id, String nom, String prenom, String mdp, String specialite){
        super(id,nom,prenom,mdp,specialite);
    }

    /**
     * @return the id
     */
    public String getID() {
        return super.ID;
    }

    /**
     * @param id the id to set
     */
    public void setID(String ID) {
        super.setID(ID);
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return super.nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        super.setNom(nom);
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return super.prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        super.setPrenom(prenom);
    }

    public String toString() {
        String s = this.getNom() + " " + this.getPrenom();
        return s;
    }
}
