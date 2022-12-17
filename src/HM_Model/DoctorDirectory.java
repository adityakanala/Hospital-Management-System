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
public class DoctorDirectory {

    private ArrayList<Doctor> doctorDirectory;

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public DoctorDirectory() {
        this.doctorDirectory = new ArrayList<Doctor>();
    }

    public Doctor addDoctor() {
        Doctor newDoctor = new Doctor();
        doctorDirectory.add(newDoctor);
        return newDoctor;
    }

    public boolean getSearch(String email, String password) {
        for (Doctor d : doctorDirectory) {
            if (d.getEmail().equalsIgnoreCase(email) && d.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Doctor> doctorSearch(String search) {
        ArrayList<Doctor> doc = new ArrayList<Doctor>();
        for (Doctor d : getDoctorDirectory()) {
            //System.out.println(d.getName()+'\n'+d.getdAge()+'\n'+d.getExperience()+'\n'+d.getHospitalLocation()+'\n'+d.getdAge());
            if (d.getName() != null) {
                if (d.getName().contains(search) || d.getHospitalName().contains(search) || d.getSpeciality().contains(search) || d.getHospitalLocation().contains(search)) {
                    if (!doc.contains(d)) {
                        doc.add(d);
                    }
                }

            }
        }
        return doc;
    }

    public boolean uniqueEmail(String email) {
        for (Doctor d : doctorDirectory) {
            if (d.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    public Doctor getDoctor(String email, String password) {
        for (Doctor d : getDoctorDirectory()) {
            if (d.getEmail().equalsIgnoreCase(email) && d.getPassword().equals(password)) {
                return d;
            }
        }
        return null;
    }
    
    public void deleteDoctor(Doctor d){
         doctorDirectory.remove(d);
     }
}
