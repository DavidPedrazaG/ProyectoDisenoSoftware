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
public class LoanMenuControllerTest {
    
    public LoanMenuControllerTest() {
    }

    /**
     * Test of buscar method, of class LoanMenuController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String codeS = "4321";
        LoanMenuController instance = new LoanMenuController();
        String expResult = "David";
        ArrayList<Object[]> search = instance.buscar(codeS);
        String result = search.get(0)[1].toString();
        assertEquals(expResult, result);
    }

    
    
}
