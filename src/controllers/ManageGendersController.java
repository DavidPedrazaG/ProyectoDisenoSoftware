/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import models.Gender;

import services.GenderServices;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageGendersController {

    public ManageGendersController() {
    }
    
   
    
    public void guardar(Gender gender){
        GenderServices.getINSTANCE().createGender(gender);
    }
    
    public void editar(Gender gender){
        GenderServices.getINSTANCE().updateGender(gender);
    }
    
    public void eliminar(String code){
        GenderServices.getINSTANCE().deleteGender(code);
    }
    
}
