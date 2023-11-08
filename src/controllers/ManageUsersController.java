/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.User;
import services.UserServices;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.TransactionHistory;
import services.TransactionService;

/**
 *
 * @author david
 */
public class ManageUsersController {

    public ManageUsersController() {
    }
    
    public ArrayList<Object[]> buscar(String codeS){
        ArrayList<Object[]> users = new ArrayList<>();
        try {
            ResultSet rs = UserServices.getINSTANCE().search(codeS);
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
    
    public void guardar(User user, String code){
        UserServices.getINSTANCE().create(user);
        TransactionHistory th = new TransactionHistory(code, "Registró un nuevo usuario");
        TransactionService.getINSTANCE().create(th);
    }
    
    public void editar(User user, String code){
        UserServices.getINSTANCE().update(user);
        TransactionHistory th = new TransactionHistory(code, "Editó un usuario");
        TransactionService.getINSTANCE().create(th);
    }
    
    public void eliminar(String code, String user){
        UserServices.getINSTANCE().delete(code);
        TransactionHistory th = new TransactionHistory(user, "Eliminó un usuario");
        TransactionService.getINSTANCE().create(th);
    }
    
}
