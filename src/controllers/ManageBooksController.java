/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import models.Book;

import services.BookServices;
import services.GenderServices;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageBooksController {
    
    private SimpleDateFormat year = new SimpleDateFormat("yyyy");
    
    public ManageBooksController() {
    }
    
    public Book buscar(String code){
        try {
            ResultSet rs = BookServices.getINSTANCE().searchBook(code);
            while(rs.next()){
                String title = rs.getString("title");
                String writer = rs.getString("Writer");
                int gender = rs.getInt("Gender");
                ResultSet rsG = GenderServices.getINSTANCE().searchGender(gender);
                String genderS = "";
                while(rsG.next()){
                    genderS = rsG.getString("name");
                }
                int quantityCopies = rs.getInt("quantityCopies");
                Date publicationYear= rs.getDate("publication_year");
                Book book = new Book(code, title, writer, genderS, quantityCopies,publicationYear);
                return book;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public ArrayList<Object[]> list(String codeS){
        ArrayList<Object[]> books = new ArrayList<>();
        try {
            ResultSet rs = BookServices.getINSTANCE().searchBook(codeS);
            while(rs.next()){
                int code = rs.getInt("code");
                String title = rs.getString("title");
                String writer = rs.getString("Writer");
                int gender = rs.getInt("Gender");
                ResultSet rsG = GenderServices.getINSTANCE().searchGender(gender);
                String genderS = "";
                while(rsG.next()){
                    genderS = rsG.getString("name");
                }
                int quantityCopies = rs.getInt("quantity_copies");
                Date publicationYearD= rs.getDate("publication_year");
                java.util.Date yearD = new java.util.Date(publicationYearD.getTime());
                String publicationYear = year.format(yearD);
                Object[] ob = {code, title, writer, genderS, quantityCopies, publicationYear};
                books.add(ob);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() +"\n"+ex.getCause());
        }
        return books;
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
