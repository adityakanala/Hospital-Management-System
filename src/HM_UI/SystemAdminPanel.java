/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HM_UI;

import HM_Model.CommunityDirectory;
import HM_Model.DoctorDirectory;
import HM_Model.EncounterDetails;
import HM_Model.HospitalDirectory;
import HM_Model.HouseDirectory;
import HM_Model.PatientHistory;
import javax.swing.JSplitPane;

/**
 *
 * @author adity
 */
public class SystemAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdmin
     */
    JSplitPane sp;
    PatientHistory patientHistory;
    DoctorDirectory doctorDirectory;
    CommunityDirectory communityDirectory;
    HospitalDirectory hospitalDirectory;
    EncounterDetails encounterDetails;
    HouseDirectory houseDirectory;
    
    public SystemAdminPanel(EncounterDetails encounterDetails, JSplitPane sp, PatientHistory patientHistory, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, CommunityDirectory communityDirectory) {
        initComponents();
        this.patientHistory=patientHistory;
        this.sp=sp;
        this.doctorDirectory=doctorDirectory;
        this.communityDirectory=communityDirectory;
        this.hospitalDirectory=hospitalDirectory;
        this.encounterDetails=encounterDetails;
        this.houseDirectory=houseDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnHospitals = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEncounter = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1410, 1130));
        setLayout(null);

        btnPatient.setBackground(new java.awt.Color(0, 0, 0));
        btnPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnPatient.setText("Patient");
        btnPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        add(btnPatient);
        btnPatient.setBounds(30, 310, 110, 40);

        btnDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctor.setText("Doctor");
        btnDoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        add(btnDoctor);
        btnDoctor.setBounds(30, 380, 110, 40);

        btnHospitals.setBackground(new java.awt.Color(0, 0, 0));
        btnHospitals.setForeground(new java.awt.Color(255, 255, 255));
        btnHospitals.setText("Hospital");
        btnHospitals.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalsActionPerformed(evt);
            }
        });
        add(btnHospitals);
        btnHospitals.setBounds(30, 450, 120, 40);

        btnCommunity.setBackground(new java.awt.Color(0, 0, 0));
        btnCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnCommunity.setText("Community");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });
        add(btnCommunity);
        btnCommunity.setBounds(30, 520, 120, 40);

        btnSignUp.setBackground(new java.awt.Color(0, 0, 0));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Create");
        btnSignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        add(btnSignUp);
        btnSignUp.setBounds(30, 770, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\adity\\Downloads\\SysAdmin_1410x1130.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1410, 1130));
        add(jLabel1);
        jLabel1.setBounds(200, 0, 1300, 1120);

        btnEncounter.setBackground(new java.awt.Color(0, 0, 0));
        btnEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnEncounter.setText("Encounter");
        btnEncounter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });
        add(btnEncounter);
        btnEncounter.setBounds(30, 590, 120, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        SysAdminPatientPanel sapp= new SysAdminPatientPanel(houseDirectory, encounterDetails,communityDirectory,patientHistory,doctorDirectory,sp,hospitalDirectory);
        sp.setRightComponent(sapp);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        SysAdminDoctorPanel sadp=new SysAdminDoctorPanel(houseDirectory, encounterDetails,communityDirectory,patientHistory,doctorDirectory,sp,hospitalDirectory);
        sp.setRightComponent(sadp);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SysAdminCreatePanel sacp = new SysAdminCreatePanel(patientHistory,doctorDirectory);
        sp.setRightComponent(sacp);     
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        SysAdminCommunityPanel sac = new SysAdminCommunityPanel(houseDirectory, encounterDetails,communityDirectory,patientHistory,doctorDirectory,sp,hospitalDirectory);
        sp.setRightComponent(sac);
        
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalsActionPerformed
        // TODO add your handling code here:
        SysAdminHospitalPanel sahp = new SysAdminHospitalPanel( encounterDetails,communityDirectory,patientHistory,doctorDirectory,sp,hospitalDirectory);
        sp.setRightComponent(sahp);
        
    }//GEN-LAST:event_btnHospitalsActionPerformed

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        SysAdminEncounter sae = new SysAdminEncounter(encounterDetails,communityDirectory,patientHistory,doctorDirectory,sp,hospitalDirectory);
        sp.setRightComponent(sae);
    }//GEN-LAST:event_btnEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnHospitals;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
