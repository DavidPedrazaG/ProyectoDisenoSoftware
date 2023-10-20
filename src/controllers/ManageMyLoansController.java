/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Book;
import models.Loan;
import models.User;
import services.BookServices;
import services.LoanServices;
import services.UserServices;

/**
 *
 * @author david
 */
public class ManageMyLoansController {  
    
    public ArrayList<Object[]> getUser(String codeS){
        ArrayList<Object[]> users = new ArrayList<>();
        try {
            ResultSet rs = UserServices.getINSTANCE().search(codeS);
            while(rs.next()){
                String code = rs.getString("id");
                int loanLimit = rs.getInt("loan_limit");
                Object[] ob = {code, loanLimit};
                users.add(ob);
            }
        } catch (SQLException ex) {
        }
        return users;
    }

    public ArrayList<Object[]> getBook(int codeS){
        ArrayList<Object[]> books = new ArrayList<>();
        try {
            ResultSet rs = BookServices.getINSTANCE().search(codeS);
            while(rs.next()){
                int code = rs.getInt("code");
                int quantityCopies = rs.getInt("quantity_copies");
                Object[] ob = {code, quantityCopies};
                books.add(ob);
            }
        } catch (SQLException ex) {
        }
        return books;
    }    
    
    public ArrayList<Object[]> list(String codeU){
        ArrayList<Object[]> loans = new ArrayList<>();
        try {
            ResultSet rs = LoanServices.getINSTANCE().searchLoanByUser(codeU);
            while(rs.next()){
                int code = rs.getInt("code");
                int book = rs.getInt("book");
                String status = rs.getString("status");
                Date fechaPrestamo = rs.getDate("fecha_prestamo");
                Date fechaDevolucion = rs.getDate("fecha_devolucion");
                Object[] ob = {code, book, status, fechaPrestamo, fechaDevolucion};
                loans.add(ob);
            }
        } catch (SQLException ex) {
        }
        return loans;
    }
    
    public void returnBooks(int codeL, Book book, User user, boolean banned){
        LoanServices.getINSTANCE().changeStatus(codeL, Loan.DEVUELTO);
        UserServices.getINSTANCE().changeBannStatus(user.getCode(), banned);
        UserServices.getINSTANCE().plusLoanLimit(user);
        BookServices.getINSTANCE().plusQuantityCopies(book);
    }
    
}
