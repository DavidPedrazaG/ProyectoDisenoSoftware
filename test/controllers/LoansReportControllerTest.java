/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class LoansReportControllerTest {
    
    public LoansReportControllerTest() {
    }

    /**
     * Test of searchGender method, of class LoansReportController.
     */
    @Test
    public void testSearchGender() {
        System.out.println("searchGender");
        int code = 2;
        LoansReportController instance = new LoansReportController();
        String expResult = "Comedia";
         ArrayList<Object[]> search = instance.searchGender(code);
        String result = search.get(0)[1].toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of searchBook method, of class LoansReportController.
     */
    @Test
    public void testSearchBook() {
        System.out.println("searchBook");
        int code = 11;
        LoansReportController instance = new LoansReportController();
        String expResult = "Holi";
         ArrayList<Object[]> search = instance.searchBook(code);
        String result = search.get(0)[0].toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
}
