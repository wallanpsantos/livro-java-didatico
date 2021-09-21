package com.br.livrojavadidatico.atividade_cap_03;

import javax.swing.JOptionPane;

public class SelecaoSexoComJOptionPane {

	public static void main(String[] args) {
		// Exercicio_02 - figura_3.17

		Object[] op = { "Masculino", "Feminino" };
		String resp = (String) JOptionPane.showInputDialog(null, "Selecione um sexo:\n ", "Pesquisa",
				JOptionPane.QUESTION_MESSAGE, null, op, "Masculino");

		if (resp == null) {
			JOptionPane.showMessageDialog(null, "Voc� Cancelou!");
		} else if (resp.equals("Masculino")) {
			JOptionPane.showMessageDialog(null, "Voc� � homem");
		} else if (resp.equals("Feminino")) {
			JOptionPane.showMessageDialog(null, "Voc� � mulher");
		}
		System.exit(0);
	}
}
