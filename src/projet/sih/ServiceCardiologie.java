/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.sih;

import javax.swing.DefaultListModel;

/**
 *
 * @author Tommy
 */
public class ServiceCardiologie extends ServiceClinique {
    
    public ServiceCardiologie(){
        this.setSpecialite("Cardiologie");
        this.setChambres(new DefaultListModel<Chambre>());
        this.getChambres().setSize(15);
    }
}
