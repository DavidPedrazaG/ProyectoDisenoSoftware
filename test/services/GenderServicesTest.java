/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Elizabeth
 */
public class GenderServicesTest {
    
    public GenderServicesTest() {
    }

    

    /**
     * Test of search method, of class GenderServices.
     */
    @Test
    public void testSearch() {
        try {
            System.out.println("search");
            Object consult = 2;
            GenderServices instance = GenderServices.getINSTANCE();
            String expResult = "Comedia";
            ResultSet search = instance.search(consult);
            String result = "";
            while (search.next()) {
                result= search.getString("name");
                
                break;
            }
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            
        } catch (SQLException ex) {
            Logger.getLogger(GenderServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
