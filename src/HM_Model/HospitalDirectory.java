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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDirectory;

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public HospitalDirectory(){
        this.hospitalDirectory= new ArrayList<Hospital>();
    }
    
    public Hospital addHospital(){
        Hospital newHospital = new Hospital();
        hospitalDirectory.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital h){
        hospitalDirectory.remove(h);
    }
    
      public boolean uniqueHospital(String hospitalName, String hospitalLocation){
        for(Hospital h : hospitalDirectory){
            if(h.getHospitalName().equals(hospitalName) && h.getHospitalLocation().equals(hospitalLocation))
                return true;
        }
        return false;
    }
      
     public ArrayList<Hospital> hospitalSearch(String search) {
        ArrayList<Hospital> hos = new ArrayList<Hospital>();
        for (Hospital h : getHospitalDirectory()) {
            //System.out.println(d.getName()+'\n'+d.getdAge()+'\n'+d.getExperience()+'\n'+d.getHospitalLocation()+'\n'+d.getdAge());
            if (h.getHospitalName() != null) {
                if (h.getHospitalName().contains(search) || h.getHospitalLocation().contains(search) || h.getCommunityName().contains(search)) {
                    if (!hos.contains(h)) {
                        hos.add(h);
                    }
                }

            }
        }
        return hos;
    }
}
