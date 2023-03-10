/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HM_UI;

import HM_Model.Community;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import HM_Model.CommunityDirectory;
import HM_Model.DoctorDirectory;
import HM_Model.EncounterDetails;
import HM_Model.HospitalDirectory;
import HM_Model.HouseDirectory;
import HM_Model.PatientHistory;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class SysAdminCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminCommunity
     */
    JSplitPane sp;
    CommunityDirectory communityDirectory;
    PatientHistory patientHistory;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    EncounterDetails encounterDetails;
    HouseDirectory houseDirectory;
    
    public SysAdminCommunityPanel(HouseDirectory houseDirectory,EncounterDetails encounterDetails,CommunityDirectory communityDirectory, PatientHistory patientHistory, DoctorDirectory doctorDirectory, JSplitPane sp, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.communityDirectory=communityDirectory;
        populateCommunityTable();
        this.sp = sp;
        this.patientHistory=patientHistory;
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

        lblCName = new javax.swing.JLabel();
        txtCName = new javax.swing.JTextField();
        lblCCode = new javax.swing.JLabel();
        txtCCode = new javax.swing.JTextField();
        btnCAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommunityView = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1410, 1130));
        setLayout(null);

        lblCName.setText("Community Name :");
        add(lblCName);
        lblCName.setBounds(400, 560, 105, 16);
        add(txtCName);
        txtCName.setBounds(530, 560, 210, 22);

        lblCCode.setText("Community Code :");
        add(lblCCode);
        lblCCode.setBounds(400, 600, 101, 16);
        add(txtCCode);
        txtCCode.setBounds(530, 600, 210, 22);

        btnCAdd.setText("Add Community");
        btnCAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAddActionPerformed(evt);
            }
        });
        add(btnCAdd);
        btnCAdd.setBounds(250, 450, 119, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(880, 450, 72, 23);

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        add(btnViewAll);
        btnViewAll.setBounds(760, 130, 72, 23);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(300, 130, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(560, 450, 72, 23);
        add(txtSearch);
        txtSearch.setBounds(410, 130, 138, 22);

        tblCommunityView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House Number", "Community Name", "Community Code"
            }
        ));
        tblCommunityView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCommunityViewMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCommunityView);

        add(jScrollPane3);
        jScrollPane3.setBounds(240, 190, 710, 241);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System Admin's Community View");
        add(jLabel2);
        jLabel2.setBounds(157, 40, 760, 60);

        lblHouseNumber.setText("House Number :");
        add(lblHouseNumber);
        lblHouseNumber.setBounds(400, 530, 87, 16);
        add(txtHouseNumber);
        txtHouseNumber.setBounds(530, 520, 210, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\adity\\Downloads\\images_1410x1130.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1420, 1130);
    }// </editor-fold>//GEN-END:initComponents

    String cName;
    String cCode;
    String hNumber;
    private void btnCAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAddActionPerformed
        // TODO add your handling code here:
        try{
        cName= txtCName.getText();
        cCode=txtCCode.getText();
        hNumber=txtHouseNumber.getText();
        
        if(checkfield()){
            if(!(communityDirectory.uniqueCommunity(cName, cCode))){
                Community c = communityDirectory.addCommunity();   
        
        c.setCommunityName(cName);
        c.setCommunityCode(cCode);
        c.setHouseNumber(hNumber);
        
        JOptionPane.showMessageDialog(this, "New Community Created..!!");
       
        txtCName.setText("");
        txtCCode.setText("");
        txtHouseNumber.setText("");
        populateCommunityTable();
       }
            else JOptionPane.showMessageDialog(this, "This Community already exists..!!");
        }
        
      }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Please enter correct values..!!");
    }//GEN-LAST:event_btnCAddActionPerformed
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblCommunityView.getSelectedRow();
         if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Community to Update their Details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunityView.getModel();
        Community selectedcommunity=(Community) model.getValueAt(selectedRowIndex, 0);
        
        try{
            if(checkfield()){
                selectedcommunity.setCommunityName(txtCName.getText());
                selectedcommunity.setCommunityCode(txtCCode.getText());
                selectedcommunity.setHouseNumber(txtHouseNumber.getText());
                JOptionPane.showMessageDialog(this, "Community Details Have Been Updated..!!");
                populateCommunityTable();
                
                txtCName.setText("");
                txtCCode.setText("");
            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(this, "Please update with correct values..!!");}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        populateCommunityTable();
        txtSearch.setText("");
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search=txtSearch.getText();
        if(txtSearch.getText().equals(null))
            JOptionPane.showMessageDialog(this, "Please enter a value to search!!");
        var result = communityDirectory.communitySearch(search);
        populateCommunitySearch(result);
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
           int selectedRowIndex = tblCommunityView.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select a Community to Delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunityView.getModel();
        Community selectedCommunity=(Community) model.getValueAt(selectedRowIndex, 0);
        
        communityDirectory.deleteCommunity(selectedCommunity);
        JOptionPane.showMessageDialog(this,"Community Deleted");
        populateCommunityTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCommunityViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCommunityViewMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunityView.getSelectedRow();
       /* if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please Select the Community to View their Details");
            return;
        }*/
        DefaultTableModel model = (DefaultTableModel) tblCommunityView.getModel();
        Community selectedcommunity=(Community) model.getValueAt(selectedRowIndex, 0);
        
        txtCName.setText(selectedcommunity.getCommunityName());
        txtCCode.setText(selectedcommunity.getCommunityCode());
        txtHouseNumber.setText(selectedcommunity.getHouseNumber());
    }//GEN-LAST:event_tblCommunityViewMouseClicked
    

 
    public boolean checkfield(){
        ArrayList msg=null;
        msg= new ArrayList();
        
        if(txtCName.getText().isBlank() || !(txtCName.getText().matches("^[a-zA-Z ]*$")))
            msg.add("Please enter the name without digits or special characters but do not leave it blank");
        if(!(String.valueOf(txtCCode.getText()).matches("^[0-9]{5}$")))
            msg.add("Please enter the correct community code(6 digits)");
            
        if(!(msg.isEmpty()))
        {JOptionPane.showMessageDialog(this, msg.toArray());
            msg.clear();
            return false;}
        else 
            return true;      
        }
    
    public void populateCommunityTable(){
        DefaultTableModel model = (DefaultTableModel) tblCommunityView.getModel();
        model.setRowCount(0);
        for(Community c:communityDirectory.getCommunityDirectory()){
            Object[] rows = new Object[3];
           rows[0]=c.getHouseNumber();
            rows[1]= c;
            rows[2]=c.getCommunityCode();
            
            
            model.addRow(rows);
    }
    }
    
     private void populateCommunitySearch(ArrayList<Community> result) {
        DefaultTableModel model = (DefaultTableModel) tblCommunityView.getModel();
        model.setRowCount(0);
        for(Community c:result){
            Object[] rows = new Object[3];
            rows[0]=c.getHouseNumber();
            rows[1]= c;
            rows[2]=c.getCommunityCode();
            
            
            model.addRow(rows);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCCode;
    private javax.swing.JLabel lblCName;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JTable tblCommunityView;
    private javax.swing.JTextField txtCCode;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
