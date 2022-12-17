/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HM_UI;

import HM_Model.CommunityDirectory;
import HM_Model.DoctorDirectory;
import HM_Model.EncounterDetails;
import HM_Model.HospitalDirectory;
import HM_Model.Patient;
import HM_Model.PatientHistory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class H_AdminPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form H_AdminPatientPanel
     */
    PatientHistory patientHistory;
    Patient p;
    HospitalDirectory hospitalDirectory;
   CommunityDirectory communityDirectory;
   JSplitPane sp;
   DoctorDirectory doctorDirectory;
      EncounterDetails encounterDetails;

    
    public H_AdminPatientPanel(PatientHistory patientHistory) {
        initComponents();
        this.hospitalDirectory=hospitalDirectory;
        this.communityDirectory=communityDirectory;
        this.patientHistory=patientHistory;
        this.doctorDirectory=doctorDirectory;
        this.sp=sp;
        this.encounterDetails=encounterDetails;
        
        populatePatientTable();
        btnViewPatient.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewPatient = new javax.swing.JButton();
        lblPEmail = new javax.swing.JLabel();
        btnUpdatePDetails = new javax.swing.JButton();
        lblPPhone = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JButton();
        txtPName = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        txtPAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientView = new javax.swing.JTable();
        txtPEmail = new javax.swing.JTextField();
        txtPPhone = new javax.swing.JTextField();
        lblHeading4 = new javax.swing.JLabel();
        txtPHeight = new javax.swing.JTextField();
        lblPName = new javax.swing.JLabel();
        txtPWeight = new javax.swing.JTextField();
        lblPAge = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnViewPatient.setText("View Details");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });
        add(btnViewPatient);
        btnViewPatient.setBounds(80, 11, 93, 23);

        lblPEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPEmail.setText("Email");
        add(lblPEmail);
        lblPEmail.setBounds(380, 490, 70, 21);

        btnUpdatePDetails.setText("Update Details");
        btnUpdatePDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePDetailsActionPerformed(evt);
            }
        });
        add(btnUpdatePDetails);
        btnUpdatePDetails.setBounds(230, 260, 130, 23);

        lblPPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPPhone.setText("Phone");
        add(lblPPhone);
        lblPPhone.setBounds(380, 610, 60, 25);

        btnSearch.setText("Search Patient");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(240, 120, 105, 23);

        lblHeight.setBackground(new java.awt.Color(0, 255, 204));
        lblHeight.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHeight.setText("Height");
        add(lblHeight);
        lblHeight.setBounds(380, 670, 60, 20);

        lblWeight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblWeight.setText("Weight");
        add(lblWeight);
        lblWeight.setBounds(380, 720, 70, 25);

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        add(btnViewAll);
        btnViewAll.setBounds(750, 120, 72, 23);
        add(txtPName);
        txtPName.setBounds(500, 420, 166, 30);
        add(txtSearch);
        txtSearch.setBounds(360, 120, 165, 22);
        add(txtPAge);
        txtPAge.setBounds(500, 550, 170, 30);

        tblPatientView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientView);

        add(jScrollPane1);
        jScrollPane1.setBounds(230, 170, 649, 62);
        add(txtPEmail);
        txtPEmail.setBounds(500, 490, 166, 30);
        add(txtPPhone);
        txtPPhone.setBounds(500, 610, 170, 30);

        lblHeading4.setBackground(new java.awt.Color(255, 255, 255));
        lblHeading4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblHeading4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading4.setText("Patients Details");
        add(lblHeading4);
        lblHeading4.setBounds(80, 40, 953, 29);

        txtPHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHeightActionPerformed(evt);
            }
        });
        add(txtPHeight);
        txtPHeight.setBounds(500, 660, 170, 30);

        lblPName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPName.setText("Patient Name");
        add(lblPName);
        lblPName.setBounds(360, 420, 140, 25);
        add(txtPWeight);
        txtPWeight.setBounds(500, 720, 170, 30);

        lblPAge.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPAge.setText("Age");
        add(lblPAge);
        lblPAge.setBounds(390, 550, 40, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\adity\\Downloads\\patient-room-front-view_960x530_1410x1130.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1410, 1130);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        /* int selectedRowIndex = tblPatientView.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Patient to View their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatientView.getModel();
        Patient selectedpatient=(Patient) model.getValueAt(selectedRowIndex, 0);

        /*btnUpdatePDetails.setVisible(true);
        txtPName.setVisible(true);
        txtPAge.setVisible(true);
        txtPEmail.setVisible(true);
        txtPPhone.setVisible(true);
        txtPHeight.setVisible(true);
        txtPWeight.setVisible(true);
        lblPName.setVisible(true);
        lblPAge.setVisible(true);
        lblPEmail.setVisible(true);
        lblPPhone.setVisible(true);
        lblHeight.setVisible(true);
        lblWeight.setVisible(true);*/

        /* txtPName.setText(selectedpatient.getName());
        txtPAge.setText(String.valueOf(selectedpatient.getpAge()));
        txtPEmail.setText(selectedpatient.getEmail());
        txtPPhone.setText(String.valueOf(selectedpatient.getPhone()));
        txtPHeight.setText(String.valueOf(selectedpatient.getHeight()));
        txtPWeight.setText(String.valueOf(selectedpatient.getWeight()));*/
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnUpdatePDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientView.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Patient to Update their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatientView.getModel();
        Patient selectedpatient=(Patient) model.getValueAt(selectedRowIndex, 0);
        try{
            if(checkfield()){
                selectedpatient.setName(txtPName.getText());
                selectedpatient.setEmail(txtPEmail.getText());
                selectedpatient.setpAge(Integer.parseInt(txtPAge.getText()));
                selectedpatient.setPhone(Long.parseLong(txtPPhone.getText()));
                selectedpatient.setHeight(Double.parseDouble(txtPHeight.getText()));
                selectedpatient.setWeight(Double.parseDouble(txtPWeight.getText()));

                JOptionPane.showMessageDialog(this, "Your Details Have Been Updated..!!");
                populatePatientTable();

                txtPName.setText("");
                txtPAge.setText("");
                txtPEmail.setText("");
                txtPPhone.setText("");
                txtPHeight.setText("");
                txtPWeight.setText("");

            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Please update with correct values..!!");}

    }//GEN-LAST:event_btnUpdatePDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search=txtSearch.getText();
        var result = patientHistory.patientSearch(search);
        populatePatientSearch(result);
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        populatePatientTable();
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void tblPatientViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientViewMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientView.getSelectedRow();
        /*if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Patient to View their Details");
            return;
        }*/
        DefaultTableModel model = (DefaultTableModel) tblPatientView.getModel();
        Patient selectedpatient=(Patient) model.getValueAt(selectedRowIndex, 0);

        txtPName.setText(selectedpatient.getName());
        txtPAge.setText(String.valueOf(selectedpatient.getpAge()));
        txtPEmail.setText(selectedpatient.getEmail());
        txtPPhone.setText(String.valueOf(selectedpatient.getPhone()));
        txtPHeight.setText(String.valueOf(selectedpatient.getHeight()));
        txtPWeight.setText(String.valueOf(selectedpatient.getWeight()));
    }//GEN-LAST:event_tblPatientViewMouseClicked

    private void txtPHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPHeightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdatePDetails;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading4;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblPAge;
    private javax.swing.JLabel lblPEmail;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPPhone;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTable tblPatientView;
    private javax.swing.JTextField txtPAge;
    private javax.swing.JTextField txtPEmail;
    private javax.swing.JTextField txtPHeight;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPPhone;
    private javax.swing.JTextField txtPWeight;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    
    private boolean checkfield(){
    ArrayList msg=null;
    msg= new ArrayList();
    
     if(txtPName.getText().isBlank()|| !(txtPName.getText().matches("^[a-zA-Z ]*$")))
        {msg.add("Please enter the name without digits or special characters but do not leave it blank");}
     if(txtPEmail.getText().isBlank()||!(txtPEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")))
        msg.add(("Please enter the correct email (xxx@xx.com)"));
     if(!(String.valueOf(txtPPhone.getText()).matches("^[0-9]{10}$")))
       {msg.add("Please enter the 10 digit mobile number");}
     if(Integer.parseInt(txtPAge.getText())<1 || Integer.parseInt(txtPAge.getText())>=100)
        {msg.add("Please enter the correct age between 1 and 100");}
     if(Double.parseDouble(txtPHeight.getText())<30.48|| Double.parseDouble(txtPHeight.getText())>300)
        {msg.add("Please Enter your appropriate height");}
     if(Double.parseDouble(txtPWeight.getText())<4.4 ||Double.parseDouble(txtPWeight.getText()) >500)
         msg.add("Please Enter your Correct weight");
     
      if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
        msg.clear();
        return false;}
        else 
        return true;
    }

    private void populatePatientTable() {
        DefaultTableModel model =(DefaultTableModel) tblPatientView.getModel();
        model.setRowCount(0);
        for(Patient p: patientHistory.getPatientHistory()){
            Object[] rows = new Object[2];
            rows[0]=p;
            rows[1]=p.getEmail();
            
            model.addRow(rows);
        }
    }
    
      private void populatePatientSearch(ArrayList<Patient> result) {
        DefaultTableModel model = (DefaultTableModel) tblPatientView.getModel();
        model.setRowCount(0);
        for(Patient p:result){
            Object[] rows = new Object[2];
            rows[0]= p;
            rows[1]=p.getEmail();
            
            
            model.addRow(rows);
        }
    }
}
