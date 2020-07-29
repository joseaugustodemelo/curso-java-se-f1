package aula2;

import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
		String nomeCompleto = nome + " " + sobrenome;
		JOptionPane.showMessageDialog(null,  nomeCompleto);
		System.exit(0);
	}

}
