/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import services.BookServices;
import services.GenderServices;

/**
 *
 * @author david
 */
public class BooksFilterController {
    
    public ArrayList<Object[]> searchGender(int code){
        ArrayList<Object[]> categories = new ArrayList<>();
        try {
            ResultSet rs = GenderServices.getINSTANCE().searchGender(code);
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
            ResultSet rs = BookServices.getINSTANCE().searchBook(code);
            while (rs.next()) {
                int id = rs.getInt("code");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                int idGender = rs.getInt("gender");
                String gender = searchGender(idGender).get(0)[1].toString();
                int quantity = rs.getInt("quantity_copies");
                Object[] ob = {id,title,writer,gender,quantity};
                products.add(ob);
            }
        } catch (SQLException ex) {
        }
        return products;
    }
    
}
