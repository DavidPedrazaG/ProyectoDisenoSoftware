/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import models.Book;

import services.BookServices;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageBooksController {
    
    public ManageBooksController() {
    }
    
    public Book buscar(String code){
        try {
            ResultSet rs = BookServices.getINSTANCE().searchBook(BookServices.WHERECODE + "'"+code+"'", "*");
            while(rs.next()){
                String title = rs.getString("title");
                String writer = rs.getString("Writer");
                String gender = rs.getString("Gender");
                int quantityCopies = rs.getInt("quantityCopies");
                Date publicationYear= rs.getDate("quantityCopies");
                
                Book book = new Book(code, title, writer, gender, quantityCopies,publicationYear);
                return book;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public void guardar(Book book){
        BookServices.getINSTANCE().createBook(book);
    }
    
    public void editar(Book book){
        BookServices.getINSTANCE().updateBook(book);
    }
    
    public void eliminar(String code){
        BookServices.getINSTANCE().deleteBook(code);
    }
   
}
