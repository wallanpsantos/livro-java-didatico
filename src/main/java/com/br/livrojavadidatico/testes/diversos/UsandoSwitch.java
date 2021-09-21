package testes.diversos;

import javax.swing.JOptionPane;

public class UsandoSwitch {

	public static void main(String[] args) {
		String mes = JOptionPane.showInputDialog("Digite o mês");

		if (mes != null) {
			switch (mes) {
			case "1":
				JOptionPane.showMessageDialog(null, "Janeiro");
				break;

			default:
				break;
			}
		}

	}

}
