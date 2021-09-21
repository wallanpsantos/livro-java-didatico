	package com.br.livrojavadidatico.atividade_cap_04;

	import javax.swing.*;

	public class AjustePercentualAcrescimo {

		public static void main(String[] args) {
			double valorInformado = 0;

			valorInformado =  Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));

			double valorComAcrescimo = valorInformado + (valorInformado * 0.12);

			JOptionPane.showMessageDialog(null,"Valor com acrescimo: " + valorComAcrescimo
				+ "\nValo arredondado: " + Math.round(valorComAcrescimo));

			System.exit(0);
		}

	}
