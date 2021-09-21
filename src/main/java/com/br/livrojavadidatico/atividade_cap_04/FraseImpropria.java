package com.br.livrojavadidatico.atividade_cap_04;

import javax.swing.*;

public class FraseImpropria {
    public static void main(String[] args) {
        String[] listaFrasesImproprias = {"idiota","sexo","trouxa"};
        String fraseDigitada = "";
        boolean conteudoLiberado = false;

        fraseDigitada = JOptionPane.showInputDialog("Forne�a uma frase: ");

        for (int i = 0; i < listaFrasesImproprias.length; i++) {
            if (fraseDigitada.indexOf(listaFrasesImproprias[i]) >= 0 || fraseDigitada.equalsIgnoreCase(listaFrasesImproprias[i])) {
                JOptionPane.showMessageDialog(null, "Conte�do impr�prio!" +
                        "\nFrase digitada: " + fraseDigitada +
                        "\nPalavra impr�pria: " + listaFrasesImproprias[i] +
                        "\nA partir da posi��o: " + fraseDigitada.indexOf(listaFrasesImproprias[i]));
                System.exit(0);
            }
            conteudoLiberado = true;
        }

        if (conteudoLiberado) {
            JOptionPane.showMessageDialog(null, "Conte�do liberado!" +
                    "\nFrase digitada: " + fraseDigitada );
            System.exit(0);
        }
    }
}
