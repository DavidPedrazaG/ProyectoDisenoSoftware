/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import models.Gender;

/**
 *
 * @author david
 */
public class GenderServices {
    
    private static GenderServices INSTANCE;
    private Statement stmt;
    private ResultSet rs;
    private Connection connection;

    private GenderServices() {
        connection = Supabase.getINSTANCE().getConnection();
        stmt = getStatement();
        rs = null;
    }

    public static GenderServices getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new GenderServices();
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
    
    public ResultSet searchGender(int code) {
        String where = "";
        if(code >0){
            where = "WHERE id = " + code +"";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM genders " + where);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public void createGender(Gender gender){
        try {
            String sql = "INSERT INTO genders (name) VALUES(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, gender.getNombre());


            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se guardó el genero", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } 
    }

    public void updateGender(Gender gender){
        try{
            String sql = "update genders set name = ?  where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(2, gender.getId());
            preparedStatement.setString(1, gender.getNombre());


            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizó el genero", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void deleteGender(int code){
        try{
            String sql = "delete from genders where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, code);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se elimino el genero", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }
}
