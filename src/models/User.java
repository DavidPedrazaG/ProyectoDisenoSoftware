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

    public User() {
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
    
    
}
