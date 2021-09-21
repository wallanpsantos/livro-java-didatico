package com.br.livrojavadidatico.atividade_cap_03;

import javax.swing.JOptionPane;

public class ValorProdutoComDesconto {

	public static void main(String[] args) {
		String nomeProduto = null;
		Double valorOriginal = null;
		Double valorComDesconto = null;
		try {
			nomeProduto = JOptionPane.showInputDialog("Favor informar nome do produto: ");
			valorOriginal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));

			if (valorOriginal >= 50 && valorOriginal < 200) {
				valorComDesconto = valorOriginal - (valorOriginal * 0.05);
			} else if (valorOriginal >= 200 && valorOriginal < 500) {
				valorComDesconto = valorOriginal - (valorOriginal * 0.06);
			} else if (valorOriginal >= 500 && valorOriginal < 1000) {
				valorComDesconto = valorOriginal - (valorOriginal * 0.07);
			} else if (valorOriginal >= 1000) {
				valorComDesconto = valorOriginal - (valorOriginal * 0.08);
			} else if (valorOriginal < 0) {
				JOptionPane.showMessageDialog(null, "Favor digite um n�mero inteiro maior ou igual a zero!");
			}

			if (nomeProduto == null || valorOriginal == null) {
				JOptionPane.showMessageDialog(null, "Favor informar Nome e valor do produto, para aplicar o desconto!");
			} else if (valorOriginal < 50) {
				JOptionPane.showMessageDialog(null,
						"Nome do produto: " + nomeProduto + 
						"\n Valor original: R$ " + valorOriginal);
			} else {
				JOptionPane.showMessageDialog(null, 
						"Nome do produto: " + nomeProduto + 
						"\n Valor original: R$ " + valorOriginal + 
						"\n Valo com Desconto: R$ " + valorComDesconto);
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formado de valor invalido, tente algo como 12.45");
		}
		System.exit(0);
	}

}
