package aula4;

public class Exer28 {

	public static void main(String[] args) {
		int valor = 20;
		switch (valor) {
		case 10: {
			System.out.println("é 10");
			System.out.println("primeiro");
			break;
		}
		case 20: {
			System.out.println("é 20");
			System.out.println("segundo");
			break;
		}
		case 22: {
			System.out.println("é 22");
			System.out.println("terceiro");
			break;
		}
		default:
			System.out.println("não é nenhum valor esperado.");
			break;
		}

		System.out.println("programa continua.");

	}

}
