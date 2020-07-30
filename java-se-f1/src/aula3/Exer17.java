package aula3;

import javax.swing.JOptionPane;

public class Exer17 {

	public static void main(String[] args) {

		String idade = JOptionPane.showInputDialog("Digite a sua idade:");
		int v1 = Integer.parseInt(idade);
		
		String relatorio = "";
		
		if(v1 >= 18) {
			relatorio = "Vc já pode tirar carteira de motorista!";
		} else {
			relatorio = "Vc não pode tirar carteira de motorista!";
		}
		
		JOptionPane.showMessageDialog(null,  relatorio);
		System.exit(0);
	}

}
