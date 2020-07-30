package aula4;

public class aula27 {

	public static void main(String[] args) {
		int valor = 20;
		switch (valor) {
		case 10: {
			System.out.println("é 10");
			System.out.println("primeiro");

		}
		case 20: {
			System.out.println("é 20");
			System.out.println("segundo");

		}
		case 22: {
			System.out.println("é 22");
			System.out.println("terceiro");

		}
		default:
			System.out.println("não é nenhum valor esperado.");

		}

		System.out.println("programa continua.");
	}

}
