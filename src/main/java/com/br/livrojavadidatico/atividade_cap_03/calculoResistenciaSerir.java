package atividade_cap_03;

import javax.swing.JOptionPane;

public class calculoResistenciaSerir {

	public static void main(String[] args) {
		int[] r = new int[4];
		int re = 0, maior = 0, menor = 0;
		String valores = "";

		for (int i = 0; i < r.length; i++) {
			r[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor da resistência " + r[i] + ": "));
			re = re + r[i];
			if (r[i] > maior) {
				maior = r[i];
			}
			menor = r[i];
			valores = r[i] + "," + valores;
		}
		for (int j = 0; j < r.length; j++) {
			if (r[j] < menor) {
				menor = r[j];
			}
		}
		JOptionPane.showMessageDialog(null, "Valor da resistência equivalente: " + re + "\nValores digitados: "
				+ valores + "\nMaior resistência: " + maior + "\nMenor Resistência: " + menor);
		System.exit(0);
	}
}
