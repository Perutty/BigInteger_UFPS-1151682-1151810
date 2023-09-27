/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author madar
 */
public class BigInteger_UFPS {

	/**
	 * Numero="23456" miNUmero={2,3,4,5,6};
	 */
	private int miNumero[];
	private int contador = 0;
	private int resultado[];

	public BigInteger_UFPS() {
	}

	public BigInteger_UFPS(String miNumero) {
		String[] datos = miNumero.split("");
		this.miNumero = new int[datos.length];
		for (int i = 0; i < datos.length; i++) {
			this.miNumero[i] = Integer.parseInt(datos[i]);
		}
	}

	public int[] getMiNumero() {
		return miNumero;
	}

	/**
	 * Mutiplica dos enteros BigInteger
	 * 
	 * @param dos
	 * @return
	 */

	public BigInteger_UFPS multiply(BigInteger_UFPS dos) {
		int resultado[] = new int[this.miNumero.length + dos.getMiNumero().length];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = 0;
		}

		for (int i = this.miNumero.length - 1; i >= 0; i--) {
			int contador = 0;
			for (int j = dos.getMiNumero().length - 1; j >= 0; j--) {
				int producto = this.miNumero[i] * dos.getMiNumero()[j] + resultado[i + j + 1] + contador;

				resultado[i + j + 1] = producto % 10;
				contador = producto / 10;
			}
			resultado[i] += contador;
		}

		BigInteger_UFPS result = new BigInteger_UFPS();
		result.miNumero = resultado;
		return result;

	}

	/**
	 * Retorna la representación entera del BigInteger_UFPS
	 * 
	 * @return un entero
	 */
	public int intValue() {
		int resultado = 0;
		int multiplicador = 1;

		for (int i = this.miNumero.length - 1; i >= 0; i--) {
			resultado += this.miNumero[i] * multiplicador;
			multiplicador *= 10;
		}
		return resultado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		boolean controladora = true;
		for (int digit : miNumero) {
			if (controladora && digit == 0)
				continue;
			else if (controladora && digit > 0)
				controladora = false;

			sb.append(digit);
		}
		return sb.toString();
	}

}
