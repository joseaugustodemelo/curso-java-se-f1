package aula3;

import javax.swing.JOptionPane;

public class Exer21 {

	public static void main(String[] args) {

		String qtd = JOptionPane.showInputDialog("Digite quantos filhos: ");
		int filhos = Integer.parseInt(qtd);
		int count = 1;
		String rel = "";
		while (count <= filhos) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + count + "º filho: ");
			String idade = JOptionPane.showInputDialog("Digite a idade do " + count + "º filho: ");
			rel += "nome: " + nome + " idade: " + idade + "\n";
			count++;
		}
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}
