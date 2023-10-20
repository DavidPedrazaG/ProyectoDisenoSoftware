/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import interfaces.Service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import models.Gender;
import models.Loan;

/**
 *
 * @author david
 */
public class LoanServices implements Service{
    
    private static LoanServices INSTANCE;
    private Statement stmt;
    private ResultSet rs;
    private Connection connection;

    private LoanServices() {
        connection = Supabase.getINSTANCE().getConnection();
        stmt = getStatement();
        rs = null;
    }

    public static LoanServices getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new LoanServices();
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
        int code = Integer.parseInt(consult.toString());
        String where = "";
        if(code >0){
            where = "WHERE code = " + code +"";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM loans " + where);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    public ResultSet searchLoanByUser(String code) {
        String where = "";
        if(!"".equals(code)){
            where = "WHERE user_id = '" + code +"'";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM loans " + where);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet searchLoanByBook(int code) {
        String where = "";
        if(code>0){
            where = "WHERE book = " + code +" and status != '"+Loan.DEVUELTO+"'";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM loans " + where);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
    public void create(Object insert){
        Loan loan = (Loan) insert;
        try {
            String sql = "INSERT INTO loans (book, status, fecha_prestamo, fecha_devolucion, user_id) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, loan.getBook());
            preparedStatement.setString(2, loan.getStatus());
            preparedStatement.setDate(3, loan.getFechaPrestamo());
            preparedStatement.setDate(4, loan.getFechaDevolucion());
            preparedStatement.setString(5, loan.getUser());
//            System.err.println(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado el prestamo", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        } 
    }
    
    
    @Override
    public void update(Object modify){
        Loan loan = (Loan) modify;
        try{
            String sql = "update loans set book = ?, fecha_prestamo = ?, fecha_devolucion = ?, status = ?  where code = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, loan.getBook());
            preparedStatement.setDate(2, loan.getFechaPrestamo());
            preparedStatement.setDate(3, loan.getFechaDevolucion());
            preparedStatement.setString(4, loan.getStatus());
            preparedStatement.setInt(5, loan.getCode());


            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizó el genero", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    @Override
    public void delete(Object eliminate){
        int code = Integer.parseInt(eliminate.toString());
        try{
            String sql = "delete from loans where code=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, code);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se elimino el genero", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public void changeStatus(int code, String status){
        try{
            String sql = "update loans set status = ?  where code = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setInt(2, code);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}
