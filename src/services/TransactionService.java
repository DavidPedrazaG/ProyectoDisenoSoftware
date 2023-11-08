/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import interfaces.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.TransactionHistory;

/**
 *
 * @author david
 */
public class TransactionService implements Service{

    private static TransactionService INSTANCE;
    private Statement stmt;
    private ResultSet rs;
    private Connection connection;

    private TransactionService() {
        connection = Supabase.getINSTANCE().getConnection();
        stmt = getStatement();
        rs = null;        
    }

    public static TransactionService getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new TransactionService();
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
    public ResultSet search(Object consult) {
        try {
            rs = stmt.executeQuery("SELECT * FROM transaction_history ");
            return rs;
        } catch (SQLException ex) {
        }        
        return null;
    }

    @Override
    public void create(Object insert) {
        TransactionHistory transaction = (TransactionHistory) insert;
        try {
            String sql = "INSERT INTO transaction_history (who_code, what) VALUES(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, transaction.getWho());
            preparedStatement.setString(2, transaction.getWhat());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public void update(Object modify) {
        
    }

    @Override
    public void delete(Object eliminate) {
        
    }
    
}
