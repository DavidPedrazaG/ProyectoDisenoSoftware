/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Book;
import models.Loan;
import models.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class LoanBookControllerTest {
    
    public LoanBookControllerTest() {
    }

    /**
     * Test of searchUser method, of class LoanBookController.
     */
    @Test
    public void testSearchUser() {
        System.out.println("searchUser");
        String codeS = "4321";
        LoanBookController instance = new LoanBookController();
        String expResult = "David";
        ArrayList<User> result = instance.searchUser(codeS);
        assertEquals(expResult, result);
        
    }

    
    
}
