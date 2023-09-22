/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
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
    
    private Statement getStatement() {
        try {
            return new Supabase().connect().createStatement();
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
}
