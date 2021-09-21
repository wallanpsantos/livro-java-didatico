package com.br.livrojavadidatico.atividade_cap_03;

import javax.swing.JOptionPane;

public class loginSenhaSimples {

	public static void main(String[] args) {
		String login = "java";
		String senha = "java";
		String dLogin = "";
		String dSenha = "";
		boolean acesso = true;
		int tentativas = 3;

		while (acesso) {
			dLogin = JOptionPane.showInputDialog("Digite o login: ");
			dSenha = JOptionPane.showInputDialog("Digite a senha: ");
			if (dLogin.equals(login) && dSenha.equals(senha)) {
				JOptionPane.showMessageDialog(null, "Login e senha aceito");
				acesso = false;
			} else {
				tentativas--;
				JOptionPane.showMessageDialog(null,
						"Login e Senha incorretos" + "\nResta apenas: " + tentativas + " tentativas");
			}
			if (tentativas == 0) {
				JOptionPane.showMessageDialog(null, "Conta bloqueada!");
				System.exit(0);
			}
		}
		System.exit(0);
	}

}
