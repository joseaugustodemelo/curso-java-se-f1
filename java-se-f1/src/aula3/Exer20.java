package aula3;

import javax.swing.JOptionPane;

public class Exer20 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		int count = 1;
		double totais = 0;
		while (count <= 12) {
			String salario = JOptionPane.showInputDialog("Digite o " + count + " salário.");
			double valor = Double.parseDouble(salario);
			totais += valor;
			++count;
		}

		double media = totais / 12;
		JOptionPane.showMessageDialog(null, "O 13º salário do " + nome + " é " + media);
	}

}
