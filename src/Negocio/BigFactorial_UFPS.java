/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Modelo.BigInteger_UFPS;


/**
 *
 * @author madar
 */
public class BigFactorial_UFPS {

    private BigInteger_UFPS numero;

    public BigFactorial_UFPS() {
    }

    /**
     * Constructor que recibe el número a ser tratado el proceso de factorial
     *
     * @param numero un entero positivo
     * @throws Exception genera excepción si el numero es negativo
     */
    public BigFactorial_UFPS(String numero) throws Exception {
    	
    	if(Integer.parseInt(numero)>0)
    		this.numero = new BigInteger_UFPS(numero);
    	else
    		throw new Exception("No se puede calcular el factorial de 0 o negativo");
    }

    /**
     * Obtiene el número factorial del atributo numero
     *
     * @return un entero con el número factorial
     */
    public BigInteger_UFPS getFactorial() {

        BigInteger_UFPS fac = new BigInteger_UFPS("1");
        for (int i = 1; i <= this.numero.intValue(); i++) {
            BigInteger_UFPS i_big = new BigInteger_UFPS(i + "");
            fac = fac.multiply(i_big);

        }
        return fac;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }

}
