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
import models.Gender;



/**
 *
 * @author Clara Elizabeth
 */
public class GenderServices {
    
    private static final GenderServices INSTANCE = new GenderServices();
   
    private Statement stmt = getStatement();
    private ResultSet rs = null;

    public GenderServices() {
    }
    
    public static GenderServices getINSTANCE() {
        return INSTANCE;
    }    
    
    private Statement getStatement(){
        try {
            return new Supabase().connect().createStatement();
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public void createGender(Gender gender){
        try {
            String sql = "INSERT INTO genders (name) VALUES(?)";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);

           
            preparedStatement.setString(1, gender.getNombre());
           

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void updateGender(Gender gender){
        try{
            String sql = "update genders set name = ?  where id = ?";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);

            preparedStatement.setString(2, String.valueOf(gender.getId()));
            preparedStatement.setString(1, gender.getNombre());
            
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteGender(String code){
        try{
            String sql = "delete from genders where id=?";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);
            preparedStatement.setString(1, code);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    
}

