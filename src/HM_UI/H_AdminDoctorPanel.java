/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HM_UI;

import HM_Model.CommunityDirectory;
import HM_Model.Doctor;
import HM_Model.DoctorDirectory;
import HM_Model.EncounterDetails;
import HM_Model.HospitalDirectory;
import HM_Model.PatientHistory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class H_AdminDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form H_AdminDoctorPanel
     */
    DoctorDirectory doctorDirectory;
    Doctor d;
    HospitalDirectory hospitalDirectory;
    CommunityDirectory communityDirectory;
    JSplitPane sp;
    PatientHistory patientHistory;
    EncounterDetails encounterDetails;

    public H_AdminDoctorPanel(DoctorDirectory doctorDirectory) {
        initComponents();
        this.doctorDirectory=doctorDirectory;
        this.d=d;
        this.hospitalDirectory=hospitalDirectory;
        this.communityDirectory=communityDirectory;
        this.patientHistory=patientHistory;
        this.doctorDirectory=doctorDirectory;
        this.sp=sp;
        this.encounterDetails=encounterDetails;

        populateDocTable();
        btnViewDetails.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDPhone = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        txtDPhone = new javax.swing.JTextField();
        lblHeading2 = new javax.swing.JLabel();
        lblHospitalLocation = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDoctorView = new javax.swing.JTable();
        lblExperience = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtDAge = new javax.swing.JTextField();
        btnViewDetails = new javax.swing.JButton();
        txtDEmail = new javax.swing.JTextField();
        txtSpeciality = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtHospitalLocation = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtExperience = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblSpeciality = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblDPhone.setText("Phone");
        add(lblDPhone);
        lblDPhone.setBounds(404, 757, 70, 16);

        lblHospitalName.setText("Hospital Name :");
        add(lblHospitalName);
        lblHospitalName.setBounds(375, 637, 100, 16);
        add(txtDPhone);
        txtDPhone.setBounds(500, 757, 180, 30);

        lblHeading2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblHeading2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading2.setText("Hospital Admin's Doctors View");
        add(lblHeading2);
        lblHeading2.setBounds(200, 40, 730, 29);

        lblHospitalLocation.setText("Hospital Location :");
        add(lblHospitalLocation);
        lblHospitalLocation.setBounds(369, 677, 120, 16);

        tblDoctorView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Speciality", "Hospital Name", "Hospital Location"
            }
        ));
        tblDoctorView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorViewMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDoctorView);

        add(jScrollPane3);
        jScrollPane3.setBounds(140, 150, 710, 241);

        lblExperience.setText("Experience :");
        add(lblExperience);
        lblExperience.setBounds(393, 717, 90, 16);
        add(txtDName);
        txtDName.setBounds(500, 480, 180, 30);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(460, 410, 72, 23);
        add(txtDAge);
        txtDAge.setBounds(500, 520, 180, 30);

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails);
        btnViewDetails.setBounds(140, 410, 93, 23);
        add(txtDEmail);
        txtDEmail.setBounds(500, 560, 180, 30);
        add(txtSpeciality);
        txtSpeciality.setBounds(500, 597, 180, 30);

        lblName.setText("Doctor Name :");
        add(lblName);
        lblName.setBounds(387, 480, 90, 16);
        add(txtHospitalName);
        txtHospitalName.setBounds(500, 637, 180, 30);

        lblAge.setText("Age :");
        add(lblAge);
        lblAge.setBounds(427, 520, 40, 16);
        add(txtHospitalLocation);
        txtHospitalLocation.setBounds(500, 677, 180, 30);
        add(txtSearch);
        txtSearch.setBounds(220, 100, 218, 22);

        lblEmail.setText("Email :");
        add(lblEmail);
        lblEmail.setBounds(415, 560, 60, 16);
        add(txtExperience);
        txtExperience.setBounds(500, 717, 180, 30);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(140, 100, 72, 23);

        lblSpeciality.setText("Speciality :");
        add(lblSpeciality);
        lblSpeciality.setBounds(406, 600, 70, 16);

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        add(btnViewAll);
        btnViewAll.setBounds(770, 90, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\adity\\Downloads\\doctor-netherlands-1920x1080_1410x1130.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1410, 1130);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDoctorViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorViewMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctorView.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Patient to View their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctorView.getModel();
        Doctor selecteddoctor=(Doctor) model.getValueAt(selectedRowIndex, 0);

        txtDName.setText(selecteddoctor.getName());
        txtDAge.setText(String.valueOf(selecteddoctor.getdAge()));
        txtDEmail.setText(selecteddoctor.getEmail());
        txtSpeciality.setText(selecteddoctor.getSpeciality());
        txtExperience.setText(String.valueOf(selecteddoctor.getExperience()));
        txtHospitalName.setText(selecteddoctor.getHospitalName());
        txtHospitalLocation.setText(selecteddoctor.getHospitalLocation());
        txtDPhone.setText(String.valueOf(selecteddoctor.getPhone()));
    }//GEN-LAST:event_tblDoctorViewMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctorView.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Patient to Update their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctorView.getModel();
        Doctor selecteddoctor=(Doctor) model.getValueAt(selectedRowIndex, 0);

        try{
            if(checkfield()){
                selecteddoctor.setName(txtDName.getText());
                selecteddoctor.setdAge(Integer.parseInt(txtDAge.getText()));
                selecteddoctor.setEmail(txtDEmail.getText());
                selecteddoctor.setSpeciality(txtSpeciality.getText());
                selecteddoctor.setExperience(Double.parseDouble(txtExperience.getText()));
                selecteddoctor.setHospitalName(txtHospitalName.getText());
                selecteddoctor.setHospitalLocation(txtHospitalLocation.getText());
                selecteddoctor.setPhone(Long.parseLong(txtDPhone.getText()));

                JOptionPane.showMessageDialog(this, "Your Details Have Been Updated..!!");
                populateDocTable();

                txtDName.setText("");
                txtDAge.setText("");
                txtDEmail.setText("");
                txtSpeciality.setText("");
                txtExperience.setText("");
                txtHospitalName.setText("");
                txtHospitalLocation.setText("");
                txtDPhone.setText("");
            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Please update with correct values..!!");}

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        /* int selectedRowIndex = tblDoctorView.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Patient to View their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctorView.getModel();
        Doctor selecteddoctor=(Doctor) model.getValueAt(selectedRowIndex, 0);

        txtDName.setText(selecteddoctor.getName());
        txtDAge.setText(String.valueOf(selecteddoctor.getdAge()));
        txtDEmail.setText(selecteddoctor.getEmail());
        txtSpeciality.setText(selecteddoctor.getSpeciality());
        txtExperience.setText(String.valueOf(selecteddoctor.getExperience()));
        txtHospitalName.setText(selecteddoctor.getHospitalName());
        txtHospitalLocation.setText(selecteddoctor.getHospitalLocation());
        txtDPhone.setText(String.valueOf(selecteddoctor.getPhone()));*/

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search=txtSearch.getText();
        var result = doctorDirectory.doctorSearch(search);
        populateDocSearch(result);
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        populateDocTable();
        txtSearch.setText("");
    }//GEN-LAST:event_btnViewAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDPhone;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblHeading2;
    private javax.swing.JLabel lblHospitalLocation;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JTable tblDoctorView;
    private javax.swing.JTextField txtDAge;
    private javax.swing.JTextField txtDEmail;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtDPhone;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtHospitalLocation;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpeciality;
    // End of variables declaration//GEN-END:variables

    
      private void populateDocTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctorView.getModel();
        model.setRowCount(0);
        for(Doctor d:doctorDirectory.getDoctorDirectory()){
            Object[] rows = new Object[4];
            rows[0]= d;
            rows[1]=d.getSpeciality();
            rows[2]=d.getHospitalName();
            rows[3]=d.getHospitalLocation();
            
            model.addRow(rows);
    }
    }
      
      private void populateDocSearch(ArrayList<Doctor> result) {
        DefaultTableModel model = (DefaultTableModel) tblDoctorView.getModel();
        model.setRowCount(0);
        for(Doctor d:result){
            Object[] rows = new Object[4];
            rows[0]= d;
            rows[1]=d.getSpeciality();
            rows[2]=d.getHospitalName();
            rows[3]=d.getHospitalLocation();
            
            model.addRow(rows);
        }
    }
      
    private boolean checkfield(){
    ArrayList msg=null;
    msg= new ArrayList();
    
     if(txtDName.getText().isBlank()|| !(txtDName.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the name without digits or special characters but do not leave it blank");}
     if(txtDEmail.getText().isBlank()||!(txtDEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")))
        msg.add(("Please enter the correct email (xxx@xx.com)"));
     if(!(String.valueOf(txtDPhone.getText()).matches("^[0-9]{10}$")))
       {msg.add("Please enter the 10 digit mobile number");}
     if(Integer.parseInt(txtDAge.getText())<1 || Integer.parseInt(txtDAge.getText())>100)
             msg.add("Please enter the correct age between 1 and 100");
     if(txtSpeciality.getText().isBlank()|| !(txtSpeciality.getText().matches("^[a-zA-Z ]*$")))
             msg.add("Please enter the Speciality without digits or special characters but do not leave it blank");
     if(Double.parseDouble(txtExperience.getText())<0 || Double.parseDouble(txtExperience.getText())>75)
             msg.add("Please enter your correct experience");
     if(txtHospitalName.getText().isBlank()|| !(txtHospitalName.getText().matches("^[a-zA-Z ]*$")))
             msg.add("Please enter the Hospital name without special characters but do not leave it blank");
     if(txtHospitalLocation.getText().isBlank()|| !(txtHospitalLocation.getText().matches("^[a-zA-Z ]*$")))
             msg.add("Please enter the correct location without special characters but do not leave it blank");
 
     if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
        msg.clear();
        return false;}
        else 
        return true;
    }
}
