/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HM_UI;

import HM_Model.Community;
import HM_Model.CommunityDirectory;
import HM_Model.Doctor;
import HM_Model.DoctorDirectory;
import HM_Model.PatientHistory;
import HM_Model.EncounterDetails;
import HM_Model.Hospital;
import HM_Model.HospitalAdmin;
import HM_Model.HospitalDirectory;
import HM_Model.Patient;
import HM_Model.SystemAdmin;
import HM_Model.VitalSignsDirectory;
/**
 *
 * @author adity
 */
public class Mainframe extends javax.swing.JFrame {

    /**
     * Creates new form Mainframe
     */
    PatientHistory patientHistory;
    DoctorDirectory doctorDirectory;
    EncounterDetails encounterDetails;
    VitalSignsDirectory vitalSignsDirectory;
    CommunityDirectory communityDirectory;
    HospitalDirectory hospitalDirectory;
    SystemAdmin s;
    HospitalAdmin h;
    
    public Mainframe() {
        initComponents();
        patientHistory = new PatientHistory();
        doctorDirectory = new DoctorDirectory();
        encounterDetails = new EncounterDetails();
        vitalSignsDirectory = new VitalSignsDirectory();
        communityDirectory = new CommunityDirectory();
        hospitalDirectory = new HospitalDirectory();
        
         /*Sample Logins*/
        Patient p = patientHistory.addPatient();
        p.setEmail("aditya@gmail.com");
        p.setPassword("Aditya123");
        p.setGender("Male");
        p.setHeight(180);
        p.setName("Aditya");
        p.setPhone(1234567890);
        p.setRole("Patient");
        p.setWeight(190);
        p.setpAge(25);
        
        Patient p1 = patientHistory.addPatient();
        p1.setEmail("test@gmail.com");
        p1.setPassword("test123");
        p1.setGender("Female");
        p1.setHeight(150);
        p1.setName("Aditi");
        p1.setPhone(1234567809);
        p1.setRole("Patient");
        p1.setWeight(170);
        p1.setpAge(30);
        
         Patient p2 = patientHistory.addPatient();
        p2.setEmail("mohit@gmail.com");
        p2.setPassword("Mohit123");
        p2.setGender("Male");
        p2.setHeight(170);
        p2.setName("Mohit");
        p2.setPhone(1234568899);
        p2.setRole("Patient");
        p2.setWeight(200);
        p2.setpAge(30);
        
        Doctor d= doctorDirectory.addDoctor();
        d.setEmail("doctor@gmail.com");
        d.setPassword("doctor123");
        d.setExperience(15);
        d.setGender("Male");
        d.setHospitalLocation("Roxbury");
        d.setHospitalName("Apollo");
        d.setName("Aditya");
        d.setPhone(1234567890);
        d.setRole("Doctor");
        d.setSpeciality("Neuro");
        d.setdAge(45);
        
        Doctor d1= doctorDirectory.addDoctor();
        d1.setEmail("test@gmail.com");
        d1.setPassword("test123");
        d1.setExperience(3);
        d1.setGender("Female");
        d1.setHospitalLocation("Rochester");
        d1.setHospitalName("Care");
        d1.setName("Alexa");
        d1.setPhone(1234567777);
        d1.setRole("Doctor");
        d1.setSpeciality("Cardio");
        d1.setdAge(30);
        
        Community c = communityDirectory.addCommunity();
        c.setCommunityName("Boston");
        c.setCommunityCode("02120");
        c.setHouseNumber("75 Saint Alphonsus Street");
        
        Community c1 = communityDirectory.addCommunity();
        c1.setCommunityName("New York");
        c1.setCommunityCode("02126");
        c1.setHouseNumber("50 Buffalo Drive");
        
        Hospital h = hospitalDirectory.addHospital();
        h.setHospitalName("NRI");
        h.setHospitalLocation("Roxbury");
        h.setCommunityName("Boston");
        
        Hospital h1 = hospitalDirectory.addHospital();
        h1.setHospitalName("AIIMS");
        h1.setHospitalLocation("Rochester");
        h1.setCommunityName("New York");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlArea = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1430, 1130));
        getContentPane().setLayout(null);

        controlArea.setBackground(new java.awt.Color(212, 232, 252));
        controlArea.setForeground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Goudy Stout", 3, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setMnemonic('L');
        btnLogin.setText("Login...");
        btnLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlAreaLayout = new javax.swing.GroupLayout(controlArea);
        controlArea.setLayout(controlAreaLayout);
        controlAreaLayout.setHorizontalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlAreaLayout.setVerticalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlArea);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\AED_assignment_1\\kanala_aditya_002914764\\HospitalManagement\\Images\\dji-0021-edit-2000x888_1410x1130.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        getContentPane().add(splitPane);
        splitPane.setBounds(0, 0, 1631, 1378);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        LoginPanel loginpanel = new LoginPanel(h,s,patientHistory, doctorDirectory,splitPane, encounterDetails, vitalSignsDirectory, communityDirectory, hospitalDirectory);
        splitPane.setRightComponent(loginpanel);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel controlArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

     


}
