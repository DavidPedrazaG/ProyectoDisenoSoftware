/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Gender;
import models.TransactionHistory;

import services.GenderServices;
import services.TransactionService;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageGendersController {

    public ManageGendersController() {
    }
    
    public ArrayList<Object[]> buscar(int codeInt){
        ArrayList<Object[]> genders = new ArrayList<>();
        try {
            ResultSet rs = GenderServices.getINSTANCE().search(codeInt);
            while(rs.next()){
                int code = rs.getInt("id");
                String name = rs.getString("name");
                
                Object[] ob = {code, name};
                genders.add(ob);
            }
        } catch (SQLException ex) {
        }
        return genders;
    }
    
    public void guardar(Gender gender, String user){
        GenderServices.getINSTANCE().create(gender);
        TransactionHistory th = new TransactionHistory(user, "Registró un nuevo genero");
        TransactionService.getINSTANCE().create(th);
    }
    
    public void editar(Gender gender, String code){
        GenderServices.getINSTANCE().update(gender);
        TransactionHistory th = new TransactionHistory(code, "Edito un genero");
        TransactionService.getINSTANCE().create(th);
    }
    
    public void eliminar(int code, String user){
        GenderServices.getINSTANCE().delete(code);
        TransactionHistory th = new TransactionHistory(user, "Eliminó un genero");
        TransactionService.getINSTANCE().create(th);
    }
    
}
