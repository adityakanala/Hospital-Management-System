/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM_Model;

/**
 *
 * @author adity
 */
public class VitalSigns {
  
    private String bp;
    private float sugar;
    private float pulse;
    Patient p;
    String encDate;
    String doctorSolution;
    String patientProblem;

    public String getPatientProblem() {
        return patientProblem;
    }

    public void setPatientProblem(String patientProblem) {
        this.patientProblem = patientProblem;
    }

    public String getDoctorSolution() {
        return doctorSolution;
    }

    public void setDoctorSolution(String doctorSolution) {
        this.doctorSolution = doctorSolution;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getEncDate() {
        return encDate;
    }

    public void setEncDate(String encDate) {
        this.encDate = encDate;
    }
    

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getPulse() {
        return pulse;
    }

    public void setPulse(float pulse) {
        this.pulse = pulse;
    }
    
}
