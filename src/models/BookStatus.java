/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class BookStatus {
    
    private Book book;
    private Date loanDate;
    private Date returnDate;
    private ArrayList<User> users;

    public BookStatus() {
    }

    public BookStatus(Book book, Date loanDate, Date returnDate, ArrayList<User> users) {
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.users = users;
    }

    public Book getBook() {
        return book;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    
    
}
