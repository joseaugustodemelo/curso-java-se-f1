package aula3;

public class Exer25 {

	public static void main(String[] args) {
		for (int count = 0; count < 10; count++) {
			if (count == 5) {
				break;
			}
			System.out.println("->processando " + count);
		}
		System.out.println("terminando o programa...");
	}

}
