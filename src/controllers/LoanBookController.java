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
import services.GenderServices;
import services.LoanServices;
import services.UserServices;

/**
 *
 * @author david
 */
public class LoanBookController {
    
    public boolean getLoans(int code){
        try {
            ResultSet rs = LoanServices.getINSTANCE().searchLoanByBook(code);
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
        }
        return false;
    }
    
    public ArrayList<Object[]> list(int codeS){
        ArrayList<Object[]> books = new ArrayList<>();
        try {
            ResultSet rs = BookServices.getINSTANCE().search(codeS);
            while(rs.next()){
                int code = rs.getInt("code");
                String title = rs.getString("title");
                int quantityCopies = rs.getInt("quantity_copies");
                Object[] ob = {code, title, quantityCopies};
                books.add(ob);
            }
        } catch (SQLException ex) {
        }
        return books;
    }
    
    public ArrayList<User> searchUser(String codeS){
        ArrayList<User> users = new ArrayList<>();
        try {
            ResultSet rs = UserServices.getINSTANCE().search(codeS);
            while(rs.next()){
                String code = rs.getString("id");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String cellphone = rs.getString("cellphone");
                String password = rs.getString("password");
                int loanLimit = rs.getInt("loan_limit");
                User user = new User(code, name, lastname, cellphone, password, loanLimit);
                users.add(user);
            }
        } catch (SQLException ex) {
        }
        return users;
    }
    
    public void loanBook(Loan loan, Book book, User user){
        System.out.println(loan.getUser());
        LoanServices.getINSTANCE().create(loan);
        BookServices.getINSTANCE().minusQuantityCopies(book);
        UserServices.getINSTANCE().minusLoanLimit(user);
    }
    
}
