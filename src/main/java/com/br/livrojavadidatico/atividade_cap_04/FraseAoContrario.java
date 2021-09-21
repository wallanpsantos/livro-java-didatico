package com.br.livrojavadidatico.atividade_cap_04;

import javax.swing.*;

public class FraseAoContrario {
    public static void main(String[] args) {
        /* Construa uma classe que receba uma frase qualquer e mostre essa frase de tr�s para frente e sem espa�os em branco.*/

        String frase = "";
        String fraseInvertida = "";

        frase = JOptionPane.showInputDialog("Digite uma frase: ");
        for (int i = frase.length() - 1 ; i >= 0; i--) {
            fraseInvertida = fraseInvertida.replace(" ","") + frase.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "Frase digitada: " + frase + "\nFrase invertida: " + fraseInvertida);
    }
}
