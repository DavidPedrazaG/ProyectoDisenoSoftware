/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Clara Elizabeth
 */
public class Gender {
    
    private int id;
    private String nombre;

    public Gender() {
    }

    public Gender(int id) {
        this.id = id;
    }

    public Gender(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Gender(String nombre) {
        this.nombre = nombre;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
