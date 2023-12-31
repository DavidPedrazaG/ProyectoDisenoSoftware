  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.sql.Connection;
import conecction.Supabase;
import interfaces.Service;
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
public class UserServices implements Service{
    
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
    
    @Override
    public ResultSet search(Object consult){
        String code = consult.toString();
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
    
    @Override
    public void create(Object insert){
        User user = (User) insert;
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
    
    
    @Override
    public void update(Object modify){
        User user = (User) modify;
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
    
    @Override
    public void delete(Object eliminate){
        String code = eliminate.toString();
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
    
    public void minusLoanLimit(User user){
        try{
            String sql = "update users set loan_limit=?  where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getLoanLimit()-1); 
            preparedStatement.setString(2, user.getCode());             
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void plusLoanLimit(User user){
        try{
            String sql = "update users set loan_limit=?  where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getLoanLimit()+1); 
            preparedStatement.setString(2, user.getCode());             
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void changeBannStatus(String code, boolean banned){
        try{
            String sql = "update users set banned=?  where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, banned); 
            preparedStatement.setString(2, code);             
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
