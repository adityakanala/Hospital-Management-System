/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM_Model;

/**
 *
 * @author adity
 */
public class SystemAdmin {
    
    public String emailID;
    public String password;
    //SystemAdmin s= new SystemAdmin();
    
    public SystemAdmin(){
    emailID = "SystemAdmin@gmail.com";
    password= "password";
    
    }
    
    public String getEmailID() {
        return emailID;
    }

    public String getPassword() {
        return password;
    }
    
    
}