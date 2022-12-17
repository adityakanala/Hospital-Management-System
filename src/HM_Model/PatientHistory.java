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
public class PatientHistory {
    private ArrayList<Patient> patientHistory;

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }

    public PatientHistory(){
        this.patientHistory=new ArrayList<Patient>();
    }
    
     public Patient addPatient(){
        Patient newPatient = new Patient();
        patientHistory.add(newPatient);
        return newPatient;
    }
    

       public boolean getSearch(String email, String password){
            for(Patient p : patientHistory){
            if(p.getEmail().equalsIgnoreCase(email) && p.getPassword().equals(password))
                return true;
          }
            
        
    return false;
    }
    
    public Patient getPatient(String email, String password){
    for(Patient p : patientHistory){
    if(p.getEmail().equalsIgnoreCase(email)&&p.getPassword().equals(password))
        return p;
    }
    return null;
    }
    
    public boolean uniqueEmail(String email){
    for(Patient p: patientHistory){
        if(p.getEmail().equalsIgnoreCase(email)) 
            return true;
        }
    return false;
    }
    
    public Patient getPatientByName(String name){
        for(Patient p : patientHistory){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }
    
     public ArrayList<Patient> patientSearch(String search) {
        ArrayList<Patient> patient = new ArrayList<Patient>();
        for (Patient p : getPatientHistory()) {
            //System.out.println(d.getName()+'\n'+d.getdAge()+'\n'+d.getExperience()+'\n'+d.getHospitalLocation()+'\n'+d.getdAge());
            if (p.getName() != null) {
                if (p.getName().contains(search) || p.getEmail().contains(search)) {
                    if (!patient.contains(p)) {
                        patient.add(p);
                    }
                }

            }
        }
        return patient;
    }
     
     public void deletePatient(Patient p){
         patientHistory.remove(p);
     }
    
    
    
}
