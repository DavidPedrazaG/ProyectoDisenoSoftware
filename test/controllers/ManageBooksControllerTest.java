/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Book;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageBooksControllerTest {
    
    public ManageBooksControllerTest() {
    }

    /**
     * Test of getGenders method, of class ManageBooksController.
     */
    @Test
    public void testGetGenders() {
        System.out.println("getGenders");
        ManageBooksController instance = new ManageBooksController();
        ArrayList expResult = null;
        ArrayList result = instance.getGenders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class ManageBooksController.
     */
    @Test
    public void testList() {
        System.out.println("list");
        int codeS = 11;
        ManageBooksController instance = new ManageBooksController();
        String expResult = "Holi";
        ArrayList<Object[]> search = instance.list(codeS);
        String result = search.get(0)[1].toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
}
