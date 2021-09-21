package testes.diversos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class UsoDoThrows {

	public static void main(String[] args) throws IOException {
		String frase = JOptionPane.showInputDialog("Entre com a frase: ");
		try {
			FileWriter file = new FileWriter("C:/Users/walla/Documents/frase.txt", true);
			PrintWriter out = new PrintWriter(file);
			out.println(frase);
			out.close();
			JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta C:/Users/walla/Documents/frase.txt existe");
		}
		System.out.println(0);
	}

}
