package com.br.livrojavadidatico.atividade_cap_04;

import javax.swing.JOptionPane;

public class BuscaLetraNaFrase {

	public static void main(String[] args) {
		String frase = "Livro Java - Ensino did?tico";
		String caractere = "i";
		/*
		 * frase.indexOf(caractere) -> Retorna a primeira ocorrencia que aparece "i".
		 * frase.indexOf(caractere, 10) -> Retorna caracter "i" apos a posicao 10.
		 * frase.indexOf("Java", 15) -> Como n?o existe a palavra "Java" apos a posicao
		 * 15, e retornado o valor -1.
		 */
		JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nIndice: " + frase.indexOf(caractere) + ", "
				+ frase.indexOf(caractere, 10) + ", " + frase.indexOf("Ensino") + ", " +
				frase.indexOf("Java", 15));
	}

}
