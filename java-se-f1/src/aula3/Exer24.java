package aula3;

import javax.swing.JOptionPane;

public class Exer24 {

	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Digite quantos filhos: ");
		int filhos = Integer.parseInt(qtd);
		String rel = "";

		for (int count = 1; count < filhos; count++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + count + "º filho: ");
			String idade = JOptionPane.showInputDialog("Digite a idade do " + count + "º filho: ");
			rel += "nome: " + nome + " idade: " + idade + "\n";
		}

		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}
