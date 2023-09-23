/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.Book;


/**
 *
 * @author Clara Elizabeth
 */
public class BookServices {

    private static final BookServices INSTANCE = new BookServices();
    private Statement stmt = getStatement();
    private ResultSet rs = null;

    private BookServices() {
    }

    public static BookServices getINSTANCE() {
        return INSTANCE;
    }

    private Statement getStatement() {
        try {
            return new Supabase().connect().createStatement();
        } catch (SQLException ex) {
            return null;
        }
    }

    public ResultSet searchBook(int code) {
        String where = "";
        if(code >0){
            where = "WHERE code = "+code+"";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM books " + where);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void createBook(Book book) {
        try {
            String sql = "INSERT INTO books ( title, writer, gender, quantity_copies,publication_year) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);

            
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getWriter());
            preparedStatement.setInt(3, book.getGender());
            preparedStatement.setInt(4, book.getQuantityCopies());
            preparedStatement.setDate(5, book.getPublicationYear());

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se creó el libro", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateBook(Book book) {
        try {
            String sql = "update books set title = ?, writer = ?, gender = ?, quantity_copies = ?, publication_year = ?  where code = ?";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);

            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getWriter());
            preparedStatement.setInt(3, book.getGender());
            preparedStatement.setInt(4, book.getQuantityCopies());
            preparedStatement.setDate(5, book.getPublicationYear());
            preparedStatement.setInt(6, book.getCode());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizo el libro", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }    

    public void deleteBook(int code) {
        try {
            String sql = "delete from books where code=?";
            PreparedStatement preparedStatement = new Supabase().connect().prepareStatement(sql);
            preparedStatement.setInt(1, code);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó el libro", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}

