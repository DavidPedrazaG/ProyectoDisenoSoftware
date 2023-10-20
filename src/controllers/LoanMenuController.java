/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Loan;
import services.LoanServices;
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
                int loanLimit = rs.getInt("loan_limit");
                boolean banned = rs.getBoolean("banned");
                Object[] ob = {code, loanLimit, banned};
                users.add(ob);
            }
        } catch (SQLException ex) {
        }
        return users;
    }
    
    public ArrayList<Object[]> getLoans(String user_id){
        ArrayList<Object[]> loans = new ArrayList<>();
        try {
            ResultSet rs = LoanServices.getINSTANCE().searchLoanByUser(user_id);
            while(rs.next()){
                int code = rs.getInt("code");
                Date fechaDevolucion = rs.getDate("fecha_devolucion");
                String status = rs.getString("status");
                Object[] ob = {code, fechaDevolucion, status};
                loans.add(ob);
            }
        } catch (SQLException ex) {
        }
        return loans;
    }
    
    public void bannUser(int codeLoan, String user_id){
        UserServices.getINSTANCE().changeBannStatus(user_id, true);
        LoanServices.getINSTANCE().changeStatus(codeLoan, Loan.ATRASADO);
    }
}
