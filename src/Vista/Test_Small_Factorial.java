/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Negocio.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author madar
 */
public class Test_Small_Factorial {

    public static void main(String[] args) {
        
       int numero=10, numeroGrande=200;
        try {
            Small_Factorial small=new Small_Factorial(numero);
            System.out.println("El factorial de :"+small.getNumero()+", es:"+small.getFactorial());
            
            small.setNumero(200);
            System.out.println("El factorial de :"+small.getNumero()+", es:"+small.getFactorial());
            
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    
}
