/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.TransactionHistory;
import services.TransactionService;
import services.UserServices;

/**
 *
 * @author david
 */
public class ReportMenuController {
    
    public ArrayList<Object[]> getList(){
        ArrayList<Object[]> list = new ArrayList<>();
        try{
            ResultSet rs = TransactionService.getINSTANCE().search(null);
            while(rs.next()){
                String who = rs.getString("who_code");
                Timestamp when = rs.getTimestamp("when");
                String what = rs.getString("what");
                String whoName = getName(who);
                Object[] ob = {whoName, when, what};
                list.add(ob);
            }
        }catch (SQLException ex) {
        }
        return list;
    }
    
    public String getName(String code){
        String name = "";
        try{
            ResultSet rs = UserServices.getINSTANCE().search(code);
            while(rs.next()){
                name = rs.getString("name");
            }
        }catch (SQLException ex) {
        }
        return name;
    }
    
}
