/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Gender;

import services.GenderServices;

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
            ResultSet rs = GenderServices.getINSTANCE().searchGender(codeInt);
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
    
    public void guardar(Gender gender){
        GenderServices.getINSTANCE().createGender(gender);
    }
    
    public void editar(Gender gender){
        GenderServices.getINSTANCE().updateGender(gender);
    }
    
    public void eliminar(int code){
        GenderServices.getINSTANCE().deleteGender(code);
    }
    
}
