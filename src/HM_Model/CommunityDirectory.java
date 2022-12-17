/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM_Model;

import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author adity
 */
public class CommunityDirectory {
    private ArrayList<Community> communityDirectory;

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public CommunityDirectory() {
        this.communityDirectory = new ArrayList<Community>();
    }
    
    public Community addCommunity(){
    Community newCommunity = new Community();
    communityDirectory.add(newCommunity);
    return newCommunity;
    }
    
    public void deleteCommunity(Community c){
         communityDirectory.remove(c);
     }
    
    public boolean uniqueCommunity(String cName, String CCode){
        for(Community c : communityDirectory){
            if(c.getCommunityName().equals(cName) && c.getCommunityCode().equals(CCode))
                return true;
        }
        return false;
    }
    
     public ArrayList<Community> communitySearch(String search) {
        ArrayList<Community> com = new ArrayList<Community>();
        for (Community c : getCommunityDirectory()) {
            //System.out.println(d.getName()+'\n'+d.getdAge()+'\n'+d.getExperience()+'\n'+d.getHospitalLocation()+'\n'+d.getdAge());
            if (c.getCommunityName() != null) {
                if (c.getCommunityName().contains(search) || c.getCommunityCode().contains(search)) {
                    if (!com.contains(c)) {
                        com.add(c);
                    }
                }

            }
        }
        return com;
    }
    
    
}
