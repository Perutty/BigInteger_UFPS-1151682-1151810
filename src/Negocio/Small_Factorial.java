/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 * Clase para el manejo de números factorial
 * @author madar
 */
public class Small_Factorial {
    
    private int numero;

    public Small_Factorial() {
    }

    /**
     *  Constructor que recibe el número a ser tratado el proceso de factorial
     * @param numero un entero positivo
     * @throws Exception genera excepción si el numero es negativo
     */
    public Small_Factorial(int numero) throws Exception{
        if (this.numero<0)
            throw new Exception("No se puede calcular el factorial de un entero negativo");
            
            
        this.numero = numero;
    }
    
    
    /**
     * Obtiene el número factorial del atributo numero
     * @return un entero con el número factorial
     */
    public int getFactorial() 
    {
    
        if(this.numero==0 || this.numero==1)
            return 1;
        
    int fac=1;
    //Su costo en términos generales es "n" donde "n" es el número a encontra su factorial
    for(int i=1;i<=this.numero;i++)
        fac*=i;
    
    return fac;
    }
    
    /**
     *  Obtiene el número 
     * @return 
     */

    public int getNumero() {
        return numero;
    }

    
    /**
     * Actualiza el 
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
}
