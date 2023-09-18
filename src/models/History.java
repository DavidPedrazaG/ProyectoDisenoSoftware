/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author david
 */
public class History {
    
    public static final String RENTA = "Renta";
    public static final String SISTEMA = "Sistema";
    
    private int code;
    private Date date;
    private String type;
    private String action;
    private User user;

    public History(int code, Date date, String type, String action, User user) {
        this.code = code;
        this.date = date;
        this.type = type;
        this.action = action;
        this.user = user;
    }

    public int getCode() {
        return code;
    }        

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
