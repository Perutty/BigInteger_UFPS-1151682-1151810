/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.BigFactorial_UFPS;

/**
 *
 * @author madar
 */
public class Test_BigFactorial_UFPS {
    
    public static void main(String[] args) {
        String numeroBig="100";
        try {
            BigFactorial_UFPS numero=new BigFactorial_UFPS(numeroBig);
            System.out.println("El factorial de:"+numero.toString()+", es:"+numero.getFactorial().toString());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    }
    

