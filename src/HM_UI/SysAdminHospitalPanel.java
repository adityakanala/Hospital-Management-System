/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HM_UI;

import HM_Model.Community;
import HM_Model.CommunityDirectory;
import HM_Model.DoctorDirectory;
import HM_Model.EncounterDetails;
import HM_Model.Hospital;
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
public class SysAdminHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminHospitalPanel
     */
   HospitalDirectory hospitalDirectory;
   CommunityDirectory communityDirectory;
   JSplitPane sp;
   PatientHistory patientHistory;
   DoctorDirectory doctorDirectory;
   EncounterDetails encounterDetails;
   
    public SysAdminHospitalPanel(EncounterDetails encounterDetails, CommunityDirectory communityDirectory, PatientHistory patientHistory, DoctorDirectory doctorDirectory, JSplitPane sp, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.hospitalDirectory=hospitalDirectory;
        
        this.communityDirectory=communityDirectory;
        this.patientHistory=patientHistory;
        this.doctorDirectory=doctorDirectory;
        this.sp=sp;
        this.encounterDetails=encounterDetails;
        populateHospitalTable();
        populateCommunities();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHAdd = new javax.swing.JButton();
        btnHUpdate = new javax.swing.JButton();
        btnHSearch = new javax.swing.JButton();
        btnHViewAll = new javax.swing.JButton();
        btnHDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        txtHName = new javax.swing.JTextField();
        txtHLocation = new javax.swing.JTextField();
        cbCommunity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        lblHName = new javax.swing.JLabel();
        lblHLocation = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1410, 1130));
        setLayout(null);

        btnHAdd.setText("Add Hospital");
        btnHAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAddActionPerformed(evt);
            }
        });
        add(btnHAdd);
        btnHAdd.setBounds(175, 451, 99, 23);

        btnHUpdate.setText("Update Hospital");
        btnHUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHUpdateActionPerformed(evt);
            }
        });
        add(btnHUpdate);
        btnHUpdate.setBounds(322, 451, 115, 23);

        btnHSearch.setText("Search");
        btnHSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHSearchActionPerformed(evt);
            }
        });
        add(btnHSearch);
        btnHSearch.setBounds(497, 451, 72, 23);

        btnHViewAll.setText("View All");
        btnHViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHViewAllActionPerformed(evt);
            }
        });
        add(btnHViewAll);
        btnHViewAll.setBounds(618, 451, 72, 23);

        btnHDelete.setText("Delete");
        btnHDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDeleteActionPerformed(evt);
            }
        });
        add(btnHDelete);
        btnHDelete.setBounds(726, 451, 72, 23);
        add(txtSearch);
        txtSearch.setBounds(457, 509, 170, 22);

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Location", "Community Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospital);

        add(jScrollPane1);
        jScrollPane1.setBounds(306, 145, 452, 79);
        add(txtHName);
        txtHName.setBounds(382, 323, 420, 22);
        add(txtHLocation);
        txtHLocation.setBounds(382, 375, 423, 22);

        cbCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCommunityActionPerformed(evt);
            }
        });
        add(cbCommunity);
        cbCommunity.setBounds(382, 260, 133, 22);

        lblCommunity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunity.setText("Select Community :");
        add(lblCommunity);
        lblCommunity.setBounds(172, 263, 180, 25);

        lblHName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHName.setForeground(new java.awt.Color(255, 255, 255));
        lblHName.setText("Hospital Name:");
        add(lblHName);
        lblHName.setBounds(203, 326, 140, 25);

        lblHLocation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblHLocation.setText("Hospital Location");
        add(lblHLocation);
        lblHLocation.setBounds(180, 380, 160, 20);

        lblHeading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("System Admin Hospital View");
        add(lblHeading);
        lblHeading.setBounds(150, 40, 760, 47);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adity\\Downloads\\best-hospital-in-south-india_1410x1130.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1410, 1130);
    }// </editor-fold>//GEN-END:initComponents

    String hName;
    String hLocation;
    private void btnHUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHUpdateActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblHospital.getSelectedRow();
         if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Hospital to Update their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Hospital selectedHospital=(Hospital) model.getValueAt(selectedRowIndex, 0);
        
           try{
            if(checkfield()){
                selectedHospital.setHospitalName(txtHName.getText());
                selectedHospital.setHospitalLocation(txtHLocation.getText());
                JOptionPane.showMessageDialog(this, "Hospital Details Have Been Updated..!!");
                populateHospitalTable();
                
                txtHName.setText("");
                txtHLocation.setText("");
            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Please update with correct values..!!");}
    }//GEN-LAST:event_btnHUpdateActionPerformed

    
    
    private void cbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCommunityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbCommunityActionPerformed

    
    private void btnHAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAddActionPerformed
        // TODO add your handling code here:
        try{
        hName = txtHName.getText();
        hLocation =txtHLocation.getText();
        
        if(checkfield()){
            if(!hospitalDirectory.uniqueHospital(hName, hLocation)){
            Hospital h = hospitalDirectory.addHospital();
        
        h.setHospitalName(hName);
        h.setHospitalLocation(hLocation);
        h.setCommunityName(String.valueOf(cbCommunity.getSelectedItem()));
        
        JOptionPane.showMessageDialog(this, "New Hospital Created..!!");
        
        txtHName.setText("");
        txtHLocation.setText("");
        populateHospitalTable();
        }
            else JOptionPane.showMessageDialog(this, "This Hospital already exists..!!");
        }
        }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Please enter correct values..!!");}
            
        
    }//GEN-LAST:event_btnHAddActionPerformed

    private void populateCommunities(){
       cbCommunity.removeAllItems();
       ArrayList<String> list  = new ArrayList<>();
       for(Community c : communityDirectory.getCommunityDirectory()){
           if(!list.contains(c.getCommunityName())){
               list.add(c.getCommunityName());
               cbCommunity.addItem(c.getCommunityName());
           }
       }
    }
    private void btnHViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHViewAllActionPerformed
        // TODO add your handling code here:
        populateHospitalTable();
        txtSearch.setText("");
    }//GEN-LAST:event_btnHViewAllActionPerformed

    private void btnHDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select a Hospital to Delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Hospital selectedHospital=(Hospital) model.getValueAt(selectedRowIndex, 0);
        
        hospitalDirectory.deleteHospital(selectedHospital);
        JOptionPane.showMessageDialog(this,"Hospital Deleted");
        populateHospitalTable();
    }//GEN-LAST:event_btnHDeleteActionPerformed

    private void btnHSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHSearchActionPerformed
        // TODO add your handling code here:
        String search=txtSearch.getText();
        if(txtSearch.getText().equals(null))
            JOptionPane.showMessageDialog(this, "Please enter a value to search!!");
        var result = hospitalDirectory.hospitalSearch(search);
        populateHospitalSearch(result);
        txtSearch.setText("");
    }//GEN-LAST:event_btnHSearchActionPerformed

    private void tblHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalMouseClicked
        // TODO add your handling code here:
          int selectedRowIndex = tblHospital.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Doctor to View their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Hospital selectedhospital=(Hospital) model.getValueAt(selectedRowIndex, 0);
        
        txtHName.setText(selectedhospital.getHospitalName());
        txtHLocation.setText(selectedhospital.getHospitalLocation());
    }//GEN-LAST:event_tblHospitalMouseClicked
    
    public boolean checkfield(){
         ArrayList msg=null;
        msg= new ArrayList();
        
        if(txtHName.getText().isBlank() || !(txtHName.getText().matches("^[a-zA-Z ]*$")))
            msg.add("Please enter the name without digits or special characters but do not leave it blank");
        if(txtHLocation.getText().isBlank() || !(txtHLocation.getText().matches("^[a-zA-Z ]*$")))
            msg.add("Please enter the location without digits or special characters but do not leave it blank");
        
         if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
            msg.clear();
            return false;}
        else 
            return true; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHAdd;
    private javax.swing.JButton btnHDelete;
    private javax.swing.JButton btnHSearch;
    private javax.swing.JButton btnHUpdate;
    private javax.swing.JButton btnHViewAll;
    private javax.swing.JComboBox<String> cbCommunity;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHLocation;
    private javax.swing.JLabel lblHName;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtHLocation;
    private javax.swing.JTextField txtHName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void populateHospitalTable(){
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        model.setRowCount(0);
        for(Hospital h:hospitalDirectory.getHospitalDirectory()){
            Object[] rows = new Object[3];
            rows[0]= h;
            rows[1]=h.getHospitalLocation();
            rows[2]=h.getCommunityName();
            
            
            model.addRow(rows);
    }
    }
    
         private void populateHospitalSearch(ArrayList<Hospital> result) {
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        model.setRowCount(0);
        for(Hospital h:result){
            Object[] rows = new Object[3];
            rows[0]= h;
            rows[1]=h.getHospitalLocation();
            rows[2]=h.getCommunityName();
            
            
            model.addRow(rows);
        }
    }
    
}
