/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM_Model;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class VitalSignsDirectory {

    private ArrayList<VitalSigns> vitalSignsDirectory;

    public ArrayList<VitalSigns> getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }

    public void setVitalSignsDirectory(ArrayList<VitalSigns> vitalSignsDirectory) {
        this.vitalSignsDirectory = vitalSignsDirectory;
    }
    
    public VitalSignsDirectory() {
        this.vitalSignsDirectory= new ArrayList<>();
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVitalSigns = new VitalSigns();
        vitalSignsDirectory.add(newVitalSigns);
        return newVitalSigns;
    }
    
    
}
