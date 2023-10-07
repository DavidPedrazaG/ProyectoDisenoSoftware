  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.sql.Connection;
import conecction.Supabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import models.User;

/**
 *
 * @author david
 */
public class UserServices {
    
    private static UserServices INSTANCE;
    private Statement stmt;
    private ResultSet rs;
    private Connection connection;

    private UserServices() {
        connection = Supabase.getINSTANCE().getConnection();
        stmt = getStatement();
        rs = null;        
    }

    public static UserServices getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new UserServices();
        }
        return INSTANCE;
    }    
    
    private Statement getStatement(){
        try {
            return connection.createStatement();
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ResultSet searchUser(String code){
        String where = "";
        if(!"".equals(code)){
            where = "WHERE id = '"+ code +"'";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM users "+where);
            return rs;
        } catch (SQLException ex) {
        }        
        return null;
    }
    
    public void createUser(User user){
        try {
            String sql = "INSERT INTO users (id, name, lastname, cellphone, password) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getCode());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getLastname());
            preparedStatement.setString(4, user.getCellphone());
            preparedStatement.setString(5, user.getPassword());

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se creó el usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void updateUser(User user){
        try{
            String sql = "update users set name = ?, lastname = ?, cellphone = ?, password = ?, loan_limit=?  where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setString(3, user.getCellphone());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setInt(5, user.getLoanLimit()); 
            preparedStatement.setString(6, user.getCode()); 
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizó el usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteUser(String code){
        try{
            String sql = "delete from users where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, code);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se elimino el usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);            
        }
    }
    
}
