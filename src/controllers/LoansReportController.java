/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import models.TransactionHistory;
import services.BookServices;
import services.GenderServices;
import services.LoanServices;
import services.TransactionService;
import services.UserServices;

/**
 *
 * @author david
 */
public class LoansReportController {
    
    public ArrayList<Object[]> searchGender(int code){
        ArrayList<Object[]> categories = new ArrayList<>();
        try {
            ResultSet rs = GenderServices.getINSTANCE().search(code);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("name");
                Object[] ob = {id,nombre};
                categories.add(ob);
            }
        } catch (SQLException ex) {
        }
        return categories;
    }
    
    public ArrayList<Object[]> searchBook(int code){
        ArrayList<Object[]> products = new ArrayList<>();
        try {
            ResultSet rs = BookServices.getINSTANCE().search(code);
            while (rs.next()) {
                String title = rs.getString("title");
                int idGender = rs.getInt("gender");
                String gender = searchGender(idGender).get(0)[1].toString();
                Object[] ob = {title,gender};
                products.add(ob);
            }
        } catch (SQLException ex) {
        }
        return products;
    }
    
    public String getUserName(String code){
        String name = "";
        try{
            ResultSet rs = UserServices.getINSTANCE().search(code);
            while(rs.next()){
                name = rs.getString("name");
                break;
            }
        } catch (SQLException ex) {
        }
        return name;
    }
    
    public ArrayList<Object[]> tableContent(String search){
        ArrayList<Object[]> rows = new ArrayList<>();
        try{
            ResultSet rs = LoanServices.getINSTANCE().searchLoanByFilters(search);
            while(rs.next()){
                String userId = rs.getString("user_id");
                String userName = getUserName(userId);
                int book_id = rs.getInt("book");
                ArrayList<Object[]> bookInfo = searchBook(book_id);
                String bookName = bookInfo.get(0)[0].toString();
                String bookGender = bookInfo.get(0)[1].toString();
                Date loanDate = rs.getDate("fecha_prestamo");
                Date returnDate = rs.getDate("fecha_devolucion");
                String status = rs.getString("status");
                Object[] row = {userName, userId, bookName, loanDate, returnDate, bookGender, status};
                rows.add(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rows;
    }
}
