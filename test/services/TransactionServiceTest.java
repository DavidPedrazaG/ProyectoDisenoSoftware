/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services;

import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Clara Elizabeth
 */
public class TransactionServiceTest {
    
    public TransactionServiceTest() {
    }

   
    @Test
    public void testSearch() {
        try {
            System.out.println("search");
            Object consult = 1;
            TransactionService instance = TransactionService.getINSTANCE();
            String expResult = "2023-10-27";
            ResultSet search = instance.search(consult);
            String result = "";
            while (search.next()) {
                Date date = search.getDate("when");
                result = date.toString();
                break;
            }
            
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            
        } catch (SQLException ex) {
            Logger.getLogger(TransactionServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
}
