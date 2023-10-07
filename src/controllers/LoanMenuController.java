/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import services.UserServices;

/**
 *
 * @author david
 */
public class LoanMenuController {
    
    public ArrayList<Object[]> buscar(String codeS){
        ArrayList<Object[]> users = new ArrayList<>();
        try {
            ResultSet rs = UserServices.getINSTANCE().searchUser(codeS);
            while(rs.next()){
                String code = rs.getString("id");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String cellphone = rs.getString("cellphone");
                String password = rs.getString("password");
                int loanLimit = rs.getInt("loan_limit");
                Object[] ob = {code, name, lastname, cellphone, password, loanLimit};
                users.add(ob);
            }
        } catch (SQLException ex) {
        }
        return users;
    }
}
