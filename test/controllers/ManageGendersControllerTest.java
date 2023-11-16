/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Gender;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class ManageGendersControllerTest {
    
    public ManageGendersControllerTest() {
    }

    /**
     * Test of buscar method, of class ManageGendersController.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int codeInt = 2;
        ManageGendersController instance = new ManageGendersController();
        String expResult = "Comedia";
        ArrayList<Object[]> search = instance.buscar(codeInt);
        String result = search.get(0)[1].toString();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

   
}
