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
public class EncounterDetails {
 
    private ArrayList<Encounter> encounterDetails;

    public ArrayList<Encounter> getEncounterDetails() {
        return encounterDetails;
    }

    public void setEncounterDetails(ArrayList<Encounter> encounterDetails) {
        this.encounterDetails = encounterDetails;
    }
    public EncounterDetails(){
    this.encounterDetails=new ArrayList<>();
    }
    
    public Encounter addEncounter(){
        Encounter newEncounter = new Encounter();
        encounterDetails.add(newEncounter);
        return newEncounter;
    }
     public Encounter getEncounterByDate(String date){
        for(Encounter e : encounterDetails){
         if(e.getEncDate().equals(date))
           return e;
        }
        return null;
    }
     
     public void deleteEncounter(Encounter e){
         encounterDetails.remove(e);
     }
}
