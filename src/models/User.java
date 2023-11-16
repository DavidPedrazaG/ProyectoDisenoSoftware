/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class User {
    private String code;
    private String name;
    private String lastname;
    private String cellphone;
    private ArrayList<History> history;
    private String password;
    private int loanLimit;
    private boolean banned;

    public User() {
    }

    public User(String code, String name, String lastname, String cellphone, String password, int loanLimit) {
        this.code = code;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.password = password;
        this.loanLimit = loanLimit;
    }

    public User(String code, String name, String lastname, String cellphone, String password, int loanLimit, boolean banned) {
        this.code = code;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.password = password;
        this.loanLimit = loanLimit;
        this.banned = banned;
    }    

    public User(String code, int loanLimit) {
        this.code = code;
        this.loanLimit = loanLimit;
    } 

    public User(String code, String name, String lastname, String cellphone, String password) {
        this.code = code;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.password = password;
    }
    
    
    
    public String getCode() {
        return code;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public ArrayList<History> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<History> loanHistory) {
        this.history = loanHistory;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(int loanLimit) {
        this.loanLimit = loanLimit;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
    
}
