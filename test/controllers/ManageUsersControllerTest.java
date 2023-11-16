/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageUsersControllerTest {
    
    public ManageUsersControllerTest() {
    }

    /**
     * Test of buscar method, of class ManageUsersController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String codeS = "1234";
        ManageUsersController instance = new ManageUsersController();
        String expResult = "David";
        ArrayList<Object[]> search = instance.buscar(codeS);
        String result = search.get(0)[1].toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
}
