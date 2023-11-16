/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Book;
import models.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageMyLoansControllerTest {
    
    public ManageMyLoansControllerTest() {
    }

    /**
     * Test of getUser method, of class ManageMyLoansController.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String codeS = "1234";
        ManageMyLoansController instance = new ManageMyLoansController();
        String expResult = "David";
        ArrayList<Object[]> result = instance.getUser(codeS);
        String result = search.get(0)[1].toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBook method, of class ManageMyLoansController.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        int codeS = 0;
        ManageMyLoansController instance = new ManageMyLoansController();
        ArrayList expResult = null;
        ArrayList result = instance.getBook(codeS);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
