/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;

/**
 *
 * @author david
 */
public class Book {
    
    private int code;
    private String title;
    private String writer;
    private int gender;
    private int quantityCopies;
    private Date publicationYear;

    public Book() {
    }

    public Book(int code, String title, String writer, int gender, int quantityCopies, Date publicationYear) {
        this.code = code;
        this.title = title;
        this.writer = writer;
        this.gender = gender;
        this.quantityCopies = quantityCopies;
        this.publicationYear = publicationYear;
    }

    public Book(String title, String writer, int gender, int quantityCopies, Date publicationYear) {
        this.title = title;
        this.writer = writer;
        this.gender = gender;
        this.quantityCopies = quantityCopies;
        this.publicationYear = publicationYear;
    }

    public Book(int code, int quantityCopies) {
        this.code = code;
        this.quantityCopies = quantityCopies;
    }        
    
    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getQuantityCopies() {
        return quantityCopies;
    }

    public void setQuantityCopies(int quantityCopies) {
        this.quantityCopies = quantityCopies;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }
    
}
