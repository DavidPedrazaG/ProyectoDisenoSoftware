/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.sql.ResultSet;


/**
 *
 * @author Clara Elizabeth
 */
public interface Service {
    
    ResultSet search(Object consult);
    
    void create(Object insert);
    
    void update(Object modify);
    
    void delete(Object eliminate);
        
    
    
    
    
}
