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
public class Book {
    
    private String code;
    private String title;
    private String writer;
    private String gender;
    private int quantityCopies;
    private Date publicationYear;
    private BookStatus status;

    public Book() {
    }

    public Book(String code, String title, String writer, String gender, int quantityCopies, Date publicationYear) {
        this.code = code;
        this.title = title;
        this.writer = writer;
        this.gender = gender;
        this.quantityCopies = quantityCopies;
        this.publicationYear = publicationYear;
    }

    public String getCode() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
    
}
