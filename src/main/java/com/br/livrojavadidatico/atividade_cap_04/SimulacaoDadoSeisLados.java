package com.br.livrojavadidatico.atividade_cap_04;

import javax.swing.JOptionPane;

public class SimulacaoDadoSeisLados {
	/*
	 * Dado seis lados, gire 3 vezes, mostre cada giro e some os numeros.
	 */
	public static void main(String[] args) {
		int[] nDado = new int[3];
		int somaLados = 0;

		for (int i = 0; i < nDado.length; i++) {
			nDado[i] = (int) (Math.random() * 6);
			somaLados += nDado[i];
		}
		JOptionPane.showMessageDialog(null, "N�meros Sorteados: "
				+ "\n" + nDado[0] 
				+ "\n" + nDado[1] 
				+ "\n" + nDado[2]
				+ "\nTotal: " + somaLados);
	}
}
