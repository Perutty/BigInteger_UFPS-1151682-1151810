/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigInteger;

/**
 *
 * @author madar
 */
public class Solucion_Java_Factorial {

    private BigInteger numero;

    public Solucion_Java_Factorial() {
    }

    /**
     * Constructor que recibe el número a ser tratado el proceso de factorial
     *
     * @param numero un entero positivo
     * @throws Exception genera excepción si el numero es negativo
     */
    public Solucion_Java_Factorial(String numero) throws Exception {

        BigInteger n = new BigInteger(numero);
        if (n.equals(BigInteger.ZERO)) {
            throw new Exception("No se puede calcular el factorial de 0 o negativo");
        }

        this.numero = n;
    }

    /**
     * Obtiene el número factorial del atributo numero
     *
     * @return un entero con el número factorial
     */
    public BigInteger getFactorial() {

        /*
     int fac=1;
    //Su costo en términos generales es "n" donde "n" es el número a encontra su factorial
    for(int i=1;i<=this.numero;i++)
        fac*=i;
    
    return fac;
         */
        BigInteger fac = new BigInteger("1");
        for (int i = 1; i <= this.numero.intValue(); i++) {
            BigInteger i_big = new BigInteger(i + "");
            fac = fac.multiply(i_big);

        }
        return fac;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }

}
