/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM_Model;

/**
 *
 * @author adity
 */
public class Encounter {
    
    private String encDate;
    Patient p;
    Doctor d;
    String patientProblem;

    public String getPatientProblem() {
        return patientProblem;
    }

    public void setPatientProblem(String patientProblem) {
        this.patientProblem = patientProblem;
    }

   
    public String getEncDate() {
        return encDate;
    }

    public void setEncDate(String encDate) {
        this.encDate = encDate;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public Doctor getD() {
        return d;
    }

    public void setD(Doctor d) {
        this.d = d;
    }
    
    
    
}
