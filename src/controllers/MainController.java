/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.UserServices;

/**
 *
 * @author david
 */
public class MainController {

    public MainController() {
    }
    
    public boolean login(String code, String password){
        ResultSet rs = UserServices.getINSTANCE().searchUser(code);
        if(rs != null){
            try {
                while(rs.next()){                    
                    if(rs.getString("id").equals(code) && rs.getString("password").equals(password)){
                        return true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}