/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import models.User;

/**
 *
 * @author david
 */
public class UserServices {
    
    private static final UserServices INSTANCE = new UserServices();
    public static final String WHERECODE = "WHERE id = ";
    private Statement stmt = getStatement();
    private ResultSet rs = null;

    private UserServices() {
    }

    public static UserServices getINSTANCE() {
        return INSTANCE;
    }    
    
    private Statement getStatement(){
        try {
            return new Supabase().connect().createStatement();
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ResultSet searchUser(String where, String atributes){
        try {
            rs = stmt.executeQuery("SELECT * FROM users "+where);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
        return null;
    }
    
    public void createUser(User user){
        try {
            String sql = "INSERT INTO users (id, name, lastname, cellphone, password) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);

            preparedStatement.setString(1, user.getCode());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getLastname());
            preparedStatement.setString(4, user.getCellphone());
            preparedStatement.setString(5, user.getPassword());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void updateUser(User user){
        try{
            String sql = "update users set name = ?, lastname = ?, cellphone = ?, password = ?  where id = ?";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setString(3, user.getCellphone());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getCode()); 
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteUser(String code){
        try{
            String sql = "delete from users where id=?";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);
            preparedStatement.setString(1, code);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
}
