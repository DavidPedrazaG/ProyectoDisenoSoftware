/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.User;
import services.UserServices;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class ManageUsersController {

    public ManageUsersController() {
    }
    
    public User buscar(String code){
        try {
            ResultSet rs = UserServices.getINSTANCE().searchUser(UserServices.WHERECODE + "'"+code+"'", "*");
            while(rs.next()){
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String cellphone = rs.getString("cellphone");
                String password = rs.getString("password");
                
                User user = new User(code, name, lastname, cellphone, password);
                return user;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public void guardar(User user){
        UserServices.getINSTANCE().createUser(user);
    }
    
    public void editar(User user){
        UserServices.getINSTANCE().updateUser(user);
    }
    
    public void eliminar(String code){
        UserServices.getINSTANCE().deleteUser(code);
    }
    
}
